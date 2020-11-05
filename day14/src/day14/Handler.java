package day14;

import java.util.Scanner;

public class Handler {
	Member[] arr = new Member[100];
	Scanner sc = new Scanner(System.in);
	
	// 1-1. 생성
	Member createMember() {
		Member newbie;
		String name;
		String id;
		String pw;
		char selectType;
		
		System.out.print("회원 유형을 선택하세요 (1. 구매자 | 2. 판매자)");
		selectType = sc.next().charAt(0);
		String address = null;
		String storeName = null;
		
		System.out.print("ID를 입력하세요 : ");
		id = sc.next();
		System.out.print("PassWord를 입력하세요 : ");
		pw = sc.next();
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		sc.nextLine();
		
		if(selectType == '1') {
			System.out.print("주소를 입력하세요 : ");
			address = sc.nextLine();
			newbie = new Customer(name, id, pw, address);
		}
		else {
			System.out.print("가게이름을 입력하세요 : ");
			storeName = sc.nextLine();
			newbie = new Seller(name, id, pw, storeName);
		}
		return newbie;
	}
	
	// 1-2. 추가
	boolean insertMember(Member newbie) {

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = newbie;
				return true;
			}
		}
		return false;
	}
	
	// 2. 전체목록
	void selectAllMember() {
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				arr[i].show();
			}
		}
		System.out.println();
	}
	
	// 3. 검색
	Member selectOneMember() {
		
		System.out.println("\n\tID로 회원을 검색합니다\n");
		
		System.out.print("검색할 ID를 입력 : ");
		String find = sc.next();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].id.contains(find)) {
				return arr[i];
			}
		}
		return null;
	}
	
	// 4. 탈퇴
	boolean deleteMember(Member delete) {
		char really;
		
		if(delete == null)
			return false;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] != null && arr[i].equals(delete)) {
				System.out.print("\t정말 탈퇴하시겠습니까? (y/n) : ");
				really = sc.next().charAt(0);
				if(really == 'y') {
					arr[i] = null;
					System.out.println("\n\t계정이 탈퇴처리되었습니다\n");
					return true;
				}
				if(really == 'n') {
					System.out.println("\n\t회원 탈퇴를 취소하였습니다\n");
				}
			}
		}
		return false;
	}
}
