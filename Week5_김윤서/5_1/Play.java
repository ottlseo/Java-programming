
public class Play extends Production {
	Play(){} //default ������
	Play(String title, String director, String writer,int performanceCost){
		super(title, director, writer);
		//�ڼ�Ŭ������ �ν��Ͻ��� �����ϸ� �ڼ��� ����� ������ ����� ������ �ϳ��� �ν��Ͻ��� ������
		//super() ȣ���Ͽ� ������ ������� �ʱ�ȭ��
		//Production(String title, String director, String writer) ��� ������ �θ��°�
		this.performanceCost=performanceCost; //performanceCost
	}
	
	private int performanceCost;
	
	public int getPerformanceCost() {
		return performanceCost;
	}
	public void setPerformanceCost(int performanceCost) {
		this.performanceCost=performanceCost;
	}
	
	public void display() {
		super.display(); //ProductionŬ������ display()�޼��� ������
		System.out.println("performance cost: "+performanceCost); //�߰�
	}
}
