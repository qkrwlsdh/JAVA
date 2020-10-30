package day10;

class Square{
	int size;					// 크기를 저장할 멤버필드
	char ch = '*';				// 출력할 글자를 받는 필드
	
	Square(int size){			// 객체 생성시 크기를 전달받을 생성자
		this.size = size;		// 멤버필드의 size와 같다
	}
	Square(int size, char ch){	// int와 char을 전달받을 생성자
		this.size = size;		// 멤버필드의 size
		this.ch = ch;			// 멤버필드의 ch
	}
	// 기본 생성자가 작성되지 않았으므로, 크기를 전달하지 않으면 객체를 생성할 수 없다!
	
	void show() {	// 크기에 따라 사각형을 출력하는 메서드
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				boolean flag = i == 0 || j == 0 || i == size -1 || j == size - 1;	// 부울 flag는 i가 0이거나 j가 0이거나 i가 사이즈보다 1작거나 j가 사이즈보다 1작다
				if(flag) {							// 만약 flag가 true라면
					System.out.print(ch + " ");		// ch와 띄워쓰기 한칸을 출력
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}	// class

public class Ex06 {
	public static void main(String[] args) {
		Square ob1 = new Square(5);
		ob1.show();
		
		Square ob2 = new Square(4);
		ob2.show();
		
		Square ob3 = new Square(3, 'z');
		ob3.show();
	}	// main
}	// class
