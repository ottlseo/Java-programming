import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*; //NumberFormatException 
import java.io.*; // ioException

/*
 * 추가할 사항
	1- Frame이 화면의 중앙에 위치함
	2-  입력값이 숫자형태가 아닌 경우 예외 처리
	3- “Etc” 의 수는 다른 값을 이용해서 계산 가능-o
*/

class MyChart extends JFrame implements ActionListener {
	public static final int x = 100;
	public static final int y = 100;
	public static final int r = 100; // pie chart 의 반지름 
	
	int kim,lee,park,etc;
	int kim_arc=0, lee_arc=0, park_arc=0, etc_arc=0;
	String kim_field, lee_field, park_field, etc_field;
	int total; // 학생 수 총합 
	int isRight = 1; // 입력값이 올바른지에 대한 int값- 예외처리에서 사용된다
	// isRight = 1; 정상 
	// isRight = 2; 학생수 합이 100 이상일 때 
	// isRight = 3; 숫자가 아니거나 음수일 때.
	
	String message =""; //오류 메시지 출력할 때 사용
	
	GraphPanel piechart = new GraphPanel(); //piechart을 얹을 패널	
	JPanel buttonPanel = new JPanel(); //label, textfield, button을 얹을 패널
	
	//JLabel message = new JLabel(""); // 잘못된 입력일 경우 에러메시지를 출력할 레이블	
	JLabel KIM = new JLabel("KIM"); //KIM 글씨 label (입력 칸 옆)
	JLabel LEE = new JLabel("LEE"); //LEE 글씨 label (입력 칸 옆)
	JLabel PARK = new JLabel("PARK"); //PARK 글씨 label (입력 칸 옆)
	JLabel ETC = new JLabel("ETC"); //ETC 글씨 label (입력 칸 옆)
	
	JTextField KIM_field = new JTextField();
	JTextField LEE_field = new JTextField();
	JTextField PARK_field = new JTextField();
	JTextField ETC_field = new JTextField();
	// 각 성씨별 인원수를 입력받을 텍스트 필드 생성
	
	JButton button = new JButton("Graph"); //버튼 생성
	
