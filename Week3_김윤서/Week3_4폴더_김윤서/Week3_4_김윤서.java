import java.util.Scanner;

public class Week3_4_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int money;//--���� �־��ּ���-- ���� ���� �ݾ��� ������ ����
		String menu; //������ �޴�
		String answer; //"����Ͻðڽ��ϱ�? (y/n)"�� ��� ������ ����
		int cokeprice,lemonadeprice,coffeeprice; //�� ������ ������ �ӽ� ������ ����
		Scanner kbd = new Scanner(System.in);
		MenuOrder m1 = new MenuOrder(); //m1 ��ü ����
		
	    
	    System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
		
		// ==========================���� ����============================
		System.out.println("---���ᰡ�� ����---");
		System.out.println("Coke����:");
		cokeprice=Integer.parseInt(kbd.nextLine());
		//���� �ݶ� ���� �Է�(String���� �ް�)- int�� �ٲ���
		m1.setPrice("1", cokeprice); // cokeprice(����)�� �޴�1(cokePrice)�� ����
		
		System.out.println("Lemonade����:");
		lemonadeprice=Integer.parseInt(kbd.nextLine());
		//���� �����̵� ���� �Է�(String���� �ް�)- int�� �ٲ���
		m1.setPrice("2", lemonadeprice); // lemonadeprice(����)�� �޴�2(lemonadePrice)�� ����
		
		System.out.println("Coffee����:");
		coffeeprice=Integer.parseInt(kbd.nextLine());
		//���� Ŀ�� ���� �Է�(String���� �ް�)- int�� �ٲ���
		m1.setPrice("3", coffeeprice); // coffeeprice(����)�� �޴�3(coffeePrice)�� ����
		
	    //// ====================���� ���� �Ϸ�=========================

		answer="y";
		while (answer.equalsIgnoreCase("y")) {
			//����� "y"�� ��쿡 ���ؼ� �ݺ�.
			
		//// ===================�� ����=====================
			System.out.println("---���� ��������---");
		    money=Integer.parseInt(kbd.nextLine());//���� ���� ���ڿ��� �Է¹ް�, �̸� int�� ��ȯ
		    
		    //// ===================�� ���� �Ϸ�=====================
		    
		    m1.showMenu();
		    menu=kbd.nextLine(); // menu(1,2,3) �Է� �ޱ�

		    m1.showResult(money,menu); //���Ե� �ݾװ� menu �� �Ű�������
		    
		    System.out.println("����Ͻðڽ��ϱ�?");
		    answer=kbd.nextLine();
		    
		}
		

		
	}

}
