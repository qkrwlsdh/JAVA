package day14;

public class Seller extends Member{

	String storeName;
	
	Seller(String name, String id, String pw, String storeName){
		super(name);
		super.id = id;
		super.pw = pw;
		this.storeName = storeName;
	}
	@Override
	void show() {
		System.out.printf("%s님의 id는 %s이고, pw는 %d입니다.\n(가게이름 : %s)\n",
				name, id, pw, storeName);
	}
}
