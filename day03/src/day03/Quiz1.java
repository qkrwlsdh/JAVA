package day03;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 한 글자를 입력받아서 글자가 산술연산자 (+, -, *, /, %)인지 아닌지 판별하는 코드
		Scanner sc = new Scanner(System.in);
		char input;
		
		System.out.println("글자를 입력해주세요 : ");
		input = sc.next().charAt(0);
		
		boolean result = (input == '+') || (input == '-') || (input == '*') || (input == '/') || (input == '%');
		
		System.out.println(result ? "산술연산자 입니다" : "산술연산자가 아닙니다");
		
		// 선생님 풀이
//		boolean flag1 = input == '+';
//		boolean flag2 = input == '-';
//		boolean flag3 = input == '*';
//		boolean flag4 = input == '/';
//		boolean flag5 = input == '%';
//		boolean result = flag1 || flag2 || flag3 || flag4 || flag5;
//		
//		if(result) {
//			System.out.println(input + " : 연산자입니다");
//		}
//		else {
//			System.out.println(input + " : 연산자가 아닙니다");
//		}
		
		sc.close();
	}
}