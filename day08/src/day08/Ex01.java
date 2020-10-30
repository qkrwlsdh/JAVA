package day08;

public class Ex01 {
	public static void main(String[] args) {
//		int[] arr1 = new int[3];
//		int[] arr2 = new int[3];
//		int[] arr3 = new int[3];
//		
//		int[][] arr = { arr1, arr2, arr3 };
		
		int[][] test = {
		//		i \ j	[i][0], [i][1], [i][2]		
		/* test[0] */		{ 0, 0, 0 },
		/* test[1] */		{ 0, 0, 0 },
		/* test[2] */		{ 0, 0, 0 },
				};
		
		int num = 1;
		for(int i = 0; i < test.length; i++) {
			System.out.print(test[i] + "\t");
			for(int j = 0; j < test[i].length; j++) {
				test[i][j] = num++;
				System.out.print(test[i][j] + " ");
			}
			System.out.println();
		}
		
	}	// end of main
}	// end of class
