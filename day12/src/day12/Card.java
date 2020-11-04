package day12;

public class Card{
	int num;
	static int width;
	static int height;
	String p;
	
	Card(int width, char kind, int num){
		
	}
	void show() {
		
	}
	static void setSize(int size) {
		width = size;
		height = size;
	}
	// 1) 클래스.메서드()형식은 static 메서드에 접근하는 문법이므로
	// setSize메서드를 static 속성으로 변경한다
	
	// 2) static method setSize는 객체 필드 width, height
	// 생성 시점이 서로 다르기 때문에 (static 요소가 더 먼저
}