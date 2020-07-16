import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*; //NumberFormatException 
import java.io.*; // ioException

/*
 * �߰��� ����
	1- Frame�� ȭ���� �߾ӿ� ��ġ��
	2-  �Է°��� �������°� �ƴ� ��� ���� ó��
	3- ��Etc�� �� ���� �ٸ� ���� �̿��ؼ� ��� ����-o
*/

class MyChart extends JFrame implements ActionListener {
	public static final int x = 100;
	public static final int y = 100;
	public static final int r = 100; // pie chart �� ������ 
	
	int kim,lee,park,etc;
	int kim_arc=0, lee_arc=0, park_arc=0, etc_arc=0;
	String kim_field, lee_field, park_field, etc_field;
	int total; // �л� �� ���� 
	int isRight = 1; // �Է°��� �ùٸ����� ���� int��- ����ó������ ���ȴ�
	// isRight = 1; ���� 
	// isRight = 2; �л��� ���� 100 �̻��� �� 
	// isRight = 3; ���ڰ� �ƴϰų� ������ ��.
	
	String message =""; //���� �޽��� ����� �� ���
	
	GraphPanel piechart = new GraphPanel(); //piechart�� ���� �г�	
	JPanel buttonPanel = new JPanel(); //label, textfield, button�� ���� �г�
	
	//JLabel message = new JLabel(""); // �߸��� �Է��� ��� �����޽����� ����� ���̺�	
	JLabel KIM = new JLabel("KIM"); //KIM �۾� label (�Է� ĭ ��)
	JLabel LEE = new JLabel("LEE"); //LEE �۾� label (�Է� ĭ ��)
	JLabel PARK = new JLabel("PARK"); //PARK �۾� label (�Է� ĭ ��)
	JLabel ETC = new JLabel("ETC"); //ETC �۾� label (�Է� ĭ ��)
	
	JTextField KIM_field = new JTextField();
	JTextField LEE_field = new JTextField();
	JTextField PARK_field = new JTextField();
	JTextField ETC_field = new JTextField();
	// �� ������ �ο����� �Է¹��� �ؽ�Ʈ �ʵ� ����
	
	JButton button = new JButton("Graph"); //��ư ����
	
