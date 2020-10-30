package day05;

import java.util.Scanner;

public class Ex02_MyReplace {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input;
		String text = "Life is too short, you need ";
		
		System.out.print("입력 : ");
		input = sc.nextLine();
		
		text += input;
		
		// for문을 이용하여 공백을 언더바로 처리하세요 (str.replace() 사용금지)
		for(int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);		// 글자를 하나 받아와서
			if(ch == ' ')	ch = '_';		// 만약 공백이 있다면 언더바로 바꿔라
			System.out.print(ch);			// 출력
		}
		System.out.println();
		System.out.println(text);
		sc.close();
		
		String result;	// 여기에 새로운 문자열을 담을거다
		// 1) 문자열을 char 배열로 변환
		char[] arr = text.toCharArray();
		for(int i = 0; i < arr.length; i++) {	// 배열에서 공백을 찾아서 언더바로
			if(arr[i] == ' ')	arr[i] = '_';
		}
		result = new String(arr);	// 값이 바뀐 배열로 문자열을 생성한다
		System.out.println(result);	// 결과 출력
	}
}
