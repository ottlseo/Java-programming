import java.util.*;
import java.awt.*;
import javax.swing.*;


class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("Calculator"); // MyFrame�� �̸�
		setSize(300,200); // ũ�� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X ������ �� ���α׷� ����Ǵ� �ڵ�
		
		JPanel panel = new JPanel(); // �г�
		JTextField tf = new JTextField(); // textfield
		tf.setHorizontalAlignment(JTextField.RIGHT); // textfield ������ ����������
		add(tf, BorderLayout.PAGE_START);
		
		panel.setLayout(new GridLayout(5,4,4,0)); // rows=5, columns=4
		makeButton(panel, "ON");
		makeButton(panel, "AC");
		makeButton(panel, "C");
		makeButton(panel,"OFF");
		makeButton(panel, "7");
		makeButton(panel, "8"); 
		makeButton(panel, "9"); 
		makeButton(panel, "/"); 
		makeButton(panel, "4"); 
		makeButton(panel, "5");
		makeButton(panel, "6");
		makeButton(panel, "X");
		makeButton(panel, "1"); 
		makeButton(panel, "2"); 
		makeButton(panel, "3"); 
		makeButton(panel, "-"); 
		makeButton(panel, "0");
		makeButton(panel, ".");
		makeButton(panel, "="); 
		makeButton(panel, "+");
		// �гο� �Է�
		
		add(panel, BorderLayout.CENTER); // center�� �г� �߰�
		setVisible(true); // ���̰�
	}
	
	public void makeButton(JPanel panel, String text) {
		JButton button = new JButton(text); // ��ư ����
		button.setAlignmentX(CENTER_ALIGNMENT);
		panel.add(button); // ��ư�� �гο� �߰�
	}
}
public class Week11_1_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
	    
	    MyFrame m = new MyFrame();
	    
	}

}
