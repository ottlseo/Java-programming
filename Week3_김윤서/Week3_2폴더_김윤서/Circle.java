
public class Circle {

	final double PI=3.14159; //final�� �ٿ� PI ��� ����
	private double radius; //private ���� radius
	
	public void setRadius(double r) {
		if (r>0) {
			radius=r; //r�� 0���� ū ��쿡 radius�� �Ҵ��ϴ� setter �޼���
		}
	}
	public double getRadius() {
		return radius; // private ���� radius�� ������ִ� getter �޼���
	}
	public double perimeter() {
		double result; //������� ������ result ��������
		result=PI*2*radius;
		return result; //result ���� perimeter()�޼����� ������ ����
	}
	public double area() {
		double result; //������� ������ result ��������
		result=PI*radius*radius; 
		return result; //result ���� area()�޼����� ������ ����
	}
	public void circleInfo() {
		System.out.println("���� �ѷ�:"+perimeter());
		System.out.println("���� ����:"+area());
		//circleInfo()�޼���� ���� �ѷ��� ���� ���
	}
	
}
