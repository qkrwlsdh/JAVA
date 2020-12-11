package teacher_code;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Timer implements Runnable {	// runnable 구현시킨다 (run 함수 상속을 위해)
	private boolean over;			// 정해준 시간 뒤 끝남을 표시하는 over 선언

	@Override								// overwrite라고 볼수있다
	public void run() {						// 타이머 클래스를 실행해주기위한 run함수를 오버라이드
		for (int i = 10; i >= 0; i--) {		// 반복문으로 초기값 10을 주고 0이 될 때까지 i를 마이너스 시킨다
			try {							// 위의 반복문 실행에서의 예외를 잡아주기 위해 try
				Thread.sleep(1000);			// 예외 발생이 예상되는 로직
			} catch (InterruptedException e) {	// 예외 클래스와 객체를 catch로 잡는다
				e.printStackTrace();		// 예외가 발생했을 때 그 내용을 출력시킨다
			}
		}
		this.over = true;					// 위의 for문을 마치고 빠져나오면 over를 true로
	}

	public boolean isOver() {				// over의 getter = 자료형이 boolean이기 때문에 getOver가 아닌 isOver
		return over;						// over를 반환
	}
}

public class Quiz2 {
	// 사용자에게 10초간 문자열을 입력받으세요
	// 엔터를 치면 다음 내용은 다음줄에 작성되어야 합니다
	// 10초가 지나면 지금까지 입력받은 문자열을
	// C:\JavaFileTest\quiz2.txt 에 기록하세요
	// 맨 아래에는 작성날짜와 시간을 yyyy-MM-dd hh:mm:ss 의 형식으로 넣어주시고
	// 작성자 본인의 이름을 기록해주세요
	// 파일 기록이 끝나면 Runtime을 이용하여 메모장을 실행하시면 됩니다

	// 키보드 입력 -> 프로그램 -> 파일 출력
	// \n, 윈도우 메모장은 \r\n 이 같이 있어야 줄바꿈으로 인식합니다

	public static void main(String[] args) throws IOException {		// main함수인데 IOException을 던져 넘길 것이다
		Timer t = new Timer();										// 만들어놓은 Timer클래스를 자료형Timer를 가진 객체t 생성
		Thread timer = new Thread(t);								// 동시작업을 할 것이기 때문에 Thread자료형을 가진 객체timer를 생성하고 매개변수로 t를 참조
		ArrayList<String> list = new ArrayList<String>();			// ArrayList를 String전용으로 객체list 생성
		Scanner sc = new Scanner(System.in);
		String filePath = "C:\\JavaFileTest";						// 파일 위치를 filePath공간에 저장
		String fileName = "quiz2.txt";								// 파일 이름을 fileName에 저장
		Date date = new Date();										// 날짜와 시간을 표시할 Date자료형을 가진 객체date 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd / hh:mm:ss");	// 날짜와 시간을 어떻게 표시할 것인지 SimpleDateFormat을 객체sdf로 생성
		File f = new File(filePath, fileName);						// file을 filePath와 fileName을 참조하여 새롭게 생성
		FileOutputStream fos = new FileOutputStream(f);				// 파일을 내보내기 위해 생성
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		// 추가코드
		if (f.exists() == true) {	// 기존 파일이 존재하면
			f.delete(); 			// 파일을 삭제하고
			f.createNewFile(); 		// 새로운 파일을 생성한 이후
		} 							// 절대 C:\windows 폴더 내부의 파일을 대상으로 삭제를 수행하지 말 것 !!

		timer.start();					// 동시작업으로 타이머를 시작

		while (t.isOver() == false) {	// while문으로 Timer의 isOver(getter)가 false일 때 반복
			System.out.print("입력 : ");
			String str = sc.nextLine();
			list.add(str);				// 입력받은 문자를 list에 저장
		}

		for (String str : list) {		// for문으로 list가 String을 담는 객체라면 저장된 str을 
			bw.write(str + "\r\n");		// 출력시킨다 (자바내에선 \n하면 줄바꿈되지만 windows에서는 \r\n 해야함)
		}

		bw.write(sdf.format(date) + "\r\n");	// 위에서 내가 sdf객체에 정의한 방식으로 날짜,시간을 출력하고 줄바꿈
		bw.write("\r\n작성자 : 박진오\r\n");			// 작성자를 출력

		bw.flush();		// 버퍼에 저장된 내용을 밀어내고 비운다
		bw.close();		// 버퍼를 닫아준다
		
		String cmd = "notepad " + f.getAbsolutePath();
		Runtime.getRuntime().exec(cmd);		// 메모장을 띄워준다
		
//		cmd에 이런 명령어도 넣어서 실행해보세요
//		"chrome http://www.naver.com" or "start chrome http://www.naver.com"
//		"shutdown /s /f /t 60"		60초 뒤에 컴퓨터가 종료됩니다

		sc.close();

//		1) 저장할 때 마다, 현재 날짜와 시간에 근거하여, 파일이름을 지정한다면 어떨까?
//		2) 만약 저장하려는 이름과 동일한 파일이 이미 있다면 파일 이름 뒤에 (1), (2) 의 형식으로 구분할 수 있는가
//		3) throws 되어 있는 코드를 모두 try ~ catch 로 바꾼다면 어떻게 코드가 변할까

	}
}