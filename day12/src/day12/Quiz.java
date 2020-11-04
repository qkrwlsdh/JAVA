package day12;

class Line{
	static int size;
	final int num = 2;		// final 필드 : 값이 변하지 않는 필드, 상수화
							// 절대 변하지 않는 값이니까, 초기값을 부여해야 한다
	
	Line(int size){
//		this.size = size;	// this는 객체 자신을 가리키는 키워드, 참조변수
		Line.size = size;	// 클래스로 접근하자
	}
	void show() {
		for(int i = 0; i < size; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}

public class Quiz {
	public static void main(String[] args) {
		Line li1 = new Line(2);
		Line li2 = new Line(15);
		
		li1.show();
		li2.show();
		
	}
}
