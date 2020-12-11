package day19_exception;

import java.util.Scanner;

/*
 * 모든 예외 클래스는 예외의 최상위 클래스 Exception을
 * 상속하는 형식으로 구성되어 있다
 */
@SuppressWarnings("serial")
class MinusException extends Exception {
	
	// 직렬화 - 역직렬화를 통해서 객체를 주고 받을 때 올바른 형식을 받았는지 확인하기 위한 값
	
	public MinusException(String msg) {
		super(msg);		// Exception클래스는 문자열을 전달받는 생성자가 있다
	}
	
	@Override
	public String toString() {
		return "나이 예외 : " + getMessage();
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("나이를 입력 : ");
		try {
			
			int age = sc.nextInt();
			if (age < 1) {
				throw new MinusException("나이가 1보다 작을 수 없습니다");
			}
			System.out.println(age >= 20 ? "성인" : "미성년자");

		} catch (MinusException e) {
//			e.printStackTrace();	// 줄이 길어질수있다 (상세하게)
			System.out.println(e);
		}
	}
}
