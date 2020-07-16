import java.io.*;
import java.net.*;
import java.util.*;

public class Week14_server_김윤서 {

	public static void main(String[] args) {
		
		System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
	    
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9100); //서버소켓 객체 생성, 포트번호 9000
			socket = serverSocket.accept(); //커넥션 요청을 기다리다가 연결하는 메서드 accept()
			
			Scanner in = new Scanner(socket.getInputStream());
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			
			out.println("How many numbers?"); //client에게 질문
			out.flush(); //바로 보내주기
			
			String num = in.nextLine();
			System.out.println(num); //num 출력
			int num_int = Integer.parseInt(num); //int로 변환
			
			out.println("Input "+num+" numbers");
			out.flush(); //바로 보내주기
			
			int total=0 ,eachNum; //각각의 숫자(eachNum) 입력받아 더해줄값total
			double avg;
			for (int i=0; i<num_int; i++) { //num 개수만큼 입력받는다.
				eachNum = Integer.parseInt(in.nextLine()); //int로 바꿔줌
				total += eachNum; //total에 n개의 숫자 더해줌
			}
			avg = total/num_int;
			
			out.println("Sum: "+Integer.toString(total));// int형을 String 으로 변환해서 총합 출력
			out.println("Average: "+Double.toString(avg)); //double형을 String 으로 변환해서 평균 출력
			out.flush(); //바로 보내주기
			
			
			
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
