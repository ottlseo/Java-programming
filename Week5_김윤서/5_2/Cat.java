
public class Cat extends Pet{

	private String color;
	
	public void writeOutput() {
		super.writeOutput(); //PetŬ������ �޼��� ���
		System.out.println("Color: "+color);
	}//writeOutput() �޼��� �������̵�
	
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	public void move() {
		System.out.println(getName()+" creeps and jumps~");
	}//move() �޼��� �������̵�
}
