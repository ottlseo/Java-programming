
public class Circle implements Geometry {
	Circle(){}
	Circle(double radius){
		this.radius=radius;
	}
	public double radius;
	
	public double area() {
		return radius*radius*PI; //상수 PI 사용해서 넓이 구하기
	}
	public double perimeter() {
		return radius*2*PI;
	} 
}
