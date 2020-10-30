package day10;

class Circle{
	double radius;		// 반지름 멤버필드 선언
	double pi = 3.14;	// 파이 멤버필드 선언
	double length, square;
	
	// 생성자 : 생성자간의 호출은 가능하지만, *각 생성자의 첫번째 줄에서만 호출할 수 있다*
	// 생성자 내부에서는 다른생성자의 이름으로 호출할 수 없고, *this()의 형식으로 호출한다*
	Circle(){
		this(5.0);
	}
	Circle(int radius){			// 대입 연산자는 좌변과 우변의 자료형이 같아야 한다
		this((double)radius);	// 크기, 범위, 데이터의 호환 여부에 따라 암묵적 형변환 : promotion
	}
	Circle(double radius){
		this.radius = radius;
		length = 2 * radius + pi;
		square = radius * radius * pi;
		
	}
	void show() {				// 출력을 담당하는 메서드
		System.out.printf("둘레 : %.2f cm, 넓이 : %.2f cm²\n", length, square);
	}
}

public class Quiz3 {
	public static void main(String[] args) {
		// 원의 넓이와 둘레를 출력할 수 있는 클래스를 작성하려고 한다
		// 생성자 매개변수에 반지름을 전달하지 않으면 기본값 5
		// 정수를 전달받으면 실수로 변환해서 계산하고
		// 실수는 그대로 전달받아서 처리한다
		// 둘레 : %.2f cm, 넓이 : %.2f cm²
		
		Circle ob1 = new Circle();
		Circle ob2 = new Circle(3);
		Circle ob3 = new Circle(2.2);
		
		ob1.show();
		ob2.show();
		ob3.show();
	}
}
