import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyCar extends JFrame implements ActionListener {
	Color color;  
	JButton button;
	
	public MyCar() {
		setTitle("MyCar -������"); //����
		setVisible(true); //���̰�
		setSize(500,350); //Frame ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X��ư ������ ���α׷� ����
		
		color = Color.red; //�ʱⰪ red
		JPanel buttonSelect = new JPanel();
		buttonSelect.setLayout(new FlowLayout(FlowLayout.CENTER)); //�߾��� �߽����� FlowLayout ����
		
		// ������ư �ֱ�
		JPanel choose_color = new JPanel();
		JRadioButton red = new JRadioButton("RED");
		JRadioButton green = new JRadioButton("GREEN"); 
		JRadioButton blue = new JRadioButton("BLUE", true); // radioButton 3�� ����
		
		ButtonGroup bg = new ButtonGroup(); // �׷�ȭ- ��ư �ϳ��� ������ �� �ֵ��� ��
		bg.add(red); // red�� ButtonGroup�� �߰�
		bg.add(green); // green�� ButtonGroup�� �߰�
		bg.add(blue); // blue�� ButtonGroup�� �߰�
		//choose_color �гο� ������ư 3�� �߰�
		choose_color.add(red);
		choose_color.add(green);
		choose_color.add(blue); 
		buttonSelect.add(choose_color); //buttonSelect�гο� choose_color�г� �߰�

		if (red.isSelected()) { //red ��ư ���� ��
			color = Color.red;
		}
		if (green.isSelected()) { //green ��ư ���� ��
			color = Color.green;
		}
		if (blue.isSelected()) { // blue��ư ���� ��
			color = Color.blue;
		}
		
		// ��ư �ֱ�
		button = new JButton("Paint");
		button.addActionListener(this);
		buttonSelect.add(button); //buttonSelect�гο� ��ư �߰�
		
		Rect1 c1 = new Rect1();
		Rect2 c2 = new Rect2();
		Circle1 c3 = new Circle1();
		Circle2 c4 = new Circle2();
		smile s = new smile();
		add(c1, "Center");
		add(c2, "Center");
		add(c3, "Center");
		add(c4, "Center");
		add(s);
		
		add(buttonSelect);
		
	}
	class Rect1 extends JPanel{ //�� �簢��
		public void paint(Graphics g) {
			g.setColor(color); //�ʱⰪ red
			g.fillRect(100, 50, 140, 60);
		}
	}
	class Rect2 extends JPanel{ //�Ʒ� �簢��
		public void paint(Graphics g) {
			g.setColor(color); //�ʱⰪ red
			g.fillRect(100, 50, 140, 60);
		}
	}
	class Circle1 extends JPanel{ //����1
		public void paint(Graphics g) {
			g.setColor(Color.lightGray); //�ʱⰪ ȸ��
			g.fillOval(70, 180, 60, 60);
		}
	}
	class Circle2 extends JPanel{ //����2
		public void paint(Graphics g) {
			g.setColor(Color.lightGray); //�ʱⰪ ȸ��
			g.fillOval(210, 180, 60, 60);
		}
	}
	class smile extends JPanel{ //������
		public void paint(Graphics g) {
			g.setColor(Color.black); //����
			g.drawArc(200,80,40,50,0,0);
		}
	}
	
	
	public void actionPerformed(ActionEvent e) {
		// ��ư �������� �� �ٲٱ�.
		// if - RadioButton �̿��ؼ� repaint() �ϱ�
			repaint(); //���� �׷�
	}

}

public class Week12_2_������ extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCar c = new MyCar();
	}

}
