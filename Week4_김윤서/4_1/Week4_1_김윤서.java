import java.util.Scanner;
public class Week4_1_김윤서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title,singer;
		int price;
		int totalPrice; //총 가격 =가격*횟수
		int num; //몇번 들으시겠습니까? 의 횟수
		Scanner kbd = new Scanner(System.in);
		
		
		System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
		
		
		Song s1; //s1, 인스턴스는 아직 만들지 않음
		
		System.out.println("* Song 정보 *"); //song1에 대한 정보 입력
		
		System.out.println("곡명:");
		title=kbd.nextLine(); //title 변수에 곡명 저장
		
		while (title.equals("")) { //곡명이 입력이 안 된 경우 while문
			System.out.println("곡명은 반드시 필요합니다!");
			System.out.println("곡명:");
			title=kbd.nextLine();
		}
		
		System.out.println("가수명:");
		singer=kbd.nextLine(); //singer 변수에 가수명 저장
		
		if (singer.equals(""))//singer 가 입력없이 줄바꿈 이면 (없으면)
		{
			System.out.println("가격:");
			price=Integer.parseInt(kbd.nextLine()); //price 변수에 가격 저장
			//nextLine()으로 받아서 int로 변환
			s1=new Song(title,price);
			//Song(String title, int price)생성자로 인스턴스 생성
			
		}
		else { //singer 있으면
			System.out.println("가격:");
			price=Integer.parseInt(kbd.nextLine()); //price 변수에 가격 저장
			//nextLine()으로 받아서 int로 변환
			s1=new Song(title,singer,price);
			//Song(String title,String singer,int price)생성자로 인스턴스 생성
		}
		
		System.out.println("몇번 들으시겠습니까?");
		num=Integer.parseInt(kbd.nextLine()); //nextLine()으로 받아서 int로 변환
		
		for(int i=0;i<num;i++)
			s1.play();
		
		totalPrice=price*num; //가격*횟수
		System.out.println("총 "+totalPrice+"원입니다.");
		
	}
}
