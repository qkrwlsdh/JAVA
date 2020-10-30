package day07;

public class Ex03 {
	public static void main(String[] args) {
		
		int n1 = 10, n2 = 20;
		// 두 변수의 값을 서로 바꾸려면 어떻게?
		
		System.out.println("n1 : " + n1 + ", n2 : " + n2);
		// 변수는 동시에 하나의 값만 저장한다
		// 새로운 값을 대입하면 기존의 값이 사라진다
		// 대입연산은 우변의 값을 좌변의 공간에 복사하여 대입한다

		int tmp;
		
		tmp = n1;	// 백업
		n1 = n2;
		n2 = tmp;
		System.out.println("n1 : " + n1 + ", n2 : " + n2);
	}
}
