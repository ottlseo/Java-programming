import java.util.Scanner;

public class Week4_3_������ {

	public static void main(String[] args) {
		
		int a=5, b=10;
		double da=3.4, db=5.2;
		char ca='a', cb='b';
		int iarr[]= {1,2,3};
		double darr[]= {1.1,2.2,3.3};
		char carr[]= {'a','p','p','l','e'};
		
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
	    
	    
	    System.out.println("a+b="+sum(a,b)); //int+int
	    System.out.println("da+b="+sum(da,b)); //double+int
	    System.out.println("a+db="+sum(a,db)); //int+double
	    System.out.println("da+db="+sum(da,db)); //double+double
	    System.out.println("ca+cb="+sum(ca,cb)); //char+char=String+char�� ��ȯ�ؼ� ����ϰ���
	    System.out.println("sum of Int_Arr="+sum(iarr)); //int�迭
	    System.out.println("sum of Double_Arr="+sum(darr)); //double�迭
	    System.out.println("sum of Char_Arr="+sum(carr)); //char�迭
	} //End of main

	//sum() �����ε� �޼��� ����
	//Ŭ���� �޼���� �����ϱ� ���� static �ٿ���
	static int sum(int x, int y) { return x+y;	} //int+int
	static double sum(double x, int y) { return x+y; }//double+int
	static double sum(int x, double y) { return x+y; }//int+double
	static double sum(double x, double y) { return x+y; } //double+double
	
	static String sum(char x, char y) { //char+char �� (String)+(char)�� ��ȯ�ؼ� ���
		String str1=Character.toString(x); //char���� x�� Character.toString(x);�� �̿��� StringŸ���� str1�� �ٲپ��ش�.
		return str1+y;
		}
	
	static int sum(int []arr) { //int�迭
		int result=0;
		for (int i=0; i<arr.length;i++) { //i=0���� arr�迭�� ���̸�ŭ �ݺ��ϴ� for��
			result+=arr[i];
		}
		return result; //��� ������ result���� ����
	}
	static double sum(double []arr) {
		double result=0;
		for (int i=0; i<arr.length;i++) {
			result+=arr[i];
		}
		return result;//��� ������ result���� ����
	}
	static String sum(char []arr) {
		String result="";
		String str1=Character.toString(arr[0]); //�迭��� �� �ϳ��� String���� ��ȯ�ص�, ��ȯ������ ���ڿ��� ������ �� �� ����
		result+=str1; //str1 ���� result���� ������
		for (int i=1; i<arr.length;i++) { //arr[0]�� str1���� �ٲپ� �̹� �������Ƿ�, i=1���� ����
			result+=arr[i];
		}
		return result;//��� ������ result���� ����
	} 
	
}
