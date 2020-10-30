package day03;

public class Ex02_IF {
	public static void main(String[] args) {
		
		// 제어문 : 프로그램의 흐름이나 반복을 제어하는 구문
		
		// if : 만약 조건이 참이면 실행문장을 처리한다
		
		int num = 30;
		
		if(num < 20) {					// 만약 num의 값이 20보다 작으면
			System.out.println(++num);	// num의 값을 1 먼저 증가시키고 출력
		}
		else{							//if(num >= 20) {
			System.out.println(--num);	// num의 값을 1 먼저 감소시키고 출력
			if(num % 2 == 0) {
				System.out.println(num + " : 짝수");
			}
			else {
				System.out.println(num + " : 홀수");
			}
		}
		// if 안에 또다른 if문을 전개해도 상관없다
		// if ~ else if ~ else 형태로 사용해도되고 [1]
		// if, if, if 형태로 사용해도된다			[2]
		
		// [1] if ~ else if ~ else	: 하나만 선택할 경우
		int test1 = 3;
		
		if(test1 == 1)
			System.out.println("1");
		else if(test1 == 2)
			System.out.println("2");
		else
			System.out.println("1도 아니고 2도 아님");
		
		// [2] if, if, if	: 여러 가능성 중 중복 선택이 가능한 경우를 구성하려면 if의 중첩
		test1 = 1;
		
		if(test1 == 1)
			System.out.println(test1);
		if(test1 % 2 != 0)
			System.out.println(test1 + "은 홀수");
		if(0 < test1 && test1 < 10)
			System.out.println(test1 + "은 한 자리의 양의 정수");
		
	}
}
