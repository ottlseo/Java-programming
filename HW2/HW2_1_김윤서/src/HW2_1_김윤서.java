import java.io.*;
import java.util.*;

public class HW2_1_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
	    
	    System.out.println("Input the filename to read.");
	    String fileToRead = kbd.nextLine(); // "animal.txt"�� �Է¹���
	    System.out.println("Input the filename to write.");
	    String fileToWrite = kbd.nextLine(); // ���ο� ���� ����
	    
	    //-------------------- inputStream ����
	    Scanner inputStream = null; //input stream ���� (���� �о���� ����)
	    try {
	    	inputStream = new Scanner(new File(fileToRead));
	    } catch(FileNotFoundException e) { //ã�� ������ ���°�� ����ó��
	    	System.out.println("File "+fileToRead+"cannot be Found.");
	    	System.exit(1); // ���� ���� ����
	    } //-------------------- input stream ���� ��
	    
	    
	    // ------------output stream ����
	    PrintWriter outputStream = null; // output stream ���� (���� ���� ����)
	    try {
	    	outputStream = new PrintWriter(new File(fileToWrite));
	    } catch(IOException e) { // IOException ���� ó��
	    	System.out.println("Error in generating "+fileToWrite);
	    	System.exit(1); // ���� ���� ����
	    } 
	 //-------------------- output stream ���� ��
	    
	    while(inputStream.hasNextLine()) { //�о�� ���� ���� ������
	    	String line = inputStream.nextLine(); //���� line�� �о�� ������ ���� (�� ����)
	    	
	    	StringTokenizer tokenizer = new StringTokenizer(line,"\n, ");
	    	// StringTokenizer ������Ʈ �����Ͽ�, �� ��(line)���� �и��ڴ�� �� �ܾ �и��� �� �ְ���
	    	
	    	while (tokenizer.hasMoreTokens()) { // tokenizer�� �� ������ ���� �ִ� ���� �ݺ�
	    		String eachword = tokenizer.nextToken(); // eachword ������ �� �ܾ���� ����
	    		
	    		if(eachword.length() >= 4) { //�� �ܾ��� ���̰� 4���� �̻��̸� �� ���Ͽ� ����
	    			outputStream.println(eachword);
	    		}
	    	}
	    }
	    inputStream.close();
	    outputStream.close();
	}

}
