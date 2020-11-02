package day11;

class Member2{
	private String name;
	private int age;
	private String address;
	private String email;
	private String phoneNum;
	private double height;
	private boolean adult;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean isAdult() {		// 자료형이 boolean이면 get대신 is로 처리한다
		return adult;
	}
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	
	// private 필드만 작성하고 저장
	// 필드를 드래그해서 범위선택
	// 우클릭 - source - generate getters and setters
	
	// getter, setter를 포함한 자바의 메서드는 작명시 camel case를 기준으로 한다
	// 1) 클래스를 제외한 나머지 요소는 이름의 첫글자를 소문자로 작성한다
	// 2) 여러 단어의 합성으로 발생한 이름이면, 각 단어의 첫글자를 대문자로 작성한다
}

public class Ex04 {

}
