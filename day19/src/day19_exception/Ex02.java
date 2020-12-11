package day19_exception;

class MyClass{
	public void test() throws ArithmeticException{	// Caller에게 예외 처리를 전가
		int n1 = 4;
		int n2 = 0;
		
		System.out.println(n1 / n2);	// 여기서 예외가 발생
	}
}

public class Ex02 {
	public static void main(String[] args) {
		MyClass ob = new MyClass();
		try {
			ob.test();
		} catch(ArithmeticException e) {
			System.out.println("숫자를 0으로 나눌수없습니다.");
		}
//		ob.test() 호출 -> test 실행 중 예외가 발생
//		main() : Caller, ob.test	호출한 사람
//		ob.test() : Callee 호출 당한 사람, 여기서 예외가 발생한건 맞지만...
	}
}
