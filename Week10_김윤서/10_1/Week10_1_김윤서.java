import java.util.*;

public class Week10_1_김윤서 {
	static Scanner kbd = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
	    
		List <Student> stu = new ArrayList <Student> ();
		// 다형성 이용해서 List 참조변수로  ArrayList 를 만듦
		// 인자는  Student 클래스만 가능함
		
		System.out.println("Input Student Name, ID, and age. 0 for name to quit.");
		while(true) { // "0" 입력할 때까지 계속 반복
			String name = kbd.next();
			if (name.equalsIgnoreCase("0")) { //0이 입력되면
				break; //반복문을 빠져나간다.
			}
			String ID = kbd.next();
			int age = Integer.parseInt(kbd.next());
			
			Student s = new Student(name, ID, age);
			stu.add(s); // add(Object o) 호출
		}
		// 초기 정보 입력 완료
		printResult(stu); //입력이 끝나면 리스트 보여준다.
		
		while (true) { // 무한 반복, 단 answer==4 일 시엔 if문 이용해서 종료.
			System.out.println("");
			System.out.println("Choose the operation you want.");
			System.out.println("1.add information  2.delete information  3.show list  4.Finish program");
			int answer = Integer.parseInt(kbd.next()); //원하는 operation 입력받을 변수
		
			if (answer == 1) { //1.add information
				addStudent(stu); // stu 리스트에 add 하는 메서드 
			}
			if (answer == 2) { //2.delete information
				deleteStudent(stu); // stu 리스트에서 delete 하는 메서드
			}
			if (answer == 3) { //3.show list
				printResult(stu); // stu 리스트 보여주는 메서드
			}
		
			if (answer == 4) { //4.Finish program
				System.out.println("Finish program.");
				System.exit(0); // 4 입력 시 시스템 종료.
			}
			if (answer <1 || answer >4) { //1~4 사이의 값이 아닌 경우 
				System.out.println("Wrong input."); //틀린 값이라고 알려주고 다시 입력받는다
			}
		}
		
		
		
	}
	
	public static void addStudent(List <Student> stu) {//1.add info 선택 시
		System.out.println("Input new Student Name, ID, and age, and the location.");
		
		String name = kbd.next();
		String ID = kbd.next();
		int age = Integer.parseInt(kbd.next());
		int index = Integer.parseInt(kbd.next()); //추가할 위치
		Student s = new Student(name, ID, age);
		stu.add(index-1, s); // add(int index, Object o) 호출
		
		printResult(stu); //입력이 끝나면 리스트 보여준다.
		}
	
	public static void deleteStudent(List <Student> stu) { //2.delete info 선택 시
		System.out.println("Input Student Number to delete.");
		int delete = Integer.parseInt(kbd.next()); //변수 delete에 지울 학생의 번호 입력받는다.
		stu.remove(delete-1); //인덱스는 0부터 시작하므로 (delete-1)번째를 remove()
		
		printResult(stu); //삭제가 끝나면 리스트 보여준다.
	}
	
	public static void printResult(List <Student> stu) { //3.show list 선택 시 + add,delete 하고 난 뒤에도 호출
		System.out.println("NUMBER	NAME	ID	AGE");
		for (int i=0; i < stu.size(); i++) { //for loop 이용 i는 0부터 stu의 사이즈까지
			System.out.println(i+1 +"	"+ stu.get(i)); //NUMBER=i, 나머지 정보는 get() 이용해서 출력
		}
		
	}
	
}
