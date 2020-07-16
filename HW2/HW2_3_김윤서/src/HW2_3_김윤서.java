import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyCal extends JFrame implements ActionListener {
	
	double firstInt, secondInt; //��ư�� ���� �ؽ�Ʈ�ʵ忡 �Էµ� ��, �� ������ ���������ν� ����� ������ ����
	double result; // ���� ����� ���� --> result = firstInt (+-*/) secondInt
	int mean; // +��ư ������ �� 1, -�϶� 2, ... ��ư���� ���� �Ҵ��ؼ� switch���� ���
	
	private JPanel btnPanel = new JPanel();
	private JTextField inputField = new JTextField();
	private JButton[] numBtns = new JButton[10];
	{ // 0~9���� ���ڹ�ư�� �迭�� ���� ����, �޸𸮸� �Ҵ�. ���� ��ü�� �������� ����;
	for (int i=0; i < numBtns.length; i++) { //for�� �̿��� ���ڹ�ư ��ü ����
		numBtns[i] = new JButton(Integer.toString(i)); //i�� ���� String ���� �ٲپ� button[i]�� ���̺�� ����
		numBtns[i].addActionListener(this); //0~9 ��ư�� ������ ���� 
	} } //���ڹ�ư 0~9���� ���� �Ϸ�
	
	private JButton btnPlus = new JButton("+"); //JButton�� ������ �̿��Ͽ� ��ư�� ���̺� �ٷ� ����
	private JButton btnMinus = new JButton("-");
	private JButton btnMultiply = new JButton("*");
	private JButton btnDivide = new JButton("/");
	private JButton btnEqual = new JButton("=");
	private JButton btnCE = new JButton("new");
	
	
	public MyCal() { //������
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Calculator");
				
		btnPanel.setLayout(new GridLayout(4,4)); 
		// btnPanel�̶�� �г��� ���̾ƿ��� Grid�� ����, row=4 column=4
		
		btnPlus.addActionListener(this);
		btnMinus.addActionListener(this);
		btnMultiply.addActionListener(this);
		btnDivide.addActionListener(this);
		btnEqual.addActionListener(this);
		btnCE.addActionListener(this);
		
		btnPanel.add(numBtns[7]);
		btnPanel.add(numBtns[8]);
		btnPanel.add(numBtns[9]);
		btnPanel.add(btnDivide); //1��
		btnPanel.add(numBtns[4]);
		btnPanel.add(numBtns[5]);
		btnPanel.add(numBtns[6]);
		btnPanel.add(btnMultiply); //2��
		btnPanel.add(numBtns[1]);
		btnPanel.add(numBtns[2]);
		btnPanel.add(numBtns[3]);
		btnPanel.add(btnMinus); //3��
		btnPanel.add(btnCE);
		btnPanel.add(numBtns[0]);
		btnPanel.add(btnEqual);
		btnPanel.add(btnPlus); //4�� �ϼ�
		
		add(btnPanel, BorderLayout.CENTER);
		add(inputField, BorderLayout.NORTH);
		
		pack();
		setVisible(true);
	} //������ ��
	
	//���ڹ�ư(0~9)�� ���ڸ� textField�� ǥ���ϰ�, ������ �����ϴ� �׼��� ����
	public void actionPerformed(ActionEvent e) {
		for (int i=0; i<10; i++) {
			if (e.getSource() == numBtns[i] ) { //numBtns ���� ���
			// numBtns�� ���̺� (���� 0~9)�� �о�� ������ ����- �ؽ�Ʈ�ʵ忡 ���
				String num = (numBtns[i].getText()); // numBtns�� ���̺� �о�� ����num�� ����
				inputField.setText(num); //�ؽ�Ʈ�ʵ忡 ���
			}
		}
		if (e.getSource() == btnCE ) {
			// textfield ���� ����� ���ο� ��� �����ϴ� body �ڵ�
			inputField.setText(""); //�ؽ�Ʈ�ʵ� ���� �����
			firstInt = 0;
			secondInt = 0;
			result = 0; // firstInt, secondInt, result �� �ʱ�ȭ
		}
		
		if (e.getSource() == btnPlus ) {
			mean = 1;
			firstInt = Integer.parseInt(inputField.getText()); //�����ȣ ��ư ������ �� inputField�� ���� firstInt�� ����
			//result = firstInt + secondInt;
		}
		if (e.getSource() == btnMinus ) {
			mean = 2;
			firstInt = Integer.parseInt(inputField.getText());
			//result = firstInt - secondInt;
		}
		if (e.getSource() == btnMultiply ) {
			mean = 3;
			firstInt = Integer.parseInt(inputField.getText());
			//result = firstInt * secondInt;
		}
		if (e.getSource() == btnDivide ) {
			mean = 4;
			firstInt = Integer.parseInt(inputField.getText());
			//result = firstInt / secondInt;
			
		}
		
		if (e.getSource() == btnEqual ) {
			// btnEqual body - result���� ����ؼ� �ؽ�Ʈ�ʵ忡 ���
			secondInt = Integer.parseInt(inputField.getText()); 
				//secondInt ���� '='��ư�� ������ �� inputField���� �о�´�.
			
			switch(mean) { //�����ȣ�� ���� mean�� �����־���, mean�� ���� switch������ ����
			case 1: // +
				result = firstInt + secondInt;
				break;
			case 2: // -
				result = firstInt - secondInt;
				break;
			case 3: // *
				result = firstInt * secondInt;
				break;
			case 4: // /
				result = (double)(firstInt / secondInt);
				break;
			}
			inputField.setText(Double.toString(result)); //�ؽ�Ʈ�ʵ忡 ���
		}
	}
} 

public class HW2_3_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
	    
		MyCal m = new MyCal();

	}

}
