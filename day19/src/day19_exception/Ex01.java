package day19_exception;

import java.util.Scanner;

public class Ex01 {
//	Exception (예외)	: 코드 상에서 예측 가능한 문제
//	Error (오류)		: 사용자의 대응에 따라 프로그램의 예측 범위를 벗어난 문제
//	Bug (버그)		: 코드상에는 문제가 없으나, 간헐적으로 발생하는 문제
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		
		// 예외처리를 작성하지 않은 코드
//		System.out.print("두 정수를 입력하세요 : ");
//		String input = sc.nextLine();		// 입력 내용을 문자열로 입력받고
//		
//		String[] arr = input.split(" ");	// 띄워쓰기를 기준으로 나누어서 배열에 저장하고
//		n1 = Integer.parseInt(arr[0]);		// 첫번째 내용을 정수로 변환하여 n1에 저장
//		n2 = Integer.parseInt(arr[1]);		// 두번째 내용을 정수로 변환하여 n2에 저장
//		
//		System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2);
//		sc.close();
		
		/*
		 * 예측 가능한 문제점
		 * 1) 정수가 아닌 다른 값을 입력하는 경우
		 * 2) 띄워쓰기를 사용하지 않는 경우
		 * 3) 두번째 정수를 0으로 입력하는 경우
		 * 
		 * 자바에서는 예외도 객체로 취급하고, 거기에 맞는 클래스 파일들이 준비되어 있다
		 * 
		 * 예외처리를 if로도 할 수 있지만, if의 본래 목적은 분기문이므로
		 * 다수의 if가 있는 코드에서 조건 판단을 위한 if인지, 예외 처리를 위한 if인지 판단하기 힘들어진다
		 * (가독성이 떨어진다)
		 * 
		 * try		: 예외 발생 가능성이 있는 코드를 작성한다
		 * catch	: try에서 예외 객체가 발생하면 catch에서 받아서 적절한 처리 코드를 넣어준다
		 * throw	: 예외 객체를 생성해서 강제로 catch에게 전달한다
		 * throws	: 예외가 발생하면 함수에서 자신을 호출한 caller에게 예외 처리를 전가한다
		 * finally	: 예외 발생 여부에 상관없이 마지막으로 반드시 실행해야 할 코드를 작성한다 (주로 객체 종료 코드)
		 * 
		 */
		
		System.out.print("두 정수를 입력하세요 : ");
		String input = sc.nextLine();		// 입력 내용을 문자열로 입력받고
		
		String[] arr = input.split(" ");	// 띄워쓰기를 기준으로 나누어서 배열에 저장하고
		
		try {		// 여기 있는 코드를 시도하고, 만약 예외가 발생하면
		n1 = Integer.parseInt(arr[0]);		// 첫번째 내용을 정수로 변환하여 n1에 저장
		n2 = Integer.parseInt(arr[1]);		// 두번째 내용을 정수로 변환하여 n2에 저장
		
		System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2);
		} catch(NumberFormatException e) {	// 숫자 형식에 관한 예외가 발생하면 여기서 처리한다
			System.out.println("숫자 형식이 잘못되었습니다 !!");
			System.err.println(e);
			
		} catch(ArrayIndexOutOfBoundsException e) {		// 배열의 범위 관련 예외가 발생하면 여기서 처리
			System.out.println("배열의 범위를 벗어났습니다 !!");
			System.err.println(e.toString());
			
		} catch(ArithmeticException e) {				// 값을 0으로 나누려하면 여기서 처리
			System.out.println("값을 0으로 나눌 수 없습니다 !!");
			e.printStackTrace();
			
		} finally {		// 예외가 발생하는지에 상관없이 마지막에 항상 실행하는 코드
			System.out.println("항상 실행되는 코드 !!");
			sc.close();
		}
	}
}
