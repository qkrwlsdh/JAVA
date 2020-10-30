package day05;

public class Ex03_doubleFor {
	public static void main(String[] args) {
		
//		int dan = 3;
		
		// 2단에서 9단까지	(8 * 9 = 72번 출력됨)
		for(int dan = 2; dan < 10; dan++) {		// 2 ~ 9 : 8번 반복
			for(int i = 1; i < 10; i++) {		// 1 ~ 9 : 9번 반복
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < 4; i++) {		// 세로로 출력
			for(int j = 0; j < 15; j++) {	// 가로로 출력
				System.out.print("♬ ");		// 줄바꿈 없음
			}
			System.out.println();
		}
		System.out.println();
	}
}
