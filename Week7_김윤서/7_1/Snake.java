
public class Snake  extends Pet {
	Snake(){}
	Snake(String name, int age){
		super(name,age);//Pet(String name, int age) 생성자 상속
		this.species="snake";//종은 항상 "snake"로 고정
		}
	
	public void move() {
		System.out.println("crawl");
	}
}
