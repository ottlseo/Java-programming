import java.util.Scanner;

public class Week6_2_김윤서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
	    Scanner kbd = new Scanner(System.in);
		
		Emergency em1 = new Emergency(); //Emergency 객체 생성
		
		System.out.println("What kind of Emergency?");
		int input=1; //1~5 선택 받는 변수, 초기값 임의로 지정
		
		
		int i=0; //emgList 배열의 인덱스
		while(input!=5) { //5.End가 아닌 이상 반복
			System.out.println("What kind of Emergency?");
			System.out.println("1.Fire  2.Patient  "
					+ "3.Thief  4.Record  5.End");//리스트 출력
			input=kbd.nextInt();
			
			if (input==1) {
				FireEngine fe = new FireEngine(); //FireEngine객체 생성
				em1.EM_Call(fe);
			}
			else if (input==2) {
				Ambulance am = new Ambulance();
				em1.EM_Call(am);
			}
			else if (input==3) {
				PoliceCar pc = new PoliceCar();
				em1.EM_Call(pc);
			}
			else if (input==4) {
				em1.EM_record();
			}
			else if (input==5){
				System.out.println("Finished"); 
				System.exit(0); // 5.End - "Finished"출력한 뒤, 시스템 종료
			}
			else {
				System.out.println("Wrong Input"); //1~5 사이 수가 아니면 "Wrong Input" 출력
			}
		}
		
		
	}

}
