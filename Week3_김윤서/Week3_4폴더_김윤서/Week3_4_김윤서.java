import java.util.Scanner;

public class Week3_4_김윤서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int money;//--돈을 넣어주세요-- 에서 받은 금액을 저장할 변수
		String menu; //선택한 메뉴
		String answer; //"계속하시겠습니까? (y/n)"의 대답 저장할 변수
		int cokeprice,lemonadeprice,coffeeprice; //각 음료의 가격을 임시 저장할 변수
		Scanner kbd = new Scanner(System.in);
		MenuOrder m1 = new MenuOrder(); //m1 객체 생성
		
	    
	    System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
		
		// ==========================가격 설정============================
		System.out.println("---음료가격 설정---");
		System.out.println("Coke가격:");
		cokeprice=Integer.parseInt(kbd.nextLine());
		//먼저 콜라 가격 입력(String으로 받고)- int로 바꿔줌
		m1.setPrice("1", cokeprice); // cokeprice(가격)를 메뉴1(cokePrice)에 저장
		
		System.out.println("Lemonade가격:");
		lemonadeprice=Integer.parseInt(kbd.nextLine());
		//먼저 레몬에이드 가격 입력(String으로 받고)- int로 바꿔줌
		m1.setPrice("2", lemonadeprice); // lemonadeprice(가격)를 메뉴2(lemonadePrice)에 저장
		
		System.out.println("Coffee가격:");
		coffeeprice=Integer.parseInt(kbd.nextLine());
		//먼저 커피 가격 입력(String으로 받고)- int로 바꿔줌
		m1.setPrice("3", coffeeprice); // coffeeprice(가격)를 메뉴3(coffeePrice)에 저장
		
	    //// ====================가격 설정 완료=========================

		answer="y";
		while (answer.equalsIgnoreCase("y")) {
			//대답이 "y"인 경우에 한해서 반복.
			
		//// ===================돈 투입=====================
			System.out.println("---돈을 넣으세요---");
		    money=Integer.parseInt(kbd.nextLine());//먼저 돈을 문자열로 입력받고, 이를 int로 변환
		    
		    //// ===================돈 투입 완료=====================
		    
		    m1.showMenu();
		    menu=kbd.nextLine(); // menu(1,2,3) 입력 받기

		    m1.showResult(money,menu); //투입된 금액과 menu 를 매개변수로
		    
		    System.out.println("계속하시겠습니까?");
		    answer=kbd.nextLine();
		    
		}
		

		
	}

}
