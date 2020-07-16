import java.util.Scanner;

public class Week7_2_김윤서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
	    
	    System.out.println("Input radius for a circle");
	    double radius=Double.parseDouble(kbd.nextLine()); //반지름 radius에 입력받기 (문자열로 입력받고 double로 변환)
	    Circle c1 = new Circle(radius); //생성자 이용하여 인스턴스 생성
	    
	    System.out.println("Input length for a square");
	    double side=Double.parseDouble(kbd.nextLine()); //한변의 길이side에 입력받기 (문자열로 입력받고 double로 변환)
	    Square s1 = new Square(side); //생성자 이용하여 인스턴스 생성

	    System.out.println("Input a for a triangle");
	    double a=Double.parseDouble(kbd.nextLine()); //한변의 길이 입력받기 (문자열로 입력받고 double로 변환)
	    System.out.println("Input b for a triangle");
	    double b=Double.parseDouble(kbd.nextLine()); //한변의 길이 입력받기 (문자열로 입력받고 double로 변환)
	    System.out.println("Input c for a triangle");
	    double c=Double.parseDouble(kbd.nextLine()); //한변의 길이 입력받기 (문자열로 입력받고 double로 변환)
	    Triangle t1 = new Triangle(a,b,c);
	    //생성자 이용하여 Triangle 인스턴스 생성
	    
	    System.out.println("<Circle>");
	    System.out.println("Area: "+c1.area()); //c1의 area() 호출
	    System.out.println("Circumference: "+c1.perimeter()); //c1의 perimeter() 호출
	    
	    System.out.println("<Square>"); //c1과 같은 방식으로 넓이, 둘레 출력
	    System.out.println("Area: "+s1.area());
	    System.out.println("Circumference: "+s1.perimeter());
	    
	    System.out.println("<Triangle>"); //c1과 같은 방식으로 넓이, 둘레 출력
	    System.out.println("Area: "+t1.area());
	    System.out.println("Circumference: "+t1.perimeter());
	    
	    
	}

}
