
public class Dog extends Pet{

	private boolean boosterShot;
	public boolean olderthantwo; //2�캸�� ���� ��� boolean ���� ���� -if���� �̿�
	
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Booster Shot: "+boosterShot);
	}//writeOutput() �޼��� �������̵�
	public void setBoosterShot(boolean boosterShot){
		this.boosterShot=boosterShot;
	}
	public boolean getBoosterShot(){
		return boosterShot;
	}
	public void move() {
		System.out.println(getName()+" walks and runs~");
	} //move() �޼��� �������̵�
	
	
}
