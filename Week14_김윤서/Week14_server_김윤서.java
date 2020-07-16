import java.io.*;
import java.net.*;
import java.util.*;

public class Week14_server_������ {

	public static void main(String[] args) {
		
		System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
	    
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9100); //�������� ��ü ����, ��Ʈ��ȣ 9000
			socket = serverSocket.accept(); //Ŀ�ؼ� ��û�� ��ٸ��ٰ� �����ϴ� �޼��� accept()
			
			Scanner in = new Scanner(socket.getInputStream());
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			
			out.println("How many numbers?"); //client���� ����
			out.flush(); //�ٷ� �����ֱ�
			
			String num = in.nextLine();
			System.out.println(num); //num ���
			int num_int = Integer.parseInt(num); //int�� ��ȯ
			
			out.println("Input "+num+" numbers");
			out.flush(); //�ٷ� �����ֱ�
			
			int total=0 ,eachNum; //������ ����(eachNum) �Է¹޾� �����ٰ�total
			double avg;
			for (int i=0; i<num_int; i++) { //num ������ŭ �Է¹޴´�.
				eachNum = Integer.parseInt(in.nextLine()); //int�� �ٲ���
				total += eachNum; //total�� n���� ���� ������
			}
			avg = total/num_int;
			
			out.println("Sum: "+Integer.toString(total));// int���� String ���� ��ȯ�ؼ� ���� ���
			out.println("Average: "+Double.toString(avg)); //double���� String ���� ��ȯ�ؼ� ��� ���
			out.flush(); //�ٷ� �����ֱ�
			
			
			
		} catch(Exception e) {
		    System.out.println(e.getMessage());
		}
		finally {
			try {
				socket.close();
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

}
