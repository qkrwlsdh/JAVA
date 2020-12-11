package day20_file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex02_file {
	public static void main(String[] args) throws IOException {
		// 자바에서 파일을 객체로 취급하여, 읽기 및 쓰기, 생성 삭제 등을 처리할 수 있는 클래스
		
		File f1 = new File("a.txt");	// File(String pathName);
		File f2 = new File("C:\\windows\\system32\\drivers\\etc\\hosts");
		File f3 = new File("C:\\windows\\system32\\config","SAM");
		File f4 = new File("C:", "windows");	// directory, 폴더
		
		// f1은 상위 경로를 지정하지 않았으므로, 현재 위치에서 파일을 탐색한다 (상대 경로)
		// f2와 f3는 C: 최상위부터 전체 주소를 작성했으므로, 항상 같은 경로를 탐색한다 (절대 경로)
		
		// 실제 파일의 존재 유무와 상관없이 객체를 생성할 수 있다
		
		System.out.println("f1이 존재하는가 : " + f1.exists());
		System.out.println("f2이 존재하는가 : " + f2.exists());
		System.out.println("f3이 존재하는가 : " + f3.exists());
		System.out.println("f4이 존재하는가 : " + f4.exists());
		System.out.println();
		
		System.out.println("f2는 파일인가 : " + f2.isFile());
		System.out.println("f2는 폴더(디렉토리)인가 : " + f2.isDirectory());
		System.out.println();
		
		System.out.println("f2는 읽기 가능한가 : " + f2.canRead());
		System.out.println("f3는 읽기 가능한가 : " + f3.canRead());
		System.out.println();
		
		System.out.println("f2는 쓰기 가능한가 : " + f2.canWrite());
		System.out.println("f3는 쓰기 가능한가 : " + f3.canWrite());
		System.out.println();
		
		System.out.println("f2는 실행 가능한가 : " + f2.canExecute());
		System.out.println("f3는 실행 가능한가 : " + f3.canExecute());
		System.out.println();
		
		Scanner sc2 = new Scanner(f2);
		String f2context = "";
		
		while(sc2.hasNextLine()) {			// 다음 줄이 있으면
			f2context += sc2.nextLine();	// 그 줄을 문자열의 내용에 더해라
			f2context += "\n";
			sc2.close();
		}
		System.out.println(f2context);
		
		
		// f3의 내용을 Scanner로 읽어들여서 화면에 출력
//		Scanner sc3 = new Scanner(f3);
//		String f3context = "";
//		
//		while(sc3.hasNextLine()) {
//			f3context += sc3.nextLine();
//			f3context += "\n";
//		}
//		System.out.println(f3context);	// 윈도우에서 읽기를 강제로 제한
	}
}
