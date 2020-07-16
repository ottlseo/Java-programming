
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
		//Math의 메서드 sqrt()이용하여 삼각형의 세 변으로 넓이 구하기
		return area; //area 리턴
	}
	public double perimeter() {
		return a+b+c; //둘레는 세변 길이 더한 것
	} 
}
