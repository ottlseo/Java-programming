
public class Bird  extends Pet {
	Bird(){}
	Bird(String name, int age){
		super(name,age);//Pet(String name, int age) ������ ���
		this.species="bird";//���� �׻� "bird"�� ����
		}
	public void move() {
		System.out.println("fly");
	}
}
