import java.util.Scanner;

public class Week4_2_김윤서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2; //입력받을 정수 2개
		int fac1,fac2;
		
		Scanner kbd = new Scanner(System.in);
				
		System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
	    
	    System.out.println("첫번쨰 원소 입력:");
		num1=Integer.parseInt(kbd.nextLine()); //num1 저장
		//nextLine()으로 받아서 int로 변환
		
		System.out.println("두번쨰 원소 입력:");
		num2=Integer.parseInt(kbd.nextLine()); //num2 저장
		//nextLine()으로 받아서 int로 변환
		
		fac1=Facto.factoVal(num1);
		fac2=Facto.factoVal(num2);
		Facto.result=fac1-fac2;
		System.out.printf("Factorial(%d)-Factorial(%d)=%d",num1,num2,Facto.result);
		
	}

}
