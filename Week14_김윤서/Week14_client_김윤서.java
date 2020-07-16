import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Week14_client_김윤서 {

	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in); //표준입력 스캐너
		System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
	    
		
		//client에는 서버소켓은 만들 필요없음
		Socket socket = null;
		
		try {
			socket = new Socket("192.168.25.44",9100); //IPv4: 192.168.25.44
			
			Scanner in = new Scanner(socket.getInputStream());
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			
			out.println("Hello?"); //client->server에게 첫 메시지전송: "Hello?"
			out.flush(); //바로 보내주기
			
			String num = kbd.nextLine(); //서버에게 보낼 숫자 - String으로 받음
			int num_int = Integer.parseInt(num); //int로 변환
			
			out.println(num); //server에게 num 전송
			out.flush(); //바로 보내주기
			
			String numtoServer;
			for (int i=0; i<num_int; i++) { //num 개수만큼 입력받는다.
				numtoServer = kbd.nextLine();
				out.println(numtoServer); //받을때마다 값 보내줌
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
