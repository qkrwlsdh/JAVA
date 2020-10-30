package day10;

class Member{
	String name;
	int age;
	
	void info() {
		
		System.out.println(name + "님은 " + age + "살입니다");
	
	}
	void info(String adult) {
		
		if(adult.equals("adult")) {
			if(age > 19) {
				System.out.println(name + "님은 " + age + "살이고 성인입니다");
			}
			else {
				System.out.println(name + "님은 " + age + "살이고 미성년자입니다");
			}
		}
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.name = "이지은";
		m1.age = 28;
		
		Member m2 = new Member();
		m2.name = "홍길동";
		m2.age = 18;
		
		// 인자값이 없으면 기본형을 반환
		m1.info();
		// 이지은님은 28살입니다
		
		// 인자값이 있으면 값을 비교해서 해당하는 내용을 추가로 반환
		m2.info("adult");
		// 홍길동님은 16살이고 미성년자입니다
	}
}
