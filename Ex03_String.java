package day02;

public class Ex03_String {
	public static void main(String[] args) {
		
		// 자료형이 소문자로 시작하면, 기본 자료형(primitive type)
		// 대문자로 시작하면, 클래스
		
		String name;	// 문자열 변수 선언
		int age;		// 정수 변수 선언 (공간 확보)
		
		name = "이지은";	// 문자열은 ""로 묶어서 표현, (char)단일 문자는 ''로 묶어서 표현
		age = 28;
		
		System.out.println(name + "님의 나이는 " + age + "살 입니다");
		
		int n1 = 10;
		int n2 = 20;
		System.out.println(n1 + n2);	// 숫자와 숫자간의 연산은 합연산 (더하기)
		
		String s1 = "10";
		String s2 = "20";
		System.out.println(s1 + s2);	// + 양변의 하나라도 문자열이라면
										// 이어붙이기가 된다
		
		int birthYear = 1993;
		int nowYear = 2020;
		System.out.println(name + "님의 나이는 " + (nowYear - birthYear + 1) + "입니다");
		
		System.out.println(n1 + s2);
	}
}
