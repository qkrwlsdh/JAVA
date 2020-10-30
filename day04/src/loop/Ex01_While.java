package loop;

public class Ex01_While {
	// 자바에서 이름 짓는 규칙
	
	// public class는 소스파일의 이름과 같아야 한다 - Hello.java파일의 public class는 Hello
	
	// 클래스의 이름은 대소문자 및 _를 사용하여 이름을 작성하고, 첫글자는 대문자로 처리한다
	// 변수, 함수는 일반적으로 소문자로 시작하는 이름을 사용한다
	// 여러 단어의 합성으로 만들어진 이름이라면, CamelCase를 사용하거나, snake_case로 이름을 작성
	// CamelCase : 단어와 단어의 합성에서, 각 단어의 첫글자를 대문자로 처리하는 작명 규칙
	// snake_case : 단어와 단어의 합성에서, 각 단어 사이에 언더바를 이용하여 구분하는 작명 규칙
	// 함수가 boolean을 반환한다면, 함수의 이름은 is, has, can과 같은 형식으로 시작한다
	// isNumber(), hasNextLine(), canWrite()
	
	public static void main(String[] args) {
		
		int num = 10;
		
		if(num < 20) {		// 조건을 판별 -> 참이면 종속문장을 실행 -> 끝
			num += 1;
			System.out.println("if : " + num);
		}
		while(num < 20) {	// 조건을 판별 -> 참이면 종속문장을 실행 -> 조건을 판별...
			num += 1;
			System.out.println("if : " + num);
		}
		
		// 횟수에 의한 반복
		int cnt = 0;
		
		while(cnt < 5) {
			System.out.println("운동장을 한바퀴 돕니다" + cnt);
			cnt++;
			
		}
		
		// 횟수와 상관없는 반복
		int test = 12345;
		
		while(test != 0) {
			int tmp = test % 10;
			System.out.println(tmp);
			test /= 10;
		}
		
		cnt = 0;
		while(true) {	// 조건이 참이면 종속문장을 실행한다. 조건은 항상 참이다.
			if(cnt == 100) {	// 반복문을 중단할 조건
				break;			// 반복문을 탈출하는 제어문, 반복문 아래로 빠져나간다
		}
			System.out.println("cnt : " + cnt);
			cnt++;
		}
	}
}
