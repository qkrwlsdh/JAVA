package day02;

public class Ex01 {
	public static void main(String[] args) {
		// primitive type, 원시 자료형 8개
		// reference type, 참조 자료형 (배열, 클래스)
		
		byte by = 127;		// 1byte, 정수
		boolean bo = true;	// 1byte, 논리값
		short sh = 32767;	// 2byte, 정수
		char ch = '가';		// 2byte, 정수 (표현형태는 글자)	 char ch = 44032;
		int num = 1234;		// 4byte, 정수
		long ln = 32L;		// 8byte, 정수
		float fl = 1.2f;	// 4byte, 부동소수점 실수
		double db = 3.14;	// 8byte, 부동소수점 실수
		
		// ctrl + alt + ↓	: 아랫줄에 현재 줄을 복사
		// ctrl + d			: 제거
		// 변수란, 값을 담을수있는 공간
		
		System.out.println(by);	// 변수가 가지고 있는 값을 출력해라
		System.out.println(bo);
		System.out.println(sh);
		System.out.println(ch);
		
//		num = bo;	// Type mismatch: cannot convert from boolean to int
//		num = (int)bo;		// Cannot cast from boolean to int
		
		// 암묵적 형 변환 : 작은 값을 큰 변수에 담을 때 (데이터가 잘릴 위험이 없을 때)
		num = by;	// 4byte <= 1byte
		
//		by = num;	// Type mismatch: cannot convert from int to byte
		// 명시적 형 변환 : 큰 값을 작은 변수에 담으려고 할 때 (데이터가 잘릴 위험이 있을 때)
		by = (byte)num;		// 같은 숫자간의 자료형 변환
		
		// 대입 연산은 우변의 값을 좌변의 변수공간에 복사하여 담는다
		// 좌변과 우변의 자료형이 일치하지 않는다면 형 변환이 발생하거나, 강제로 발생시킬 수 있다
	}
}
