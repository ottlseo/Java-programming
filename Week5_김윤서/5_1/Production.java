
public class Production {

	Production() {} //default������
	
	Production(String title, String director, String writer) {
		this.title=title;
		this.director=director;
		this.writer=writer;
	} //Production(String title, String director, String writer) ������
	
	private String title;
	private String director;
	private String writer;
	
	public String getTitle() {
		return title;
	} //title �����ϴ� �޼���
	public String getDirector() {
		return director;
	}//director �����ϴ� �޼���
	public String getWriter() {
		return writer;
	}//writer �����ϴ� �޼���
	
	public void setTitle(String title) {
		this.title=title;
	}//���ڷ� ���� title�� �����ϴ� �޼���
	public void setDirector(String director) {
		this.director=director;
	}//���ڷ� ���� director�� �����ϴ� �޼���
	public void setWriter(String writer) {
		this.writer=writer;
	}//���ڷ� ���� writer�� �����ϴ� �޼���
	
	public void display() {
		System.out.println("Title: "+this.getTitle());
		System.out.println("Director: "+this.getDirector());
		System.out.println("Writer: "+this.getWriter());
		//PlayŬ������ FilmŬ���������� ����� �� �ֵ��� getTitle()�� ������ֱ�
	}//title director writer �� ����ϴ� �޼���
	
	
}
