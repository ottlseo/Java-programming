import java.util.Scanner;
public class Week3_1_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int answer; //�뷡 ��ȣ
		Scanner kbd = new Scanner(System.in);
		
		
	    System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
		
		
		Song s1 = new Song(); //Song Ŭ������ s1 ��ü ����
		Song s2 = new Song(); //Song Ŭ������ s2 ��ü ����
		
		System.out.println("* Song 1 *"); //song1�� ���� ���� �Է�
		System.out.println("��� �Է�:");
		s1.title=kbd.nextLine(); //title�� String���� �Է¹޾� s1.title�� ����
		System.out.println("������ �Է�:");
		s1.singer=kbd.nextLine(); //singer�� String���� �Է¹޾� s1.singer�� ����
		System.out.println("���� �Է�:");
		String str=kbd.nextLine();//������ String���� �Է¹ް�
		s1.price=Integer.parseInt(str); //Integer.parseInt()�� int�� �ٲپ� s1.price�� �����Ѵ�.
		
		System.out.println("* Song 2 *");//song2�� ���� ���� �Է�
		System.out.println("��� �Է�:");
		s2.title=kbd.nextLine(); //title�� String���� �Է¹޾� s2.title�� ����
		System.out.println("������ �Է�:");
		s2.singer=kbd.nextLine(); //singer�� String���� �Է¹޾� s2.singer�� ����
		System.out.println("���� �Է�:");
		String str2=kbd.nextLine();//������ String���� �Է¹ް�
		s2.price=Integer.parseInt(str2); //Integer.parseInt()�� int�� �ٲپ� s2.price�� �����Ѵ�.
		
		
		System.out.println("�뷡�� ������");
		System.out.println("1:"+s1.title+"  2:"+s2.title);
		answer=kbd.nextInt(); //1�� 2�߿� �� ��(int)�� �Է¹޾� answer�� ����
		
		if (answer==1) {
			s1.play(); //play() �޼��� ����
			s1.price(); //price() �޼��� ����
			System.out.println("�����մϴ�.");	
		} // answer==1�� ���
		else if (answer==2) {
			s2.play(); //play() �޼��� ����
			s2.price(); //price() �޼��� ����
			System.out.println("�����մϴ�.");
	}// answer==2 �� ���
		else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
	}
}