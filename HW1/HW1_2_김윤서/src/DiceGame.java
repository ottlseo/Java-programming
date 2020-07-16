import java.util.Scanner;

public class DiceGame {
	Scanner kbd = new Scanner(System.in);
	
	private int diceFace;
	private int userGuess;
	//userGuess=1;//처음부터 반복문에 들어가지 않기 위해 1~6 사이 아무 수나 초기값으로 지정
	private int rollDice() {
		return (int)(Math.random()*6)+1; //random() 이용하여 1~6까지의 난수 만들기
	}
	private int getUserInput() {
		
		System.out.println("Guess the number! What do you think?");
	    userGuess=Integer.parseInt(kbd.nextLine()); //nextLine()으로 받은 뒤 int로 변환해준다
		
	    while (userGuess<1 || userGuess>6) {
			System.out.println("Input number between 1~6.");
			userGuess=Integer.parseInt(kbd.nextLine()); //nextLine()으로 받은 뒤 int로 변환해준다
			// userGuess가 범위를 넘어갈 경우에 계속 반복 
		}
		return userGuess;
	}
	private void checkUserGuess(int userGuess) {
		
		if(this.diceFace==userGuess) //diceFace와 입력값이 같을 경우
			System.out.println("Bingo!");
		else
			System.out.println("Wrong!");
			System.out.println("The face was "+this.diceFace); //정답 출력
	}
	
	public void startPlaying() {
		
		System.out.println("<< GAME START >>");
		System.out.println("Dice is rolled!!!");
		
		diceFace=rollDice();
		checkUserGuess(getUserInput());
		//getUserInput()메서드를 인자로 호출하여 리턴값인 userGuess 값 checkUserGuess()메서드에 인자로 전달
	}
	
}
