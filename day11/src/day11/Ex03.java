package day11;

class Member{
	private String name;
	private int age;
	
	Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	// 각 필드에 대한 getter/setter를 작성
	public void setName(String name) {	// 입력값이 String
		this.name = name;
	}
	public String getName() {	// 반환값이 String
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void show() {
		System.out.println(name + "님은 " + age + "살입니다");
	}
}	// end of class

public class Ex03 {
	public static void main(String[] args) {
		Member m1 = new Member("김소영", 25);
		
//		m1.name = "뽀로로";
		
		m1.setName("임소영");
		m1.setAge(27);
		m1.show();
		System.out.println("이름 : " + m1.getName());
		System.out.println("나이 : " + m1.getAge());
	}
}
