package day13_studentManagement;

import java.util.Scanner;

public class Handler {
	Student[] arr = new Student[10];
	Scanner sc = new Scanner(System.in);
	
	Handler(){
		arr[0] = new Student3("이지은", 100, 99, 87);
		arr[1] = new Student4("홍진호", 21, 22, 23, 22);
		arr[2] = new Student3("김소영", 75, 89, 65);
		arr[3] = new Student4("박진수", 97, 66, 45, 100);
		arr[4] = new Student3("홍진호", 22, 23, 22);
	}
	
	// 1-1. 학생 생성
	Student createStudent() {
		char selectType;
		Student newbie;
		String name;
		int kor, eng, mat, jpn;
		System.out.println("===신규 학생을 생성합니다===");
		System.out.print("제 2외국어를 포함하는 학생입니까 (y/n) : ");
		selectType = sc.next().charAt(0);
		
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("국어 입력 : ");
		kor = sc.nextInt();
		System.out.print("영어 입력 : ");
		eng = sc.nextInt();
		System.out.print("수학 입력 : ");
		mat = sc.nextInt();
		
		if(selectType == 'y') {
			System.out.print("일어 입력 : ");
			jpn = sc.nextInt();
			newbie = new Student4(name, kor, eng, mat, jpn);
		}
		else {
			newbie = new Student3(name, kor, eng, mat);
		}
		return newbie;
	}
	
	// 1-2. 학생 추가
	boolean insertStudent(Student newbie) {
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = newbie;
				return true;
			}
		}
		return false;
	}

	// 2. 전체 출력 (빈 칸은 출력하지 않고)
	void selectAllStudent() {
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				arr[i].show();
			}
		}
		System.out.println();
	}

	// 3. 검색 후 한명의 정보만 출력 (이름으로 검색, A.equals(B) : A와 B의 내용이 같은지 검사한다)
	// A.method(B)에서 A가 null이면 예외가 발생, B가 null이면 예외가 발생하지 않는다
	Student selectOneStudent() {
		
		System.out.print("검색할 학생의 이름을 입력하세요 : ");
		String find = sc.next();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.contains(find)) {	// A가 B를 포함하는가
				return arr[i];
			}
		}
		return null;	// 반환하는 함수이지만 조건에 맞는 객체가 없어서 반환을 하지 않겠다
	}

//	void selectOneStudent() {
//		boolean hasResult = false;	// 결과가 있는가? 초기값은 false
//		
//		System.out.print("검색할 학생의 이름을 입력하세요 : ");
//		String find = sc.next();
//		// 배열 전체 중에서 빈값이 아닌곳만 확인하면서, find와 이름이 같은 학생을 찾으면 show()하고 return
//		
//		for(int i = 0; i < arr.length; i++) {
////			if(arr[i] != null && find.equals(arr[i].name)) {		// 정확하게 일치
//				if(arr[i] != null && arr[i].name.contains(find)) {	// 포함
//				arr[i].show();
//				hasResult = true;	// 결과를 찾았다면 값을 true로 변경
//			}
//		}
//		if(hasResult == false)
//			System.out.println(find + " : 검색 결과를 찾을 수 없습니다\n");
//	}
	
	// 4. 평균으로 오름차순 정렬 (정렬만 하기, 메인에서 전체출력을 한번 더 호출)
	void orderByAvg() {
		
		// 전체 출력을 할때
		// 그안에서 평균을 비교하여
		// 오름차순으로 정렬한다
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {

				if(arr[i] != null && arr[j] != null) {
					if(arr[i].avg > arr[j].avg) {
						Student tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}
		}
	}	// end of orderByAvg
	
	// 5. 수정
	boolean updateStudent(Student update) {
		// 어떤 학생을 수정할지 입력을 받아서 검색을하고 검색된 학생의 정보를 지우고 다시 입력받는다
		if(update == null)
			return false;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].equals(update)) {
				arr[i] = null;
				System.out.println("다음 학생의 정보를 수정합니다.");
				arr[i].show();
				
				Student newInfo = createStudent();	// 하나 만들어서 (신규생성에 있던 작동, 기능)
				arr[i] = newInfo;					// 바꿔치기 한다
				return true;
			}
		}
		return false;
	}
	
	// 6. 삭제
	boolean deleteStudent(Student delete) {
		if(delete == null)	// 받은 값이 null이면 배열을 순회할 필요가 없다
			return false;
			
		for(int i = 0; i < arr.length; i++) {
			// A.equals(B)는 문자열뿐만 아니라, 모든 객체에 적용되는 함수다
			if(arr[i] != null && arr[i].equals(delete)) {	// 학생이 null이 아니고 학생과 delete가 같을때
				arr[i] = null;	// 그 학생을 null시킨다 (없앤다)
				return true;
			}
		}
		return false;
	}
} // end of class
