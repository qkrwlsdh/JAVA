package day17;

import java.util.ArrayList;

class Member{
	protected String name;
	protected int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void show() {
		System.out.println(name + " : " + age + "살");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

class VIP extends Member{
	
	public VIP(String name, int age) {
		super(name, age);
	}
	@Override
	public void show() {
		System.out.println("=== VIP ===");
		System.out.println(name + " : " + age + "살");
	}
	
	public void test() {
		System.out.println("vip 고유 메서드");
	}
}


public class Ex03 {
	public static void main(String[] args) {
		
		Member[] arr = new Member[3];
		
		arr[0] = new Member("이지은", 28);
		arr[1] = new Member("홍진호", 37);
		arr[2] = new Member("원종래", 36);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].show();
		}
		System.out.println();
		
		ArrayList al1 = new ArrayList();
//		ArrayList is a raw type.
//		References to generic type ArrayList<E> should be parameterized
		
		al1.add(new Member("이지은", 28));
		al1.add(new Member("홍진호", 37));
		al1.add(new Member("원종래", 36));
		
		for(int i = 0; i < al1.size(); i++) {
//			al1.get(i).show();
//			객체를 ArrayList에 넣으면, Object타입으로 취급된다
//			Object클래스에는 show()메서드가 정의되어 있지 않다 -> 호출 불가
//			1) 다운 캐스팅, 강제 형변환
//			((Member)al1.get(i)).show();
			
			Member m = (Member)al1.get(i);
			m.show();
		}
		
		// Member만 넣어서 관리하는 ArrayList al2
		ArrayList<Member> al2 = new ArrayList<Member>();
		
		// 컬렉션, 클래스, 함수 등에 특정 자료형을 제한하는 문법 -> 제네릭
		// 자바 1.5부터 등장, 컬렉션에는 제네릭을 지정하는 편이 안전하다
		
		al2.add(new Member("공유", 40));
		al2.add(new Member("김고은", 30));
		al2.add(new Member("김옥빈", 33));
		al2.add(new VIP("홍길동", 20));	// Member의 자식클래스 객체
		
		for(int i = 0; i < al2.size(); i++) {
			al2.get(i).show();
			// 내부의 객체들이 자료형 Member로 취급되고 있다 -> 형변환이 필요 없다
		}
		al2.get(3).show();
//		al2.get(3).test();	제네릭 타입이 Member인데
//							Member에는 test()메서드가 선언되어 있지 않으므로 호출 불가
		
		VIP v = (VIP)al2.get(3);
		v.test();
//		= ((VIP)al2.get(3)).test();
		
		// 컬렉션에서 내부 요소의 자료형을 명시하는 기능을 제네릭으로 수행한다
		Member[] arr1;
//		ㄴ>
		ArrayList<Member> list1;
	}
}
