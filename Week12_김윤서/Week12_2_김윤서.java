import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyCar extends JFrame implements ActionListener {
	Color color;  
	JButton button;
	
	public MyCar() {
		setTitle("MyCar -김윤서"); //제목
		setVisible(true); //보이게
		setSize(500,350); //Frame 사이즈
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X버튼 누르면 프로그램 종료
		
		color = Color.red; //초기값 red
		JPanel buttonSelect = new JPanel();
		buttonSelect.setLayout(new FlowLayout(FlowLayout.CENTER)); //중앙을 중심으로 FlowLayout 지정
		
		// 라디오버튼 넣기
		JPanel choose_color = new JPanel();
		JRadioButton red = new JRadioButton("RED");
		JRadioButton green = new JRadioButton("GREEN"); 
		JRadioButton blue = new JRadioButton("BLUE", true); // radioButton 3개 생성
		
		ButtonGroup bg = new ButtonGroup(); // 그룹화- 버튼 하나만 선택할 수 있도록 함
		bg.add(red); // red을 ButtonGroup에 추가
		bg.add(green); // green을 ButtonGroup에 추가
		bg.add(blue); // blue을 ButtonGroup에 추가
		//choose_color 패널에 라디오버튼 3개 추가
		choose_color.add(red);
		choose_color.add(green);
		choose_color.add(blue); 
		buttonSelect.add(choose_color); //buttonSelect패널에 choose_color패널 추가

		if (red.isSelected()) { //red 버튼 선택 시
			color = Color.red;
		}
		if (green.isSelected()) { //green 버튼 선택 시
			color = Color.green;
		}
		if (blue.isSelected()) { // blue버튼 선택 시
			color = Color.blue;
		}
		
		// 버튼 넣기
		button = new JButton("Paint");
		button.addActionListener(this);
		buttonSelect.add(button); //buttonSelect패널에 버튼 추가
		
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
	class Rect1 extends JPanel{ //위 사각형
		public void paint(Graphics g) {
			g.setColor(color); //초기값 red
			g.fillRect(100, 50, 140, 60);
		}
	}
	class Rect2 extends JPanel{ //아래 사각형
		public void paint(Graphics g) {
			g.setColor(color); //초기값 red
			g.fillRect(100, 50, 140, 60);
		}
	}
	class Circle1 extends JPanel{ //바퀴1
		public void paint(Graphics g) {
			g.setColor(Color.lightGray); //초기값 회색
			g.fillOval(70, 180, 60, 60);
		}
	}
	class Circle2 extends JPanel{ //바퀴2
		public void paint(Graphics g) {
			g.setColor(Color.lightGray); //초기값 회색
			g.fillOval(210, 180, 60, 60);
		}
	}
	class smile extends JPanel{ //눈웃음
		public void paint(Graphics g) {
			g.setColor(Color.black); //검정
			g.drawArc(200,80,40,50,0,0);
		}
	}
	
	
	public void actionPerformed(ActionEvent e) {
		// 버튼 눌렀을때 색 바꾸기.
		// if - RadioButton 이용해서 repaint() 하기
			repaint(); //새로 그려
	}

}

public class Week12_2_김윤서 extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCar c = new MyCar();
	}

}
