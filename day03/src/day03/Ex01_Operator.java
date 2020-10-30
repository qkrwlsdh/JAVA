package day03;

import java.util.Scanner;

public class Ex01_Operator {
	public static void main(String[] args) {
		
		// 연산자 : 값을 연산처리할 수 있는 기호나 단어
		// 함수는 아니지만, 값을 만들어 낼 수 있다. 연산의 결과는 값이다
		
		int num = 3 * 4;
		int num2 = num;
		// num에 담긴 값을 num2변수 공간(메모리)에 담아라
		System.out.println(num);
		System.out.println(num2);
		
		// 대입연산자는 항상 우변을 먼저 처리하여 하나의 값으로 만들어내고
		// 우변의 값이 결정되면 그 값을 좌변의 변수공간에 대입한다
		
		// 멤버 연산자		.	(~의, ~안에)
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n1 = sc.nextInt();
		System.out.println("입력한 정수 : " + n1);
		sc.close();
		
		// 대입 연산자		=
		
		// 복합대입 연산자	+=, -=, *=, /=, %=
		int n2 = 10, n3 = 20;
		n2 += n3;				// n2 = n2 + n3;
		
		String result = "";
		result += "오늘은 ";
		result += "10월 21일 ";
		result += "입니다";
		
		System.out.println(n2);
		System.out.println(result);
		
		// 산술 연산자		+, -, *, /, %
		// % 연산자 : 나머지를 구하는 연산자
		// 1) 홀수나 짝수를 구분할 수 있다	(%2)
		// 2) 배수나 약수를 처리할 수 있다	(%n)
		// 3) 정수의 자릿수를 떼어낼 수 있다	(%10)
		int id = 930827;
		int day = id % 100;	// 0의 개수만큼 뒤부터 정수를 떼어 낼 수 있다
		System.out.println(day);
		// 4) 난수의 범위를 제한할 수 있다	(%n)
		int random = 574234;
		int mynum = random % 6;	// 0 ~ 5
		System.out.println(mynum);
		
		// 크기비교 연산자	>, <, >=, <=, ==, !=
		// 결과는 boolean형으로 나타난다
		int n4 = 10;
		boolean flag = n4 < 20;
		
		if(n4 < 20)
			System.out.println("n4는 20보다 작다");
		if(flag)
			System.out.println("n4는 20보다 작다");
		if(true)
			System.out.println("n4는 20보다 작다");
		
		// 논리 연산자		&&, ||, !
		int gender = 1;
		int age = 24;
		boolean gotoarmy = (gender % 2 == 1) && (age >= 19);
		System.out.println(gotoarmy ? "입영대상" : "아님");
		
		int card = 0;
		int cash = 50000;
		boolean byTexi = (card != 0) || (cash >= 10000);
		System.out.println(byTexi ? "택시타고간다" : "걸어서 간다");
		
		boolean login = true;				// 현재 로그인 되어있는 상태
		if(!login)							// 로그인 상태가 아니라면
			System.out.println("로그인");		// 로그인하기 위해서 버튼이름을 로그인으로
		else								// 로그인 상태라면
			System.out.println("로그아웃");	// 버튼 이름을 로그아웃으로
		
		// 비트 연산자		<<, >>
		int n5 = 4;						// 0000 0100
		System.out.println(n5 << 1);	// 0000 1000
		System.out.println(n5 << 2);	// 0001 0000
		System.out.println(n5 << 3);	// 0010 0000
		
		System.out.println(n5 >> 1);	// 0000 0010
		System.out.println(n5 >> 2);	// 0000 0001
		
		// 삼항 연산자		조건 ? 값1 : 값2
		
	}
}