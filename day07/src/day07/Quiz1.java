package day07;

public class Quiz1 {
	public static void main(String[] args) {
		
		int[] arr = { 42, 17, 27, 65, 63, 64, 20, 15, 32 };
		
		// 1. arr의 홀수번째 멤버의 합계를 출력하세요
		int oddSum = 0;
		
		for(int i = 0; i < arr.length; i++) {	// 배열 전체중에서		* i는 index, iterable
			if(i % 2 == 1) {					// 순번이 홀수이면
				oddSum += arr[i];				// 합계에 더해라
			}
		}
		System.out.println("홀수번째 멤버의 합계는 : " + oddSum);

		// 2. arr의 짝수번째 멤버의 합계를 출력하세요
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println("짝수번째 멤버의 합계는 : " + sum);
		
		// 3. arr와 크기가 같은 빈 배열 arr2를 생성하고 내용을 그대로 복사하세요
		int[] arr2 = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		System.out.print("arr2 : ");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		// 4. arr2를 오름차순으로 정렬하세요
		for(int i = 0; i < arr2.length - 1; i++) {
			for(int j = i + 1; j < arr2.length; j++) {
				if(arr2[i] > arr2[j]) {
					int tmp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = tmp;
				}
			}
		}
		System.out.print("정렬 후 arr2 : ");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		System.out.print("기존의  arr : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// 5. arr에서 값의 크기가 짝수인 값만 가져와서 새로운 배열 arr3를 생성하고 출력하세요
		
		// 1) arr에서 짝수인 값은 총 몇개인가		(배열은 크기를 변경할 수 없기 때문에)
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				count += 1;
			}
		}
		// 2) 1에서 구한 크기를 이용해서 새로운 배열 arr3을 생성
		int[] arr3 = new int[count];
		int[] arr4 = new int[count];
		
		// 3-1) arr에서 짝수인 값만 찾아서 arr3에 순서대로 대입
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				arr3[cnt++] = arr[i];
			}
		}
		// 3-2)
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				for(int j = 0; j < arr4.length; j++) {
					if(arr4[j] == 0) {
						arr4[j] = arr[i];
						break;
					}
				}
			}
		}
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < arr4.length; i++) {
			System.out.print(arr4[i] + " ");
		}
		System.out.println();
		
	}
}
