package day07;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		// Scanner를 이용하여 5개의 정수를 입의로 입력받고
		// 합계와 평균을 출력하세요
		// (각 점수가 0 ~ 100 범위를 벗어나면 다시 입력받게 처리하세요)
		// (평균은 소수점 둘째자리까지만 출력하세요)
		
		// 스캐너 선언
		Scanner sc = new Scanner(System.in);
		
		
		// array로 5개 정수 공간을 만들어라
		int[] arr = new int[5];
		
		int sum = 0;
		double avg = 0;
		// 입력을 받아라
		for(int i = 0; i < arr.length; i++) {	// 5번 반복입력
			
			do {	// 일단 한번 실행하고
				System.out.printf("arr[%d] 정수 입력 : ", i);
				arr[i] = sc.nextInt();
				
			// 여기에서 각 점수가 0 ~ 100를 벗어나면 다시 입력	
			} while (arr[i] < 0 || 100 < arr[i]); // 반복여부를 결정
			// 합계와 평균을 구해라
			sum += arr[i];
			}
		
		avg = sum / 5.0;
		System.out.printf("합계는 %d, 평균은 %.2f\n", sum, avg);
		sc.close();
		}
			
	}
