package day07;

public class Ex04_Sort {
	public static void main(String[] args) {
		int[] arr = new int[] { 4, 8, 2, 7, 6 };
		
		System.out.print("arr : ");		// 정렬 전 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
		
		// 선택 정렬
		for(int i = 0; i < arr.length - 1; i++) {	// 기준
			for(int j = i + 1; j < arr.length; j++) {	// 대상
				if(arr[i] > arr[j]) {				// 바꿀 조건
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.print("arr : ");		// 정렬 후 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
	}
}
