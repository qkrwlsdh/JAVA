package day11_Machine;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Handler hd = new Handler();
		Scanner sc = new Scanner(System.in);
		String input;
		
		while(true) {
			System.out.println("1. 코카콜라");
			System.out.println("2. 칠성사이다");
			System.out.println("3. 잔치집 식혜");
			System.out.println("4. 파워에이드");
			System.out.println("5. 호가든");
			System.out.println("선택해주세요>>> ");
			input = sc.next();
			
			switch(input) {
			case "1":	hd.cola();	break;
			case "2":	hd.sida();	break;
			case "3":	hd.riceDrink();	break;
			case "4":	hd.power();	break;
			case "5":	hd.hogarden();	break;
			case "0":
				System.out.println("");
				sc.close();
				return;
			}
		}
	}
}
