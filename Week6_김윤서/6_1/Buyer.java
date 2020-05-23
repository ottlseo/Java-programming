import java.util.*;

public class Buyer {

	int money;
	int bonusPoint=0;
	int i;
	
	Vector item = new Vector();
	// �������� ũ�Ⱑ �����Ǵ� ��ü�迭 Vector Ŭ���� �̿�. 
	//item ���� ���� ���� - ������ ��ǰ�� ����� item�� ����. 

	
	void buy(Product pd) {
		//buyer�� pd�� ��� �޼���
		
		if(pd.price>money) { //Buyer�� ���� ���ڸ� ���
			System.out.println("Money is not enough.");
			
			this.summary(); //���θ���Ʈ ���
			System.out.println("\nMoney Left:"+this.money); //���� ���ڸ� ��쿡�� �ܾװ� ����Ʈ ��� - this �̿�
			System.out.println("Current Bonus Point:"+this.bonusPoint);
			System.exit(0); //�ý��� ����
		}
		money=money-pd.price;
		bonusPoint=bonusPoint+pd.bonusPoint; //���ʽ� ����Ʈ �����ش�.
		
		item.add(pd); //������ ��ǰ�� Vector�� �����Ѵ�.
		System.out.println("You bought "+pd+" ("+pd.price+")"); //���� ���
	}
	
	
	void summary() { // �� ��ǰ ��ϰ� �ܾ�, ���ʽ� ����Ʈ ���
		
		String itemList=""; //������ ��ǰ ���
		
		for (int i=0; i<item.size(); i++) {
			Product pd = (Product) item.get(i); //Vector�� i������ �ִ� ��ü�� ���´�.
			itemList += (i==0) ? "" + pd : ", "+pd; //������ ��ǰ�� ����� �����.
		}
		System.out.println("Shopping List: "+itemList); //���
		
		
			
		}
	}

