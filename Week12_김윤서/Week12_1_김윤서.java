import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CatchMe extends JFrame {
	JButton b = new JButton("Click!"); // ��ư ����
	
	public CatchMe() {
		setTitle("�� ��ƺ�~��! -������"); // Frame�� ���� ����
		setSize(300,300); // frame ũ�� ����
		setResizable(false); // frame ũ�� ���� ���ϵ���
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X��ư ������ ���α׷� ����
		JPanel p =  new JPanel(); // �г� p ����

		p.add(b); // �гο� ��ư b �߰�
		this.add(p); // Frame(this)�� �г� p �߰�
		b.addMouseListener(new MouseListener()); // ���콺�� ��ư ���� ��
		add(p, BorderLayout.CENTER); // �г��� ����� ��ġ
		setVisible(true);
	}
	
	class MouseListener extends MouseAdapter{
			public void mouseEntered(MouseEvent e){
				int x = (int)(Math.random()*300); // x ����
				int y = (int)(Math.random()*300); // y ����
				b.setLocation((int)(Math.random()*100),(int)(Math.random()*100));
				System.out.println("x = " + x + " y = " + y); // button ��ġ ���
				}

	
			public void mouseClicked(MouseEvent e) { // ������
				System.out.println("��,,, �����٤Ф�");
			}
		}	
}

public class Week12_1_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
	    
		CatchMe c = new CatchMe();
	}

}
