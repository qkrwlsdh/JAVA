package day12;


class A_card{
	
	private char kind;			
	private int num;			
	private int width = 5;		
	private int height = 5;	
	private String p;
	
	public void SetA_card(char kind, int num) {
		this.kind=kind;
		this.num=num;
		if(kind=='H')		p="♥";
		else if(kind=='S')	p="♠";
		else if(kind=='C')	p="♣";	//다이아는 형태 깨져서 안만듬
	}

	public void ShowA_card(){
		System.out.println("["+kind+num+" CARD]");
		for(int i=0;i<height;i++)
		{
			if		(i==0)			System.out.print("┌");
			else if	(i==height-1)	System.out.print("└");
			else 					System.out.print("│");//줄의 가장 왼쪽
			
			if(i==0 || i==height-1)			//줄의 가운데 부분 출력
				for(int j=0;j<width;j++)
					System.out.print("─");
			else
			{
				for(int j=0;j<width;j++)
					{
						if(j==width/2 && (i>=height/2-num/2 && i<=height/2+num/2)) 
						{
							if(num%2==0 && i==height/2)	System.out.print(" ");
							else System.out.print(p);
						}
						else System.out.print(" ");
					}
			}
			
			if		(i==0)			System.out.print("┐");
			else if	(i==height-1)	System.out.print("┘");
			else 					System.out.print("│");
			System.out.println();
		}
	}

	public void Set_Size(int i) {
		//Set_Size에서 가로 세로 값을 할당
		width = i;
		height = i;
	}
}
public class Test2{
	public static void main(String[] args) {
		// 객체를 생성하기 전에 미리 카드의 크기를 결정하고
		// 이후 같은 크기로 카드들을 생성합니다
		// A_card.Set_Size(7);
		
		A_card card01 = new A_card();	// 하나의 클래스로 서로 다른 객체를 생성한 경우
		A_card card02 = new A_card();	// 객체들이 같은 값을 갖게 만들고 싶다면
		A_card card03 = new A_card();	// static을 활용하면 된다
			
		card01.SetA_card('H', 3);
		card01.ShowA_card();
		card02.SetA_card('C', 1);
		card02.ShowA_card();
		card03.SetA_card('S', 2);
		card03.ShowA_card();
	}
}

