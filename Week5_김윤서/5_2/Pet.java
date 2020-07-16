
public class Pet {
	Pet(){}
	Pet(String name,int age,double weight){
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	
	private String name;
	private int age;
	private double weight;
	
	public void writeOutput() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Weight: "+weight);
		}
	public void setPet(String name, int age, double weight) {
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	public void setName(String name) {
		this.name=name; //name 변수에 이름 저장
	}
	public void setAge(int age) {
		this.age=age;//age 변수에 나이 저장
	}
	public void setWeight(double weight) {
		this.weight=weight;//weight 변수에 무게 저장
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getWeight() {
		return weight;
	}
	public void move() {
		System.out.println(name+" moves~");
	}
}
