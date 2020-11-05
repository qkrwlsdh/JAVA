package day14;

public class Member {
	String name;
	String id;
	String pw;
	
	Member(String name){
		this.name = name;
	}
	void show() {
		System.out.printf("%s님의 id : %s , pw : %d\n", name, id, pw);
	}
}
