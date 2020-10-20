package day02;

public class Quiz {
	public static void main(String[] args) {
		String name;
		int age;
		int nowYear;
		int birthYear;
		
		// 위 변수에 자신의 이름과 나이를 대입하고 올해 연도를 이용하여 출생연도를 구하세요
		
		// 이름과 나이와 출생연도를 화면에 출력하세요
		
		name = "박진오";
		age = 28;
		nowYear = 2020;
		birthYear = nowYear - age + 1;
		
		System.out.println(name + "님의 나이는 " + age + "살이고 출생 연도는 " + birthYear + "년 입니다");
		
//		String result = name + "님의 나이는 " + age + "살이고 출생 연도는 " + birthYear + "년 입니다";
//		System.out.println(result);
	}
}
