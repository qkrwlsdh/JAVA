package day02;

public class Ex04_Print {
	public static void main(String[] args) {
		
		System.out.print("print");			// 줄 바꿈 없이 출력만 하는 함수
		System.out.println("println");		// 출력 이후 한줄 자동으로 바꾸는 함수
		System.out.printf("printf");		// 줄 바꿈은 없으나, 서식문자를 사용하는 함수
		
		System.out.print("A" + "B" + "C" + "\n");
		System.out.println("D" + "E" + "F");
		System.out.printf("G" + "H" + "I");
		
		System.out.println("end");
		
		int kor = 100, eng = 99, mat = 87;
		double avg = (kor + eng + mat) / 3;			// 정수와 정수를 계산했기때문에 95.0으로 정수가 나옴
//		double avg = (kor + eng + mat) / 3.0;
//		double avg = (kor + eng + mat) / (double)3;
		System.out.println(avg);
		
		System.out.printf("평균 : %.2f\n", avg);
		
		/*
		 * 서식 제어 문자
		 * 
		 * %d : 10진수			%02d : 숫자가 한자리면 앞에 0을 채운다
		 * %f : 부동소수점 실수		%.2f : 소수점 이하 둘째자리까지 출력한다
		 * %c : 단일 문자 (char)
		 * %s : 문자열 (String)
		 */
		
		int hour = 2;
		int minute = 20;
		System.out.printf("현재 시간은 [%02d : %02d]\n", hour, minute);
	}
}
