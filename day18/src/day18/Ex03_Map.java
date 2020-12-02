package day18;

import java.util.Map;
import java.util.Set;
import java.util.Enumeration;
import java.util.Hashtable;

public class Ex03_Map {
	public static void main(String[] args) {
//		1) 리스트의 인덱스 대신 key라는 형식으로 value를 관리한다
//		2) key는 임의의 자료형으로 사용할 수 있고, key와 value가 1:1 맵핑되어서 저장된다
//		3) 파이썬의 dict와 같은 유형이다
//		4) key는 중복될 수 없으며, value는 중복될 수 있다
//		5) key를 알면 value에 접근가능하지만, value를 이용해서 key를 알아낼 수는 없다
		
//		Map map = new Map();
		Hashtable<String, String> ht = new Hashtable<String, String>();
		
		ht.put("apple", "사과");
		ht.put("banana", "바나나");
		ht.put("car", "자동차");
		ht.put("orange", "델몬트");
		
		System.out.println(ht.get("apple"));
		// ht.get(key)
		System.out.println(ht.get("사과"));	// null
		
//		key를 알면 value에 접근할 수 있다
//		변수 이름을 알면 변수 값에 접근할 수 있다
		
//		여러 변수와 값을 묶어서 전달하고자 할 때 많이 사용
		
//		이후에는 ht를 함수 호출로 전달받아서 사용한다고 가정한다
		Hashtable<String, String> param = ht;
		
		// 부모클래스(인터페이스)로 참조할 수 있다
		Set<String> keySet = param.keySet();	// Set의 자식클래스 객체를 반환
		
		// key만 받아왔다. Set은 중복을 허용하지 않는 자료형이다
		// 따라서, Map의 key는 서로 중복될 수 없다
		
		for(String key : keySet) {
			String value = param.get(key);
			System.out.printf("%s : %s\n", key, value);
		}System.out.println();
		
		// 2) Map의 모든 값을 출력하는 방법 두번째
		Enumeration<String> enu = param.keys();
		
		while(enu.hasMoreElements()) {		// 아직 확인하지 않은 원소를 가지고 있다면
			String key = enu.nextElement();	// 그 값을 key로 저장
			String value = param.get(key);
			System.out.printf("%s : %s\n", key, value);
		}System.out.println();
	}
}
