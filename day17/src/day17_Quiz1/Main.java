package day17_Quiz1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Handler hd = new Handler();
		Scanner sc = new Scanner(System.in);
		int menu;
		String name;
		
		// while ~ switch ~ case 메뉴 구성
		
		// 1. 신규 캐릭터 추가
		// 2. 이름으로 캐릭터 찾기
		// 3. 캐릭터 정보 수정
		// 4. 삭제
		// 0. 종료
		
		while(true) {
			System.out.println("1. 신규 캐릭터 추가");
			System.out.println("2. 이름으로 캐릭터 찾기");
			System.out.println("3. 캐릭터 정보 수정");
			System.out.println("4. 삭제");
			System.out.println("0. 종료");
			System.out.print("메뉴>>");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				PlayableCharacter p1 = new PlayableCharacter();
				hd.insert(p1);
				break;
				
			case 2:
				System.out.print("이름을 입력해주세요 : ");
				name = sc.next();
				PlayableCharacter find = hd.selectOne(name);
				if(find != null) {
					System.out.println(find);
				}
				else {
					System.out.println("결과를 찾을 수 없습니다!");
				}
				break;
				
			case 3:
				System.out.print("수정할 캐릭터의 이름을 입력 : ");
				name = sc.next();
				boolean modify = hd.modify(name);
				System.out.println(modify ? "성공" : "실패");
				break;
				
			case 4:
				System.out.print("삭제할 캐릭터의 이름을 입력 : ");
				name = sc.next();
				boolean delete = hd.delete(name);
				System.out.println(delete ? "삭제 성공" : "삭제 실패 : 데이터가 없습니다.");
				break;
			case 0:
				sc.close();
				return;
			}
		}
	}
}
