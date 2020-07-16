
public class Dog extends Pet {
	Dog(){}
	Dog(String name, int age){
		super(name,age); //Pet(String name, int age) 생성자 상속
		this.species="dog"; //종은 항상 "dog"로 고정
	}
	public void move() {
		System.out.println("run");
	}

}
