package day18;

import java.util.Hashtable;
import java.util.Scanner;

public class Quiz1 {
	
	static Hashtable<String, String> account =
			new Hashtable<String, String>();
	
	
	static boolean login(String userid, String userpw) {

//		String result = account.get(userid);
		
		if(account.get(userid).equals(userpw)) {
			
			return true;
//			return userpw.equals(result);
		}
		return false;
	}
	
	public static void main(String[] args) {
		// 사용자 지정 클래스 없이 Hashtable을 이용하여, 간단한 로그인 함수를 구현하세요
		Scanner sc = new Scanner(System.in);
		int menu;
		String id = null, pw = null;
		
		// key는 중복될 수 없다 (id는 중복되지 않는다)
		// value는 중복될 수 있다 (서로 다른 계정의 비밀번호가 우연히 같을 수는 있다)
		// while, switch ~ case
		// 1. 가입	: 아이디와 비밀번호로 가입하여 account에 추가하기
		// 2. 로그인	: 성공, 실패 여부를 출력하기
		// 3. 종료
		while(true) {
			System.out.println("1. 가입");
			System.out.println("2. 로그인");
			System.out.println("3. 종료");
			System.out.print("메뉴 선택 >>");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("ID를 입력하세요 : ");
				id = sc.next();
				System.out.print("Passward를 입력하세요 : ");
				pw = sc.next();
				
				account.put(id, pw);
				
				System.out.println("회원가입 성공 !");
				break;
			case 2:
				System.out.print("ID : ");
				id = sc.next();
				System.out.print("PW : ");
				pw = sc.next();
				
				if(login(id, pw)) {
					System.out.println("로그인 성공 !");
				}
				else {
					System.err.println("로그인 실패 !");
				}
				break;
			case 3:
				System.out.println("프로그램 종료");
				sc.close();
				return;
			}
		}
	}
}
