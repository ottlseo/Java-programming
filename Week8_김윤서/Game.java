import java.util.Scanner;

public class Game {
	Scanner kbd = new Scanner(System.in);
	
	int you_win=0; //사용자가 이긴 횟수
	int com_win=0;  // 컴퓨터가 이긴 횟수
	
	int you_choose;//"당신의 선택은?" 답변 저장
	int com_choose;//컴퓨터의 선택
	
	String rsp(int choose) { //1,2,3을 넣으면 각각 가위,바위,보로 리턴해주는 메서드
		if(choose==1) //입력받은 숫자가 1인 경우 "가위" 리턴
			return "가위";
		if(choose==2) //입력받은 숫자가 2인 경우 "바위" 리턴
			return "바위";
		if(choose==3)//입력받은 숫자가 3인 경우 "보" 리턴
			return "보";
		else
			return "x";
	}
	
	void play() {
		System.out.println("가위바위보 게임을 시작합니다.");
		
		while(true) { 
		//사용자와 컴퓨터 중 한쪽이 먼저 세번을 이기기 전까지는 반복 //you_win<3 || com_win<3
			input();
		
			if(you_win == 3) { //사용자가 이긴 횟수가 3인 경우 - 사용자가 최종 승
				System.out.printf(" (You(%d) - Com(%d))", you_win, com_win);
				System.out.println("");
				System.out.println("당신이 이겼습니다.");
				break; //"당신이 이겼습니다" 출력 후 반복문 빠져나감
			}
			if(com_win == 3) {//컴퓨터가 이긴 횟수가 3인 경우 - 컴퓨터가 최종 승
				System.out.printf(" (You(%d) - Com(%d))", you_win, com_win);
				System.out.println("");
				System.out.println("컴퓨터가 이겼습니다.");
				break;//"컴퓨터가 이겼습니다" 출력 후 반복문 빠져나감
			}
		}
		System.out.println("게임을 종료합니다.");
		
	}
	void input() {
		try {
			System.out.println("");
			System.out.print("당신의 선택은?");
			System.out.printf(" (You(%d) - Com(%d))", you_win, com_win);
			System.out.println("");
			System.out.println("가위(1)	바위(2)	보(3)");
			you_choose= kbd.nextInt();
			
			if(you_choose>3 || you_choose<1) //1~3 밖의 수를 입력한 경우
				throw new Exception("범위가 잘못되었습니다."); //오브젝트 Exception을 "범위가 잘못되었습니다"라는 string을 가지고 생성
			
			com_choose= (int)(Math.random()*3 +1); //컴퓨터의 선택 -랜덤으로 생성
			
			System.out.println("<You>	<Com>");
			System.out.println(rsp(you_choose)+"	"+rsp(com_choose)); //rsp()메서드에 1,2,3 인자로 넣어주어  가위/바위/보로 바꾸어줌
			writeOutput(you_choose, com_choose); //writeOutput() 호출
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());//"범위가 잘못되었습니다" 리턴해서 출력
		}
		
		
	}
	void writeOutput(int you, int com){
		int result = you - com; // 사용자 선택값에서 컴퓨터 선택값 뺀 값으로 승패 여부 결정
		
		if(result == 2) {
			System.out.println("컴퓨터 승");
			this.com_win+=1; //컴퓨터 이긴 횟수 +1
		}
		if(result == 1) {
			System.out.println("당신 승");
			this.you_win+=1; //사용자 이긴 횟수 +1
		}
		if(result == 0) //같은 숫자 낸 경우
			System.out.println("비김"); //횟수 더해주지 않음
		
		if(result == -1) {
			System.out.println("컴퓨터 승");
			this.com_win+=1; //컴퓨터 이긴 횟수 +1
		}
		if(result == -2) {
			System.out.println("당신 승");
			this.you_win+=1; //사용자 이긴 횟수 +1
		}
	}
}
