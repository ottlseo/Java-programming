
public class Production {

	Production() {} //default생성자
	
	Production(String title, String director, String writer) {
		this.title=title;
		this.director=director;
		this.writer=writer;
	} //Production(String title, String director, String writer) 생성자
	
	private String title;
	private String director;
	private String writer;
	
	public String getTitle() {
		return title;
	} //title 리턴하는 메서드
	public String getDirector() {
		return director;
	}//director 리턴하는 메서드
	public String getWriter() {
		return writer;
	}//writer 리턴하는 메서드
	
	public void setTitle(String title) {
		this.title=title;
	}//인자로 받은 title을 저장하는 메서드
	public void setDirector(String director) {
		this.director=director;
	}//인자로 받은 director를 저장하는 메서드
	public void setWriter(String writer) {
		this.writer=writer;
	}//인자로 받은 writer를 저장하는 메서드
	
	public void display() {
		System.out.println("Title: "+this.getTitle());
		System.out.println("Director: "+this.getDirector());
		System.out.println("Writer: "+this.getWriter());
		//Play클래스와 Film클래스에서도 출력할 수 있도록 getTitle()로 출력해주기
	}//title director writer 값 출력하는 메서드
	
	
}
