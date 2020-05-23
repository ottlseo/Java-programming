import java.util.*;

public class Buyer {

	int money;
	int bonusPoint=0;
	int i;
	
	Vector item = new Vector();
	// 동적으로 크기가 관리되는 객체배열 Vector 클래스 이용. 
	//item 참조 변수 정의 - 구매한 물품들 목록을 item에 저장. 

	
	void buy(Product pd) {
		//buyer가 pd를 사는 메서드
		
		if(pd.price>money) { //Buyer의 돈이 모자른 경우
			System.out.println("Money is not enough.");
			
			this.summary(); //쇼핑리스트 출력
			System.out.println("\nMoney Left:"+this.money); //돈이 모자른 경우에도 잔액과 포인트 출력 - this 이용
			System.out.println("Current Bonus Point:"+this.bonusPoint);
			System.exit(0); //시스템 종료
		}
		money=money-pd.price;
		bonusPoint=bonusPoint+pd.bonusPoint; //보너스 포인트 더해준다.
		
		item.add(pd); //구입한 제품을 Vector에 저장한다.
		System.out.println("You bought "+pd+" ("+pd.price+")"); //가격 출력
	}
	
	
	void summary() { // 산 물품 목록과 잔액, 보너스 포인트 출력
		
		String itemList=""; //구입한 물품 목록
		
		for (int i=0; i<item.size(); i++) {
			Product pd = (Product) item.get(i); //Vector의 i번쨰에 있는 객체를 얻어온다.
			itemList += (i==0) ? "" + pd : ", "+pd; //구입한 물품의 목록을 만든다.
		}
		System.out.println("Shopping List: "+itemList); //출력
		
		
			
		}
	}

