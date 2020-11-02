package day11;

import java.util.Scanner;

public class Quiz1 {
	// 정수를 입력받아서 switch ~ case 메뉴를 구성하고 있습니다
	// 만약 문자열을 입력하면 예외가 발생하여 프로그램이 실행되지 않는데
	// 이걸 해결하려면 어떻게 해야 할까요?
	
	// 전달받은 문자열이 모두 정수로 구성되어 있는지 아닌지 판별하는 함수를 만들어서 사용해보세요
	static boolean isNumeric(String str) {
		for(int i = 0; i < str.length(); i++) {			// 문자열 전체에서
			char ch = str.charAt(i);					// 각 글자가 ch라면
			boolean flag = '0' <= ch && ch <= '9';		// ch가 0 ~ 9사이가 정상일 조건
			if(flag == false) {							// 조건이 하나라도 벗어나면
				return false;							// false를 반환하면서 함수 종료
			}
		}
		return true;			// 전체를 순회해도 조건을 벗어나는 경우가 없으면 true를 반환하면서 종료
	}
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			String input = null;
			
			while(true) {		// continue는 여기로 와서 다시 코드를 진행
				
				System.out.print("정수 입력 : ");
				input = sc.next();
				
				if(isNumeric(input) == false) {
					System.err.println("정수를 입력해주세요 !");
					continue;	// 반복하던 내용을 중단하고, 반복문을 처음부터 다시 수행한다
				}
				
				switch(input) {
				case "1": case "2": case "3":
					System.out.println("input : " + input);
					break;		// while 밑으로 빠져나간다
				case "0":
					System.out.println("프로그램 종료");
					sc.close();
					return;
				}
			}	// while
		}	// main
}	// class
