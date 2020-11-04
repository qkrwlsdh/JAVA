package day13_studentManagement;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Handler hd = new Handler();
		int menu;
		
		System.out.println("\n\t===학생 관리 프로그램 v0.2===\n");

		while(true) {
			System.out.println("1. 학생 생성 및 입력");
			System.out.println("2. 전체 출력");
			System.out.println("3. 검색 후 한명의 정보만 출력");
			System.out.println("4. 평균으로 오름차순 정렬");
			System.out.println("5. 수정");
			System.out.println("6. 삭제");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택>>> ");
			
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				Student newbie = hd.createStudent();
				boolean inserted = hd.insertStudent(newbie);
				String msg1 = inserted ?
						("===" + newbie.name + " 학생 정보가 추가되었습니다===\n") :
							"===더 이상 학생을 추가할 수 없습니다 !===\n";
						System.out.println(msg1);
				break;
			case 2: hd.selectAllStudent(); break;
			case 3:
				Student result = hd.selectOneStudent();
				if(result != null)	result.show();
				else				System.out.println("검색 결과가 없습니다");
				break;
			case 4:
				hd.orderByAvg();		// 정렬해두고
				hd.selectAllStudent();	// 전체출력하기
				break;
			case 5:
				Student update = hd.selectOneStudent();
				boolean isUpdated = hd.updateStudent(update);
				String msg5 = isUpdated ? "수정 완료" : "실패";
				System.out.println(msg5);
				break;
				
			case 6:
				Student delete = hd.selectOneStudent();
				boolean isDeleted = hd.deleteStudent(delete);
				String msg = isDeleted ? "삭제되었습니다\n" : "데이터가 없습니다\n";
				System.out.println(msg);
				break;
			case 0:
				sc.close();
				System.out.println("===프로그램을 종료합니다===\n");
				return;
			}
		}
	}
}
