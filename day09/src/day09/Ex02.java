package day09;

class Human {		// 이 프로그램에서 사람이라는 형태를 나타내기 위한 자료형
	String name;	// 세부항목으로 이름
	int age;		// 나이를 포함하고 있다
	
	void show() {
		System.out.println(name + "님은 " + age + "살입니다");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		
		Human h1 = new Human();		// Human 자료형으로 새로운 객체를 생성하는 코드
		h1.name = "원빈";		// .(dot) 연산자를 이용하여 객체의 내부 속성에 접근한다
		h1.age = 44;
		
		Human h2 = new Human();
		h2.name = "현빈";
		h2.age = 39;
		
		Human h3 = new Human();
		h3.name = "박현빈";
		h3.age = 40;
		
		Human[] arr = new Human[] { h1, h2, h3 };
		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i].name + "님은 " + arr[i].age + "살 입니다");
			arr[i].show();
		}
		
		// 기본자료형으로 만들어낼 수 있는 데이터의 형식은 제한이 많다
		
		// 변수 : 자료형(크기)을 동반하여 메모리 공간을 확보하고 데이터를 저장하는 공간
		
		// 배열 : 같은 자료형의 여러 데이터를 연속적인 공간에 저장할 수 있는 구조
		
		// 구조체 : 서로 다른 자료형의 여러 데이터를 하나로 묶을 수 있는 사용자 정의 [자료형]
		// -> 속성정보만 묶을 수 있고, 함수(기능)을 포함할 수 없다
		
		// 클래스 : 구조체 + 함수, 속성과 기능을 같이 포함하는 자료형
		// 하나의 데이터를 만들기 위한 사용자 정의 [자료형]
		// 서로 다른 자료형의 변수도 포함할 수 있고, 함수도 포함할 수 있다
	}
}
