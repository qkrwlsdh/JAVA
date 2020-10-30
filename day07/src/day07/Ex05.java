package day07;

public class Ex05 {
	
	static void printArray(int[] arr) {			// 정수 배열을 전달받아서
		System.out.print("arr : ");
		for(int i = 0; i < arr.length; i++) {	// 길이만큼 반복
			System.out.print(arr[i] + " ");		// 각 요소를 출력
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		// 배열을 출력하는 함수를 만들어서 쓰기
		int arr[] = new int[3];
		int num = 1;
		
		for(int i = 0; i < arr.length; i++) {		// ㄱ	arr배열에서 빈칸(0)이면
			if(arr[i] == 0) {
			arr[i] = num;		// num을 대입하고
			num += 2;			// 2 증가
			}
		}
		printArray(arr);							// ㄴ	값을 늘려주는 식
		
		int[] tmp = new int[arr.length + 3];		// ㄱ	3 + 3
		for(int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		arr = tmp;		// tmp가 가지는 참조값을 arr에게 똑같이 전달해라
						// arr가 tmp와 같은 배열을 바라보게 해라
		printArray(arr);							// ㄴ	배열을 늘려주는 식
		
		for(int i = 0; i < arr.length; i++) {		// ㄱ
			if(arr[i] == 0) {
			arr[i] = num;
			num += 2;
			}
		}
		printArray(arr);							// ㄴ	값을 늘려주는 식
		
		tmp = new int[arr.length + 3];				// ㄱ	3 + 3
		for(int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		arr = tmp;		// tmp가 가지는 참조값을 arr에게 똑같이 전달해라
						// arr가 tmp와 같은 배열을 바라보게 해라
		printArray(arr);							// ㄴ	배열을 늘려주는 식
		
		for(int i = 0; i < arr.length; i++) {		// ㄱ
			if(arr[i] == 0) {
			arr[i] = num;
			num += 2;
			}
		}
		printArray(arr);							// ㄴ	값을 늘려주는 식
	}
}
