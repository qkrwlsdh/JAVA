package day13;

class Animal{
	String name;
	void speak() {
		System.out.println("...");
		}
	Animal(String name){
		this.name = name;
	}
}
class Dog extends Animal{
	@Override void speak() {
		System.out.println("멍멍");		// 상속받은 메서드를 재정의(오버라이딩)
		}
	void tailing() {
		System.out.println(name + "가 꼬리를 흔든다");	// 상속받지 않은 기능, Dog의 고유 기능
		}
	Dog(String name){
		super(name);
	}
}
class Cat extends Animal{
	@Override void speak() {			// 오버라이딩
		System.out.println("야옹");
	}
	void growling() {					// 고유 메서드
		System.out.println(name + "가 그르렁소리를 낸다");
	}
	Cat(String name){
		super(name);
	}
}

public class Ex01_Polymorphism {
	public static void main(String[] args) {
		// 다형성 : 상속에 의해서 생성된 객체는 슈퍼클래스로도 취급될 수 있고, 서브클래스로도 취급될 수 있다
		// => 하나의 객체가 여러가지 타입의 성격을 가질 수 있다
		
		Dog d1 = new Dog("초코");
		Cat c1 = new Cat("토리");
		
		d1.speak();		d1.tailing();
		c1.speak();		c1.growling();
		System.out.println();
		
		Animal ob1 = d1;	// 신규 생성이 아니다
		
		ob1.speak();		// Animal에도 정의되어 있는 메서드
//		ob1.tailing();		// Animal에는 정의되어 있지 않은 메서드
		System.out.println(d1 + ", " + ob1);
		
		// 오버라이딩 된 메서드는 자식 객체를 부모클래스로 참조해도 자식클래스의 메서드가 호출된다
		
		Animal ob2 = c1;		// 자식 객체를 부모 타입으로 참조하기 위한 형변환 (업 캐스팅)
								// 암묵적 형변환 (여러 객체를 한번에 제어할 수 있다)
		ob2.speak();
//		ob2.growling();		// The method growling() is undefined for the type Animal
		
		Animal[] arr = new Animal[] { ob1, ob2 };
		// 동물만 입장 가능한 배열에 두 반려동물을 모셨습니다..
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			arr[i].speak();
			
			if(arr[i] instanceof Dog) {		// 자료형 상관없이 객체가 Dog타입이면
				((Dog)arr[i]).tailing();	// 객체를 Dog로 형변환
			}
			if(arr[i] instanceof Cat) {
				((Cat)arr[i]).growling();	// 업캐스팅된 객체를 원래 자식타입으로 형변환
			}								// => 다운 캐스팅 (고유 기능을 호출하기 위해서)
		}
	}
}
