import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;


/*
 * ������ ����
  	1- �߸��� �Է� Wrong Input �߸� �׷��� �� �ߵ���
  */

class MyGraph extends JFrame implements ActionListener {
	public static final int x = 30;
	public static final int y = 120;
	int kor_grade=0, eng_grade=0, math_grade=0; // �ؽ�Ʈ�ʵ��� ���� �����̸� int �� ����
	String kor_input, eng_input, math_input; // �ؽ�Ʈ�ʵ忡�� �� ������ String���� ������ ����
	String message = ""; // �߸��� �Է��� ��� "Wrong Input"�� ��µǵ��� ������ ����
	boolean isRight = true; // �Է°��� ��ȿ������ ��Ÿ���� ���� isRight
	
	GraphPanel graphPanel = new GraphPanel(); //�׷��� �׸��� ���� �г�	
	JPanel buttonPanel = new JPanel(); //��ư�� ���� �г�
	JPanel messagePanel = new JPanel(new FlowLayout()); // �߸��� �Է��� ��� "Wrong Input" ����� �г�
 	
	JLabel KOR = new JLabel("KOR"); //KOR �۾� label (���� �Է� ĭ ��)
	JLabel ENG = new JLabel("ENG"); //ENG �۾� label (���� �Է� ĭ ��)
	JLabel MATH = new JLabel("MATH"); //MATH �۾� label (���� �Է� ĭ ��)
	JTextField KOR_field = new JTextField();
	JTextField ENG_field = new JTextField();
	JTextField MATH_field = new JTextField();
	JButton button = new JButton("Show Graph");
	
	public MyGraph() { //������
		setSize(300,200);
		setTitle("Score Graph");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Toolkit tk = getToolkit(); // Toolkit�� �ҷ����� tk ���� 
		Dimension d = tk.getScreenSize(); // ȭ���� ũ�⸦ �ҷ��� d�� ����
		int screenHeight = d.height; // ȭ���� ������ screenHeight ����
		int screenWidth = d.width; // ȭ���� �ʺ��� screenWidth ����
		setLocation(screenWidth/2 - this.getWidth()/2, screenHeight/2 - this.getHeight()/2);
		// â�� ȭ���� �߾ӿ� ������ ����	
		
		add(graphPanel, BorderLayout.CENTER);
		
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
		button.addActionListener(this);
		
		buttonPanel.add(KOR);
		buttonPanel.add(KOR_field);
		buttonPanel.add(ENG);
		buttonPanel.add(ENG_field);
		buttonPanel.add(MATH);
		buttonPanel.add(MATH_field);
		buttonPanel.add(button);
		
		add(buttonPanel, BorderLayout.SOUTH);
		
		setVisible(true);
	}// ������ ��
	
	private class GraphPanel extends JComponent { //�׷��� �׸��� �׸� Ŭ������ JComponent ���
		public void paint(Graphics g) {
			
			g.drawLine(x, y, x+200, y); //x�� �׸���
			g.drawLine(x,y, x, y-110); // y�� �׸���
			int i = 10;
			while (i<=100) {
				g.drawLine(x, y-i, x+200, y-i); // i��(10~100)�� y������ �������ν� 10���� ���� �׸���
				g.drawString(Integer.toString(i), x-15, y-i); // �� ������ ����Ű�� ���� i �� ���� ���
				i+=10;
			} // ���ݼ� 10~100 ���� �׸���
			g.drawString("KOR", x+50, y+10); //KOR �۾�
			g.drawString("ENG", x+100, y+10); //ENG �۾�
			g.drawString("MATH", x+150, y+10); //MATH �۾�
			
			if (isRight == true) { //�Է°��� ��ȿ�� �����̸�
				// �簢������ ����׷��� �׸���
				g.setColor(Color.red); //����׷��� ������ red�� ����
				g.fillRect(x+50, y-kor_grade, 5, kor_grade); //���� �׷���
				g.fillRect(x+100, y-eng_grade, 5, eng_grade); //���� �׷���
				g.fillRect(x+150, y-math_grade, 5, math_grade); //���� �׷���
				// (�����)_grade ������ �׷����� ���̸� ����. 
				//actionPerformed() ���� ����ڰ� �Է��� ����� �׷����� �ö󰡰� �ϱ� ����.	
			}
			else { //��ȿ���� ���� �� ������
				g.setColor(Color.black); // ������ ����
				g.drawString("Wrong Input", 80, 10);// Wrong Input ���
				
			}
		}

	}
		public void actionPerformed(ActionEvent e) {
		
			
			try {
				kor_grade = Integer.parseInt(KOR_field.getText());
				eng_grade = Integer.parseInt(ENG_field.getText());
				math_grade = Integer.parseInt(MATH_field.getText());
				
				if((kor_grade>100 || kor_grade<0) || (eng_grade>100 || eng_grade<0) || (math_grade>100 || math_grade<0)) 
					//�� ���� �� �ϳ��� 0~100 ���� ���� �Է��� ���
					throw new Exception(); //������Ʈ Exception ����
				
				else {
					isRight = true; //��ȿ�� ������ �����ϰ�,
					repaint(); //��������̸� �� ������ �簢���� ���̷� �Ͽ� repaint()
				}
			
			} catch(Exception w) {
				isRight = false; //���� ��ȿ���� �ʴٰ� ����
				kor_grade = 0;
				eng_grade = 0;
				math_grade = 0; // �簢���� �׷����� �ʵ��� �� ���� ���� 0���� �����Ͽ���.
				repaint();
			} 

}
}

public class HW2_4_������ extends JFrame {
	
	public static void main(String[] args) {
		System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
	    
		MyGraph m = new MyGraph();
	}
}