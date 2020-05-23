import java.util.Scanner;

public class Week4_3_김윤서 {

	public static void main(String[] args) {
		
		int a=5, b=10;
		double da=3.4, db=5.2;
		char ca='a', cb='b';
		int iarr[]= {1,2,3};
		double darr[]= {1.1,2.2,3.3};
		char carr[]= {'a','p','p','l','e'};
		
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
	    
	    
	    System.out.println("a+b="+sum(a,b)); //int+int
	    System.out.println("da+b="+sum(da,b)); //double+int
	    System.out.println("a+db="+sum(a,db)); //int+double
	    System.out.println("da+db="+sum(da,db)); //double+double
	    System.out.println("ca+cb="+sum(ca,cb)); //char+char=String+char로 변환해서 계산하겠음
	    System.out.println("sum of Int_Arr="+sum(iarr)); //int배열
	    System.out.println("sum of Double_Arr="+sum(darr)); //double배열
	    System.out.println("sum of Char_Arr="+sum(carr)); //char배열
	} //End of main

	//sum() 오버로딩 메서드 정의
	//클래스 메서드로 정의하기 위해 static 붙여줌
	static int sum(int x, int y) { return x+y;	} //int+int
	static double sum(double x, int y) { return x+y; }//double+int
	static double sum(int x, double y) { return x+y; }//int+double
	static double sum(double x, double y) { return x+y; } //double+double
	
	static String sum(char x, char y) { //char+char 를 (String)+(char)로 변환해서 계산
		String str1=Character.toString(x); //char형인 x를 Character.toString(x);를 이용해 String타입의 str1로 바꾸어준다.
		return str1+y;
		}
	
	static int sum(int []arr) { //int배열
		int result=0;
		for (int i=0; i<arr.length;i++) { //i=0부터 arr배열의 길이만큼 반복하는 for문
			result+=arr[i];
		}
		return result; //모두 더해준 result값을 리턴
	}
	static double sum(double []arr) {
		double result=0;
		for (int i=0; i<arr.length;i++) {
			result+=arr[i];
		}
		return result;//모두 더해준 result값을 리턴
	}
	static String sum(char []arr) {
		String result="";
		String str1=Character.toString(arr[0]); //배열요소 중 하나만 String으로 변환해도, 반환값으로 문자열이 나오게 할 수 있음
		result+=str1; //str1 먼저 result값에 더해줌
		for (int i=1; i<arr.length;i++) { //arr[0]은 str1으로 바꾸어 이미 더했으므로, i=1부터 시작
			result+=arr[i];
		}
		return result;//모두 더해준 result값을 리턴
	} 
	
}
