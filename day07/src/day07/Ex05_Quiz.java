package day07;

import java.util.Scanner;

public class Ex05_Quiz {

	static void printArray(int[] arr) {
		System.out.print("arr : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = null;	// 자료형이 대문자이거나, 배열자료형이면 참조변수 (null)
		
		int[] arr;
		int[] tmp;
		int num = 0;
		int size = 3;
				
		sc = new Scanner(System.in);
		arr = new int[size];
		
		while(true) {
			// 입력 (빈 칸에만 입력받기)
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == 0) {	// 빈 칸이면
					System.out.print("정수 입력 : ");
					num = sc.nextInt();
					if(num != 0) {
						arr[i] = num;
					}
					break;		// 입력을 받았다면 break;					
				}
			}
			// 출력
			System.out.printf("출력 (%2d) : ", arr.length);
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] != 0)	
					System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			// 0인지 체크 -> 종료
			if(num == 0) {
				sc.close();
				System.out.println("프로그램을 종료합니다");
				return;
			}
			
			// 배열이 꽉 찼는지 체크 -> 증가 및 복사 및 바꿔치기
			// 배열이 가득 찼다 == 배열의 마지막 값이 0이 아니다
			// 배열[배열의 길이 - 1]
			// arr[arr.length - 1]
			
			if(arr[arr.length - 1] != 0) {
				tmp = new int[arr.length + size];	// 0 0 0 0 0 0
				
				for(int i = 0; i < arr.length; i++) {
					tmp[i] = arr[i];				// 1 2 3 0 0 0
				}
				arr = tmp;		// tmp가 가리키는 배열을 arr도 똑같이 가리키도록
								// (기존에 arr가 가리키던 배열은 소멸)
			}
		}	// end of while
	}	// end of main
}	// end of class


	/*
	 * 자바에서 배열은 참조변수의 형태로 취급합니다
	 * 
	 * int[] arr
	 * 정수 배열을 참조할 수 있는 변수 arr
	 * 
	 * arr = new int[5]
	 * 5개의 정수를 저장할 수 있는 배열을 생성하고
	 * 그 시작주소를 arr에 저장하여
	 * arr이 방금 생성한 배열을 가리키게 한다
	 * 
	 * arr = new int[10]
	 * 10개를 저장할 수 있는 배열을 생성하고
	 * 기존 배열 대신 새 배열을 가리키게 한다
	 */