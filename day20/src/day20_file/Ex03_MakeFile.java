package day20_file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex03_MakeFile {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		File f1 = new File("a.text");
		
		if(f1.exists() == false) {
			boolean make = f1.createNewFile();
			System.out.println("파일이 생성되었는가 : " + make);
		}
		System.out.println(f1.exists());
		
		FileOutputStream fos = new FileOutputStream(f1);	// 파일을 대상으로 하는 파일 출력 스트림
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		// Stream : 데이터가 이동할 수 있는 통로와 같은 역할
		// Writer : 문자열을 기록하는 객체 <-> Reader
		
		bw.write("Hello, world !!");	// bw.write() : 버퍼(임시공간)에 기록한다
		bw.write("\r\n");				// 아직 파일에 기록된건 아님
		bw.write("작성일자 : " + new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		
		bw.flush();		// 버퍼를 비운다 -> 파일로 밀어넣기
		
		bw.close();		// 작업이 마무리되면 꼭 스트림을 닫는 습관을 들이자
		System.out.println("실행 완료 !");
		
		// java.util.Date : 자바에서 날짜 및 시간을 표현하기 위한 클래스. 기본 생성자에 의해 현재 시간을 가진다
		// java.text.SimpleDateFormat
		// Date의 객체를 원하는 표현형식으로 바꾸어서 문자열로 만들어주는 클래스
		// yyyy 4자리 연도, MM 월, dd 일, hh 시, mm 분, ss 초
		
		Date date = new Date(); 		// 현재 시간 정보
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String date2 = sdf.format(date);
		System.out.println(date2);
		
		if(f1.exists()) {
			Runtime rt = Runtime.getRuntime();
			// 운영체제에 명령어를 전달해서 프로그램을 실행할 수 있도록 하는 객체
			
			Process pro = rt.exec("notepad " + f1.getAbsolutePath());
			// f1.getAbsolutePath() : 파일의 절대경로를 문자열로 반환하는 메서드
			// Process : 현재 실행되고 있는 프로그램의 정보
			
			Thread.sleep(5000); 	// 5초 기다린 후에
			
			pro.destroyForcibly();	// 프로세스를 강제로 종료한다
		}
	}
}
