package day09;

import java.util.Scanner;

class Student2 {
	// 멤버 필드는 객체 생성 이후 자료형에 따라서 자동으로 초기화가 진행된다
	// primitive : 0에 기반한 자료형의 값
	// byte, char, short, int, long => 0
	// float, double => 0.0
	// boolean => false
	
	// reference : 대상을 참조하고 있지 않다 => null;
	
	// 클래스의 멤버필드는 초기화가 자동으로 진행되지만, 메서드의 지역변수는 초기화 되지 않는다
	
	int kor, eng, mat;
	int sum;
	double avg;
	String name;
	Scanner sc = new Scanner(System.in);	// 멤버 필드는 초기화 가능
	
	void input() {				// ctrl누른채로 함수 클릭하면 찾아가진다
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("국어 점수 입력 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		mat = sc.nextInt();
		
		sum = kor + eng + mat;
		avg = sum / 3.0;		// 멤버 필드에 저장해주었으면 메서드가 종료되어도 멤버필드는 유지된다
		
	}
	void show() {
		String form = "%s) %3d, %3d, %3d / %3d / %.2f\n";
		System.out.printf(form, name, kor, eng, mat, sum, avg);
	}
}

// 입력함수와 출력함수를 구현하고
// 세 과목의 점수를 입력받으면
// 자동으로 합계와 평균이 계산되어 저장되도록 클래스를 설계하세요
// 하나씩 입력하고 전체 출력

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student2[] arr = new Student2[5];	// { null, null, null, null, null }
		
		int menu = 0;
		
		while(true) {
			System.out.println("1. 신규 학생 정보 입력");
			System.out.println("2. 전체 학생 정보 출력");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 입력 >>> ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				for(int i = 0; i < arr.length; i++) {	// 배열에서
					if(arr[i] == null) {				// 빈칸을 하나 찾아서
						arr[i] = new Student2();		// 새로운 학생 객체를 생성하고
						arr[i].input();					// 입력 메서드를 실행해라
						break;							// 입력이 끝나면 순회를 종료한다
					}
				}
				break;
			case 2:
				for(int i = 0; i < arr.length; i++) {	// 배열에서
					if(arr[i] != null) {				// 빈칸이 아닌곳을 찾아서
						arr[i].show();					// 그 객체의 출력 메서드를 실행해라
					}
				}
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			}
		}
	}
}
