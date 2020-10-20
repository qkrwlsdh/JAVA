package day02;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		// 1. Scanner를 이용하여 입력받으세요
		//		이름과 나이를 입력받고 나이가 20살 미만이면 미성년자, 이상이면 성인을 출력하세요
		//		if ~ else를 이용하여 출력해보고, 삼항연산자를 활용하여 출력해보세요
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("이름 : ");
//		String name = sc.nextLine();
//		System.out.print("나이 : ");
//		int age = sc.nextInt();
//		
//		if(age < 20) {
//			System.out.println(name + "님은 미성년자입니다");
//		}
//		else{
//			System.out.println(name + "님은 성인입니다");
//		}
//		
//		System.out.println(name + "님의 나이는 " + age + "입니다");
//		
//		System.out.println(age >= 20 ? "성인" : "미성년자");
		
		String name, adult;
		int age;
		
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		if(age >= 20)	adult = "성인";
		else			adult = "미성년자";
		
		adult = age >= 20 ? "성인" : "미성년자";
		
		System.out.println(name + "님은 " + age + "살이고, " + adult + "입니다");
		
		
		// 2. 사용자에게 주민등록번호 뒷자리 첫번째(성별) 숫자를 입력받아서
		//		1이면 1900년대 남성
		//		2이면 1900년대 여성
		//		3이면 2000년대 남성
		//		4이면 2000년대 여성
		//		을 출력하는 코드를 switch ~ case를 활용하여 작성하세요
		
		int num;
		System.out.print("주민번호 뒷자리 첫 숫자 입력 : ");
		num = sc.nextInt();
		
		switch(num) {		// 자바의 switch에는 String을 넣을 수 있다
		case 1: case 2:
			System.out.println("1900년대 출생"); break;
		case 3: case 4:
			System.out.println("2000년대 출생"); break;
			default:
				System.out.println("잘못된 입력입니다");
		}
		
	}
}
