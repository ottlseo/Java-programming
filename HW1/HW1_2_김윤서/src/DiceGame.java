import java.util.Scanner;

public class DiceGame {
	Scanner kbd = new Scanner(System.in);
	
	private int diceFace;
	private int userGuess;
	//userGuess=1;//ó������ �ݺ����� ���� �ʱ� ���� 1~6 ���� �ƹ� ���� �ʱⰪ���� ����
	private int rollDice() {
		return (int)(Math.random()*6)+1; //random() �̿��Ͽ� 1~6������ ���� �����
	}
	private int getUserInput() {
		
		System.out.println("Guess the number! What do you think?");
	    userGuess=Integer.parseInt(kbd.nextLine()); //nextLine()���� ���� �� int�� ��ȯ���ش�
		
	    while (userGuess<1 || userGuess>6) {
			System.out.println("Input number between 1~6.");
			userGuess=Integer.parseInt(kbd.nextLine()); //nextLine()���� ���� �� int�� ��ȯ���ش�
			// userGuess�� ������ �Ѿ ��쿡 ��� �ݺ� 
		}
		return userGuess;
	}
	private void checkUserGuess(int userGuess) {
		
		if(this.diceFace==userGuess) //diceFace�� �Է°��� ���� ���
			System.out.println("Bingo!");
		else
			System.out.println("Wrong!");
			System.out.println("The face was "+this.diceFace); //���� ���
	}
	
	public void startPlaying() {
		
		System.out.println("<< GAME START >>");
		System.out.println("Dice is rolled!!!");
		
		diceFace=rollDice();
		checkUserGuess(getUserInput());
		//getUserInput()�޼��带 ���ڷ� ȣ���Ͽ� ���ϰ��� userGuess �� checkUserGuess()�޼��忡 ���ڷ� ����
	}
	
}
