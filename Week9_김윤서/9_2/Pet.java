import java.io.*;

public class Pet implements Serializable {
	private String name;
	private int age;
	private double weight;
	

	public Pet() {}
	public Pet(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public void setPet(String newName, int newAge, double newWeight) {
		this.name = newName;
		this.age = newAge;
		this.weight = newWeight;
	}
	public void setName(String newName) { //name 변수의 setter 메서드
		this.name = newName;
	}
	public void setAge(int newAge) {//age 변수의 setter 메서드
		this.age = newAge;
	}
	public void setWeight(double newWeight) {//weight 변수의 setter 메서드
		this.weight = newWeight;
	}
	public String getName() { //name 변수의 getter 메서드
		return this.name;
	}
	public int getAge() { //age 변수의 getter 메서드
		return this.age;
	}
	public double getWeight() { //weight 변수의 getter 메서드
		return this.weight;
	}
}
