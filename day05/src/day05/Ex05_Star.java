package day05;

public class Ex05_Star {
	public static void main(String[] args) {
		
//		int size = 5;
//		int star = 1;							// 별의 갯수 1개로 선언
//		int space = 2;							// 공백 칸수 2개로 선언
//		
//		for(int i = 0; i < size; i++) {
//			for(int j = 0; j < space; j++) {	// 공백을 지정된 개수만큼 출력 (초기값 : 2)
//				System.out.print("- ");
//			}
//			for(int j = 0; j < star; j++) {		// 문자를 지정된 개수만큼 출력 (초기값 : 1)
//				System.out.print("* ");
//			}
//			for(int j = 0; j < space; j++) {
//				System.out.print("- ");
//			}
//			if(i < size / 2) {					// 반만큼 내려가기전이라면
//				star += 2;						// 별을 2개 추가
//				space -= 1;						// 공백을 1개 제거
//			}
//			else {								// 반만큼 내려간후에는
//				star -= 2;						// 별을 2개 제거
//				space += 1;						// 공백을 1개 추가
//			}
//			System.out.println();				// 줄바꿈
//		}
		
//		int size = 5;
//		int star = 5;
//		int space = 2;
//		
//		for(int i = 0; i < size; i++) {
//			for(int j = 0; j < space; j++) {
//				System.out.print("  ");
//			}
//			for(int j = 0; j < star; j++) {
//				System.out.print("* ");
//			}
//			for(int j = 0; j < space; j++) {
//				System.out.print("  ");
//			}
//			if(i < size / 2) {
//				star -= 2;
//				space += 1;
//			}
//			else {
//				star += 2;
//				space -= 1;
//			}
//			System.out.println();
//		}
		
		int size = 5;
		int star = 1;
		int space = 3;
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < star; j++) {		// 별을 지정한 개수만큼 출력 (초기값 : 1)
				System.out.print("* ");
			}
			for(int j = 0; j < space; j++) {	// 공백을 지정한 개수만큼 출력 (초기값 : 3)
				System.out.print("  ");
			}
			
			int star2 = star;							// 삐져나오는 별을 제어하기위해 star2를 만들어주고 star와 같다고 선언
			if(i == size / 2)	star2 = size - star;	// 만약 i(세로줄)가 사이즈의 반이면 size - star를 star2에 넣어라
			
			for(int j = 0; j < star2; j++) {			// 별을 지정한 개수만큼 출력 (초기값 : 1)
				System.out.print("* ");
			}
			if(i < size / 2) {					// 반만큼 내려가기전이라면
				star += 1;						// 별을 1 추가
				space -= 2;						// 공백을 1 감소
			}
			else {								// 반보다 내려갔다면
				star -= 1;						// 별을 1 감소
				space += 2;						// 공백을 2 추가
			}
			System.out.println();				// 줄 바꿈
		}  
	}
}