	public MyChart() { //������
		setSize(300,200);
		setTitle("Pie Chart of Student names -������"); //���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
		button.addActionListener(this); //��ư�� ActionListener()�� �ٿ���
		
		buttonPanel.add(KIM);
		buttonPanel.add(KIM_field);
		buttonPanel.add(LEE);
		buttonPanel.add(LEE_field);
		buttonPanel.add(PARK);
		buttonPanel.add(PARK_field);
		buttonPanel.add(ETC);
		buttonPanel.add(ETC_field);
		buttonPanel.add(button);
		// buttonPanel�� �� ���� �󺧰� �ؽ�Ʈ�ʵ� 3�� + ��ư���� �ø���.

		add(piechart, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		
		setVisible(true);
	}// ������ ��
	
	private class GraphPanel extends JPanel { //�׷��� �׸��� �׸� Ŭ������ JComponent ���
		public void paint(Graphics g) {
			// 1) fillArch()
			// 2) drawString()
			// 3) �����޽���
			
			int startAngle = 0; //fillArch �׸� �� �����ϴ� angle �� 0���� ����, ���� ����������Ŵ
			
			if ( 0<= total && total <= 100 ) {
				// �� �л����� 0~100�� �̸�
				ETC_field.setText(Integer.toString(100-total)); // etc���� �ؽ�Ʈ�ʵ忡 ���
				
				g.setColor(Color.yellow); //KIMs :yellow�� �� ����
				g.fillArc(x, y, r, r, startAngle, kim_arc); // arch�� ��ĥ
				g.drawString("YELLOW : KIMs", 400, 200); // ���ڿ� draw
				startAngle += kim_arc; 
				//���� ��Ʈ�� KIM �׷��� �������� �����ϵ��� startAngle ����
				
				g.setColor(Color.red); //LEEs
				g.fillArc(x, y, r, r, startAngle, lee_arc);// arch�� ��ĥ
				g.drawString("RED : LEEs", 400, 210); // ���ڿ� draw
				startAngle += lee_arc;
				
				g.setColor(Color.blue); // PARKs
				g.fillArc(x, y, r, r, startAngle, park_arc); // arch�� ��ĥ
				g.drawString("BLUE : PARKs", 400, 220);  // ���ڿ� draw
				startAngle += park_arc;
				
				g.setColor(Color.green); // Etc.
				g.fillArc(x, y, r, r, startAngle, 360-startAngle); // arch�� ��ĥ
				g.drawString("GREEN : Etc", 400, 230);  //���ڿ� draw
			// ---------------- ---------- -------------
		}
			
			
			try {
				
		} catch(NumberFormatException notInt) { //�Է°��� ���ڰ� �ƴѰ��
			g.setColor(Color.black);
			g.drawString("Input numbers of student names", 400, 230);  //�����޽��� ���ڿ� draw
		} //catch(IOException e) { //���� �Է��� ���
			//g.setColor(Color.black);
			//g.drawString("Input numbers of student names", 400, 230);  //�����޽��� ���ڿ� draw
		//} 
		catch(Exception sumIsWrong) { //���� 100 �̻��� ���
			g.setColor(Color.black);
			g.drawString("Number of students is 100", 400, 230);  //���ڿ� draw
		}
		}
		
	}
		public void actionPerformed(ActionEvent e) {
		// ��ư ������NumberFormatException 
			// �� �ؽ�Ʈ�ʵ忡�� �Է¹��� �ο��� �����´�.
			
			try {
				kim = Integer.parseInt(KIM_field.getText());
				lee = Integer.parseInt(LEE_field.getText());
				park = Integer.parseInt(PARK_field.getText());
				etc = Integer.parseInt(ETC_field.getText());
				// �Է°� ���ڰ� �ƴ� ��� - NumberFormatException���� �ڵ����� catch��

				//total�� ��,��,�ھ� ���� ���� �л� �� ����
				total = kim+lee+park;
				
				if((kor_grade>100 || kor_grade<0) || (eng_grade>100 || eng_grade<0) || (math_grade>100 || math_grade<0)) 
					//�� ���� �� �ϳ��� 0~100 ���� ���� �Է��� ���
					throw new Exception(); //������Ʈ Exception ����
				if (total>100) { // �л� �� ���� 100�� �̻��� ���
					
				}
				
				
				// �ο����� ���׷��� ���� ������ ȯ���ؼ� ����
				kim_arc = (int)(kim/100*360);
				lee_arc = (int)(lee/100*360);
				park_arc = (int)(park/100*360);
				etc_arc = (int)((100-total)/100*360); // etc�� �ڵ����� ���
				
				
				else {
					isRight = 1; //��ȿ�� ������ �����ϰ�,
					repaint(); //��������̸� �� ������ �簢���� ���̷� �Ͽ� repaint()
				}
			
			} catch(Exception w) {
				isRight = 2; //���� ��ȿ���� �ʴٰ� ����
				kor_grade = 0;
				eng_grade = 0;
				math_grade = 0; // �簢���� �׷����� �ʵ��� �� ���� ���� 0���� �����Ͽ���.
				repaint();
			} 
			
			
			
			kim = Integer.parseInt(KIM_field.getText());
			lee = Integer.parseInt(LEE_field.getText());
			park = Integer.parseInt(PARK_field.getText());
			etc = Integer.parseInt(ETC_field.getText());
			// �Է°� ���ڰ� �ƴ� ��� - NumberFormatException���� �ڵ����� catch��

			//total�� ��,��,�ھ� ���� ���� �л� �� ����
			total = kim+lee+park;
			
			// �ο����� ���׷��� ���� ������ ȯ���ؼ� ����
			kim_arc = (int)(kim/100*360);
			lee_arc = (int)(lee/100*360);
			park_arc = (int)(park/100*360);
			etc_arc = (int)((100-total)/100*360); // etc�� �ڵ����� ���
			
			if((kim+lee+park)>100) {
					//�� ���� ���� 100 ���� ���� �Է��� ���
					//isRight = false; //���� ��ȿ���� �ʴٰ� ����
					//message
				//throw new Exception(); //������Ʈ Exception�� �����޽����� �����ϵ��� ����
			}
			if( kim<0 || lee<0 || park<0 ) 
					//�Է°��� ���� ���°� �ƴϰų� ������ ���
				//throw new NumberFormatException(); //������Ʈ Exception�� �����޽����� �����ϵ��� ����
			else {
				isRight = true; // ���� ��ȿ�ϴٰ� ����
				repaint(); //��������̸� �� ���� �°� ���׷����� repaint()
			}
			
			 
			}
		}



public class HW2_5_������ver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
	    
		MyChart m = new MyChart();
	}

}
