
public class Snake  extends Pet {
	Snake(){}
	Snake(String name, int age){
		super(name,age);//Pet(String name, int age) ������ ���
		this.species="snake";//���� �׻� "snake"�� ����
		}
	
	public void move() {
		System.out.println("crawl");
	}
}
