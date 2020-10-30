package day08;

public class Ex03 {
	
	static void print2dArr(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {			// 여러 줄 중에
			for(int j = 0; j < arr[i].length; j++) {	// 한 줄을 출력
				System.out.printf("%3d ", arr[i][j]);
			}
			System.out.println();	// 한 줄이 끝나면 줄 바꿈
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		int size = 5;
		int[][] arr = new int[size][size];
		
		// 1)
		/*
		 * 		1 10 11 20 21		i[1] j[1]부터 i[5] j[1] 1 ~ 5
		 * 		2  9 12 19 22		i[5] j[2]부터 i[1] j[2] 6 ~ 10
		 * 		3  8 13 18 23		i[1] j[3]부터 i[5] j[3] 11 ~ 15
		 * 		4  7 14 17 24		i[5] j[4]부터 i[1] j[4] 16 ~ 20
		 * 		5  6 15 16 25
		 */
		int num = 1;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(i % 2 == 0) {
					arr[j][i] = num++;
				}
				else {
					arr[4 - j][i] = num++;
				}
			}
		}print2dArr(arr);
		
		// 2)
		/*
		 * 		1  2  3  4  5
		 * 		16 17 18 19 6
		 * 		15 24 25 20 7
		 * 		14 23 22 21 8
		 * 		13 12 11 10 9
		 */
		int x = -1, y = 0, plus = 1, length = 5;
		int num2 = 1;
		
//		arr[0][0] = num2++;
//		arr[0][1] = num2++;
//		arr[0][2] = num2++;
//		arr[0][3] = num2++;
//		arr[0][4] = num2++;
//		for(int i = 0; i < length; i++) {
//			x += plus;
//			arr[y][x] = num2++;
//		}print2dArr(arr);
		
//		arr[0][4] = num2++;
//		arr[1][4] = num2++;
//		arr[2][4] = num2++;
//		arr[3][4] = num2++;
//		arr[4][4] = num2++;
//		length -= 1;
//		for(int i = 0; i < length; i++) {
//			y += plus;
//			arr[y][x] = num2++;
//		}print2dArr(arr);
		
//		arr[4][3] = num2++;
//		arr[4][2] = num2++;
//		arr[4][1] = num2++;
//		arr[4][0] = num2++;
//		for(int i = 0; i < length; i++) {
//			x -= plus;
//			arr[y][x] = num2++;
//		}print2dArr(arr);
		
//		arr[4][0] = num2++;
//		arr[3][0] = num2++;
//		arr[2][0] = num2++;
//		arr[1][0] = num2++;
		
//		arr[1][1] = num2++;
//		arr[1][2] = num2++;
//		arr[1][3] = num2++;
		
//		arr[2][3] = num2++;
//		arr[3][3] = num2++;
		
//		arr[3][2] = num2++;
//		arr[3][1] = num2++;
		
//		arr[2][1] = num2++;
		
//		arr[2][2] = num2++;
		
		while(true) {
			for(int i = 0; i < length; i++) {
				x += plus;
				arr[y][x] = num2++;
			}
			length -= 1;
		}
		
		
						
	}	// end of main
}	// end of class
