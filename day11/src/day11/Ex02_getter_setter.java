package day11;

import day11.Human;		// 선언하지 않아도 같은 패키지 내에서는 다른 클래스 참조 가능

class Human2{
	private String name;
	private int age;
	
	public Human2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// 문자열을 전달받아서 이름을 수정하는 메서드 (값을 세팅하는 메서드)
	public void setName(String name) {	// setter
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void show() {
		System.out.println(name + "님의 나이는 " + age + "살입니다");
	}
}

public class Ex02_getter_setter {
	public static void main(String[] args) {
		Human h2 = new Human("홍진호", 37);
		h2.show();
		
		// 생성된 객체의 값을 수정하고 싶다면 -> 메서드를 통해서 수정해야 한다 (메서드가 없다)
//		h2.name = "콩진호";
		
		Human2 h3 = new Human2("이병건", 39);
//		h3.name = "침착맨";	// 접근 제한에 의해서 직접적인 대입은 안된다
		h3.setName("침착맨");
		
		// h3객체의 나이를 수정할 수 있는 setter를 만들고 나이를 38로 대입하여 실행하세요
		h3.setAge(38);
		
		h3.show();
	}

}
