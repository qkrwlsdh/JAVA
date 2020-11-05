package day14;

public class Customer extends Member{
	
	String address;
	
	Customer(String name, String id, String pw, String address){
		super(name);
		super.id = id;
		super.pw = pw;
		this.address = address;
	}
	@Override
	void show() {
		System.out.printf("%s님의 id는 %s이고, pw는 %d입니다.\n(주소 : %s)\n",
				name, id, pw, address);
	}
}
