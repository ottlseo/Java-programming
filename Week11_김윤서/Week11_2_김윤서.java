import java.awt.*;
import javax.swing.*;

class MyFrame2 extends JFrame {
	
	public MyFrame2() {
		setSize(350,200); // ũ�� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X ������ �� ���α׷� ����Ǵ� �ڵ�
		setTitle("Student Information"); // title ����
		
		JPanel p1 = new JPanel();
		JPanel choose_gender = new JPanel();
		JPanel p2 = new JPanel(); // �г� 3��
		
		JLabel title = new JLabel("STUDENT INFORMATION"); // title �Է�
		title.setHorizontalAlignment(JTextField.CENTER); // ��� ����
		
		JLabel name = new JLabel("NAME"); // �̸�
		JTextField inputName = new JTextField(); //�̸� �Է�ĭ
		
		JLabel gender = new JLabel("GENDER"); // ���� -RadioButton���� �����ϵ���
		JRadioButton r1 = new JRadioButton("Male");
		JRadioButton r2 = new JRadioButton("Female", true); // radioButton 2�� ����
		ButtonGroup bg = new ButtonGroup(); // �׷�ȭ- ��ư �ϳ��� ������ �� �ֵ��� ��
		bg.add(r1); // r1�� ButtonGroup�� �߰�
		bg.add(r2); // r2�� ButtonGroup�� �߰�
		
		
		JLabel id = new JLabel("ID"); // ID
		JTextField inputId = new JTextField(); //ID �Է�ĭ
		
		JLabel department = new JLabel("DEPARTMENT");  // DEPARTMENT
		JTextField inputDepartment = new JTextField(); //DEPARTMENT �Է�ĭ
		
		add(title, BorderLayout.NORTH); // title ��ġ(north)
		
		
		p1.setLayout(new GridLayout(4,2)); // rows=4, columns=2
		//�г�1�� NAME, GENDER, ID, DEPARTMENT �߰�
		p1.add(name); 
		p1.add(inputName); //�̸�
		p1.add(gender); //����
		p1.add(choose_gender); //choose_gender�г� �߰� - ������ �Ʒ���
		p1.add(id);
		p1.add(inputId); //ID
		p1.add(department);
		p1.add(inputDepartment); // Department
		
		choose_gender.add(r1); 
		choose_gender.add(r2); // choose_gender�� radiobutton �ֱ�
	
		JButton save = new JButton("Save"); //save��ư
		JButton cancel = new JButton("Cancel"); // cancel��ư
		
		add(p1); // p1�� ��ġ
		
		p2.add(save);
		p2.add(cancel); // p2�� ��ư �ֱ�
		add(p2, BorderLayout.SOUTH); // p2 ��ġ (south)
		
		setVisible(true); 
		
	}
}
public class Week11_2_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
	    
	    MyFrame2 m2 = new MyFrame2();
	    
	}

}
