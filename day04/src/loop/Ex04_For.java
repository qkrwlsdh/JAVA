package loop;

import java.util.Scanner;

public class Ex04_For {
	public static void main(String[] args) {
		
		int count = 0;
		while(count < 5) {
			System.out.println("Hello, world !!");
			count++;
		}
		System.out.println();
		
		
		for(int i = 0; i < 5; i++) {				// 주로, 횟수에 의한 반복을 처리할 때 사용
			System.out.println("Hello, Java !!" + i);
		}
//		System.out.println(i);			여기서 i는 for문안에서만 유효하다
		System.out.println();
		
		int j = 0;						// 반복문 바깥에서 선언한 변수는 반복문이 끝나도 참조가 가능하다
		for(j = 0; j < 5; j++) {
			System.out.println("Hello !!");
		}
		System.out.println("j : " + j);
		System.out.println();
		
		// 알파벳 대문자 A부터 Z까지 한줄에 출력하는 코드를 for문으로 구성하세요
		for(char a = 'A'; a <= 'Z'; a++) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		// 입력받은 수 만큼 반복하기
		Scanner sc = new Scanner(System.in);
		System.out.print("길이 입력 : ");
		int length = sc.nextInt();
		
		for(int i = 0; i < length; i++) {
			if(i % 2 == 0)
			System.out.print("#");
			else
				System.out.print("_");
		}
	}
}
