import java.util.Scanner;

public abstract class Pet {
	Scanner kbd = new Scanner(System.in);
	
	Pet(){}
	Pet(String name, int age){
		this.name=name;
		this.age=age;
	}
	public String species; //종
	public String name; //이름
	public int age; //나이
	
	public abstract void move(); //각 Pet마다 다르게 오버로딩 할 것이므로 추상 메서드로 정의한다.
	

		
	}