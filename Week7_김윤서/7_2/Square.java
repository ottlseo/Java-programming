
public class Square implements Geometry {
	Square(){}
	Square(double side){
		this.side=side;
	}
	public double side; //�Ѻ��� ����
	
	public double area() {
		return side*side; //�׺��� ���̰� ��� �����Ƿ� �Ѻ��� ������ ����
	}
	public double perimeter() {
		return side*4;
	} 
}
