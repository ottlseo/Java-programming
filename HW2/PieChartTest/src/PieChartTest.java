import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*; //NumberFormatException 

class MyChart extends JFrame {
	public static final int x = 100;
	public static final int y = 50;
	public static final int r = 120; // pie chart 의 반지름 
	
	int kims, lees, parks, etc;
	int kim_arc = 0, lee_arc = 0, park_arc = 0, etc_arc = 0; // 각 성씨의 비율을 저장할 정수형변수 선언
	int total = 0;  // 학생 수 총합
	
	int isRight = 1; // 입력값이 올바른지에 대한 int값- 예외처리에서 사용된다
	// isRight = 1; 정상 
	// isRight = 2; 학생수 합이 100 이상일 때 
	// isRight = 3; 숫자가 아니거나 음수일 때
	
	JPanel piechart, buttonPanel; //piechart을 얹을 패널 piechart/ buttonPanel
	JLabel KIM, LEE, PARK, ETC; //KIM, LEE, PARK, ETC 글씨 label (입력 칸 옆)
	JButton button; // 버튼 선언
	JTextField KIM_field, LEE_field, PARK_field, ETC_field; // 각 성씨별 인원수를 입력받을 텍스트 필드 생성
	
	public MyChart(){ //생성자
		
		Toolkit tk = getToolkit(); // Toolkit을 불러오는 tk 설정 
		Dimension d = tk.getScreenSize(); // 화면의 크기를 불러와 d에 저장
		int screenHeight = d.height; // 화면의 높이인 screenHeight 생성
		int screenWidth = d.width; // 화면의 너비인 screenWidth 생성
		setLocation(screenWidth/2 - this.getWidth()/2, screenHeight/2 - this.getHeight()/2);
		// 창이 화면의 중앙에 오도록 설정	
		
		
		setSize(400, 300); // 프레임의 사이즈 선언
		setTitle("Pie Chart of Student names -김윤서"); // 프레임 이름 선언
		setDefaultCloseOperation(EXIT_ON_CLOSE); // x를 누르면 프로그램이 종료되도록 한다
		
		piechart = new GraphPanel(); //piechart을 얹을 패널	
		buttonPanel = new JPanel(); //label, textfield, button을 얹을 패널
		// 각 라벨 생성
		KIM = new JLabel ("KIM"); //KIM 글씨 label (입력 칸 옆)
		LEE = new JLabel ("LEE");//LEE 글씨 label (입력 칸 옆)
		PARK = new JLabel ("PARK");//PARK 글씨 label (입력 칸 옆)
		ETC = new JLabel ("ETC"); //ETC 글씨 label (입력 칸 옆)
		
		KIM_field = new JTextField(3);
		LEE_field = new JTextField(3);
		PARK_field = new JTextField(3);
		ETC_field = new JTextField(3);
		// 각 성씨별 인원수를 입력받을 텍스트 필드 생성
		
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		//버튼패널의 레이아웃 FlowLayout 으로 설정
		button = new JButton("Graph");
		button.addActionListener(new MyListener()); //버튼에 ActionListener()를 붙여줌
		
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
		add(buttonPanel, BorderLayout.PAGE_END);
		
		setVisible(true);
	}
	
	class GraphPanel extends JPanel {
		
		public void paint(Graphics g) {
			// 1) fillArch()
			// 2) drawString()
			// 3) 오류메시지
			
			if(isRight == 1) { //  유효한 값일 경우
				ETC_field.setText(Integer.toString(100-total)); // etc값을 텍스트필드에 출력하고
				
				g.setColor(Color.YELLOW); // YELLOW : KIMs
				g.fillArc(x, y, r, r, 0, kim_arc); //KIM 부분 그래프 생성 - Arch 색칠
				g.drawString("YELLOW : KIMs", 400, 200);

				g.setColor(Color.RED);
				g.fillArc(x, y, r, r, kim_arc, lee_arc); //LEE 부분 그래프 생성 - Arch 색칠
				g.drawString("RED : LEEs", 400, 210); //RED : LEEs

				g.setColor(Color.BLUE); 
				g.fillArc(x, y, r, r, kim_arc+lee_arc, park_arc); //PARK 부분 그래프 생성 - Arch 색칠
				g.drawString("BLUE : PARKs", 400, 220); // BLUE : PARKs
				
				g.setColor(Color.GREEN); // GREEN : Etc
				g.drawString("GREEN : Etc", 400, 230); // 문자열을 그림
				g.fillArc(x, y, r, r, kim_arc+lee_arc+park_arc, 360-(kim_arc+lee_arc+park_arc)); // etc의 비율만큼 부채꼴을 설정한다(원의 나머지 부분)
			}
			else if (isRight == 2) { // 학생수 총합이 100명 이상인 경우 
				g.setColor(Color.BLACK); // 검정색으로 설정
				g.drawString("Number of Student is 100.", 200, 250); // 해당 문자열을 그린다
				
			}
			else { // 음수가 입력되거나 올바른 값이 아닐때
				g.setColor(Color.BLACK); // 검정색으로 설정
				g.drawString("Input numbers of student names", 200, 250); // 해당 문자열을 그린다
			}
		}
	}
	
	class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) { // 버튼이 눌리면
				// 버튼 누르면 
				// 각 텍스트필드에서 입력받은 인원수 가져온다.
				
				try {
					// 각 성씨별
					kims = Integer.parseInt(KIM_field.getText());
					lees = Integer.parseInt(LEE_field.getText()); 
					parks = Integer.parseInt(PARK_field.getText());
					total = kims+lees+parks; //총 학생수 계산
					
					//각 성씨를 가진 학생수의 비율을 계산해 정수형변수에 저장한다
					kim_arc = (int)(kims*3.6);
					lee_arc = (int)(lees*3.6);
					park_arc = (int)(parks*3.6);
					etc_arc = (int)((100 -total)*3.6); // etc의 비율은 자동으로 계산
					
					if(total >100) //학생수 총합이 100 이상인 경우 예외처리 - Exception으로 throw
						throw new Exception();
					
					else if((kims>100 || kims<0) || (lees>100 || lees<0) || (parks>100 || parks<0)) {
						// kim, lee, park 중에 하나라도 0~100 사이 값이 아닌경우
						throw new NumberFormatException(); //NumberFormatException 으로 throw
					}
					
					else { //유효한 값일 때
						isRight = 1; //유효한 값이라고 설정
						repaint();
					}
				} catch(NumberFormatException notNum) {
					isRight = 3; //음수이거나, 숫자가 아닌경우
					kim_arc =0;
					lee_arc =0;
					park_arc =0;
					etc_arc =0; //그려지지 않도록 모두 0으로 설정
					repaint();
				} catch(Exception oversum) { //100명 이상
					isRight = 2; //
					kim_arc =0;
					lee_arc =0;
					park_arc =0;
					etc_arc =0; //그려지지 않도록
					repaint();
				} 
				
				
				
				}
			}
		}
	
	
}



public class PieChartTest {

	public static void main(String[] args) {
		System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
	    
		MyChart m = new MyChart();
	}

}
