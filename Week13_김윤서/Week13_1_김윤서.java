package week13_1_김윤서;
import java.util.*;

class SimulThread extends Thread {
	   
		SharedArea sharedArea;
	   
		double head=0; //앞면
		double tail=0; //뒷면
		int n; //던지는 횟수 
	   
		SimulThread(int n) { //생성자
	      this.n = n; //- 던질 횟수 N을 main에서 받아서 SimulThread 생성자로 전달
	   }
	   
		public void run() {
			for(int i=0;i<n;i++) {
				if((int)Math.round(Math.random()) == 1) { //랜덤으로 선택한 숫자가 1이면 앞면
					head++;
				}
				else { // else인 경우 -> 뒷면
					tail++;
				}
			}
	      
	      sharedArea.ratio = head / (head+tail) *100; //확률 계산(%)
	      sharedArea.isReady=true;
	      
	      synchronized(sharedArea) {
	         sharedArea.notify(); //notify 메서드 사용
	      }
	   }
	}

class PrintThread extends Thread {

	SharedArea sharedArea;

   public void run() {
      while (sharedArea.isReady != true) {
         try {
            synchronized (sharedArea) {
            	sharedArea.wait(); //wait 메서드 사용
            }
         } catch (InterruptedException e) { //InterruptedException 예외처리
            System.out.println(e.getMessage());
         }
      }
      System.out.println("Front Ratio: "+sharedArea.ratio+"%");
      // 확률 출력
   }
}


class SharedArea { 
   double ratio;
   boolean isReady;
} //과제의 조건에서 주어진 형식대로 sharedArea를 정의함

public class week13_1_김윤서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd=new Scanner(System.in);
		System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
	    
	    int n; // 던질 횟수 n 
	    System.out.println("Input the number of coin toss:");
	    n = kbd.nextInt(); //사용자에게 던질 횟수 입력 받기
	    
	    SimulThread thread1 = new SimulThread(n); //생성자이용- n값 전달
	    PrintThread thread2 = new PrintThread();
	    SharedArea SH = new SharedArea();
	      
	    thread1.sharedArea = SH;
	    
	    thread2.sharedArea = SH;

	    thread1.start(); //SimulThread
	    thread2.start(); //PrintThread


	}

}
