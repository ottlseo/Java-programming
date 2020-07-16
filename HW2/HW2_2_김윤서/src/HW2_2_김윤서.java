import java.util.*;

public class HW2_2_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
	    
	    Scanner kbd = new Scanner(System.in); //ǥ���Է�
	    String input, result;
	    	// ��ȣ ���ڿ� �Է¹��� ���� input
	    	// Correct/Incorrect �� ������ ���� result
	    
	    while(true) { // ���� �ݺ�. �� input==0�̸� ����.
	    	LinkedList <Character> myStack = new LinkedList<Character>(); //���� ������ ���� push()-pop()
		    result = "Correct"; // result�⺻���� Correct
		    
		    System.out.println("Input:"); //�Է¹ޱ�
		    input = kbd.nextLine();
		    
		    if (input.equalsIgnoreCase("0")) { //�Է��� 0�̸�
		    	System.out.println("Program finished"); //���α׷� ���� ����ϰ�
		    	System.exit(0); //���α׷� �����Ų��
		    }
		    
		    int length = input.length(); //length=���ڿ� ���� ==���ڹ迭�� ũ�� 
		    char Arr[] = new char[100]; //���ڹ迭 ����
		    Arr = input.toCharArray(); // ���ڿ� input�� ���� �迭Arr�� ��ȯ
		    
		    for (int i=0; i<length; i++) {
		    	char check = Arr[i]; //Arr���ڹ迭���� ������� Ȯ���� ��
		    	char stacksPop; //stack���� ������ ��
		    	
		    	// Arr[i]�� (,{,[ �� ��� -Stack�� push
		    	if ( check =='[' || check =='(' || check =='{') {
		    		myStack.addLast(check); //myStack�� check1�� push()
		    	}
		    	
		    	//Arr[i]�� ],},) �� ��� -Stack���� Pop�� ���� ���ؼ� correct ���� ���ϱ�
		    	else if (check ==']' || check ==')' || check =='}') {
		    		if(!myStack.isEmpty()) { //stack�� ������� �ʴٸ�
		    			stacksPop = myStack.removeLast(); //���� ���� ���� pop
		    			
		    			switch(check) { //3�� �߿��� ������ ��츦 switch������ ����
		    	    	case ']': //check�� ']'�� ���
		    	    		if (stacksPop != '[') { //���� ���� ������
		    	    			result = "Incorrect"; //incorrect
		    	    			break;
		    	    		}
		    	    		else
		    	    			break; // ���� ���� ���� �׳� break�� ����������.
		    	    	case '}': //check�� '}'�� ���
		    	    		if (stacksPop != '{') {//���� ���� ������ 
		    	    			result = "Incorrect"; //incorrect
		    	    			break;
		    	    		}
		    	    		else
		    	    			break;
		    	    	case ')': //check�� ')'�� ���
		    	    		if (stacksPop != '(') { //���� ���� ������ 
		    	    			result = "Incorrect"; //incorrect
		    	    			break; 
		    	    		}
		    	    		else
		    	    			break;
		    	    		// ���� ���� ���� �׳� break�� ����������.
		    	    	}
		    		}
		    	}
		    	else { //check�� �� 6�� �� ������ ���
		    		 System.out.println("Wrong Input"); // ��Wrong Input���̶�� ����ϰ�
		    		 result=""; //Correct�� ��µ��� �ʵ��� ��ĭ���� ó�����ش�.
		    }
		    	
	    }	    

		    if (!myStack.isEmpty()) //������ ��� ���� �Ŀ��� stack�� ������� ������
		    	result = "Incorrect"; // Incorrect
		    
		    System.out.println(result);
	}
}}
