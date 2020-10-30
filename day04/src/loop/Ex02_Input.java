package loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex02_Input {
	public static void main(String[] args) throws IOException {
		// System.in		// 시스템 입력, 주로 키보드에 의한 입력이 버퍼(표준 입력 스트림)를 지나서 프로그램으로
		// System.out		// 시스템 출력, 프로그램 -> 표준 출력 스트림 -> 화면 (콘솔)
		// System.err		// 시스템 에러, 프로그램 -> 에러 출력 스트림 -> 화면 (콘솔)
		
		System.out.print("1byte의 키값 입력 : ");
		int a = System.in.read();			// 입력받은 키의 아스키 코드값을 정수로 반환
		int b = System.in.read();			// \r, 13, Carrige Return
		int c = System.in.read();			// \n, 10, Line Feed
		
		
		System.out.printf("a : %d, b : %d, c : %d\n", a, b, c);
		
		// 2Byte 단위로 입력받을 수 있는 객체
		InputStreamReader ins = new InputStreamReader(System.in);
		System.out.print("2 byte 글자 입력 : ");
		char ch1 = (char)ins.read();
		System.out.println("ch : " + ch1);
		
		// 문자열 단위로 입력받는 객체 (2byte 입력객체를 재료로 문자열 입력 객체를 만들어낸다)
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(ins);
		br.readLine();	// sc.nextLine()	: 엔터키를 입력한 이전까지 내용을 문자열로
		
		System.out.println("안녕하세요 라고 입력해보세요 : ");
		String str = br.readLine();
		System.out.println("str : " + str);
		
		// 예외처리 내장 및 간편화, 기능 추가
		Scanner sc = new Scanner(System.in);
		
		sc.nextInt();		// 버퍼에서 정수만 가져온다 (\r, \n은 정수가 아니므로 버퍼에 남는다)
		sc.nextDouble();
		sc.nextFloat();
		sc.next();
		sc.nextShort();
		sc.nextByte();
		sc.nextBoolean();
		sc.nextLine();
		sc.nextLine().charAt(0);
		sc.close();
	}
}
