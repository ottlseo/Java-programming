
public class Student {
	Student(){}
	Student(String name, String ID, int age){
		this.name = name;
		this.ID = ID;
		this.age = age;
	}
	public String name; //�̸�
	public String ID; // ID
	public int age; // ����
	
	public String toString() {
		return name+"	"+ID+"	"+age;
	} //����Ŭ�������� get() ���� �� �̷��� ��������
}
