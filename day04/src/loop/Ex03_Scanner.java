package loop;

import java.util.Scanner;

public class Ex03_Scanner {
	public static void main(String[] args) {
		
		String input = "1234";
		System.out.println(input + 4);
		
		int num = Integer.parseInt(input);
		System.out.println(num + 4);
		
		Scanner sc = new Scanner(System.in);
		
		// 1) 버퍼에 엔터가 남는 경우
		System.out.print("정수 입력 : ");
		int n1 = sc.nextInt();				// 정수, \r, \n
		System.out.print("문자열 입력 : ");
		String s1 = sc.next();				// 엔터에 상관없이 (공백문자까지)
		System.out.println(n1 + ", " + s1);
		sc.nextLine();	// 1번 예제에서 사용했던 버퍼를 비우기
		
		// 2) 모든 입력을 문자열로 처리하고, 상황에 맞게 자료형을 강제로 변환하기
		System.out.print("정수 입력 : ");
		String input2 = sc.nextLine();		// 띄워쓰기 포함 엔터까지 입력받기
		int n2 = Integer.parseInt(input2);	// 입력받은 문자열을 정수로 형태를 변환 (파싱)
		System.out.println(n2 + 1);
		
		// 3)
		System.out.print("n3 입력 : ");
		int n3 = Integer.parseInt(sc.nextLine());	// 버퍼에 엔터가 남지 않는다
		System.out.println("n3 : " + n3);
		
		String sample = "동해물과 백두산이 마르고 닳도록\n"	// 따옴표 안에서 바로 엔터
				+ "하느님이 보우하사 우리나라만세\n"
				+ "무궁화 삼천리 화려강산\n"
				+ "대한사람 대한으로 길이 보전하세\n";
		System.out.println(sample);
		
		Scanner sc2 = new Scanner(sample);		// 문자열도 Scanner로 읽을 수 있다
		
		System.out.println(sc2.next());			// 공백까지만
		System.out.println(sc2.nextLine());		// 엔터까지만
		System.out.println();
		
		Scanner sc3 = new Scanner(sample);
		
		while(sc3.hasNext()) {					// next()값이 있는지 없는지 확인해서 있으면
			System.out.println(sc3.next());		// 그 다음값을 출력
		}System.out.println();

		Scanner sc4 = new Scanner(sample);
		
		while(sc4.hasNextLine()) {					// nextLine()값이 있는지 없는지 확인해서 있으면
			System.out.println(sc4.nextLine());		// 그 다음값을 출력
		}System.out.println();
		
	}
}
