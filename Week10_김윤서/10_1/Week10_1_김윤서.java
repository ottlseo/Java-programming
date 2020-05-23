import java.util.*;

public class Week10_1_������ {
	static Scanner kbd = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
	    
		List <Student> stu = new ArrayList <Student> ();
		// ������ �̿��ؼ� List ����������  ArrayList �� ����
		// ���ڴ�  Student Ŭ������ ������
		
		System.out.println("Input Student Name, ID, and age. 0 for name to quit.");
		while(true) { // "0" �Է��� ������ ��� �ݺ�
			String name = kbd.next();
			if (name.equalsIgnoreCase("0")) { //0�� �ԷµǸ�
				break; //�ݺ����� ����������.
			}
			String ID = kbd.next();
			int age = Integer.parseInt(kbd.next());
			
			Student s = new Student(name, ID, age);
			stu.add(s); // add(Object o) ȣ��
		}
		// �ʱ� ���� �Է� �Ϸ�
		printResult(stu); //�Է��� ������ ����Ʈ �����ش�.
		
		while (true) { // ���� �ݺ�, �� answer==4 �� �ÿ� if�� �̿��ؼ� ����.
			System.out.println("");
			System.out.println("Choose the operation you want.");
			System.out.println("1.add information  2.delete information  3.show list  4.Finish program");
			int answer = Integer.parseInt(kbd.next()); //���ϴ� operation �Է¹��� ����
		
			if (answer == 1) { //1.add information
				addStudent(stu); // stu ����Ʈ�� add �ϴ� �޼��� 
			}
			if (answer == 2) { //2.delete information
				deleteStudent(stu); // stu ����Ʈ���� delete �ϴ� �޼���
			}
			if (answer == 3) { //3.show list
				printResult(stu); // stu ����Ʈ �����ִ� �޼���
			}
		
			if (answer == 4) { //4.Finish program
				System.out.println("Finish program.");
				System.exit(0); // 4 �Է� �� �ý��� ����.
			}
			if (answer <1 || answer >4) { //1~4 ������ ���� �ƴ� ��� 
				System.out.println("Wrong input."); //Ʋ�� ���̶�� �˷��ְ� �ٽ� �Է¹޴´�
			}
		}
		
		
		
	}
	
	public static void addStudent(List <Student> stu) {//1.add info ���� ��
		System.out.println("Input new Student Name, ID, and age, and the location.");
		
		String name = kbd.next();
		String ID = kbd.next();
		int age = Integer.parseInt(kbd.next());
		int index = Integer.parseInt(kbd.next()); //�߰��� ��ġ
		Student s = new Student(name, ID, age);
		stu.add(index-1, s); // add(int index, Object o) ȣ��
		
		printResult(stu); //�Է��� ������ ����Ʈ �����ش�.
		}
	
	public static void deleteStudent(List <Student> stu) { //2.delete info ���� ��
		System.out.println("Input Student Number to delete.");
		int delete = Integer.parseInt(kbd.next()); //���� delete�� ���� �л��� ��ȣ �Է¹޴´�.
		stu.remove(delete-1); //�ε����� 0���� �����ϹǷ� (delete-1)��°�� remove()
		
		printResult(stu); //������ ������ ����Ʈ �����ش�.
	}
	
	public static void printResult(List <Student> stu) { //3.show list ���� �� + add,delete �ϰ� �� �ڿ��� ȣ��
		System.out.println("NUMBER	NAME	ID	AGE");
		for (int i=0; i < stu.size(); i++) { //for loop �̿� i�� 0���� stu�� ���������
			System.out.println(i+1 +"	"+ stu.get(i)); //NUMBER=i, ������ ������ get() �̿��ؼ� ���
		}
		
	}
	
}
