import java.util.Scanner;

public class Week5_1_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int performanceCost, boxOfficeGross; //performanceCost�� �Է¹��� ����,boxOfficeGross�� �Է¹��� ����
		
		Scanner kbd = new Scanner(System.in);
		
		Play p1 = new Play(); //playŬ������ �ν��Ͻ� p1 ����
	    Film f1 = new Film(); //filmŬ������ �ν��Ͻ� f1  ����
		
		System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
	    
	    System.out.println("Input Title for Play");
	    p1.setTitle((kbd.nextLine()));
	    System.out.println("Input Director for Play");
	    p1.setDirector((kbd.nextLine()));
	    System.out.println("Input Writer for Play");
	    p1.setWriter((kbd.nextLine()));
	    // Play Ŭ������ title, director, writer ���� �Ϸ�
	   
	    
	    System.out.println("Input Title for Film");
	    f1.setTitle((kbd.nextLine()));
	    System.out.println("Input Director for Film");
	    f1.setDirector((kbd.nextLine()));
	    System.out.println("Input Writer for Film");
	    f1.setWriter((kbd.nextLine()));
	    // Film Ŭ������  title, director, writer ���� �Ϸ�
	    
	    System.out.println("Input Performance Cost for Play");
	    performanceCost=Integer.parseInt(kbd.nextLine()); //nextLine()���� ���� �� int�� ��ȯ���ش�
	    p1.setPerformanceCost(performanceCost); //p1�� ����- setPerformanceCost() �޼��� �̿�
	    
	    System.out.println("Input boxOfficeGross for Film");
	    boxOfficeGross=Integer.parseInt(kbd.nextLine());//nextLine()���� ���� �� int�� ��ȯ���ش�
	    f1.setBoxOfficeGross(boxOfficeGross); //f1�� ���� - setBoxOfficeGross() �޼��� �̿�
	    
	    
	    p1.display();
	    System.out.println(""); //��ĭ ����ִ� �뵵
	    f1.display();
	}

}
