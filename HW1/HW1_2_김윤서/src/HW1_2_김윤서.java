import java.util.Scanner;

public class HW1_2_김윤서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("==========");
	    System.out.println("Major: 사이버보안");
	    System.out.println("ID: 1971063");
	    System.out.println("Name: 김윤서");
	    System.out.println("==========");
	    
	    String answer=""; //while문 실행하기 위해 초기값 공백으로 지정
	    DiceGame d1 = new DiceGame(); //d1객체 생성
	    
	    while(!answer.equalsIgnoreCase("n")) { //answer가 "n"또는 "N"이 아닐 경우 (! 부정문)
	    	d1.startPlaying();
	    	System.out.println("Try again? (y/n)");
	    	answer=kbd.nextLine();
	    }
	    System.out.println("Game finished."); //"n"또는 "N" 입력해서 while문 빠져나왔을 경우 마지막에 출력
	}

}
