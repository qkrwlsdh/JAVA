package day03;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		
		String id = "itbank";
		String pw = "it";
		
		String userid, userpw;
		Scanner sc = new Scanner(System.in);
		
		// 사용자에게 userid와 userpw를 입력받아서
		// id도 일치하고 pw도 일치하면 "로그인 성공"을 출력하고
		// 아니면, "로그인 실패"를 출력하세요
		
		System.out.println("ID를 입력하세요 : ");
		userid = sc.next();
		
		System.out.println("PW를 입력하세요 : ");
		userpw = sc.next();
		
		if(userid.equals(id) && userpw.equals(pw)) {
			System.out.println("로그인 성공");
		}
		else {
			System.err.println("로그인 실패");
		}sc.close();
	}
}
