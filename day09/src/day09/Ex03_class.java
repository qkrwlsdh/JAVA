package day09;

class Student {
	// 멤버 필드 : 객체 내부의 속성값을 저장할 수 있는 변수
	String name;
	int score;
	
	// 멤버 메서드 : 객체들이 호출 할 수 있는 함수, 각각의 멤버 필드에 접근이 가능하다
	void show() {
		System.out.println(name + "의 점수는 " + score + "점 입니다");
	}
}

public class Ex03_class {
	public static void main(String[] args) {
		// 기본자료형은 알파벳 소문자로 시작한다

		// 클래스 자료형은 알파벳 대문자로 시작한다
		
		// 배열과 클래스 자료형은 실제 데이터를 직접 저장하지 않고, 대상의 위치를 저장
		// 참조 변수
		
		int test = 10;
		Student st1 = new Student();
		int[] arr = new int[3];
		
		System.out.println(test);	// 기본 자료형 변수
		System.out.println(st1);	// Student객체를 참조하는 참조변수
		System.out.println(arr);	// int배열을 가리키는 참조변수
		
		st1.name = "이지은";
		st1.score = 97;
		
		st1.show();
	}
}
