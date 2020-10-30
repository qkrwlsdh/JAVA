package day10;

class Human{
	String name;
}

public class Ex02_Nullpointer {
	public static void main(String[] args) {
		
		Human hu1 = new Human();
		hu1.name = "이지은";
		Human hu2 = new Human();
		hu2.name = "홍진호";
		
		Human[] building = new Human[5];
		building[0] = hu1;
		building[1] = hu2;
		
		for(int i = 0; i < building.length; i++) {
//			if(building[i] != null && building[i].name.equals("홍진호"))
			if(building[i].name.equals("홍진호"))
				System.out.println("홍진호 찾았다!");
		}
		System.out.println("프로그램종료");
	}
}
