import java.util.Scanner;

public class Week7_2_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
	    
	    System.out.println("Input radius for a circle");
	    double radius=Double.parseDouble(kbd.nextLine()); //������ radius�� �Է¹ޱ� (���ڿ��� �Է¹ް� double�� ��ȯ)
	    Circle c1 = new Circle(radius); //������ �̿��Ͽ� �ν��Ͻ� ����
	    
	    System.out.println("Input length for a square");
	    double side=Double.parseDouble(kbd.nextLine()); //�Ѻ��� ����side�� �Է¹ޱ� (���ڿ��� �Է¹ް� double�� ��ȯ)
	    Square s1 = new Square(side); //������ �̿��Ͽ� �ν��Ͻ� ����

	    System.out.println("Input a for a triangle");
	    double a=Double.parseDouble(kbd.nextLine()); //�Ѻ��� ���� �Է¹ޱ� (���ڿ��� �Է¹ް� double�� ��ȯ)
	    System.out.println("Input b for a triangle");
	    double b=Double.parseDouble(kbd.nextLine()); //�Ѻ��� ���� �Է¹ޱ� (���ڿ��� �Է¹ް� double�� ��ȯ)
	    System.out.println("Input c for a triangle");
	    double c=Double.parseDouble(kbd.nextLine()); //�Ѻ��� ���� �Է¹ޱ� (���ڿ��� �Է¹ް� double�� ��ȯ)
	    Triangle t1 = new Triangle(a,b,c);
	    //������ �̿��Ͽ� Triangle �ν��Ͻ� ����
	    
	    System.out.println("<Circle>");
	    System.out.println("Area: "+c1.area()); //c1�� area() ȣ��
	    System.out.println("Circumference: "+c1.perimeter()); //c1�� perimeter() ȣ��
	    
	    System.out.println("<Square>"); //c1�� ���� ������� ����, �ѷ� ���
	    System.out.println("Area: "+s1.area());
	    System.out.println("Circumference: "+s1.perimeter());
	    
	    System.out.println("<Triangle>"); //c1�� ���� ������� ����, �ѷ� ���
	    System.out.println("Area: "+t1.area());
	    System.out.println("Circumference: "+t1.perimeter());
	    
	    
	}

}
