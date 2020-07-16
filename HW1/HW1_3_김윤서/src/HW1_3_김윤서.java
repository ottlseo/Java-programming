import java.util.Scanner;

public class HW1_3_김윤서 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("==========");
	    System.out.println("Major: 사이버보안");
	    System.out.println("ID: 1971063");
	    System.out.println("Name: 김윤서");
	    System.out.println("==========");
	    
	    
	    String answer="y"; //while문 실행하기 위해 초기값 "y"로 지정
	    
	    while(answer.equalsIgnoreCase("y")) { //사용자 입력이 'y'인 동안 반복
		    System.out.println("Input a word");
		    String input = kbd.next(); //input에 사용자가 입력한 문자열 저장
		    char Arr[] = new char[100];
		    Arr = input.toCharArray(); //스트링을 문자배열로 변환
		   
		    if(check(Arr)) //check 메서드 호출 - 값이 true이면
		    	System.out.println("Symmetry");
		    else
		    	System.out.println("Asymmetry");
		    
		    System.out.println("Try again? (y/n)");
	    	answer=kbd.next();
	    }
	  }
	    
	 public static boolean check(char[]Arr) {
		 
		int len=Arr.length; //문자배열의 원소의 개수=스트링의 길이 :변수 len에 저장
		for (int i=0; i<(len/2); i++) // len을 2로 나눈 몫까지 i의 범위를 지정 (len이 int형이므로 자동으로 몫이 됨)

			if(Arr[i]!=Arr[len-1-i]) //문자열에서 대칭관계에 있는 두 문자가 같지 않으면,
				return false; // false를 리턴하고 반복문을 빠져나간다.
		
		return true; //모두 같으면 true를 리턴한다.
		
		    		 
	 }   
	    
	}

