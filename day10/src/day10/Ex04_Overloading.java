package day10;

class Position{			// 위치정보를 표시할 수 있는 클래스
	int x;				// x축 좌표의 값을 저장하는 멤버필드
	int y;				// y축 좌표의 값을 저장하는 멤버필드
	
	void init() {		// 초기화 함수 (전달값이 없으면 모두 1로 초기화 한다)
		x = 1;
		y = 1;
	}
	void init(int a) {		// 초기화 함수 (전달값이 하나 있으면 x의 값을 처리한다)
		x = a;
	}
	void init(int a, int b) {		// 초기화 함수 (전달값이 두개 있으면 각각 처리한다)
		x = a;
		y = b;
	}
	void show() {
		System.out.println("x : " + x + ", y : " + y);
	}
}

public class Ex04_Overloading {
	public static void main(String[] args) {
		Position ob1 = new Position();
		Position ob2 = new Position();
		Position ob3 = new Position();
		
		ob1.init();			// 멤버필드의 초기값을 할당
		ob2.init(3);		// 객체 생성 이후의 작동을 제어
		ob3.init(5, 12);
		
		ob1.show();
		ob2.show();
		ob3.show();
	}
}
