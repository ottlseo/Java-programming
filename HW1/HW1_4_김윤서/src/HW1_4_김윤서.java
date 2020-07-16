import java.util.Scanner;

public class HW1_4_김윤서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("==========");
	    System.out.println("Major: 사이버보안");
	    System.out.println("ID: 1971063");
	    System.out.println("Name: 김윤서");
	    System.out.println("==========");
	    
	    int howmany; //학생수
	    int sum_kor=0, sum_math=0, sum_eng=0;
	    double avg_kor, avg_math, avg_eng;
	    
	    System.out.println("How many students are there?");
	    howmany=Integer.parseInt(kbd.nextLine()); //nextLine()으로 받은 뒤 int로 변환해준다
	    StudentScore std[] = new StudentScore[howmany];
	    //StudentScore 클래스의 객체배열 생성- 학생수(howmany) 만큼 배열 길이 지정

	    
	    System.out.println("Input the information.");
	    for (int i=0; i<std.length; i++) { //i는 0부터 std배열의 길이만큼 입력을 반복
	    	
	    	System.out.println("NAME:");
	    	String name = kbd.nextLine();
	    	System.out.println("ID:");
	    	String id = kbd.nextLine();
	    	System.out.println("KOREAN:");
	    	int korean = Integer.parseInt(kbd.nextLine()); //nextLine()으로 받은 뒤 int로 변환해준다
	    	System.out.println("MATH:");
	    	int math = Integer.parseInt(kbd.nextLine()); //nextLine()으로 받은 뒤 int로 변환해준다
	    	System.out.println("ENGLISH:");
	    	int english = Integer.parseInt(kbd.nextLine()); //nextLine()으로 받은 뒤 int로 변환해준다
	    	System.out.println("");
	    	
	    	
	    	std[i] = new StudentScore(id,name,korean,math,english);
	    	//std의 i번째 멤버에 정보 저장, 생성자 이용
	    }
	    
	    System.out.println("NAME	ID	KOREAN	MATH	ENGLISH	SUM	AVG");
	    for (int i=0; i<std.length; i++) {
	    	std[i].display(); //StudentScore클래스의 display() 메서드 호출
	    	
	    	sum_kor+=std[i].getKorean(); //모든 학생의 국어 성적을 더해서 sum_kor에 저장
	    	sum_math+=std[i].getMath(); //모든 학생의 수학 성적을 더해서 sum_math에 저장
	    	sum_eng+=std[i].getEnglish(); //모든 학생의 영어 성적을 더해서 sum_eng에 저장
	    }
	
	    avg_kor=sum_kor/howmany; //국어 평균
	    avg_math=sum_math/howmany; //수학 평균
	    avg_eng=sum_eng/howmany; //영어 평균
	    
	    System.out.println("Subject Avg	"+avg_kor+"	"+avg_math+"	"+avg_eng);
	    
	    System.out.println("<Students over the average>");
	    System.out.println("Korean:");
	    for(int i=0; i<std.length; i++) { //평균보다 높은 학생을 골라내기 위해 for문으로 확인
	    	if(std[i].getKorean()>avg_kor) //i번째 학생의 국어 점수가 국어 평균보다 높으면
	    		System.out.print(std[i].getName()+"	"); //이름 출력
	    }
	    System.out.println("");
	    System.out.println("Math:");
	    for(int i=0; i<std.length; i++) {
	    	if(std[i].getMath()>avg_math)//i번째 학생의 수학 점수가 수학 평균보다 높으면
	    		System.out.print(std[i].getName()+"	");//이름 출력
	  
	    }
	    System.out.println("");
	    System.out.println("English:");
	    for(int i=0; i<std.length; i++) {
	    	if(std[i].getEnglish()>avg_eng)//i번째 학생의 영어 점수가 영어 평균보다 높으면
	    		System.out.print(std[i].getName()+"	");//이름 출력
	    }
	}

}
