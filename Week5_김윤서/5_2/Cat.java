
public class Cat extends Pet{

	private String color;
	
	public void writeOutput() {
		super.writeOutput(); //Pet클래스의 메서드 상속
		System.out.println("Color: "+color);
	}//writeOutput() 메서드 오버라이딩
	
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	public void move() {
		System.out.println(getName()+" creeps and jumps~");
	}//move() 메서드 오버라이딩
}
