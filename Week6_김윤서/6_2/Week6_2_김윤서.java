import java.util.Scanner;

public class Week6_2_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
	    Scanner kbd = new Scanner(System.in);
		
		Emergency em1 = new Emergency(); //Emergency ��ü ����
		
		System.out.println("What kind of Emergency?");
		int input=1; //1~5 ���� �޴� ����, �ʱⰪ ���Ƿ� ����
		
		
		int i=0; //emgList �迭�� �ε���
		while(input!=5) { //5.End�� �ƴ� �̻� �ݺ�
			System.out.println("What kind of Emergency?");
			System.out.println("1.Fire  2.Patient  "
					+ "3.Thief  4.Record  5.End");//����Ʈ ���
			input=kbd.nextInt();
			
			if (input==1) {
				FireEngine fe = new FireEngine(); //FireEngine��ü ����
				em1.EM_Call(fe);
			}
			else if (input==2) {
				Ambulance am = new Ambulance();
				em1.EM_Call(am);
			}
			else if (input==3) {
				PoliceCar pc = new PoliceCar();
				em1.EM_Call(pc);
			}
			else if (input==4) {
				em1.EM_record();
			}
			else if (input==5){
				System.out.println("Finished"); 
				System.exit(0); // 5.End - "Finished"����� ��, �ý��� ����
			}
			else {
				System.out.println("Wrong Input"); //1~5 ���� ���� �ƴϸ� "Wrong Input" ���
			}
		}
		
		
	}

}
