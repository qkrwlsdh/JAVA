package day17_Quiz1;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<PlayableCharacter>list =
				new ArrayList<PlayableCharacter>();
		
		PlayableCharacter p1 = new PlayableCharacter("Marine", 5, 40);
		PlayableCharacter p2 = new PlayableCharacter("Zergling", 6, 35);
		
		list.add(p1);
		list.add(p2);
		
		for(int i = 0; i < list.size(); i++) {
			PlayableCharacter ob = list.get(i);
			System.out.println(ob);
//			= System.out.println(ob.toString());
			
			// 캐릭터의 이름과 공격력, 체력이 순서대로 출력될 수 있도록 처리하세요
			// 메서드 오버라이딩
		}
	}
}
