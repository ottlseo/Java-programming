
public class Circle implements Geometry {
	Circle(){}
	Circle(double radius){
		this.radius=radius;
	}
	public double radius;
	
	public double area() {
		return radius*radius*PI; //��� PI ����ؼ� ���� ���ϱ�
	}
	public double perimeter() {
		return radius*2*PI;
	} 
}
