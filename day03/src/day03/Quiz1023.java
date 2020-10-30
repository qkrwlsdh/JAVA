package day03;

import java.util.Scanner;

public class Quiz1023 {

	// 두 정수와 부호를 입력받아 답을 출력하는 코드를 작성하세요
	// +, -, *, /, %
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, result;
		char oper;
		
		System.out.println("첫번째 정수 입력 : ");
		num1 = sc.nextInt();
		System.out.println("두번째 정수 입력 : ");
		num2 = sc.nextInt();
		System.out.println("연산자 입력 : ");
		oper = sc.next().charAt(0);
		
		boolean checkOper = oper == '+';
		checkOper = oper == '-';
		checkOper = oper == '*';
		checkOper = oper == '/';
		checkOper = oper == '%';
		
		if(checkOper == false)
			System.err.println("잘못된 입력입니다");
		sc.close();
		return;
	}
}
