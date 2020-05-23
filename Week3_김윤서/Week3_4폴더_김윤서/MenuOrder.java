
public class MenuOrder {

	private int cokePrice, lemonadePrice, coffeePrice;
	private int inputMoney;
	private String drinkSelected;
	
	public void setPrice(String menu, int price) {
		if (menu=="1") {
			this.cokePrice=price;
		}
		else if (menu=="2") {
			this.lemonadePrice=price;
		}
		else if (menu=="3") {
			this.coffeePrice=price;
		}
	} //가격 설정- 반복문에 포함 x
	
	public void showMenu() {
	    System.out.println("---음료를 선택하세요---");
	    System.out.println("1. Coke: "+this.cokePrice);
	    System.out.println("2. lemonade: "+this.lemonadePrice);
	    System.out.println("3. Coffee: "+this.coffeePrice);
	    	    
	} //메뉴 보여주기- 반복문 내에 포함
	
	public void showResult(int money,String menu) {
		int change, moremoney; //잔돈과, 부족할 경우 더 내야하는 금액 변수선언
		inputMoney=money; //매개변수로 받은 money를 inputMoney에 저장
		
	    if(menu.equals("1")) { 
	    	//String 타입이므로 equals() 메서드로 비교 
	    	System.out.println("Coke를 선택하셨습니다.");
	    	change=inputMoney-this.cokePrice;
	    	if (change<0) {
	    		moremoney=-change; //잔돈이 음수값인 경우, 부족한 금액을 moremoney에 저장
	    		System.out.println(moremoney+"원을 더 넣어주세요.");
	    	}
	    	else {
		    	System.out.println("잔돈은 "+change+"원입니다.");
		    	}
	    }
	    
	    else if(menu.equals("2")) { 
	    	//String 타입이므로 equals() 메서드로 비교 
	    	System.out.println("lemonade를 선택하셨습니다.");
	    	change=inputMoney-this.lemonadePrice;
	    	if (change<0) {
	    		moremoney=-change; //잔돈이 음수값인 경우, 부족한 금액을 moremoney에 저장
	    		System.out.println(moremoney+"원을 더 넣어주세요.");
	    	}
	    	else {
		    	System.out.println("잔돈은 "+change+"원입니다.");
		    	}
	    }
	    else if(menu.equals("3")) {
	    	//String 타입이므로 equals() 메서드로 비교 
	    	System.out.println("Coffee를 선택하셨습니다.");
	    	change=inputMoney-this.coffeePrice;
	    	if (change<0) {
	    		moremoney=-change; //잔돈이 음수값인 경우, 부족한 금액을 moremoney에 저장
	    		System.out.println(moremoney+"원을 더 넣어주세요.");
	    	}
	    	else {
		    	System.out.println("잔돈은 "+change+"원입니다.");
		    	}
	    }
	    else {
	    	System.out.println("없는 메뉴를 선택하셨습니다.");
	    	// 1,2,3 중에 없는 경우 
	    }
		
	}//결과 출력- 반복문 내에 포함
}
