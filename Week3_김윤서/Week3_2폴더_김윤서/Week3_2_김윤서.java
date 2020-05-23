import java.util.Scanner;
public class Week3_2_김윤서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double r; //원의 반지름을 임시로 입력받을 값 (임시)

		Scanner kbd = new Scanner(System.in);
		Circle c1 = new Circle(); //Circle 객체 c1 생성
		
	    System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
	      
		
		
		System.out.println("반지름:");
		r=kbd.nextDouble(); //double 값으로 r 입력받기
		
		c1.setRadius(r); //입력값 r을 c1.radius에 할당 
		System.out.println("반지름:"+c1.getRadius()); //getRadius()로 c1의 반지름 출력
		
		c1.circleInfo(); //circleInfo()메서드 호출해서 원의 둘레와 넓이 출력
		
		
	}


}
