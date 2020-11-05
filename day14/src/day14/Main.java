package day14;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Handler hd = new Handler();
		int menu;
		
		System.out.println("\n\t20201105 - 회원관리프로그램 (박진오)\n");
		
		while(true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 전체목록");
			System.out.println("3. 회원검색");
			System.out.println("4. 회원탈퇴");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택>>> ");
			
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				Member newbie = hd.createMember();
				boolean inserted = hd.insertMember(newbie);
				String msg = inserted ?
						"\n회원가입이 정상적으로 처리되었습니다.\n" :
							"\n이미 사용중인 ID입니다. 다른 ID를 입력해주세요.\n";
				System.out.println(msg);
				break;
			case 2:
				hd.selectAllMember();
				break;
			case 3:
				Member result = hd.selectOneMember();
				if(result != null)
					result.show();
				else
					System.out.println("회원을 찾을 수 없습니다");
				break;
			case 4:
				System.out.println("\n\t지정한 계정을 탈퇴합니다");
				Member delete = hd.selectOneMember();
				hd.deleteMember(delete);
				break;
			case 0:
				sc.close();
				System.out.println("\n\t♥프로그램을 종료합니다♥\n");
				return;
			}
		}
	}
}
