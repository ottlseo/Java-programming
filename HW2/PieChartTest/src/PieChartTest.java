import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*; //NumberFormatException 

class MyChart extends JFrame {
	public static final int x = 100;
	public static final int y = 50;
	public static final int r = 120; // pie chart �� ������ 
	
	int kims, lees, parks, etc;
	int kim_arc = 0, lee_arc = 0, park_arc = 0, etc_arc = 0; // �� ������ ������ ������ ���������� ����
	int total = 0;  // �л� �� ����
	
	int isRight = 1; // �Է°��� �ùٸ����� ���� int��- ����ó������ ���ȴ�
	// isRight = 1; ���� 
	// isRight = 2; �л��� ���� 100 �̻��� �� 
	// isRight = 3; ���ڰ� �ƴϰų� ������ ��
	
	JPanel piechart, buttonPanel; //piechart�� ���� �г� piechart/ buttonPanel
	JLabel KIM, LEE, PARK, ETC; //KIM, LEE, PARK, ETC �۾� label (�Է� ĭ ��)
	JButton button; // ��ư ����
	JTextField KIM_field, LEE_field, PARK_field, ETC_field; // �� ������ �ο����� �Է¹��� �ؽ�Ʈ �ʵ� ����
	
	public MyChart(){ //������
		
		Toolkit tk = getToolkit(); // Toolkit�� �ҷ����� tk ���� 
		Dimension d = tk.getScreenSize(); // ȭ���� ũ�⸦ �ҷ��� d�� ����
		int screenHeight = d.height; // ȭ���� ������ screenHeight ����
		int screenWidth = d.width; // ȭ���� �ʺ��� screenWidth ����
		setLocation(screenWidth/2 - this.getWidth()/2, screenHeight/2 - this.getHeight()/2);
		// â�� ȭ���� �߾ӿ� ������ ����	
		
		
		setSize(400, 300); // �������� ������ ����
		setTitle("Pie Chart of Student names -������"); // ������ �̸� ����
		setDefaultCloseOperation(EXIT_ON_CLOSE); // x�� ������ ���α׷��� ����ǵ��� �Ѵ�
		
		piechart = new GraphPanel(); //piechart�� ���� �г�	
		buttonPanel = new JPanel(); //label, textfield, button�� ���� �г�
		// �� �� ����
		KIM = new JLabel ("KIM"); //KIM �۾� label (�Է� ĭ ��)
		LEE = new JLabel ("LEE");//LEE �۾� label (�Է� ĭ ��)
		PARK = new JLabel ("PARK");//PARK �۾� label (�Է� ĭ ��)
		ETC = new JLabel ("ETC"); //ETC �۾� label (�Է� ĭ ��)
		
		KIM_field = new JTextField(3);
		LEE_field = new JTextField(3);
		PARK_field = new JTextField(3);
		ETC_field = new JTextField(3);
		// �� ������ �ο����� �Է¹��� �ؽ�Ʈ �ʵ� ����
		
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		//��ư�г��� ���̾ƿ� FlowLayout ���� ����
		button = new JButton("Graph");
		button.addActionListener(new MyListener()); //��ư�� ActionListener()�� �ٿ���
		
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
		add(buttonPanel, BorderLayout.PAGE_END);
		
		setVisible(true);
	}
	
	class GraphPanel extends JPanel {
		
		public void paint(Graphics g) {
			// 1) fillArch()
			// 2) drawString()
			// 3) �����޽���
			
			if(isRight == 1) { //  ��ȿ�� ���� ���
				ETC_field.setText(Integer.toString(100-total)); // etc���� �ؽ�Ʈ�ʵ忡 ����ϰ�
				
				g.setColor(Color.YELLOW); // YELLOW : KIMs
				g.fillArc(x, y, r, r, 0, kim_arc); //KIM �κ� �׷��� ���� - Arch ��ĥ
				g.drawString("YELLOW : KIMs", 400, 200);

				g.setColor(Color.RED);
				g.fillArc(x, y, r, r, kim_arc, lee_arc); //LEE �κ� �׷��� ���� - Arch ��ĥ
				g.drawString("RED : LEEs", 400, 210); //RED : LEEs

				g.setColor(Color.BLUE); 
				g.fillArc(x, y, r, r, kim_arc+lee_arc, park_arc); //PARK �κ� �׷��� ���� - Arch ��ĥ
				g.drawString("BLUE : PARKs", 400, 220); // BLUE : PARKs
				
				g.setColor(Color.GREEN); // GREEN : Etc
				g.drawString("GREEN : Etc", 400, 230); // ���ڿ��� �׸�
				g.fillArc(x, y, r, r, kim_arc+lee_arc+park_arc, 360-(kim_arc+lee_arc+park_arc)); // etc�� ������ŭ ��ä���� �����Ѵ�(���� ������ �κ�)
			}
			else if (isRight == 2) { // �л��� ������ 100�� �̻��� ��� 
				g.setColor(Color.BLACK); // ���������� ����
				g.drawString("Number of Student is 100.", 200, 250); // �ش� ���ڿ��� �׸���
				
			}
			else { // ������ �Էµǰų� �ùٸ� ���� �ƴҶ�
				g.setColor(Color.BLACK); // ���������� ����
				g.drawString("Input numbers of student names", 200, 250); // �ش� ���ڿ��� �׸���
			}
		}
	}
	
	class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) { // ��ư�� ������
				// ��ư ������ 
				// �� �ؽ�Ʈ�ʵ忡�� �Է¹��� �ο��� �����´�.
				
				try {
					// �� ������
					kims = Integer.parseInt(KIM_field.getText());
					lees = Integer.parseInt(LEE_field.getText()); 
					parks = Integer.parseInt(PARK_field.getText());
					total = kims+lees+parks; //�� �л��� ���
					
					//�� ������ ���� �л����� ������ ����� ������������ �����Ѵ�
					kim_arc = (int)(kims*3.6);
					lee_arc = (int)(lees*3.6);
					park_arc = (int)(parks*3.6);
					etc_arc = (int)((100 -total)*3.6); // etc�� ������ �ڵ����� ���
					
					if(total >100) //�л��� ������ 100 �̻��� ��� ����ó�� - Exception���� throw
						throw new Exception();
					
					else if((kims>100 || kims<0) || (lees>100 || lees<0) || (parks>100 || parks<0)) {
						// kim, lee, park �߿� �ϳ��� 0~100 ���� ���� �ƴѰ��
						throw new NumberFormatException(); //NumberFormatException ���� throw
					}
					
					else { //��ȿ�� ���� ��
						isRight = 1; //��ȿ�� ���̶�� ����
						repaint();
					}
				} catch(NumberFormatException notNum) {
					isRight = 3; //�����̰ų�, ���ڰ� �ƴѰ��
					kim_arc =0;
					lee_arc =0;
					park_arc =0;
					etc_arc =0; //�׷����� �ʵ��� ��� 0���� ����
					repaint();
				} catch(Exception oversum) { //100�� �̻�
					isRight = 2; //
					kim_arc =0;
					lee_arc =0;
					park_arc =0;
					etc_arc =0; //�׷����� �ʵ���
					repaint();
				} 
				
				
				
				}
			}
		}
	
	
}



public class PieChartTest {

	public static void main(String[] args) {
		System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
	    
		MyChart m = new MyChart();
	}

}
