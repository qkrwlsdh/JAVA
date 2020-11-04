package day12;

class Human {
	String name;
	int age;
	// 기본생성자를 작성하지 않아서 !!
	Human(String name, int age){
		System.out.println("부모(super)클래스 생성자 호출 !!");
		this.name = name;
		this.age = age;
	}
	void show() {
		System.out.println(name + " : " + age);
	}
}
class Teacher extends Human {
	String subject;
	
	Teacher(String name, int age, String subject) {
		super(name, age);	// 자신의 슈퍼클래스 (= Human)  의 생성자를 호출하면서 인자를 전달한다
		this.subject = subject;
		System.out.println("자식(sub)클래스 생성자 호출 !!");
	}
	@Override
	void show() {
		System.out.println(name + " : " + age + "(" + subject + ")");
	}
}

public class Ex05_Super {
	public static void main(String[] args) {
		Human ob1 = new Human("이지은", 28);
		Teacher ob2 = new Teacher("원종래", 36, "자바");
		
		ob1.show();
		ob2.show();
	}		
}
