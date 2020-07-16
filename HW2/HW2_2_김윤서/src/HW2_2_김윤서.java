import java.util.*;

public class HW2_2_김윤서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
	    
	    Scanner kbd = new Scanner(System.in); //표준입력
	    String input, result;
	    	// 괄호 문자열 입력받을 변수 input
	    	// Correct/Incorrect 값 저장할 변수 result
	    
	    while(true) { // 무한 반복. 단 input==0이면 종료.
	    	LinkedList <Character> myStack = new LinkedList<Character>(); //문자 종류에 따라 push()-pop()
		    result = "Correct"; // result기본값은 Correct
		    
		    System.out.println("Input:"); //입력받기
		    input = kbd.nextLine();
		    
		    if (input.equalsIgnoreCase("0")) { //입력이 0이면
		    	System.out.println("Program finished"); //프로그램 종료 출력하고
		    	System.exit(0); //프로그램 종료시킨다
		    }
		    
		    int length = input.length(); //length=문자열 길이 ==문자배열의 크기 
		    char Arr[] = new char[100]; //문자배열 정의
		    Arr = input.toCharArray(); // 문자열 input을 문자 배열Arr로 변환
		    
		    for (int i=0; i<length; i++) {
		    	char check = Arr[i]; //Arr문자배열에서 순서대로 확인할 값
		    	char stacksPop; //stack에서 꺼내올 값
		    	
		    	// Arr[i]가 (,{,[ 인 경우 -Stack에 push
		    	if ( check =='[' || check =='(' || check =='{') {
		    		myStack.addLast(check); //myStack에 check1을 push()
		    	}
		    	
		    	//Arr[i]가 ],},) 인 경우 -Stack에서 Pop한 값과 비교해서 correct 여부 정하기
		    	else if (check ==']' || check ==')' || check =='}') {
		    		if(!myStack.isEmpty()) { //stack이 비어있지 않다면
		    			stacksPop = myStack.removeLast(); //가장 위의 값을 pop
		    			
		    			switch(check) { //3개 중에서 각각의 경우를 switch문으로 제어
		    	    	case ']': //check가 ']'인 경우
		    	    		if (stacksPop != '[') { //쌍이 맞지 않으면
		    	    			result = "Incorrect"; //incorrect
		    	    			break;
		    	    		}
		    	    		else
		    	    			break; // 쌍이 맞은 경우는 그냥 break로 빠져나간다.
		    	    	case '}': //check가 '}'인 경우
		    	    		if (stacksPop != '{') {//쌍이 맞지 않으면 
		    	    			result = "Incorrect"; //incorrect
		    	    			break;
		    	    		}
		    	    		else
		    	    			break;
		    	    	case ')': //check가 ')'인 경우
		    	    		if (stacksPop != '(') { //쌍이 맞지 않으면 
		    	    			result = "Incorrect"; //incorrect
		    	    			break; 
		    	    		}
		    	    		else
		    	    			break;
		    	    		// 쌍이 맞은 경우는 그냥 break로 빠져나간다.
		    	    	}
		    		}
		    	}
		    	else { //check가 이 6개 외 문자일 경우
		    		 System.out.println("Wrong Input"); // “Wrong Input”이라고 출력하고
		    		 result=""; //Correct가 출력되지 않도록 빈칸으로 처리해준다.
		    }
		    	
	    }	    

		    if (!myStack.isEmpty()) //과정이 모두 끝난 후에도 stack이 비어있지 않으면
		    	result = "Incorrect"; // Incorrect
		    
		    System.out.println(result);
	}
}}
