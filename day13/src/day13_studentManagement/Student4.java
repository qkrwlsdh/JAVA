package day13_studentManagement;

public class Student4 extends Student3 {

	int jpn;
	
	Student4(String name, int kor, int eng, int mat, int jpn) {
		super(name, kor, eng, mat);
		this.jpn = jpn;
		sum += jpn;
		avg = sum / 4.0;
		
	}

	@Override
	void show() {
		System.out.printf("%s : %3d, %3d, %3d, %3d (%3d, %3.2f)\n",
				name, kor, eng, mat, jpn, sum, avg);
	}
	void showJpn() {
		System.out.println("일본어 성적 : " + jpn);
	}
}
