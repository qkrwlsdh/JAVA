package day10;

class Test1 {
	String str;		// 멤버필드는 자동 초기화
	int num;
	
	Test2 ob2 = new Test2();	// 멤버필드가 객체를 가리키는 상태
	Test2 ob3;					// 멤버필드는 존재하지만 대상이 없어서 null인 상태
	
}
class Test2{
	String name = "test2";		// 멤버필드는 직접 초기화가 가능하다 (!= 구조체)
}

public class Ex01_Field {
	public static void main(String[] args) {
		Test1 ob1 = new Test1();
		
		System.out.println(ob1.str);	// 참조변수는 멤버필드일 때 초기값이 null
		System.out.println(ob1.num);	// 원시자료형은 멤버필드일 때 초기값이 0
		
		String str = null;
		int num = 0;					// 초기화되지 않은 지역변수는 출력할 수 없다
		System.out.println(str);
		System.out.println(num);
		
		// . 연산자 기준 왼쪽의 값이 null이면 nullPointerException (참조 대상이 없다)
		
		System.out.println(ob1 + ", " + ob1.ob2);
		System.out.println(ob1.ob2.name + "\n");
		
		System.out.println(ob1 + ", " + ob1.ob3);
		System.out.println(ob1.ob3.name + "\n");	// ob3에는 아무것도 없음
		
	}
}
