import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CatchMe extends JFrame {
	JButton b = new JButton("Click!"); // 버튼 생성
	
	public CatchMe() {
		setTitle("나 잡아봐~라! -김윤서"); // Frame의 제목 설정
		setSize(300,300); // frame 크기 설정
		setResizable(false); // frame 크기 변경 못하도록
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X버튼 누르면 프로그램 종료
		JPanel p =  new JPanel(); // 패널 p 생성

		p.add(b); // 패널에 버튼 b 추가
		this.add(p); // Frame(this)에 패널 p 추가
		b.addMouseListener(new MouseListener()); // 마우스로 버튼 잡을 때
		add(p, BorderLayout.CENTER); // 패널을 가운데로 배치
		setVisible(true);
	}
	
	class MouseListener extends MouseAdapter{
			public void mouseEntered(MouseEvent e){
				int x = (int)(Math.random()*300); // x 범위
				int y = (int)(Math.random()*300); // y 범위
				b.setLocation((int)(Math.random()*100),(int)(Math.random()*100));
				System.out.println("x = " + x + " y = " + y); // button 위치 출력
				}

	
			public void mouseClicked(MouseEvent e) { // 잡히면
				System.out.println("윽,,, 잡혔다ㅠㅠ");
			}
		}	
}

public class Week12_1_김윤서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
	    
		CatchMe c = new CatchMe();
	}

}
