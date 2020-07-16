import java.util.Scanner;
import javax.swing.*;

class SharedArea { //SharedArea 정의
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
	      // 타자연습 단어 목록 (3글자 이상의 단어 * 15개 로 구성)
	      
	      for (int j = 0; j < 20; j++) { //20초까지 기회를 주고
	         if (game == true)
	            break;
	         
	         int i = (int) (Math.random() * 16); //단어 랜덤으로 선택
	         System.out.println(mylist[i]);
	         
	         sharedarea.mylist = mylist[i];
	        
	         try {
	            sleep(1000); //1초에 하나씩 단어 초기화
	         }
	         catch (InterruptedException e) { // InterruptedException 예외처리
	            System.out.println(e.getMessage());
	         }
	      }
	      
	      if (game == true) { // 입력한 단어가 등장한 단어와 동일하면
	         System.out.println("성공"); //성공!
	         System.out.println("Timer is stopped.");
	         System.exit(0); //프로그램 종료
	      }
	      
	      else { //동일하지 않으면
	         System.out.println("실패");
	         System.exit(0);
	      }
	   }

	   public void setStop(boolean game) { //쓰레드 중지시키는 메서드
	      this.game = game;
	   }
	}


public class Week13_2_김윤서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
	    
	    MyThread thread = new MyThread();// thread 생성
	    SharedArea SH = new SharedArea();// SH 생성
	      
	    thread.sharedarea = SH;
	    thread.start(); //쓰레드 시작

	      while (true) {
	         String inputword = JOptionPane.showInputDialog("문자열 입력");
	         
	         if (inputword == null)
	         {
	            thread.setStop(true);
	            break;
	         } //입력창을 닫으면 종료
	         
	         System.out.println("<" + inputword + ">을 입력하셨습니다");
	         // 사용자가 입력한 단어 출력해줌
	         if (thread.game == true) {
		            thread.setStop(false);
		         }
	         
	         if (inputword.equalsIgnoreCase(SH.mylist)) {
	        	 // 입력한 단어와 등장한 단어가 일치하면
	            thread.setStop(true); //쓰레드 중지
	            break;
	         }
	         
	      }
	 
	    
	}

}
