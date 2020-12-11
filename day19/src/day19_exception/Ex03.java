package day19_exception;

import java.io.IOException;

public class Ex03 {
	public static void main(String[] args) throws IOException {
		
		int n = 0;
			System.out.print("글자하나 입력 : ");
			n = System.in.read();
		
//		System.in.read()는 caller에게 예외처리를 전가하는 메서드이다
		
		System.out.println("n :" + n);
	}
}
