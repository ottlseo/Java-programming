import java.util.Scanner;

public class Week4_2_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2; //�Է¹��� ���� 2��
		int fac1,fac2;
		
		Scanner kbd = new Scanner(System.in);
				
		System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
	    
	    System.out.println("ù���� ���� �Է�:");
		num1=Integer.parseInt(kbd.nextLine()); //num1 ����
		//nextLine()���� �޾Ƽ� int�� ��ȯ
		
		System.out.println("�ι��� ���� �Է�:");
		num2=Integer.parseInt(kbd.nextLine()); //num2 ����
		//nextLine()���� �޾Ƽ� int�� ��ȯ
		
		fac1=Facto.factoVal(num1);
		fac2=Facto.factoVal(num2);
		Facto.result=fac1-fac2;
		System.out.printf("Factorial(%d)-Factorial(%d)=%d",num1,num2,Facto.result);
		
	}

}
