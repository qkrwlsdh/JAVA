package day20_wrapperClass;

import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
		boolean bo1 = true;		// 1 byte
		byte by1 = 127;			// 1 byte
		short sh1 = 32767;		// 2 byte
		char ch1 = 65;			// 2 byte
		int num1 = 1234;		// 4 byte
		long ln1 = 100L;		// 8 byte
		float fl1 = 1.2f;		// 4 byte
		double db1 = 3.14;		// 8byte
		
		Boolean bo2 = bo1;		// Wrapper Class는 모두 4 byte (참조 변수)
		Byte by2 = by1;			// 데이터를 저장하는 기능도 포함하면서
		Short sh2 = sh1;		// 각 자료형에 맞는 메서드를 가지고 있다
		Character ch2 = ch1;	// instance method도 있고 (객체에서 호출하는 메서드)
		Integer num2 = num1;	// static method도 있다 (자료형에서 호출하는 메서드)
		Long ln2 = ln1;
		Float fl2 = fl1;		// Wrapper Class는 자신에 맞는 primitive와 1:1 대응되지만
		Double db2 = db1;		// 다른 Wrapper Class와는 기본 형변환으로 대입이 안될 수 있다
		
		num1 = ch1;				// 좌변의 변수가 범위가 더 크기 때문에, 암묵적 형 변환 발생
//		num2 = (Integer)ch2;	// 둘 다 클래스이고, 자료형이 일치하지 않아서 형 변환 처리가 안됨
		System.out.println(Character.getNumericValue(ch1));
		
		num2 = (int)(char)ch2;	// (char) 빠져도 됨 : ch2가 정수형이기 때문에
		System.out.println("num2 : " + num2);
//		Character -> char -> int -> Integer
		
		fl2 = (float)(double)db2;
		System.out.println("fl2 : " + fl2);
		fl2 = (float)db2.doubleValue();		// == fl2 = (float)(double)db2;
//		Double -> double -> float -> Float
		
//		primitive 데이터를 객체로 취급하기 위해서
//		정보 은닉 개념에 따라, 크기에 따른 유형을 추측할 수 없도록
//		클래스에서 제공하는 메서드를 활용하기 위해서
		
//		Genuric Type을 지정할 때, Reference Type만 지정 가능하기 때문에
//		정수를 담는 리스트를 구현하려면
		
//		ArrayList<int> list = new ArrayList<int>();
//		위와 같이 제네릭에는 primitive를 지정할 수 없으므로
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(10);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}
}
/*
 * Wrapper Class : 기본 자료형의 데이터를 객체 취급하기 위한 클래스
 * primitive type과 1:1로 대응되는 자료형이 있다
 * 자료를 효율적으로 관리하면서 은닉화를 위해 만들어졌다
 */
