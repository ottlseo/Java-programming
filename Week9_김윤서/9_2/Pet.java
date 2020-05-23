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
	public void setName(String newName) { //name ������ setter �޼���
		this.name = newName;
	}
	public void setAge(int newAge) {//age ������ setter �޼���
		this.age = newAge;
	}
	public void setWeight(double newWeight) {//weight ������ setter �޼���
		this.weight = newWeight;
	}
	public String getName() { //name ������ getter �޼���
		return this.name;
	}
	public int getAge() { //age ������ getter �޼���
		return this.age;
	}
	public double getWeight() { //weight ������ getter �޼���
		return this.weight;
	}
}
