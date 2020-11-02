package day11;

import java.util.Scanner;

class Student{
	private String name;
	private int kor, eng, math, sum;
	private double avg;
	
	Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		sum = kor + eng + math;
		avg = sum / 3.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
}

class Handler{
	private Scanner sc = new Scanner(System.in);
	private Student[] arr = new Student[10];
	
	private void createStudent() {
		String name;
		int kor, eng, math;
		
		for(int i = 0; i < arr.length; i++) {	// 배열 한줄이 진행될때
			if(arr[i] == null) {	// 배열 인덱스가 null이라면
				System.out.print("이름 입력 : ");
				name = sc.next();
				System.out.print("국어 입력 : ");
				kor = sc.nextInt();
				System.out.print("영어 입력 : ");
				eng = sc.nextInt();
				System.out.print("수학 입력 : ");
				math = sc.nextInt();	// 이름과 세 과목 점수 입력을 받는다
				
				arr[i] = new Student(name, kor, eng, math);		// 배열의 인덱스는 Student클래스 변수와 같다
				System.out.println(name + "학생 생성 완료 !!\n");		// 생성 완료 메세지 출력
				return;		// 반환
			}
		}
		System.out.println("더 이상 학생을 추가할 수 없습니다 !!\n");	// 배열을 다 채우고나면 출력
	}
	private void showAllStudent() {
		System.out.println("=== 전체 학생 목록 ===\n");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				String format = "%s : %d, %d, %d (%d, %.2f)\n";
				System.out.printf(format, arr[i].getName(),
						arr[i].getKor(), arr[i].getEng(), arr[i].getMath(), arr[i].getSum(), arr[i].getAvg());
			}
		}
		System.out.println();
		
	}
	private boolean isNumber(String str) {
		for(int i = 0; i < str.length(); i++) {			// 문자열 전체에서
			char ch = str.charAt(i);					// 각 글자가 ch라면
			boolean flag = '0' <= ch && ch <= '9';		// ch가 0 ~ 9사이가 정상일 조건
			if(flag == false) {							// 조건이 하나라도 벗어나면
				return false;							// false를 반환하면서 함수 종료
			}
		}
		return true;			// 전체를 순회해도 조건을 벗어나는 경우가 없으면 true를 반환하면서 종료
	}
	
	public void start() {
		String input;
		while(true) {
			System.out.println("1. 신규 학생 생성 및 입력");
			System.out.println("2. 전체 출력");
			System.out.println("0. 종료");
			System.out.print("입력>>> ");
			input = sc.next();
			
			if(isNumber(input) == false) {
				System.err.println("숫자로 입력하세요 !");
				continue;
			}
			switch(input) {
			case "1":	createStudent(); break;
			case "2":	showAllStudent(); break;
			case "0":
				System.out.println("프로그램을 종료합니다 !");
				sc.close();
				return;
			}
		}
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		Handler hd = new Handler();
		
		hd.start();
	}
}
