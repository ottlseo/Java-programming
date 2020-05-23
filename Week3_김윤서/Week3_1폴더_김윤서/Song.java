
public class Song {


	public String singer; //가수 이름
	public int price; //가격
	public String title; //노래 제목
	//지역변수로, 자동초기화 x

	void play() {
		System.out.println("노래 들어요! : \""+this.title+"\" by "+this.singer);
		//\" 을 이용해서 따옴표 출력
		//this.title, this.singer로 객체를 찾아가 값을 얻어옴
	}
	void price() {
		System.out.println(this.price+"원입니다.");
		// this.price로 객체를 찾아가 값을 얻어옴
	}
	

	

}
