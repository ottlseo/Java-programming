import java.io.*;
import java.util.*;

public class Week9_1_김윤서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
	    
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("File name for input:");
		String inFileName = kbd.nextLine(); // 입력파일 이름 입력받기 "numbers.dat"
		System.out.println("File name for output:");
		String outFileName = kbd.nextLine(); // 출력파일 이름 입력받기
		
		try {
			ObjectInputStream inputStream 
			= new ObjectInputStream(new FileInputStream(inFileName));
			// binary 파일을 읽어오기 위해 
			ObjectOutputStream outputStream
			= new ObjectOutputStream(new FileOutputStream(outFileName));
			// 새 값을 저장할 파일
			
			System.out.println("The numbers in File "+inFileName);
			try {
				while(true) { //무한루프
					int anInteger = inputStream.readInt(); //inputStream에서 값을 읽어옴
					System.out.println(anInteger);
					outputStream.writeInt(anInteger*2); //2를 곱한 값을 outputStream을 통해 출력파일에 저장!
				}
			}
			catch(EOFException e) { //EndOfFile -더이상 읽어올 값이 없으면
				System.out.println("End of reading from File, "+inFileName);
				System.out.println(outFileName+" is generated.");
				System.out.println("");
				outputStream.close();
				inputStream.close(); //두 파일 모두 닫아준다.
			}
		}
		catch(FileNotFoundException e) { //파일이 없는경우
			System.out.println("Cannot find file "+inFileName);
		}
		catch(IOException e) { //Input-Output 에서 문제생길 것을 대비해 꼭 써줄것
			System.out.println("Problem with input from file "+inFileName);
		}
		
		try {
			ObjectInputStream newInputStream =
					new ObjectInputStream(new FileInputStream(outFileName));
			//outFileName을 다시 열어 읽어오기
			System.out.println("The numbers in new File, "+outFileName);
			
			try {
				while(true) { //무한루프 -값이 끝나면 EOFException으로 닫아줄 것
					int doubleInteger = newInputStream.readInt();
					System.out.println(doubleInteger);
				}
			}
			catch(EOFException e) { //값이 끝난 경우 (EndOfFile -더이상 읽어올 값이 없으면)

				System.out.println("End of reading from 2nd File, "+outFileName);
				newInputStream.close(); //닫아준다.
			}
		}
		catch(FileNotFoundException e) {   //파일이 없는경우
			System.out.println("Cannot find File "+outFileName);
		}
		catch (IOException e) { //Input-Output 에서 문제생길 것을 대비해 꼭 써줄것
			System.out.println("Problem with input from File "+outFileName);
		}
	}

}
