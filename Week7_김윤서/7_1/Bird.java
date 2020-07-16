
public class Bird  extends Pet {
	Bird(){}
	Bird(String name, int age){
		super(name,age);//Pet(String name, int age) 생성자 상속
		this.species="bird";//종은 항상 "bird"로 고정
		}
	public void move() {
		System.out.println("fly");
	}
}
