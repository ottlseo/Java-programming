import java.util.Scanner;

public class Week6_1_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
	    
		int input=1; // What do you want to buy? 
		//�ʱⰪ 1�� ������, �ǹ� ����- 0�� �ƴϰ� �ϴ� �뵵.
		Buyer buyer1 = new Buyer(); //������ ��ü ����
		
		System.out.println("How much money do you have?");
		buyer1.money=kbd.nextInt();
		
		
		int i=1; //item �迭�� �ε���
		while(input!=0) {
			System.out.println("1.TV(100)  2.Computer(200)  "
					+ "3.Video(110)  4.Audio(50)  5.NoteBook(300)");//����Ʈ ���
			System.out.println("What do you want to buy?(1~5)  "
					+ "Input 0 to quit.");
			input=kbd.nextInt();
			
			if (input==1) {
				Product tv = new Tv(); //Tv ��ü ����
				buyer1.buy(tv);
			}
			else if (input==2) {
				Product com = new Computer(); //Computer ��ü ����
				buyer1.buy(com);
			}
			else if (input==3) {
				Product vd = new Video(); // Video ��ü ����
				buyer1.buy(vd);
			}
			else if (input==4) {
				Product ad = new Audio(); //Audio ��ü ����
				buyer1.buy(ad);
			}
			else if (input==5){
				Product ntb = new NoteBook(); //NoteBook ��ü ����
				buyer1.buy(ntb);
			}
			
		}
		
		buyer1.summary(); //���θ���Ʈ ���
		System.out.println("\nMoney Left:"+buyer1.money);
		System.out.println("Current Bonus Point:"+buyer1.bonusPoint);
		
	}

}
