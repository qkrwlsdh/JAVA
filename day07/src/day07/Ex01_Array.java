package day07;

public class Ex01_Array {
	public static void main(String[] args) {

		// 변수 : 어떤 데이터를 담기 위한 자료형 크기에 따른 메모리 공간
		
		int n1 = 11, n2 = 22, n3 = 33, n4 = 44, n5 = 55;
		int sum1 = 0;
		
		sum1 += n1;		// 변수의 개수가 증가할 때 마다
		sum1 += n2;		// 처리하는 식이 점점 같이 증가한다
		sum1 += n3;
		sum1 += n4;
		sum1 += n5;
		System.out.println("sum1 : " + sum1);
		
		
		// 배열 : (같은 자료형의)여러 데이터를 연속적인 공간에 담아서 관리하기 위한 구조
		
		int[] arr = { 12, 23, 34, 45, 56 };
		int sum2 = 0;
		
//		sum2 += arr[0];
//		sum2 += arr[1];
//		sum2 += arr[2];
//		sum2 += arr[3];
//		sum2 += arr[4];
		
		// 길이가 길어져도 식이 변하지 않는다
		for(int i = 0; i < arr.length; i++)
			sum2 += arr[i];
		
		System.out.println("sum2 : " + sum2);
		
		// 순번에 상관없이 배열 내부에 있는 모든 멤버에 대해서 실행한다
		int sum3 = 0;
		for(int num : arr)
			sum3 += num;
		
		System.out.println("sum3 : " + sum3);
		
		// 배열을 생성하는 방법
		int[] arr2;
		int arr3[];
//		int arr4[5];	*선언하면서 배열이름에 길이를 넣지 않는다*
		
		int[] arr5 = new int[5];	// 1.길이를 알려주고 만든 배열
		
		for(int num : arr5)
			System.out.println("num : " + num);
		
		// 2.요소를 직접 작성한 배열
		int[] arr6 = new int[] { 4, 2, 8, 6, 7 };	
		
//		int[] arr7 = new int[5] { 1, 2, 3, 4, 5 };	 *길이와 요소를 동시에 제공하지 않는다*
		
		
		int[] arr8 = new int[] { n1, n2, n3, n4, n5 };
		
		int sum8 = 0;
		for(int num : arr8) {
			sum8 += num;
		}
		double avg = sum8 / (double)arr8.length;
		System.out.println("합계 : " + sum8 + ", 평균 : " + avg);
		
		// 배열은 순번(첨자, index)을 기반으로 값(value)에 접근하는 구조이다
		// 배열의 멤버 요소는 일반 변수와 동일하게 취급한다
		// 이미 만들어진 값을 배열로 묶는것도 가능하다
		// 배열의 순번은 항상 0부터 시작한다
		// 배열의 마지막 순번은 [arr.length(배열길이) - 1]이다
		// 배열의 길이와 같은 순번은 존재하지 않는다
		
		// 만약 배열의 범위를 벗어나는 접근을 시도하면
		// ArrayIndexOutOfBoundsException을 발생시킨다
		
		System.out.println(arr8[100]);
		}
	}

