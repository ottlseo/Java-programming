import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Week14_client_������ {

	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in); //ǥ���Է� ��ĳ��
		System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
	    
		
		//client���� ���������� ���� �ʿ����
		Socket socket = null;
		
		try {
			socket = new Socket("192.168.25.44",9100); //IPv4: 192.168.25.44
			
			Scanner in = new Scanner(socket.getInputStream());
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			
			out.println("Hello?"); //client->server���� ù �޽�������: "Hello?"
			out.flush(); //�ٷ� �����ֱ�
			
			String num = kbd.nextLine(); //�������� ���� ���� - String���� ����
			int num_int = Integer.parseInt(num); //int�� ��ȯ
			
			out.println(num); //server���� num ����
			out.flush(); //�ٷ� �����ֱ�
			
			String numtoServer;
			for (int i=0; i<num_int; i++) { //num ������ŭ �Է¹޴´�.
				numtoServer = kbd.nextLine();
				out.println(numtoServer); //���������� �� ������
				out.flush();
			}
			
			
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
