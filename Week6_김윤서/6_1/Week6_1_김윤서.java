import java.util.Scanner;

public class Week6_1_김윤서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
	    
		int input=1; // What do you want to buy? 
		//초기값 1로 정해줌, 의미 없음- 0이 아니게 하는 용도.
		Buyer buyer1 = new Buyer(); //구매자 객체 생성
		
		System.out.println("How much money do you have?");
		buyer1.money=kbd.nextInt();
		
		
		int i=1; //item 배열의 인덱스
		while(input!=0) {
			System.out.println("1.TV(100)  2.Computer(200)  "
					+ "3.Video(110)  4.Audio(50)  5.NoteBook(300)");//리스트 출력
			System.out.println("What do you want to buy?(1~5)  "
					+ "Input 0 to quit.");
			input=kbd.nextInt();
			
			if (input==1) {
				Product tv = new Tv(); //Tv 객체 생성
				buyer1.buy(tv);
			}
			else if (input==2) {
				Product com = new Computer(); //Computer 객체 생성
				buyer1.buy(com);
			}
			else if (input==3) {
				Product vd = new Video(); // Video 객체 생성
				buyer1.buy(vd);
			}
			else if (input==4) {
				Product ad = new Audio(); //Audio 객체 생성
				buyer1.buy(ad);
			}
			else if (input==5){
				Product ntb = new NoteBook(); //NoteBook 객체 생성
				buyer1.buy(ntb);
			}
			
		}
		
		buyer1.summary(); //쇼핑리스트 출력
		System.out.println("\nMoney Left:"+buyer1.money);
		System.out.println("Current Bonus Point:"+buyer1.bonusPoint);
		
	}

}
