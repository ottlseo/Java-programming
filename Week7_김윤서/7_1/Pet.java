import java.util.Scanner;

public abstract class Pet {
	Scanner kbd = new Scanner(System.in);
	
	Pet(){}
	Pet(String name, int age){
		this.name=name;
		this.age=age;
	}
	public String species; //��
	public String name; //�̸�
	public int age; //����
	
	public abstract void move(); //�� Pet���� �ٸ��� �����ε� �� ���̹Ƿ� �߻� �޼���� �����Ѵ�.
	

		
	}