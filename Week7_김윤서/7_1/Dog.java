
public class Dog extends Pet {
	Dog(){}
	Dog(String name, int age){
		super(name,age); //Pet(String name, int age) ������ ���
		this.species="dog"; //���� �׻� "dog"�� ����
	}
	public void move() {
		System.out.println("run");
	}

}
