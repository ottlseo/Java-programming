
public class StudentInformation {
	
	StudentInformation(){}
	StudentInformation(String id, String name){
		this.id=id;
		this.name=name;
	}
	
	private String id, name;
	
	public String getName() {
		return this.name; //mainŬ�������� �̸��� ����ؾ� �ϹǷ� name getter �޼��� ���� 
	}
	public void display() {
		System.out.print(name+"	"+id+"	");
	}
	
}
