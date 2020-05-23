
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
	} //���� ����- �ݺ����� ���� x
	
	public void showMenu() {
	    System.out.println("---���Ḧ �����ϼ���---");
	    System.out.println("1. Coke: "+this.cokePrice);
	    System.out.println("2. lemonade: "+this.lemonadePrice);
	    System.out.println("3. Coffee: "+this.coffeePrice);
	    	    
	} //�޴� �����ֱ�- �ݺ��� ���� ����
	
	public void showResult(int money,String menu) {
		int change, moremoney; //�ܵ���, ������ ��� �� �����ϴ� �ݾ� ��������
		inputMoney=money; //�Ű������� ���� money�� inputMoney�� ����
		
	    if(menu.equals("1")) { 
	    	//String Ÿ���̹Ƿ� equals() �޼���� �� 
	    	System.out.println("Coke�� �����ϼ̽��ϴ�.");
	    	change=inputMoney-this.cokePrice;
	    	if (change<0) {
	    		moremoney=-change; //�ܵ��� �������� ���, ������ �ݾ��� moremoney�� ����
	    		System.out.println(moremoney+"���� �� �־��ּ���.");
	    	}
	    	else {
		    	System.out.println("�ܵ��� "+change+"���Դϴ�.");
		    	}
	    }
	    
	    else if(menu.equals("2")) { 
	    	//String Ÿ���̹Ƿ� equals() �޼���� �� 
	    	System.out.println("lemonade�� �����ϼ̽��ϴ�.");
	    	change=inputMoney-this.lemonadePrice;
	    	if (change<0) {
	    		moremoney=-change; //�ܵ��� �������� ���, ������ �ݾ��� moremoney�� ����
	    		System.out.println(moremoney+"���� �� �־��ּ���.");
	    	}
	    	else {
		    	System.out.println("�ܵ��� "+change+"���Դϴ�.");
		    	}
	    }
	    else if(menu.equals("3")) {
	    	//String Ÿ���̹Ƿ� equals() �޼���� �� 
	    	System.out.println("Coffee�� �����ϼ̽��ϴ�.");
	    	change=inputMoney-this.coffeePrice;
	    	if (change<0) {
	    		moremoney=-change; //�ܵ��� �������� ���, ������ �ݾ��� moremoney�� ����
	    		System.out.println(moremoney+"���� �� �־��ּ���.");
	    	}
	    	else {
		    	System.out.println("�ܵ��� "+change+"���Դϴ�.");
		    	}
	    }
	    else {
	    	System.out.println("���� �޴��� �����ϼ̽��ϴ�.");
	    	// 1,2,3 �߿� ���� ��� 
	    }
		
	}//��� ���- �ݺ��� ���� ����
}
