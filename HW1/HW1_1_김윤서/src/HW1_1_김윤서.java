import java.util.Scanner;

public class HW1_1_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("==========");
	    System.out.println("Major: ���̹�����");
	    System.out.println("ID: 1971063");
	    System.out.println("Name: ������");
	    System.out.println("==========");
	    
	    int hour, min;
	    Time t1 = new Time();
	    
	    System.out.println("Hour:");
	    hour=Integer.parseInt(kbd.nextLine()); //nextLine()���� ���� �� int�� ��ȯ���ش�
	    System.out.println("Minute:");
	    min=Integer.parseInt(kbd.nextLine()); //nextLine()���� ���� �� int�� ��ȯ
	    
	    t1.setTime(hour, min); //hour�� min TimeŬ������ ���� 
	    
	    if(t1.getValid(t1)) {
	    	System.out.println(t1.getTime('h')+":"+t1.getTime('m'));
	    	
	    }
	    else {
	    	System.out.println("Wrong Input");
	    	System.out.println("0:0");
	    	
	    }
	    
	}

}
