package day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		
		Random r = new Random();
		int n1 = r.nextInt();
		
		n1 = n1 % 6 + 1;
		if(n1 < 0) {
			n1 = -n1;	// 정수의 부호 반전
		}
		System.out.println("n1 : " + n1);
		
		// 임의의 숫자를 중복없이 원하는 개수만큼 추출하는 코드
		HashSet<Integer> hs = new HashSet<Integer>();	// int 대신 Integer를 사용한다
		
		while(hs.size() != 7) {
			Integer n = r.nextInt(45 + 1);	// %연산자 제한법 대신 정수를 넣어주면 범위에서 추출한다
			hs.add(n);
		}
		
		for(Integer num : hs) {
			System.out.println(num);
		}System.out.println();
		
		// 정렬을 하고싶은데, HashSet에는 순서 개념이 존재하지 않는다 => 리스트로 처리하자 !
		
		ArrayList<Integer> list = new ArrayList<Integer>(hs);
		// hs를 이용해서, 내부의 요소를 가지고 ArrayList를 생성한다
		
		for(Integer num : list) {
			System.out.print(num + " ");
		}System.out.println();
		
		Collections.sort(list);		// list의 요소들을 정렬한다
		
		System.out.print("정렬 후 -> ");
		for(Integer num : list) {
			System.out.print(num + " ");
		}System.out.println();
	}
}
