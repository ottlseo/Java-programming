import java.util.Scanner;
public class Week3_2_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double r; //���� �������� �ӽ÷� �Է¹��� �� (�ӽ�)

		Scanner kbd = new Scanner(System.in);
		Circle c1 = new Circle(); //Circle ��ü c1 ����
		
	    System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
	      
		
		
		System.out.println("������:");
		r=kbd.nextDouble(); //double ������ r �Է¹ޱ�
		
		c1.setRadius(r); //�Է°� r�� c1.radius�� �Ҵ� 
		System.out.println("������:"+c1.getRadius()); //getRadius()�� c1�� ������ ���
		
		c1.circleInfo(); //circleInfo()�޼��� ȣ���ؼ� ���� �ѷ��� ���� ���
		
		
	}


}
