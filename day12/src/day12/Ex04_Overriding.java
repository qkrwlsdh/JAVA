package day12;

class Pos2D {
	int x, y;
	
	void showPos() {
		System.out.println("x : " + x + ", y : " + y);
	}
}

class Pos3D extends Pos2D {	// 슈퍼클래스의 필드와 메서드를 그대로 가져온다
	// 추가하고 싶은 요소를 작성한다
	int z;
	
//	void showPos3D() {
	
	@Override			// 이건 재정의된 메서드입니다 !!
	void showPos() {	// 슈퍼클래스의 메서드와 동일한 형식을 사용하면 메서드를 덮어쓴다 (오버라이딩)
		System.out.println("x : " + x + ", y : " + y + ", z : " + z);
	}
}

public class Ex04_Overriding {
	public static void main(String[] args) {
		
		// 1. 상속받은 서브클래스는 슈퍼클래스의 필드와 메서드를 그대로 가지고 있다
		Pos2D ob1 = new Pos2D();
		ob1.x = 2;
		ob1.y = 3;
		ob1.showPos();		// 2차원의 좌표를 출력하는 메서드
		
		Pos3D ob2 = new Pos3D();
		ob2.x = 12;
		ob2.y = 14;
		ob2.z = 6;
		ob2.showPos();		// 이름은 같지만 3차원의 좌표를 출력하는 메서드 (내용이 재정의되었다)
		
		
	}
}
