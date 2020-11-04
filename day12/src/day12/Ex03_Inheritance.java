package day12;

class Student{
	String name;
	int kor, eng, mat, sum;
	double avg;
	
	Student(String name, int kor, int eng, int mat){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	void show() {
		sum = kor + eng + mat;
		avg = sum / 3.0;
		System.out.println(name + " : " + sum + ", " + avg);
	}
}

class Student2 extends Student{
	// 이름, 국어, 영어, 수학 작성되지 않았음 
	// 상속받음
	int deu;
	
	Student2(String name, int kor, int eng, int mat, int deu){
		super(name, kor, eng, mat);
		this.deu = deu;
	}
	// show()메서드도 작성되지 않았음
	void show() {
		// 4과목을 기준으로 합계와 평균을 출력하는 내용을 작성하고 실행
		sum = kor + eng + mat + deu;
		avg = sum / 4.0;
		System.out.println(name + " : " + sum + ", " + avg);
		
	}
}

public class Ex03_Inheritance {
	public static void main(String[] args) {
		Student st = new Student("박진오", 90, 100, 94);
		Student2 st2 = new Student2("이지은", 100, 99, 87, 79);
		st.show();
		st2.show();
		
		// 학생관리 프로그램을 작성하고 있다
		// 기존에 사용하던 학생클래스를 세분화해서
		// 국영수만 점수를 계산하는 학생(고1, 2)과
		// 제2외국어를 포함하여 성적을 계산하는 학생(고3)을 구분하여 처리하려고 한다
		
		// 비슷한 항목이 많은 클래스를 새로 작성하려고 하니 불편해서
		// 기존의 Student 클래스의 내용을 받아오려면 어떻게 해야 할까
	}
}
