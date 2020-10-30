package day06;

public class Quiz2 {
	
	static int getMaxInt(int num1,int num2) {				// 1번
		
		if(num1 > num2) {
			return num1;
		}
		else {
			return num2;
		}
		
//		return num1 > num2 ? num1 : num2;
	}
	
	static int getMaxInt(int num1, int num2, int num3) {	// 2번
//		int result = 0;
//		if(num1 > num2) {
//			if(num1 > num3) {
//				result = num1;
//			}
//		}
//		if(num2 > num1) {
//			if(num2 > num3) {
//				result = num2;
//			}
//		}
//		if(num3 > num1) {
//			if(num3 > num2) {
//				result = num3;
//			}
//		}
//		return result;
		
		int max = num1;		// num1이 최대값이라고 가정하고
		if(max < num2)		// 만약, num2가 최대값보다 크면
			max = num2;		// num2가 최대값이다
		if(max < num3)		// 만약, num3가 최대값보다 크면
			max = num3;		// num3이 최대값이다
		return max;			// 구해진 최대값을 반환한다
	}
	
	static int getSum(int num1, int num2) {					// 3번
		
//		int result = 0;
//		
//		if(num1 > num2) {
//			for(int i = num2; i <= num1; i++) {
//				result += i;
//			}
//		}
//		else {
//			for(int i = num1; i <= num2; i++) {
//				result += i;
//			}
//		}
//		return result;
		
		int max = getMaxInt(num1, num2);
		int min = num1 < num2 ? num1 : num2;
		int sum = 0;
		
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// 1) 두 정수를 전달받아서 큰 수를 반환하는 함수 getMaxInt
		System.out.println(getMaxInt(3, -5));	// 3
		
		// 2) 세 정수를 전달받아서 가장 큰 수를 반환하는 함수 getMaxInt
		System.out.println(getMaxInt(2, 4, 3));	// 4
		
		// 3) 두 정수를 전달받아서 두 정수 사이의 합계를 반환하는 함수 getSum
		//    두 정수의 전달 순서에 상관없이 사이의 값을 구할 수 있도록 만들기
		System.out.println(getSum(1, 10));		// 55
	}
}		// 반환값을 만들어서하면 편리하다

		// overloading	: 중복 정의
		// overriding	: 재정의