import java.util.Scanner;

public class HW1_4_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("==========");
	    System.out.println("Major: ���̹�����");
	    System.out.println("ID: 1971063");
	    System.out.println("Name: ������");
	    System.out.println("==========");
	    
	    int howmany; //�л���
	    int sum_kor=0, sum_math=0, sum_eng=0;
	    double avg_kor, avg_math, avg_eng;
	    
	    System.out.println("How many students are there?");
	    howmany=Integer.parseInt(kbd.nextLine()); //nextLine()���� ���� �� int�� ��ȯ���ش�
	    StudentScore std[] = new StudentScore[howmany];
	    //StudentScore Ŭ������ ��ü�迭 ����- �л���(howmany) ��ŭ �迭 ���� ����

	    
	    System.out.println("Input the information.");
	    for (int i=0; i<std.length; i++) { //i�� 0���� std�迭�� ���̸�ŭ �Է��� �ݺ�
	    	
	    	System.out.println("NAME:");
	    	String name = kbd.nextLine();
	    	System.out.println("ID:");
	    	String id = kbd.nextLine();
	    	System.out.println("KOREAN:");
	    	int korean = Integer.parseInt(kbd.nextLine()); //nextLine()���� ���� �� int�� ��ȯ���ش�
	    	System.out.println("MATH:");
	    	int math = Integer.parseInt(kbd.nextLine()); //nextLine()���� ���� �� int�� ��ȯ���ش�
	    	System.out.println("ENGLISH:");
	    	int english = Integer.parseInt(kbd.nextLine()); //nextLine()���� ���� �� int�� ��ȯ���ش�
	    	System.out.println("");
	    	
	    	
	    	std[i] = new StudentScore(id,name,korean,math,english);
	    	//std�� i��° ����� ���� ����, ������ �̿�
	    }
	    
	    System.out.println("NAME	ID	KOREAN	MATH	ENGLISH	SUM	AVG");
	    for (int i=0; i<std.length; i++) {
	    	std[i].display(); //StudentScoreŬ������ display() �޼��� ȣ��
	    	
	    	sum_kor+=std[i].getKorean(); //��� �л��� ���� ������ ���ؼ� sum_kor�� ����
	    	sum_math+=std[i].getMath(); //��� �л��� ���� ������ ���ؼ� sum_math�� ����
	    	sum_eng+=std[i].getEnglish(); //��� �л��� ���� ������ ���ؼ� sum_eng�� ����
	    }
	
	    avg_kor=sum_kor/howmany; //���� ���
	    avg_math=sum_math/howmany; //���� ���
	    avg_eng=sum_eng/howmany; //���� ���
	    
	    System.out.println("Subject Avg	"+avg_kor+"	"+avg_math+"	"+avg_eng);
	    
	    System.out.println("<Students over the average>");
	    System.out.println("Korean:");
	    for(int i=0; i<std.length; i++) { //��պ��� ���� �л��� ��󳻱� ���� for������ Ȯ��
	    	if(std[i].getKorean()>avg_kor) //i��° �л��� ���� ������ ���� ��պ��� ������
	    		System.out.print(std[i].getName()+"	"); //�̸� ���
	    }
	    System.out.println("");
	    System.out.println("Math:");
	    for(int i=0; i<std.length; i++) {
	    	if(std[i].getMath()>avg_math)//i��° �л��� ���� ������ ���� ��պ��� ������
	    		System.out.print(std[i].getName()+"	");//�̸� ���
	  
	    }
	    System.out.println("");
	    System.out.println("English:");
	    for(int i=0; i<std.length; i++) {
	    	if(std[i].getEnglish()>avg_eng)//i��° �л��� ���� ������ ���� ��պ��� ������
	    		System.out.print(std[i].getName()+"	");//�̸� ���
	    }
	}

}
