package day06;

public class Quiz1 {
	static int reverse(int num) {	// 반드시 하나의 정수값을 return해야 한다
		int ret = 0;
		while(num > 0) {
			ret += num % 10;
			ret *= 10;
			num /= 10;
		}
		return ret / 10;
	}
	
	static double getObesityRate(double height, double weight) {
		
			return (weight / (height - 100) * 0.9) * 100;
	}
	
	public static void main(String[] args) {
		
		int num = 1234;
		int ret = reverse(num);
		
		System.out.println(num + "을 뒤집으면 " + ret);
		
		System.out.println(reverse(98765));
		
		
		// 키와 체중을 실수형태로 전달받아서, 비만도를 반환하는 함수를 만들자
		// (현재 체중 / (키 - 100) * 0.9) * 100 = 비만도
		double rate = getObesityRate(171.25, 65.54);
		System.out.printf(" \"%.2f %%\" ", rate);
	}
}
