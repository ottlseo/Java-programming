import java.util.Scanner;

public class HW1_3_������ {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("==========");
	    System.out.println("Major: ���̹�����");
	    System.out.println("ID: 1971063");
	    System.out.println("Name: ������");
	    System.out.println("==========");
	    
	    
	    String answer="y"; //while�� �����ϱ� ���� �ʱⰪ "y"�� ����
	    
	    while(answer.equalsIgnoreCase("y")) { //����� �Է��� 'y'�� ���� �ݺ�
		    System.out.println("Input a word");
		    String input = kbd.next(); //input�� ����ڰ� �Է��� ���ڿ� ����
		    char Arr[] = new char[100];
		    Arr = input.toCharArray(); //��Ʈ���� ���ڹ迭�� ��ȯ
		   
		    if(check(Arr)) //check �޼��� ȣ�� - ���� true�̸�
		    	System.out.println("Symmetry");
		    else
		    	System.out.println("Asymmetry");
		    
		    System.out.println("Try again? (y/n)");
	    	answer=kbd.next();
	    }
	  }
	    
	 public static boolean check(char[]Arr) {
		 
		int len=Arr.length; //���ڹ迭�� ������ ����=��Ʈ���� ���� :���� len�� ����
		for (int i=0; i<(len/2); i++) // len�� 2�� ���� ����� i�� ������ ���� (len�� int���̹Ƿ� �ڵ����� ���� ��)

			if(Arr[i]!=Arr[len-1-i]) //���ڿ����� ��Ī���迡 �ִ� �� ���ڰ� ���� ������,
				return false; // false�� �����ϰ� �ݺ����� ����������.
		
		return true; //��� ������ true�� �����Ѵ�.
		
		    		 
	 }   
	    
	}

