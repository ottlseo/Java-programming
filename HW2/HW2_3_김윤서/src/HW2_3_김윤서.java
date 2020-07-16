import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyCal extends JFrame implements ActionListener {
	
	double firstInt, secondInt; //버튼을 통해 텍스트필드에 입력될 값, 이 변수에 저장함으로써 계산을 수행할 것임
	double result; // 최종 결과값 저장 --> result = firstInt (+-*/) secondInt
	int mean; // +버튼 눌렀을 때 1, -일때 2, ... 버튼별로 숫자 할당해서 switch문에 사용
	
	private JPanel btnPanel = new JPanel();
	private JTextField inputField = new JTextField();
	private JButton[] numBtns = new JButton[10];
	{ // 0~9까지 숫자버튼을 배열로 만들 것임, 메모리만 할당. 아직 객체는 생성하지 않음;
	for (int i=0; i < numBtns.length; i++) { //for문 이용해 숫자버튼 객체 생성
		numBtns[i] = new JButton(Integer.toString(i)); //i의 값을 String 으로 바꾸어 button[i]의 레이블로 지정
		numBtns[i].addActionListener(this); //0~9 버튼에 리스너 연결 
	} } //숫자버튼 0~9까지 생성 완료
	
	private JButton btnPlus = new JButton("+"); //JButton의 생성자 이용하여 버튼의 레이블 바로 지정
	private JButton btnMinus = new JButton("-");
	private JButton btnMultiply = new JButton("*");
	private JButton btnDivide = new JButton("/");
	private JButton btnEqual = new JButton("=");
	private JButton btnCE = new JButton("new");
	
	
	public MyCal() { //생성자
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Calculator");
				
		btnPanel.setLayout(new GridLayout(4,4)); 
		// btnPanel이라는 패널의 레이아웃을 Grid로 지정, row=4 column=4
		
		btnPlus.addActionListener(this);
		btnMinus.addActionListener(this);
		btnMultiply.addActionListener(this);
		btnDivide.addActionListener(this);
		btnEqual.addActionListener(this);
		btnCE.addActionListener(this);
		
		btnPanel.add(numBtns[7]);
		btnPanel.add(numBtns[8]);
		btnPanel.add(numBtns[9]);
		btnPanel.add(btnDivide); //1줄
		btnPanel.add(numBtns[4]);
		btnPanel.add(numBtns[5]);
		btnPanel.add(numBtns[6]);
		btnPanel.add(btnMultiply); //2줄
		btnPanel.add(numBtns[1]);
		btnPanel.add(numBtns[2]);
		btnPanel.add(numBtns[3]);
		btnPanel.add(btnMinus); //3줄
		btnPanel.add(btnCE);
		btnPanel.add(numBtns[0]);
		btnPanel.add(btnEqual);
		btnPanel.add(btnPlus); //4줄 완성
		
		add(btnPanel, BorderLayout.CENTER);
		add(inputField, BorderLayout.NORTH);
		
		pack();
		setVisible(true);
	} //생성자 끝
	
	//숫자버튼(0~9)의 숫자를 textField에 표시하고, 변수에 저장하는 액션을 수행
	public void actionPerformed(ActionEvent e) {
		for (int i=0; i<10; i++) {
			if (e.getSource() == numBtns[i] ) { //numBtns 누른 경우
			// numBtns의 레이블 (숫자 0~9)를 읽어와 변수에 저장- 텍스트필드에 출력
				String num = (numBtns[i].getText()); // numBtns의 레이블 읽어와 변수num에 저장
				inputField.setText(num); //텍스트필드에 출력
			}
		}
		if (e.getSource() == btnCE ) {
			// textfield 내용 지우고 새로운 계산 시작하는 body 코드
			inputField.setText(""); //텍스트필드 내용 지우기
			firstInt = 0;
			secondInt = 0;
			result = 0; // firstInt, secondInt, result 값 초기화
		}
		
		if (e.getSource() == btnPlus ) {
			mean = 1;
			firstInt = Integer.parseInt(inputField.getText()); //연산기호 버튼 눌렀을 때 inputField의 수는 firstInt에 저장
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
			// btnEqual body - result값을 계산해서 텍스트필드에 출력
			secondInt = Integer.parseInt(inputField.getText()); 
				//secondInt 값은 '='버튼을 눌렀을 때 inputField에서 읽어온다.
			
			switch(mean) { //연산기호에 따라 mean을 정해주었고, mean에 따른 switch문으로 연산
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
			inputField.setText(Double.toString(result)); //텍스트필드에 출력
		}
	}
} 

public class HW2_3_김윤서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
	    
		MyCal m = new MyCal();

	}

}
