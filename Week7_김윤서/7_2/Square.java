
public class Square implements Geometry {
	Square(){}
	Square(double side){
		this.side=side;
	}
	public double side; //한변의 길이
	
	public double area() {
		return side*side; //네변의 길이가 모두 같으므로 한변의 제곱이 넓이
	}
	public double perimeter() {
		return side*4;
	} 
}
