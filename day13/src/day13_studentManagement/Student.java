package day13_studentManagement;

public class Student {
	String name;
	int sum;
	double avg;
	
	Student(String name){
		this.name = name;
	}
	void show() {	// 다른 서브 클래스가 오버라이딩 할 수 있게끔
		System.out.printf("%s : %3d, %3.2f\n", name, sum, avg);
	}
}
