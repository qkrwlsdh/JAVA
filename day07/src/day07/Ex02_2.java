package day07;

import java.util.Scanner;

public class Ex02_2 {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		int sum = 0;
		double avg = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			
			do {
				System.out.printf("arr[%d] 정수 입력 : ", i);
				arr[i] = sc.nextInt();
			}
			while(arr[i] < 0 || 100 < arr[i]);
			sum += arr[i];
		}
		avg = sum / 5.0;
		System.out.printf("합계 : %d, 평균 : %.2f\n", sum, avg);
		sc.close();
	}
}
