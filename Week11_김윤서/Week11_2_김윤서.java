import java.awt.*;
import javax.swing.*;

class MyFrame2 extends JFrame {
	
	public MyFrame2() {
		setSize(350,200); // 크기 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X 눌렀을 때 프로그램 종료되는 코드
		setTitle("Student Information"); // title 설정
		
		JPanel p1 = new JPanel();
		JPanel choose_gender = new JPanel();
		JPanel p2 = new JPanel(); // 패널 3개
		
		JLabel title = new JLabel("STUDENT INFORMATION"); // title 입력
		title.setHorizontalAlignment(JTextField.CENTER); // 가운데 정렬
		
		JLabel name = new JLabel("NAME"); // 이름
		JTextField inputName = new JTextField(); //이름 입력칸
		
		JLabel gender = new JLabel("GENDER"); // 성별 -RadioButton으로 선택하도록
		JRadioButton r1 = new JRadioButton("Male");
		JRadioButton r2 = new JRadioButton("Female", true); // radioButton 2개 생성
		ButtonGroup bg = new ButtonGroup(); // 그룹화- 버튼 하나만 선택할 수 있도록 함
		bg.add(r1); // r1을 ButtonGroup에 추가
		bg.add(r2); // r2을 ButtonGroup에 추가
		
		
		JLabel id = new JLabel("ID"); // ID
		JTextField inputId = new JTextField(); //ID 입력칸
		
		JLabel department = new JLabel("DEPARTMENT");  // DEPARTMENT
		JTextField inputDepartment = new JTextField(); //DEPARTMENT 입력칸
		
		add(title, BorderLayout.NORTH); // title 배치(north)
		
		
		p1.setLayout(new GridLayout(4,2)); // rows=4, columns=2
		//패널1에 NAME, GENDER, ID, DEPARTMENT 추가
		p1.add(name); 
		p1.add(inputName); //이름
		p1.add(gender); //성별
		p1.add(choose_gender); //choose_gender패널 추가 - 내용은 아래에
		p1.add(id);
		p1.add(inputId); //ID
		p1.add(department);
		p1.add(inputDepartment); // Department
		
		choose_gender.add(r1); 
		choose_gender.add(r2); // choose_gender에 radiobutton 넣기
	
		JButton save = new JButton("Save"); //save버튼
		JButton cancel = new JButton("Cancel"); // cancel버튼
		
		add(p1); // p1을 배치
		
		p2.add(save);
		p2.add(cancel); // p2에 버튼 넣기
		add(p2, BorderLayout.SOUTH); // p2 배치 (south)
		
		setVisible(true); 
		
	}
}
public class Week11_2_김윤서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
	    
	    MyFrame2 m2 = new MyFrame2();
	    
	}

}
