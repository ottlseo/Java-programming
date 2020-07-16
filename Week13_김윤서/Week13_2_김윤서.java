import java.util.Scanner;
import javax.swing.*;

class SharedArea { //SharedArea ����
   boolean stop;
   String mylist;
}


class MyThread extends Thread {

	   boolean game;
	   public SharedArea sharedarea;

	   public void run() {
	      
	      String mylist[] = {"hello", "mymymy", "name", "iss",
	                       "kim", "yoon", "seo", "what",
	                       "isss", "your", "name", "nice",
	                       "too", "meet", "you"};
	      // Ÿ�ڿ��� �ܾ� ��� (3���� �̻��� �ܾ� * 15�� �� ����)
	      
	      for (int j = 0; j < 20; j++) { //20�ʱ��� ��ȸ�� �ְ�
	         if (game == true)
	            break;
	         
	         int i = (int) (Math.random() * 16); //�ܾ� �������� ����
	         System.out.println(mylist[i]);
	         
	         sharedarea.mylist = mylist[i];
	        
	         try {
	            sleep(1000); //1�ʿ� �ϳ��� �ܾ� �ʱ�ȭ
	         }
	         catch (InterruptedException e) { // InterruptedException ����ó��
	            System.out.println(e.getMessage());
	         }
	      }
	      
	      if (game == true) { // �Է��� �ܾ ������ �ܾ�� �����ϸ�
	         System.out.println("����"); //����!
	         System.out.println("Timer is stopped.");
	         System.exit(0); //���α׷� ����
	      }
	      
	      else { //�������� ������
	         System.out.println("����");
	         System.exit(0);
	      }
	   }

	   public void setStop(boolean game) { //������ ������Ű�� �޼���
	      this.game = game;
	   }
	}


public class Week13_2_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
	    
	    MyThread thread = new MyThread();// thread ����
	    SharedArea SH = new SharedArea();// SH ����
	      
	    thread.sharedarea = SH;
	    thread.start(); //������ ����

	      while (true) {
	         String inputword = JOptionPane.showInputDialog("���ڿ� �Է�");
	         
	         if (inputword == null)
	         {
	            thread.setStop(true);
	            break;
	         } //�Է�â�� ������ ����
	         
	         System.out.println("<" + inputword + ">�� �Է��ϼ̽��ϴ�");
	         // ����ڰ� �Է��� �ܾ� �������
	         if (thread.game == true) {
		            thread.setStop(false);
		         }
	         
	         if (inputword.equalsIgnoreCase(SH.mylist)) {
	        	 // �Է��� �ܾ�� ������ �ܾ ��ġ�ϸ�
	            thread.setStop(true); //������ ����
	            break;
	         }
	         
	      }
	 
	    
	}

}
