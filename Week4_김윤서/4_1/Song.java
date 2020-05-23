
public class Song {
	
	public String title; //노래 제목
	public String singer; //가수 이름
	public int price; //가격
	//멤버변수 3개

	Song(){}; //default 생성자
	
	Song(String title, int price){
		this(title,"모름",price); 
		//가수 정보가 없는 경우 "모름" 저장
		//생성자 Song(String title, String singer, int price)를 this()로 호출
	}
	
	Song(String title, String singer, int price){
		this.title=title;
		this.singer=singer;
		
	} //위에서 이 생성자를 this()로 호출
	
	void play() {
		System.out.println(this.title+" by "+this.singer);
		//this.title,this.singer,this.price로 객체를 찾아가 값을 얻어옴
		}
	//메서드 정의
	
}
