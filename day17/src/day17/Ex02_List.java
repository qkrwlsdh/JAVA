package day17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex02_List {
	public static void main(String[] args) {
		
//		List list1 = new List();
//		ㄴ> Cannot instantiate the type List : List타입은 객체화 할 수 없습니다.
		
		int[] arr = new int [5];
		ArrayList al = new ArrayList();
		
		arr[0] = 2;		// 배열의 특정 순번위치에 값을 저장
		arr[1] = 7;		// 배열의 크기만큼만 데이터를 저장할 수 있다
		
		al.add(2);		// 메서드를 활용하여 원하는 값을 리스트에 추가할 수 있다
		al.add(7);		// 추가된 값은 리스트가 임의로 순번을 부여하여, 순번으로 값에 접근할 수 있다
		
		System.out.println(arr[0]);		// 배열의 특정 순번에 있는 값을 출력
		System.out.println(arr[1]);
		
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		
		System.out.println("배열의 크기 : " + arr.length);
		System.out.println("리스트의 크기 : " + al.size());
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}
		
		for(int i = 0; i < al.size(); i++) {
			System.out.printf("al.get(%d) : %d\n", i, al.get(i));
		}
		
		// 컬렉션에는 모든 자료형을 추가할 수 있다
		al.add("ITBANK");	// String
		al.add(3.14);		// 실수
		al.add(7);			// 중복된 값
		
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("리스트의 크기 : " + al.size());
		System.out.println("리스트의 2번째 값 : " + al.get(2));
		al.remove(2);	// (0부터 시작) 2번째에 있는 값을 제거, 이후의 값을 한칸씩 앞당긴다
		System.out.println("리스트의 크기 : " + al.size());
		System.out.println("리스트의 2번째 값 : " + al.get(2));
		
		System.out.println("리스트가 2를 포함하는가 : " + al.contains(2));
		System.out.println("리스트가 4를 포함하는가 : " + al.contains(4));
		
		System.out.println("3.14는 몇번째에 위치하는가 : " + al.indexOf(3.14) + "번째");
		System.out.println("3.15는 몇번째에 위치하는가 : " + al.indexOf(3.15) + "번째");
		System.out.println("10는 몇번째에 위치하는가 : " + al.indexOf(10) + "번째");
		
		al.clear();		// 리스트 내부의 모든 값을 삭제하고, 크기를 0으로 되돌린다
		
		System.out.println("리스트의 크기 : " + al.size());
		
		al.add("test");
		System.out.println(al.get(0));
		System.out.println("test".length());
		System.out.println(((String)al.get(0)).length());
		
		// 리스트에 넣으면 Object로 취급되기 때문에 자료형 고유의 메서드를 호출할 수 없다
		// 리스트에 값을 넣으면 Object로 up-casting 되어 있는 상태이다
		// 고유 메서드를 호출하기 위해서는 각각의 클래스로 down-casting을 수행해야 한다
	}
}
