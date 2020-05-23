import java.util.*;
public class Week10_2_김윤서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
	    
	    String ID, name;
	    String maxID, minID;
	    String maxName, minName;
	    int maxLength, minLength, nowLength;
	    
	    Map <String, String> student = new HashMap<String, String> ();
	    // Map 인터페이스로 HashMap 클래스의 객체를 만듦
	    
	    System.out.println("학생의 ID와 이름을 차례로 입력하세요. (종료시 0 0 입력)");
	    ID = kbd.next();
	    name = kbd.next();
	    student.put(ID, name); //저장
	    
	    Set s = student.keySet(); // key 값의 set를 만듦
	    Iterator <String> it = s.iterator();
	    
	    maxID = ID; // ID를 maxID초기값으로 지정
	    maxName = student.get(maxID);
	    maxLength = maxName.length();
	    // 이key에 대한 value를 get()으로 가져옴-> name
	    // 이 name값의 길이를 maxLength의 초기값으로 지정
	    
	    minID = ID; // ID를 minID초기값으로 지정
	    minName = student.get(minID);
	    minLength = minName.length();
	    // maxLength의 초기값 정한 것과 같은 방식으로 minLength의 초기값을 지정
	    
	
	    while(true) { // 무한반복으로 입력 받음, if문 이용하여 0 0 입력하면 입력을 멈추도록
	    	ID = kbd.next();
		    name = kbd.next();
		    
		    if (ID.equalsIgnoreCase("0") && name.equalsIgnoreCase("0")) {
		    	// 0 0 입력시
		    	break; //반복문을 빠져나간다.
		    }
		    
		    student.put(ID, name); //저장
		    
		    nowLength = name.length();
		    // nowID에 대한 value를 get()으로 가져옴-> nowName
		    // 현재 이름의 길이를 nowLength에 저장
		    if (nowLength > maxLength) { // nowLength 값이 max 보다 크면
		    	maxLength = nowLength; // update
		    	maxID = ID;
		    	maxName = name;
		    }
		    if (nowLength < minLength) { // nowLength 값이 min 보다 작으면
		    	minLength = nowLength; // update
		    	minID = ID;
		    	minName = name;
		    }
	    }
	    // 입력 end
	    Set stu = student.keySet(); // 처음부터 key값을 읽어오기 위한 set를 새로 만듦
	    Iterator <String> it2 = stu.iterator();
	    
	    System.out.println("<학생 명단>");
	    System.out.println("[ID]	[NAME]");
	    while (it2.hasNext()) { // 더이상 stu에 남아있는 게 없을 때까지
	    	String str = it2.next();
	    	System.out.println(str+"	"+student.get(str));
		    // ID와 이름 출력
	    }
	    //학생 명단 출력 end
	    
	    System.out.println("전체 학생수: "+s.size()); //key값의 Set인 s의 크기가 전체 학생 수
	    System.out.println("<가장 긴 이름을 가진 학생>");
	    System.out.println("ID:"+maxID+"  Name:"+maxName+"  길이:"+maxLength);
	    System.out.println("<가장 짧은 이름을 가진 학생>");
	    System.out.println("ID:"+minID+"  Name:"+minName+"  길이:"+minLength);
	}

}
