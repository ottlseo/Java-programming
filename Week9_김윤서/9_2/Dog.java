import java.io.*;

public class Dog extends Pet implements Serializable{

	private String breed;
	private boolean boosterShot;
	
	Dog(){
		super();
	}
	Dog(String name, int age, double weight, String breed, boolean boosterShot){
		super(name, age, weight); //Pet�� ������ �ҷ��ͼ� ����
		this.breed = breed;
		this.boosterShot =boosterShot;
	}
	public void setBreed(String breed) { //breed ������ setter �޼���
		this.breed = breed;
	}
	public void setBoosterShot(boolean boosterShot) { //boosterShot ������ setter �޼���
		this.boosterShot = boosterShot;
	}
	public String getBreed() { //breed ������ getter �޼���
		return breed;
	}
	public boolean getBoosterShot() { //boosterShot ������ getter �޼���
		return boosterShot;
	}
	public String toString() {
		return(super.getName()+"	"+super.getAge()+
				"	"+super.getWeight()+"	"+breed+"	"+boosterShot);
	} //name, age, weight, breed, boosterShot ���� ���� 
}
