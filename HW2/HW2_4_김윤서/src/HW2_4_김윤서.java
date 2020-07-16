import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;


/*
 * 수정할 사항
  	1- 잘못된 입력 Wrong Input 뜨면 그래프 안 뜨도록
  */

class MyGraph extends JFrame implements ActionListener {
	public static final int x = 30;
	public static final int y = 120;
	int kor_grade=0, eng_grade=0, math_grade=0; // 텍스트필드의 값이 숫자이면 int 로 저장
	String kor_input, eng_input, math_input; // 텍스트필드에서 값 가져와 String으로 저장할 변수
	String message = ""; // 잘못된 입력일 경우 "Wrong Input"가 출력되도록 수정할 예정
	boolean isRight = true; // 입력값이 유효한지를 나타내는 변수 isRight
	
	GraphPanel graphPanel = new GraphPanel(); //그래프 그림을 얹을 패널	
	JPanel buttonPanel = new JPanel(); //버튼을 얹을 패널
	JPanel messagePanel = new JPanel(new FlowLayout()); // 잘못된 입력일 경우 "Wrong Input" 출력할 패널
 	
	JLabel KOR = new JLabel("KOR"); //KOR 글씨 label (점수 입력 칸 옆)
	JLabel ENG = new JLabel("ENG"); //ENG 글씨 label (점수 입력 칸 옆)
	JLabel MATH = new JLabel("MATH"); //MATH 글씨 label (점수 입력 칸 옆)
	JTextField KOR_field = new JTextField();
	JTextField ENG_field = new JTextField();
	JTextField MATH_field = new JTextField();
	JButton button = new JButton("Show Graph");
	
	public MyGraph() { //생성자
		setSize(300,200);
		setTitle("Score Graph");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Toolkit tk = getToolkit(); // Toolkit을 불러오는 tk 설정 
		Dimension d = tk.getScreenSize(); // 화면의 크기를 불러와 d에 저장
		int screenHeight = d.height; // 화면의 높이인 screenHeight 생성
		int screenWidth = d.width; // 화면의 너비인 screenWidth 생성
		setLocation(screenWidth/2 - this.getWidth()/2, screenHeight/2 - this.getHeight()/2);
		// 창이 화면의 중앙에 오도록 설정	
		
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
	}// 생성자 끝
	
	private class GraphPanel extends JComponent { //그래프 그림을 그릴 클래스로 JComponent 상속
		public void paint(Graphics g) {
			
			g.drawLine(x, y, x+200, y); //x축 그리기
			g.drawLine(x,y, x, y-110); // y축 그리기
			int i = 10;
			while (i<=100) {
				g.drawLine(x, y-i, x+200, y-i); // i값(10~100)을 y값에서 빼줌으로써 10개의 눈금 그리기
				g.drawString(Integer.toString(i), x-15, y-i); // 각 눈금이 가리키는 숫자 i 도 옆에 출력
				i+=10;
			} // 눈금선 10~100 까지 그리기
			g.drawString("KOR", x+50, y+10); //KOR 글씨
			g.drawString("ENG", x+100, y+10); //ENG 글씨
			g.drawString("MATH", x+150, y+10); //MATH 글씨
			
			if (isRight == true) { //입력값이 유효한 범위이면
				// 사각형으로 막대그래프 그리기
				g.setColor(Color.red); //막대그래프 색깔을 red로 지정
				g.fillRect(x+50, y-kor_grade, 5, kor_grade); //국어 그래프
				g.fillRect(x+100, y-eng_grade, 5, eng_grade); //영어 그래프
				g.fillRect(x+150, y-math_grade, 5, math_grade); //수학 그래프
				// (과목명)_grade 변수로 그래프의 높이를 조정. 
				//actionPerformed() 에서 사용자가 입력한 값대로 그래프가 올라가게 하기 위함.	
			}
			else { //유효하지 않은 값 들어오면
				g.setColor(Color.black); // 검정색 설정
				g.drawString("Wrong Input", 80, 10);// Wrong Input 출력
				
			}
		}

	}
		public void actionPerformed(ActionEvent e) {
		
			
			try {
				kor_grade = Integer.parseInt(KOR_field.getText());
				eng_grade = Integer.parseInt(ENG_field.getText());
				math_grade = Integer.parseInt(MATH_field.getText());
				
				if((kor_grade>100 || kor_grade<0) || (eng_grade>100 || eng_grade<0) || (math_grade>100 || math_grade<0)) 
					//세 과목 중 하나라도 0~100 밖의 수를 입력한 경우
					throw new Exception(); //오브젝트 Exception 생성
				
				else {
					isRight = true; //유효한 값임을 설정하고,
					repaint(); //정상범위이면 각 점수를 사각형의 높이로 하여 repaint()
				}
			
			} catch(Exception w) {
				isRight = false; //값이 유효하지 않다고 설정
				kor_grade = 0;
				eng_grade = 0;
				math_grade = 0; // 사각형이 그려지지 않도록 세 과목 점수 0으로 저장하였다.
				repaint();
			} 

}
}

public class HW2_4_김윤서 extends JFrame {
	
	public static void main(String[] args) {
		System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
	    
		MyGraph m = new MyGraph();
	}
}