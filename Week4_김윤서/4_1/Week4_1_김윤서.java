import java.util.Scanner;
public class Week4_1_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title,singer;
		int price;
		int totalPrice; //�� ���� =����*Ƚ��
		int num; //��� �����ðڽ��ϱ�? �� Ƚ��
		Scanner kbd = new Scanner(System.in);
		
		
		System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
		
		
		Song s1; //s1, �ν��Ͻ��� ���� ������ ����
		
		System.out.println("* Song ���� *"); //song1�� ���� ���� �Է�
		
		System.out.println("���:");
		title=kbd.nextLine(); //title ������ ��� ����
		
		while (title.equals("")) { //����� �Է��� �� �� ��� while��
			System.out.println("����� �ݵ�� �ʿ��մϴ�!");
			System.out.println("���:");
			title=kbd.nextLine();
		}
		
		System.out.println("������:");
		singer=kbd.nextLine(); //singer ������ ������ ����
		
		if (singer.equals(""))//singer �� �Է¾��� �ٹٲ� �̸� (������)
		{
			System.out.println("����:");
			price=Integer.parseInt(kbd.nextLine()); //price ������ ���� ����
			//nextLine()���� �޾Ƽ� int�� ��ȯ
			s1=new Song(title,price);
			//Song(String title, int price)�����ڷ� �ν��Ͻ� ����
			
		}
		else { //singer ������
			System.out.println("����:");
			price=Integer.parseInt(kbd.nextLine()); //price ������ ���� ����
			//nextLine()���� �޾Ƽ� int�� ��ȯ
			s1=new Song(title,singer,price);
			//Song(String title,String singer,int price)�����ڷ� �ν��Ͻ� ����
		}
		
		System.out.println("��� �����ðڽ��ϱ�?");
		num=Integer.parseInt(kbd.nextLine()); //nextLine()���� �޾Ƽ� int�� ��ȯ
		
		for(int i=0;i<num;i++)
			s1.play();
		
		totalPrice=price*num; //����*Ƚ��
		System.out.println("�� "+totalPrice+"���Դϴ�.");
		
	}
}
