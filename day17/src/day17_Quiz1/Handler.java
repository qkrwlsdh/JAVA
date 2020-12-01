package day17_Quiz1;

import java.util.ArrayList;
import java.util.Scanner;

public class Handler {
	private ArrayList<PlayableCharacter> list;
	private Scanner sc;
	String name;
	int at, hp;
	
	public Handler() {
		list = new ArrayList<PlayableCharacter>();
		sc = new Scanner(System.in);
	}
	
	public void insert(PlayableCharacter p) {		// 생성	create
		
		System.out.print("이름 입력 : ");
		name = sc.next();
		
		System.out.print("공격력 입력 : ");
		at = sc.nextInt();
		
		System.out.print("체력 입력 : ");
		hp = sc.nextInt();
		
		if(name != null && at != 0 && hp != 0) {
			
			p = new PlayableCharacter(name, at, hp);
			
			list.add(p);
			
			System.out.println("생성 완료!!\n");
		}
		return;
	}
	
	public PlayableCharacter selectOne(String name) {	// 읽기	read
		
		for(int i = 0; i < list.size(); i++) {
			PlayableCharacter ob = list.get(i);
			if(ob.getName().equals(name))
				return ob;
		}
		System.out.println("없는 이름 입니다.\n");
		return null;
	}
	
	public boolean modify(String name) {				// 수정	update
		
		for(int i = 0; i < list.size(); i++) {
			
		PlayableCharacter ob = list.get(i);
		if(ob.getName().equals(name)) {
			System.out.println(ob);
			// 이름은 변경하지 않고, 수치만 변경하게끔
			System.out.print("공격력 : ");
			int at = sc.nextInt();
			System.out.print("체력 : ");
			int hp = sc.nextInt();
			
			ob.setAt(at);
			ob.setHp(hp);
			return true;
			}
		}
		return false;
	}
	
	public boolean delete(String name) {				// 삭제	delete
		
		for(int i = 0; i < list.size(); i++) {
			PlayableCharacter ob = list.get(i);
			if(ob.getName().equals(name)) {
				list.remove(i);
				return true;
			}
		}
		return false;
	}
}