	public MyChart() { //생성자
		setSize(300,200);
		setTitle("Pie Chart of Student names -김윤서"); //제목 생성
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
		button.addActionListener(this); //버튼에 ActionListener()를 붙여줌
		
		buttonPanel.add(KIM);
		buttonPanel.add(KIM_field);
		buttonPanel.add(LEE);
		buttonPanel.add(LEE_field);
		buttonPanel.add(PARK);
		buttonPanel.add(PARK_field);
		buttonPanel.add(ETC);
		buttonPanel.add(ETC_field);
		buttonPanel.add(button);
		// buttonPanel에 각 성씨 라벨과 텍스트필드 3쌍 + 버튼까지 올린다.

		add(piechart, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		
		setVisible(true);
	}// 생성자 끝
	
	private class GraphPanel extends JPanel { //그래프 그림을 그릴 클래스로 JComponent 상속
		public void paint(Graphics g) {
			// 1) fillArch()
			// 2) drawString()
			// 3) 오류메시지
			
			int startAngle = 0; //fillArch 그릴 때 시작하는 angle 은 0으로 설정, 이후 점차증가시킴
			
			if ( 0<= total && total <= 100 ) {
				// 총 학생수가 0~100명 이면
				ETC_field.setText(Integer.toString(100-total)); // etc값을 텍스트필드에 출력
				
				g.setColor(Color.yellow); //KIMs :yellow로 색 설정
				g.fillArc(x, y, r, r, startAngle, kim_arc); // arch를 색칠
				g.drawString("YELLOW : KIMs", 400, 200); // 문자열 draw
				startAngle += kim_arc; 
				//다음 파트가 KIM 그래프 다음에서 시작하도록 startAngle 설정
				
				g.setColor(Color.red); //LEEs
				g.fillArc(x, y, r, r, startAngle, lee_arc);// arch를 색칠
				g.drawString("RED : LEEs", 400, 210); // 문자열 draw
				startAngle += lee_arc;
				
				g.setColor(Color.blue); // PARKs
				g.fillArc(x, y, r, r, startAngle, park_arc); // arch를 색칠
				g.drawString("BLUE : PARKs", 400, 220);  // 문자열 draw
				startAngle += park_arc;
				
				g.setColor(Color.green); // Etc.
				g.fillArc(x, y, r, r, startAngle, 360-startAngle); // arch를 색칠
				g.drawString("GREEN : Etc", 400, 230);  //문자열 draw
			// ---------------- ---------- -------------
		}
			
			
			try {
				
		} catch(NumberFormatException notInt) { //입력값이 숫자가 아닌경우
			g.setColor(Color.black);
			g.drawString("Input numbers of student names", 400, 230);  //오류메시지 문자열 draw
		} //catch(IOException e) { //음수 입력한 경우
			//g.setColor(Color.black);
			//g.drawString("Input numbers of student names", 400, 230);  //오류메시지 문자열 draw
		//} 
		catch(Exception sumIsWrong) { //합이 100 이상인 경우
			g.setColor(Color.black);
			g.drawString("Number of students is 100", 400, 230);  //문자열 draw
		}
		}
		
	}
		public void actionPerformed(ActionEvent e) {
		// 버튼 누르면NumberFormatException 
			// 각 텍스트필드에서 입력받은 인원수 가져온다.
			
			try {
				kim = Integer.parseInt(KIM_field.getText());
				lee = Integer.parseInt(LEE_field.getText());
				park = Integer.parseInt(PARK_field.getText());
				etc = Integer.parseInt(ETC_field.getText());
				// 입력값 숫자가 아닌 경우 - NumberFormatException으로 자동으로 catch됨

				//total에 김,이,박씨 성을 가진 학생 수 저장
				total = kim+lee+park;
				
				if((kor_grade>100 || kor_grade<0) || (eng_grade>100 || eng_grade<0) || (math_grade>100 || math_grade<0)) 
					//세 과목 중 하나라도 0~100 밖의 수를 입력한 경우
					throw new Exception(); //오브젝트 Exception 생성
				if (total>100) { // 학생 수 합이 100명 이상인 경우
					
				}
				
				
				// 인원수를 원그래프 내의 비율로 환산해서 저장
				kim_arc = (int)(kim/100*360);
				lee_arc = (int)(lee/100*360);
				park_arc = (int)(park/100*360);
				etc_arc = (int)((100-total)/100*360); // etc는 자동으로 계산
				
				
				else {
					isRight = 1; //유효한 값임을 설정하고,
					repaint(); //정상범위이면 각 점수를 사각형의 높이로 하여 repaint()
				}
			
			} catch(Exception w) {
				isRight = 2; //값이 유효하지 않다고 설정
				kor_grade = 0;
				eng_grade = 0;
				math_grade = 0; // 사각형이 그려지지 않도록 세 과목 점수 0으로 저장하였다.
				repaint();
			} 
			
			
			
			kim = Integer.parseInt(KIM_field.getText());
			lee = Integer.parseInt(LEE_field.getText());
			park = Integer.parseInt(PARK_field.getText());
			etc = Integer.parseInt(ETC_field.getText());
			// 입력값 숫자가 아닌 경우 - NumberFormatException으로 자동으로 catch됨

			//total에 김,이,박씨 성을 가진 학생 수 저장
			total = kim+lee+park;
			
			// 인원수를 원그래프 내의 비율로 환산해서 저장
			kim_arc = (int)(kim/100*360);
			lee_arc = (int)(lee/100*360);
			park_arc = (int)(park/100*360);
			etc_arc = (int)((100-total)/100*360); // etc는 자동으로 계산
			
			if((kim+lee+park)>100) {
					//세 값의 합이 100 밖의 수를 입력한 경우
					//isRight = false; //값이 유효하지 않다고 설정
					//message
				//throw new Exception(); //오브젝트 Exception을 에러메시지를 리턴하도록 생성
			}
			if( kim<0 || lee<0 || park<0 ) 
					//입력값이 숫자 형태가 아니거나 음수인 경우
				//throw new NumberFormatException(); //오브젝트 Exception을 에러메시지를 리턴하도록 생성
			else {
				isRight = true; // 값이 유효하다고 설정
				repaint(); //정상범위이면 각 값에 맞게 원그래프를 repaint()
			}
			
			 
			}
		}



public class HW2_5_김윤서ver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
	    
		MyChart m = new MyChart();
	}

}
