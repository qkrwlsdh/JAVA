package day12;

import java.util.Scanner;

public class Ex02_sample {
	public static void main(String[] args) {
		// 객체가 있어야만 호출하는 메서드 (일반)
		Scanner sc = new Scanner("안녕하세요 반갑습니다");
		String test1 = sc.next();	// 객체.메서드();
		System.out.println(test1);
		sc.close();
		
		// 객체를 생성하지 않고 메서드를 호출하는 예시
		String test2 = String.format("%.2f\n", 95.331234);
		System.out.println(test2);
		
		int num = Integer.parseInt("12");
		System.out.println(num - 4);
		
		Integer num2 = new Integer(5);
		System.out.println(num2.max(4, 7));		// 객체로도 접근가능
		System.out.println(Integer.max(4, 7));	// 그러나 클래스로 접근하는게 정석
	}
}
