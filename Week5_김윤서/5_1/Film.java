
public class Film extends Production {
	Film(){} //default ������
	Film(String title, String director, String writer,int boxOfficeGross){
		super(title, director, writer);
		//�ڼ�Ŭ������ �ν��Ͻ��� �����ϸ� �ڼ��� ����� ������ ����� ������ �ϳ��� �ν��Ͻ��� ������
		//super() ȣ���Ͽ� ������ ������� �ʱ�ȭ��
		//Production(String title, String director, String writer) ��� ������ �θ��°�
		this.boxOfficeGross=boxOfficeGross;//boxOfficeGross
	}
	
	private int boxOfficeGross;
	
	public int getBoxOfficeGross() {
		return boxOfficeGross;
	}
	public void setBoxOfficeGross(int boxOfficeGross) {
		this.boxOfficeGross=boxOfficeGross;
	}
	
	public void display() {
		super.display();//ProductionŬ������ display()�޼��� ������
		System.out.println("BoxOffice Gross: "+boxOfficeGross);//�߰�
	}
}
