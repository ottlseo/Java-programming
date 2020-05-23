import java.io.*;

public class Dog extends Pet implements Serializable{

	private String breed;
	private boolean boosterShot;
	
	Dog(){
		super();
	}
	Dog(String name, int age, double weight, String breed, boolean boosterShot){
		super(name, age, weight); //Pet의 생성자 불러와서 지정
		this.breed = breed;
		this.boosterShot =boosterShot;
	}
	public void setBreed(String breed) { //breed 변수의 setter 메서드
		this.breed = breed;
	}
	public void setBoosterShot(boolean boosterShot) { //boosterShot 변수의 setter 메서드
		this.boosterShot = boosterShot;
	}
	public String getBreed() { //breed 변수의 getter 메서드
		return breed;
	}
	public boolean getBoosterShot() { //boosterShot 변수의 getter 메서드
		return boosterShot;
	}
	public String toString() {
		return(super.getName()+"	"+super.getAge()+
				"	"+super.getWeight()+"	"+breed+"	"+boosterShot);
	} //name, age, weight, breed, boosterShot 값을 리턴 
}
