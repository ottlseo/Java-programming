
public class Cat extends Pet  {
	Cat(){}
	Cat(String name, int age){
		super(name,age);//Pet(String name, int age) 생성자 상속
		this.species="cat";//종은 항상 "cat"로 고정
		}
		
	public void move() {
		System.out.println("jump");
	}
}
