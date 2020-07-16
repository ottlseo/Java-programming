import java.util.Scanner;

public class Game {
	Scanner kbd = new Scanner(System.in);
	
	int you_win=0; //����ڰ� �̱� Ƚ��
	int com_win=0;  // ��ǻ�Ͱ� �̱� Ƚ��
	
	int you_choose;//"����� ������?" �亯 ����
	int com_choose;//��ǻ���� ����
	
	String rsp(int choose) { //1,2,3�� ������ ���� ����,����,���� �������ִ� �޼���
		if(choose==1) //�Է¹��� ���ڰ� 1�� ��� "����" ����
			return "����";
		if(choose==2) //�Է¹��� ���ڰ� 2�� ��� "����" ����
			return "����";
		if(choose==3)//�Է¹��� ���ڰ� 3�� ��� "��" ����
			return "��";
		else
			return "x";
	}
	
	void play() {
		System.out.println("���������� ������ �����մϴ�.");
		
		while(true) { 
		//����ڿ� ��ǻ�� �� ������ ���� ������ �̱�� �������� �ݺ� //you_win<3 || com_win<3
			input();
		
			if(you_win == 3) { //����ڰ� �̱� Ƚ���� 3�� ��� - ����ڰ� ���� ��
				System.out.printf(" (You(%d) - Com(%d))", you_win, com_win);
				System.out.println("");
				System.out.println("����� �̰���ϴ�.");
				break; //"����� �̰���ϴ�" ��� �� �ݺ��� ��������
			}
			if(com_win == 3) {//��ǻ�Ͱ� �̱� Ƚ���� 3�� ��� - ��ǻ�Ͱ� ���� ��
				System.out.printf(" (You(%d) - Com(%d))", you_win, com_win);
				System.out.println("");
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				break;//"��ǻ�Ͱ� �̰���ϴ�" ��� �� �ݺ��� ��������
			}
		}
		System.out.println("������ �����մϴ�.");
		
	}
	void input() {
		try {
			System.out.println("");
			System.out.print("����� ������?");
			System.out.printf(" (You(%d) - Com(%d))", you_win, com_win);
			System.out.println("");
			System.out.println("����(1)	����(2)	��(3)");
			you_choose= kbd.nextInt();
			
			if(you_choose>3 || you_choose<1) //1~3 ���� ���� �Է��� ���
				throw new Exception("������ �߸��Ǿ����ϴ�."); //������Ʈ Exception�� "������ �߸��Ǿ����ϴ�"��� string�� ������ ����
			
			com_choose= (int)(Math.random()*3 +1); //��ǻ���� ���� -�������� ����
			
			System.out.println("<You>	<Com>");
			System.out.println(rsp(you_choose)+"	"+rsp(com_choose)); //rsp()�޼��忡 1,2,3 ���ڷ� �־��־�  ����/����/���� �ٲپ���
			writeOutput(you_choose, com_choose); //writeOutput() ȣ��
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());//"������ �߸��Ǿ����ϴ�" �����ؼ� ���
		}
		
		
	}
	void writeOutput(int you, int com){
		int result = you - com; // ����� ���ð����� ��ǻ�� ���ð� �� ������ ���� ���� ����
		
		if(result == 2) {
			System.out.println("��ǻ�� ��");
			this.com_win+=1; //��ǻ�� �̱� Ƚ�� +1
		}
		if(result == 1) {
			System.out.println("��� ��");
			this.you_win+=1; //����� �̱� Ƚ�� +1
		}
		if(result == 0) //���� ���� �� ���
			System.out.println("���"); //Ƚ�� �������� ����
		
		if(result == -1) {
			System.out.println("��ǻ�� ��");
			this.com_win+=1; //��ǻ�� �̱� Ƚ�� +1
		}
		if(result == -2) {
			System.out.println("��� ��");
			this.you_win+=1; //����� �̱� Ƚ�� +1
		}
	}
}
