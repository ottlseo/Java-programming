
public class Triangle implements Geometry {
	Triangle(){}
	Triangle(double a, double b, double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public double a,b,c;
	
	public double area() {
		double s=(a+b+c);
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		//Math�� �޼��� sqrt()�̿��Ͽ� �ﰢ���� �� ������ ���� ���ϱ�
		return area; //area ����
	}
	public double perimeter() {
		return a+b+c; //�ѷ��� ���� ���� ���� ��
	} 
}
