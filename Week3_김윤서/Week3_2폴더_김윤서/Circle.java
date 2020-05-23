
public class Circle {

	final double PI=3.14159; //final을 붙여 PI 상수 선언
	private double radius; //private 변수 radius
	
	public void setRadius(double r) {
		if (r>0) {
			radius=r; //r이 0보다 큰 경우에 radius에 할당하는 setter 메서드
		}
	}
	public double getRadius() {
		return radius; // private 변수 radius를 출력해주는 getter 메서드
	}
	public double perimeter() {
		double result; //결과값을 저장할 result 지역변수
		result=PI*2*radius;
		return result; //result 값을 perimeter()메서드의 값으로 리턴
	}
	public double area() {
		double result; //결과값을 저장할 result 지역변수
		result=PI*radius*radius; 
		return result; //result 값을 area()메서드의 값으로 리턴
	}
	public void circleInfo() {
		System.out.println("원의 둘레:"+perimeter());
		System.out.println("원의 넓이:"+area());
		//circleInfo()메서드로 원의 둘레와 넓이 출력
	}
	
}
