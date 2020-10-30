package day10;

class Member2{
	String name;
	int age;
	
	String info() {
		String ret = name + "님은 " + age + "살입니다";
		return ret;		// * 함수의 반환값은 함수의 호출값을 대체한다 *
	}
	String info(String option) {
		// 문자열 비교 >> A.equals(B)
		String ret;
		if(option.equals("adult")) {
			String adult = age >= 20 ? "성인" : "미성년자";
				ret = name + "님은 " + age + "살이고 ";
				ret += adult + "입니다";
		}
			else {
				ret = info();
			}				// 자바는 switch ~ case에서 문자열을 비교할 수 있다
			return ret;
	}							
}
public class Quiz1_T {
	public static void main(String[] args) {
		Member2 m1 = new Member2();
		m1.name = "이지은";
		m1.age = 28;
		
		Member2 m2 = new Member2();
		m2.name = "홍길동";
		m2.age = 18;
		
		// 인자값이 없으면 기본형을 반환
		System.out.println(m1.info());
		// 이지은님은 28살입니다
		
		// 인자값이 있으면 값을 비교해서 해당하는 내용을 추가로 반환
		System.out.println(m2.info("adult"));
		// 홍길동님은 16살이고 미성년자입니다

	}
}
