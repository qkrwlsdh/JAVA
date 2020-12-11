package day19_runnable;

class MyThread extends Object implements Runnable {
//	The type MyThread must implement the inherited abstract method Runnable.run()
//	Runnable은 추상메서드를 하나만(run()) 가지는, 함수형 인터페이스이다 -> 람다식 객체 생성이 가능하다
	
	@Override
	public void run() {
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
		}
	}	
}

public class Ex02_Runnable {
	public static void main(String[] args) {
		
		MyThread ob = new MyThread();	// 어떤 작업을 수행할지만 적어둔 객체
		Thread th = new Thread(ob);		// 이 작업을 스레드 형식으로 객체 생성
		th.start();
		
		for(int i = 1; i <= 25; i++) {
			System.out.print(i + " ");
		}
		
		/*
		 * 1) Thread 클래스를 상속받는 것 만으로도, 쉽게 동시 다중작업을 구현할 수 있다
		 * 2) 자바에서는 다중 상속을 허용하지 않으므로, 슈퍼클래스가 존재하는 경우 extends Thread가 안된다
		 * 3) extends Thread 대신, implement Runnable을 통해서 같은 과정을 구현할 수 있다
		 * 4) 생성한 Runnable 객체를 Thread의 생성자 매개변수에 넣어주면 된다
		 */
	}
}
