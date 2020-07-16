
public class StudentInformation {
	
	StudentInformation(){}
	StudentInformation(String id, String name){
		this.id=id;
		this.name=name;
	}
	
	private String id, name;
	
	public String getName() {
		return this.name; //main클래스에서 이름을 출력해야 하므로 name getter 메서드 정의 
	}
	public void display() {
		System.out.print(name+"	"+id+"	");
	}
	
}
