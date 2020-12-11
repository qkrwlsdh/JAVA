package day20_file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Timer extends Thread {
	ArrayList<String> list = new ArrayList<String>();
	private double sec;
	private boolean over;

	public Timer(double sec) {
		this.sec = sec;
	}

	@Override
	public void run() {
		go();
	}

	public void go() {
		for (int i = (int) sec; i >= 0; i--) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
		System.out.println();
		this.over = true;
	}

	public boolean isOver() {
		return over;
	}
}

public class Quiz2 {
	static void fileWrite(ArrayList<String> list) throws IOException {
		File f = new File("C:\\JavaFileTest", "quiz2.txt");
		FileOutputStream fos = new FileOutputStream(f);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		Scanner sc = new Scanner(System.in);
		Timer t = new Timer(5);
		
		t.start();
		
		if (f.exists() == true) { // 기존 파일이 존재하면
			f.delete(); 		// 파일을 삭제하고
			f.createNewFile(); // 새로운 파일을 생성한 이후
		}
		while (true) {
			System.out.print("입력해주세요 : ");
			String inp = sc.nextLine();
			list.add(inp);
			
			if (t.isOver() == true) {
				break;
			}
		}
		for (int i = 0; i < list.size(); i++) {
			bw.write(list.get(i) + "\n");
		}
		
		bw.write("\r\n작성자 : 박진오\r\n");
		bw.write(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
		bw.flush();
		bw.close();
		sc.close();

		Runtime.getRuntime().exec("notepad " + f.getAbsolutePath());
	}

	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<String>();

		fileWrite(list);
	}
}

//	사용자에게 10초간 문자열을 입력받으세요
//	엔터를 치면 다음 내용은 다음줄에 작성되어야 합니다
//	10초가 지나면 지금까지 입력받은 문자열을
//	C:\JavaFileTest\quiz2.txt 에 기록하세요
//	맨 아래에는 작성날짜와 시간을 yyyy-MM-dd hh:mm:ss 의 형식으로 넣어주시고
//	작성자 본인의 이름을 기록해주세요
//	파일 기록이 끝나면 Runtime을 이용하여 메모장을 실행하시면 됩니다

//	키보드 입력 -> 프로그램 -> 파일 출력