package day19_runnable;

public class Ex03_Lambda {
	public static void main(String[] args) {	// main도 하나의 스레드다
		
		/*
		 * () 에는 메서드의 인자값을 작성
		 * -> 인자값을 전달받아서 수행할거다
		 * {} 메서드의 수행 코드를 작성하면 된다
		 */
		
		Thread alpha = new Thread(() -> {
			for(char ch = 'a'; ch <= 'z'; ch++) {
				System.out.print(ch + " ");
			}
		});
		alpha.start();
		
		for(int i = 1; i <= 25; i++) {
			System.out.print(i + " ");
		}
	}
}
