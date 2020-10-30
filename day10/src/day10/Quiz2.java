package day10;

class Item{
	String name;			// 멤버필드에 값을 넣어주고 생성자에도 변수에 값을 넣을 경우에 생성자의 변수 값이 먼저다
	int price;
// this.변수이름 -> 각각의 객체가 서로 다른 이름을 가지게 할 경우
	Item(){					// 생성자 여러개를 만들것이기 때문에 기본 생성자를 만들어준다
		name = "이름 없음";		// name변수에 이름없음을 넣어준다
		price = 0;			// price변수에 0을 넣어준다
	}
	Item(String name){		// 매개변수 하나를 가진 생성자를 만들어준다
		this.name = name;	// 멤버필드에 같은 이름을 가진 변수가 있기때문에 this.로 멤버필드임을 알려준다
		price = 249000;		// price변수에 249000를 넣어준다
	}
	Item(String name, int price){	// 매개변수 둘을 가진 생성자를 만들어준다
		this.name = name;			// 멤버필드에 같은 이름을 가진 변수가 있기때문에 this.로 멤버필드임을 알려준다
		this.price = price;			// 위와 같이 this.로 멤버필드임을 알려준다
	}
	
	void show() {			// 출력을 담당할 함수를 만들어준다
		System.out.printf("%s : %,d원\n", name, price);
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		Item it1 = new Item();						// it1로 기본생성자를 호출한다
		Item it2 = new Item("24인치 모니터");			// it2로 String 매개변수 하나를 가진 생성자를 호출한다
		Item it3 = new Item("55인치 TV", 1490000);	// it3로 String, int 매개변수 둘을 가진 생성자를 호출한다
		
		it1.show();		// 이름없음 : 0원
		it2.show();		// 24인치 모니터 : 249,000원
		it3.show();		// 55인치 TV : 1,490,000원
	}
}
