
public class StudentScore extends StudentInformation {

	StudentScore(){}
	StudentScore(String id, String name, int korean, int math, int english){
		super(id,name); //StudentInformationŬ������ ������ super()�� ��ӹޱ�
		this.korean=korean;
		this.math=math;
		this.english=english; // �� ���� ������ ���ڷ� ���� �� ����
	}
	private int korean, math, english;
	
	public int getKorean() {
		return this.korean; //korean�� getter�޼���
	}
	public int getMath() {
		return this.math;//math�� getter�޼���
	}
	public int getEnglish() {
		return this.english;//english�� getter�޼���
	}
	
	public void display() {
		super.display(); //StudentInformationŬ������ display()�޼��� �������̵�
		System.out.print(korean+"	"+math+"	"+english+"	");
		System.out.print(sum()+"	"+std_avg(sum())); //std_avg �޼��忡 sum()�� ���ڷ� �Ͽ� ��� ���
		System.out.println("");
	}
	public int sum() {
		return korean+math+english; //korean, math, english ���� ���� ����
	}
	public double std_avg(int sum) { //�л� ������ ��� ���
		return sum/3; //�� ���� ���� 3���� ����, ��� ����
	}
	
		
}
