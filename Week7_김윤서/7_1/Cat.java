
public class Cat extends Pet  {
	Cat(){}
	Cat(String name, int age){
		super(name,age);//Pet(String name, int age) ������ ���
		this.species="cat";//���� �׻� "cat"�� ����
		}
		
	public void move() {
		System.out.println("jump");
	}
}
