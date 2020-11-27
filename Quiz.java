package functionQuiz;

public class Quiz {
	
	public static void main(String[] args) {
		Jinoh j = new Jinoh();
/*1*/	j.hello();
/*2*/	j.strlength("Hello, world");
/*3*/	System.out.println(j.add(4, 5));
/*4*/	System.out.println(j.compare(3, 7));
/*5*/	System.out.println(j.compare2(1, 2, 3));
/*6*/	System.out.println(j.primeNum(11));
/*7*/	System.out.println(j.reverse(12345));
/*8*/	
	}
}
class Jinoh{
	
	// 1. Hello, world 문자열을 5번 출력하는 함수 만들기
	
	String hello() {
		String str = "Hello, world";
			for(int i = 0; i < 5; i++) {
				System.out.println(str);
			}
			return str;
	}
	
	// 2. Hello, world 문자열을 전달하는 정수만큼 출력하는 함수 만들기
	
	String strlength(String a) {
		String str2 = "Hello, world";
		for(int i = 0; i < str2.length(); i++) {
			System.out.println(str2);
		}return str2;
	}
	
	// 3. 두 정수의 합을 구하고, 결과를 반환하는 함수 만들기
	
	int add(int i, int j) {
		
		return i + j;
	}
	
	// 4. 두 정수의 크기를 비교하여, 큰 값을 반환하는 함수 만들기
	
	int compare(int i, int j) {
		int max;
		if(i > j)
			max = i;
		else
			max = j;
		return max;
	}
	
	// 5. 세 정수의 크기를 비교하여, 큰 값을 반환하는 함수 만들기
	
	int compare2(int i, int j, int k) {
		int max = 0;
		if(i > j && i > k)
			max = i;
		else if(j > i && j > k)
			max = j;
		else if(k > i && k > j)
			max = k;
		return max;
	}
	
	// 6. 정수 하나를 전달받아서, 정수가 소수인지 아닌지 판별하여 논리값을 반환하는 함수 만들기
	
	boolean primeNum(int i) {
		boolean prime = true;
		
		for(int j = 2; j < i; j++) {
			if(i % j == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
	
	// 7. 정수를 전달받아서, 그 값을 거꾸로 한 수를 반환하는 함수 만들기
	
	int reverse(int i) {
		int result = 0;
		while(i != 0) {
			result = i % 10 + result * 10;
			i /= 10;
		}
		return result;
	}
	
	// 8. 금액을 전달받아서, 화폐와 개수를 문자열로 반환하는 함수 만들기
	
	String money(int i) {
		int oman = 0;
		int man = 0;
		int oceon = 0;
		int ceon = 0;
		int obaek = 0;
		int baek = 0;
		
		String tmp = "";
		int result = 0;
		
		while(i != 0) {
			if(result == i % 50000) {
				if(i == oman)
					tmp += oman;
				System.out.println("오만원권 : " + tmp);
			}
			if(result == i % 10000) {
				if(i == man)
					tmp += man;
				System.out.println("만원권 : " + tmp);
			}
			if(result == i % 5000) {
				if(i == oceon)
					tmp += oceon;
				System.out.println("오천원권 : " + tmp);
			}
			if(result == i % 1000) {
				if(i == ceon)
					tmp += ceon;
				System.out.println("천원권 : " + tmp);
			}
			if(result == i % 500) {
				if(i == obaek)
					tmp += obaek;
				System.out.println("오백원 : " + tmp);
			}
			if(result == i % 100) {
				if(i == baek)
					tmp += baek;
				System.out.println("백원 : " + tmp);
			}
		}
		
		return tmp;
	}
}
