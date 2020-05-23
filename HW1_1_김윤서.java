import java.util.Scanner;

public class HW1_1_김윤서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("==========");
	    System.out.println("Major: 사이버보안");
	    System.out.println("ID: 1971063");
	    System.out.println("Name: 김윤서");
	    System.out.println("==========");
	    
	    int hour, min;
	    Time t1 = new Time();
	    
	    System.out.println("Hour:");
	    hour=Integer.parseInt(kbd.nextLine()); //nextLine()으로 받은 뒤 int로 변환해준다
	    System.out.println("Minute:");
	    min=Integer.parseInt(kbd.nextLine()); //nextLine()으로 받은 뒤 int로 변환
	    
	    t1.setTime(hour, min); //hour와 min Time클래스에 저장 
	    
	    if(t1.getValid(t1)) {
	    	System.out.println(t1.getTime('h')+":"+t1.getTime('m'));
	    	
	    }
	    else {
	    	System.out.println("Wrong Input");
	    	System.out.println("0:0");
	    	
	    }
	    
	}

}
