import java.util.Scanner;

public class Week5_1_김윤서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int performanceCost, boxOfficeGross; //performanceCost를 입력받을 변수,boxOfficeGross를 입력받을 변수
		
		Scanner kbd = new Scanner(System.in);
		
		Play p1 = new Play(); //play클래스의 인스턴스 p1 생성
	    Film f1 = new Film(); //film클래스의 인스턴스 f1  생성
		
		System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
	    
	    System.out.println("Input Title for Play");
	    p1.setTitle((kbd.nextLine()));
	    System.out.println("Input Director for Play");
	    p1.setDirector((kbd.nextLine()));
	    System.out.println("Input Writer for Play");
	    p1.setWriter((kbd.nextLine()));
	    // Play 클래스의 title, director, writer 저장 완료
	   
	    
	    System.out.println("Input Title for Film");
	    f1.setTitle((kbd.nextLine()));
	    System.out.println("Input Director for Film");
	    f1.setDirector((kbd.nextLine()));
	    System.out.println("Input Writer for Film");
	    f1.setWriter((kbd.nextLine()));
	    // Film 클래스의  title, director, writer 저장 완료
	    
	    System.out.println("Input Performance Cost for Play");
	    performanceCost=Integer.parseInt(kbd.nextLine()); //nextLine()으로 받은 뒤 int로 변환해준다
	    p1.setPerformanceCost(performanceCost); //p1에 저장- setPerformanceCost() 메서드 이용
	    
	    System.out.println("Input boxOfficeGross for Film");
	    boxOfficeGross=Integer.parseInt(kbd.nextLine());//nextLine()으로 받은 뒤 int로 변환해준다
	    f1.setBoxOfficeGross(boxOfficeGross); //f1에 저장 - setBoxOfficeGross() 메서드 이용
	    
	    
	    p1.display();
	    System.out.println(""); //한칸 띄어주는 용도
	    f1.display();
	}

}
