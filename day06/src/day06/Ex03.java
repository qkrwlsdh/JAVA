package day06;

import java.util.Scanner;

public class Ex03 {
//		primitive 타입에서는 null을 사용할 수 없다
//		String s1 = null;
//		int n1 = null;
	
	static String insertDash(String str) {
		if(str.length() != 16) {
			System.err.println("문자열의 길이가 맞지 않습니다.");
			return null;	// 반환자료형이 명시되어 있으나 데이터를 반환하지 않고 싶은 경우
		}
//		String test = str.substring(4, 8);
		String ret = "";	// 여기서 ""는 0과 같은 의미
		
		for(int i = 0; i < str.length(); i++) {
			if(i % 4 == 0) {	// 0, 4/ 4, 8/ 8, 12/ 12, 16
//				System.out.println(str.substring(i, i + 4));
				ret += str.substring(i, i + 4);
				ret += i != 12 ? "-" : "" ;
			}
		}
//		System.out.println(ret);
		
		return ret;
	}
	
	public static void main(String[] args) {
		
		String result = insertDash("1212343456567878");
		// 전달받는 문자열의 길이가 16자리이면 4자리씩 끊어서 사이에 -기호를 넣어서 반환하기
		
		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("카드 번호를 입력하세요 (16자리) : ");
		String input = sc.nextLine();
		System.out.println(insertDash(input));
		sc.close();
		
	}
}
