import java.io.*;
import java.util.*;

public class HW2_1_김윤서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
	    
	    System.out.println("Input the filename to read.");
	    String fileToRead = kbd.nextLine(); // "animal.txt"를 입력받음
	    System.out.println("Input the filename to write.");
	    String fileToWrite = kbd.nextLine(); // 새로운 파일 생성
	    
	    //-------------------- inputStream 설정
	    Scanner inputStream = null; //input stream 생성 (파일 읽어오기 위해)
	    try {
	    	inputStream = new Scanner(new File(fileToRead));
	    } catch(FileNotFoundException e) { //찾는 파일이 없는경우 예외처리
	    	System.out.println("File "+fileToRead+"cannot be Found.");
	    	System.exit(1); // 에러 나면 종료
	    } //-------------------- input stream 설정 끝
	    
	    
	    // ------------output stream 설정
	    PrintWriter outputStream = null; // output stream 생성 (파일 쓰기 위해)
	    try {
	    	outputStream = new PrintWriter(new File(fileToWrite));
	    } catch(IOException e) { // IOException 예외 처리
	    	System.out.println("Error in generating "+fileToWrite);
	    	System.exit(1); // 에러 나면 종료
	    } 
	 //-------------------- output stream 설정 끝
	    
	    while(inputStream.hasNextLine()) { //읽어올 다음 줄이 있으면
	    	String line = inputStream.nextLine(); //변수 line에 읽어온 내용을 저장 (줄 단위)
	    	
	    	StringTokenizer tokenizer = new StringTokenizer(line,"\n, ");
	    	// StringTokenizer 오브젝트 생성하여, 각 줄(line)에서 분리자대로 각 단어를 분리할 수 있게함
	    	
	    	while (tokenizer.hasMoreTokens()) { // tokenizer가 더 가져올 값이 있는 동안 반복
	    		String eachword = tokenizer.nextToken(); // eachword 변수에 각 단어들을 저장
	    		
	    		if(eachword.length() >= 4) { //각 단어의 길이가 4글자 이상이면 새 파일에 쓰기
	    			outputStream.println(eachword);
	    		}
	    	}
	    }
	    inputStream.close();
	    outputStream.close();
	}

}
