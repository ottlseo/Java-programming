
public class Student {
	Student(){}
	Student(String name, String ID, int age){
		this.name = name;
		this.ID = ID;
		this.age = age;
	}
	public String name; //이름
	public String ID; // ID
	public int age; // 나이
	
	public String toString() {
		return name+"	"+ID+"	"+age;
	} //메인클래스에서 get() 했을 때 이렇게 나오도록
}
