package loop;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 1. while을 이용하여 자신의 이름을 3번만 출력하세요
		int num = 0;
		
		while(num < 3) {
			System.out.println("박진오");
			num++;
		}
		
		// 2. while을 이용하여 한줄에 1부터 20까지 출력하세요 (띄워쓰기로 구분)
		int num1 = 0;
		
		while(num1 < 20) {
			num1 += 1;
			System.out.print(num1 + " ");
		}
		System.out.println();
		
		// 3. while을 이용하여 한줄에 대문자A부터 Z까지 출력하세요(띄워쓰기로 구분)
//		char alpha = 65;
		char alpha = 'A';
		
		while(alpha <= 'Z') {
			System.out.print(alpha + " ");		// alpha를 int로 형변환시켜서 아스키코드로 볼수도있다
			alpha++;
		}
		System.out.println();
		
		// 4. while을 이용하여 입력받은 정수를 거꾸로 출력하세요 (1234 -> 4321)
		Scanner sc = new Scanner(System.in);	// f11, f6 디버깅
		int num4, ret = 0;
		
		System.out.println("정수 입력 : ");
		num4 = sc.nextInt();	// 입력 버퍼에서 정수만 가져간다 (\n이 남는다)
		sc.nextLine();			// 남아있는 \n을 제거한다
		
		while(true) {
			ret += num4 % 10;	// 입력받은 수에서 끝자리를 떼어내서 ret에 더한다
			ret *= 10;			// 1의 자리를 비우기 위해 10을 곱한다
			num4 /= 10;			// 처리된 맨 끝 자리를 날리기 위해 10으로 나눈다
			if(num4 < 10) {		// 만약 10보다 작으면 (한자리수만 남으면)
				ret += num4;	// 남은 한자리를 더하고
				break;			// 반복을 중단한다
			}
		}
		System.out.println(ret);
		
		// 5. while을 이용하여 문자열을 입력받고, 문자열의 길이가 8미만이면 새로 입력받으세요
		// 	   길이 8이상의 문자열을 입력받았다면 화면에 출력하고 종료하세요
		String text;
		
		System.out.print("문자를 입력해주세요 : ");
		text = sc.next();
		
		while(text.length() != 0) {
			if(text.length() >= 8) {
				System.out.println(text);
				sc.close();
				break;
			}
			else {
				System.err.print("다시 입력하세요 : ");
				text = sc.next();
			}
		}
		System.out.println();	// 반복을 해야하면 반복문안에 코드를 넣고 끝내려면 밖으로 빼면 된다
		
		// 6. 첫날에 10원, 다음날은 20원, 다음날은 40원
		// 전날의 두배를 은행에 입금하면 30일이 경과한 후 은행의 잔고는 얼마인지 계산하기
		long income = 10, acount = 0, day = 1;
		
		while(day <= 30) {
			acount += income;
			income *= 2;
			day++;
		}
		System.out.printf("계좌금액 : %,d원\n", acount);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
