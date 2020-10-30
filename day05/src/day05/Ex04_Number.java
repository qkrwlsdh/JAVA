package day05;

public class Ex04_Number {
	public static void main(String[] args) {

		// 1) System.out.printf("%2d ", num);
		/*
		 *      1  2  3  4  5
		 *      6  7  8  9 10
		 *     11 12 13 14 15
		 *     16 17 18 19 20
		 *     21 22 23 24 25
		 */
//		int num = 1;
//
//		for (int i = 0; i < 5; i++) { 				// 세로
//			for (int j = 0; j < 5; j++) {			// 가로
//				System.out.printf("%2d ", num++);
//			}
//			System.out.println(); 					// 한 줄이 끝나면 줄 바꿈
//		}
//		System.out.println(); 						// 전체(5줄)가 끝나면 줄 바꿈
		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.printf("%2d ", i * 5 + j + 1);
//			}
//			System.out.println();
//		}
		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				if((i + j) % 2 == 0)	System.out.print("* ");
//				else					System.out.print("  ");
//			}
//			System.out.println();
//		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("<%d, %d> ", i, j);
			}
			System.out.println("\n");
		}
		System.out.println();
		
		// 테두리만 글자 찍기
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				boolean flag = i == 0 || i == 4 || j == 0 || j == 4;
				if(flag)	System.out.print("* ");
				else		System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 엑스자로 글자 찍기
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				boolean flag = (i == j) || (i + j == 4);
				if(flag)	System.out.print("* ");
				else		System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
