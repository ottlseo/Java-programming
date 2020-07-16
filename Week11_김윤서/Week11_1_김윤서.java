import java.util.*;
import java.awt.*;
import javax.swing.*;


class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("Calculator"); // MyFrame의 이름
		setSize(300,200); // 크기 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X 눌렀을 때 프로그램 종료되는 코드
		
		JPanel panel = new JPanel(); // 패널
		JTextField tf = new JTextField(); // textfield
		tf.setHorizontalAlignment(JTextField.RIGHT); // textfield 데이터 오른쪽정렬
		add(tf, BorderLayout.PAGE_START);
		
		panel.setLayout(new GridLayout(5,4,4,0)); // rows=5, columns=4
		makeButton(panel, "ON");
		makeButton(panel, "AC");
		makeButton(panel, "C");
		makeButton(panel,"OFF");
		makeButton(panel, "7");
		makeButton(panel, "8"); 
		makeButton(panel, "9"); 
		makeButton(panel, "/"); 
		makeButton(panel, "4"); 
		makeButton(panel, "5");
		makeButton(panel, "6");
		makeButton(panel, "X");
		makeButton(panel, "1"); 
		makeButton(panel, "2"); 
		makeButton(panel, "3"); 
		makeButton(panel, "-"); 
		makeButton(panel, "0");
		makeButton(panel, ".");
		makeButton(panel, "="); 
		makeButton(panel, "+");
		// 패널에 입력
		
		add(panel, BorderLayout.CENTER); // center에 패널 추가
		setVisible(true); // 보이게
	}
	
	public void makeButton(JPanel panel, String text) {
		JButton button = new JButton(text); // 버튼 생성
		button.setAlignmentX(CENTER_ALIGNMENT);
		panel.add(button); // 버튼을 패널에 추가
	}
}
public class Week11_1_김윤서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
	    
	    MyFrame m = new MyFrame();
	    
	}

}
