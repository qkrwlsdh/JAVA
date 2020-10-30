package day05;

public class Quiz {
	public static void main(String[] args) {
		
		for(int dan = 1; dan < 10; dan++) {
			for(int i = 2; i < 6; i++) {								// 2단부터 5단까지
				System.out.printf("%d * %d = %2d\t", i, dan, i * dan);
			}
			System.out.println();
		}
		System.out.println();
		for(int dan = 1; dan < 10; dan++) {
			for(int i = 6; i < 10; i++) {								//6단부터 9단까지
				System.out.printf("%d * %d = %2d\t", i, dan, i * dan);
			}
			System.out.println();
		}
	}
}
