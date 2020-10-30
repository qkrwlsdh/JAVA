package day09;

import java.util.Scanner;

class TV {
	
	// 전원버튼 , 볼륨조절, 채널조절
	
	// Power가 true라면 전원이 On되고 채널은 2, 볼륨은 20으로
	boolean power = false;		// 조건문에서 끌어다 쓸 일이 많겠다
	int ch = 2;
	int vl = 20;
	Scanner sc = new Scanner(System.in);
	
	void onoff() { power = !power; }

	void chup() {
		ch++;
		System.out.println("CH UP : " + ch);
		}

	void chdown() { 
		ch--;
		System.out.println("CH DOWN : " + ch);
		}
	
	void vlup() { 
		vl++;
		System.out.println("VOL UP : " + vl);
	}
	
	void vldown() { 
		vl--;
		System.out.println("VOL DOWN : " + vl);
	}
	
	void start() {
		while(true) {
			System.out.print("1. 전원 <> ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1: onoff(); break;
			}
			show();
		}
	}
	void show() {
		if(power) {
			
		}
			
	}
	
}

public class Ex05 {
	public static void main(String[] args) {
		TV tv = new TV();
		
		tv.start();
		tv.show();
	}
}
