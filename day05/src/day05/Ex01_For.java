package day05;

public class Ex01_For {
	public static void main(String[] args) {
		
		// if : 조건에 따라서 종속문장을 한번 실행하는 제어문 (else if, else)
		// switch ~ case : 특정 변수의 값이 얼마인지에 따라 분기하는 제어문 (break)
		// while : 조건에 따라서 종속문장을 여러번 실행하는 반복문 (do ~ while)
		// for : 횟수에 의한 반복을 주로 처리하는 반복문 (배열, 자료구조와 연계되어 사용된다)
		
		String text = "Talk is cheap. show me the code.";
		System.out.println(text);
		
		for(int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);	// ch는 반복문 안에서만 유효하며, 반복시마다 값이 바뀐다
			if('a' <= ch && ch <= 'z') {
				ch -= 32;	// 아스키코드에서 [소문자 - 32 = 대문자]
			}
			System.out.print(ch);
		}						
	}
}
