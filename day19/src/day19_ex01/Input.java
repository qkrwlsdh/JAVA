package day19_ex01;

// 사용자에게 문자열을 연속으로 입력받아서
// 입력받은 문자열을 누적시켜서 저장하고
// 타이머가 끝나면, 지금까지 입력한 문자열을 한번에 출력하는 클래스

import java.util.ArrayList;
import java.util.Scanner;

public class Input {
	private ArrayList<String> list = new ArrayList<String>();
	private Scanner sc = new Scanner(System.in);
	private Timer t;
	
	public Input(Timer t) {		// Input 객체를 생성하기 위해서는 타이머가 필요하다
		this.t = t;
	}
	
	public void go() {
		// 타이머가 끝나지 않은 동안 연속적으로 사용자에게 문자열을 입력받아서
		// 문자열을 입력받을 때 마다, 그 문자열을 list에 추가하는 코드
		
		while(true) {
			System.out.print("문자열 입력 : ");
			String text = sc.nextLine();
			
			list.add(text);
			if(t.isOver() == true) {	// 만약 타이머가 끝났으면
				break;					// 더이상 입력을 받지 말자
			}
		}
		System.out.println("=== 입력 종료 ===\n");
		
		for(String text : list) {
			System.out.println(text);
		}
	}
}
