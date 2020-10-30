package day06;

public class Quiz4 {
	
	static int getSummary(int n1) {
		int sum = 0;
//		  1) 초기값 선언; 2) 반복조건; 4) 증감연산
		for(int i = 0; i <= n1; i++) {
			sum += i;	// 3) 실행문;
		}
		return sum;
	}
//	static int getSummary(int end) {
//		return getSummary(0, end, 1);
//	}
	
	static int getSummary(int n1, int n2) {
		int sum = 0;
		for(int i = n1; i <= n2; i++) {
			sum += i;
		}
		return sum;
	}
//	static int getSummary(int start, int end) {
//		return getSummary(start, end, 1);
//	}
	
	static int getSummary(int n1, int n2, int n3) {
		int sum = 0;
		for(int i = n1; i <= n2; i += n3) {
			sum += i;
		}
		return sum;
	}
//	static int getSummary(int start, int end, int plus) {
//		int sum = 0;
//		for(int i = start; i <= end; i += plus) {
//			sum += i;
//		}
//		return sum;
//	}
	
	public static void main(String[] args) {
	
		int n1 = getSummary(10);
		int n2 = getSummary(1, 10);
		int n3 = getSummary(1, 100, 2);
		
		System.out.println("0부터 10의 누적합계 (step 1) : " + n1);
		System.out.println("1부터 10의 누적합계 (step 1) : " + n2);
		System.out.println("1부터 100의 누적합계 (step 2) : " + n3);
	}
}
