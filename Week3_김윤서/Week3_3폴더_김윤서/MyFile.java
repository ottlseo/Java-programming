
public class MyFile {

	private String title;
	private int page;
	
	public void setTitle(String title) {
		this.title=title; //title을 this.title에 저장하는 setter메서드
		}
	public String getTitle() {
		return title;
	}
	public void setPage(int page) {
		this.page=page; //page를 this.page에 저장하는 setter메서드
	}
	public int getPage() {
		return page;
	}
	
	public void fileCopy(MyFile fnew) {
		fnew.title=this.title; //fileCopy(fnew): 매개변수로 받은 fnew파일의 title에 원래 파일(this.)의 title 복사.
		fnew.page=this.page; //fileCopy(fnew): 매개변수로 받은 fnew파일의 page에 원래 파일(this.)의 page 복사.
	}
	
	public void fileInfo() {
		System.out.println("파일 제목:"+this.title);
		System.out.println("페이지:"+this.page);
	} //해당 file 객체의 파일제목(this.title)과 페이지(this.page) 출력 
		
	}
