import java.util.Scanner;

public class HW1_2_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("==========");
	    System.out.println("Major: ���̹�����");
	    System.out.println("ID: 1971063");
	    System.out.println("Name: ������");
	    System.out.println("==========");
	    
	    String answer=""; //while�� �����ϱ� ���� �ʱⰪ �������� ����
	    DiceGame d1 = new DiceGame(); //d1��ü ����
	    
	    while(!answer.equalsIgnoreCase("n")) { //answer�� "n"�Ǵ� "N"�� �ƴ� ��� (! ������)
	    	d1.startPlaying();
	    	System.out.println("Try again? (y/n)");
	    	answer=kbd.nextLine();
	    }
	    System.out.println("Game finished."); //"n"�Ǵ� "N" �Է��ؼ� while�� ���������� ��� �������� ���
	}

}
