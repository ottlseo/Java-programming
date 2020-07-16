package week13_1_������;
import java.util.*;

class SimulThread extends Thread {
	   
		SharedArea sharedArea;
	   
		double head=0; //�ո�
		double tail=0; //�޸�
		int n; //������ Ƚ�� 
	   
		SimulThread(int n) { //������
	      this.n = n; //- ���� Ƚ�� N�� main���� �޾Ƽ� SimulThread �����ڷ� ����
	   }
	   
		public void run() {
			for(int i=0;i<n;i++) {
				if((int)Math.round(Math.random()) == 1) { //�������� ������ ���ڰ� 1�̸� �ո�
					head++;
				}
				else { // else�� ��� -> �޸�
					tail++;
				}
			}
	      
	      sharedArea.ratio = head / (head+tail) *100; //Ȯ�� ���(%)
	      sharedArea.isReady=true;
	      
	      synchronized(sharedArea) {
	         sharedArea.notify(); //notify �޼��� ���
	      }
	   }
	}

class PrintThread extends Thread {

	SharedArea sharedArea;

   public void run() {
      while (sharedArea.isReady != true) {
         try {
            synchronized (sharedArea) {
            	sharedArea.wait(); //wait �޼��� ���
            }
         } catch (InterruptedException e) { //InterruptedException ����ó��
            System.out.println(e.getMessage());
         }
      }
      System.out.println("Front Ratio: "+sharedArea.ratio+"%");
      // Ȯ�� ���
   }
}


class SharedArea { 
   double ratio;
   boolean isReady;
} //������ ���ǿ��� �־��� ���Ĵ�� sharedArea�� ������

public class week13_1_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd=new Scanner(System.in);
		System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
	    
	    int n; // ���� Ƚ�� n 
	    System.out.println("Input the number of coin toss:");
	    n = kbd.nextInt(); //����ڿ��� ���� Ƚ�� �Է� �ޱ�
	    
	    SimulThread thread1 = new SimulThread(n); //�������̿�- n�� ����
	    PrintThread thread2 = new PrintThread();
	    SharedArea SH = new SharedArea();
	      
	    thread1.sharedArea = SH;
	    
	    thread2.sharedArea = SH;

	    thread1.start(); //SimulThread
	    thread2.start(); //PrintThread


	}

}
