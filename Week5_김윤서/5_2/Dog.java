
public class Dog extends Pet{

	private boolean boosterShot;
	public boolean olderthantwo; //2살보다 많은 경우 boolean 값을 저장 -if문에 이용
	
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Booster Shot: "+boosterShot);
	}//writeOutput() 메서드 오버라이딩
	public void setBoosterShot(boolean boosterShot){
		this.boosterShot=boosterShot;
	}
	public boolean getBoosterShot(){
		return boosterShot;
	}
	public void move() {
		System.out.println(getName()+" walks and runs~");
	} //move() 메서드 오버라이딩
	
	
}
