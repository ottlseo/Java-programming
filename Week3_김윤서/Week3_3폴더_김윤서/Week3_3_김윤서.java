import java.util.Scanner;

public class Week3_3_김윤서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String title; //제목을 저장할 String 타입의 title 변수
		int page; //페이지수를 저장할 int 타입의 page 변수
		
		Scanner kbd = new Scanner(System.in);
		MyFile fOld = new MyFile(); //old file 객체 생성
		MyFile fNew = new MyFile(); //new file 객체 생성
				
	    System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
		
	    System.out.println("--File 정보 입력 (제목,페이지수)--");
	    fOld.setTitle(kbd.nextLine());
	    fOld.setPage(kbd.nextInt());
	    fOld.fileCopy(fNew);
	    System.out.println("<원래 File>");
	    fOld.fileInfo(); //파일 정보 출력
	    System.out.println("<복사된 File>");
	    fNew.fileInfo(); //복사된 파일 정보 출력
	    	    
	    
	}

}
