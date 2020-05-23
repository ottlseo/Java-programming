import java.io.*;
import java.util.*;

public class Week9_2_김윤서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
	    
		Scanner kbd = new Scanner(System.in);
		
		Dog myDog[] = new Dog[10];
		myDog[0] = new Dog("Merry", 3, 2.5, "Bulldog", false);
		myDog[1] = new Dog("JJong", 5, 5.5, "Mix", false);
		myDog[2] = new Dog("Kong", 4, 3, "Poodle", true);
		myDog[3] = new Dog("Apple", 2, 2.5, "Collie", true);
		myDog[4] = new Dog("Candy", 5, 5.5, "Coca", false);
		myDog[5] = new Dog("Cutie", 7, 2.5, "Chiwawa", true);
		myDog[6] = new Dog("Peace", 3, 2.5, "Huskey", false);
		myDog[7] = new Dog("Lion", 9, 1.5, "Shepard", true);
		myDog[8] = new Dog("Windy", 2, 9, "Jindo", true);
		myDog[9] = new Dog("Sweetie", 1, 2.5, "Maltiz", false);
		
	
		System.out.println("Input File name to write Dog data");
		String fileName = kbd.nextLine(); // 출력파일 이름 입력받기
		
		try { 
			ObjectOutputStream outputStream
			= new ObjectOutputStream(new FileOutputStream(fileName));
			// 새 값을 저장할 파일
			outputStream.writeObject(myDog); //outputStream을 통하여 myDog 배열을 오브젝트 전체로 써주고
			outputStream.close(); //닫아준다
		}
		catch(FileNotFoundException e) { //파일이 없는경우
			System.out.println("Cannot find file "+fileName);
			System.exit(0); //파일명이 잘못된 경우 그냥 종료.
		}
		catch(IOException e) { //Input-Output 에서 문제생길 것을 대비해 꼭 써줄것
			System.out.println("Problem with input from file "+fileName);
		}
		
		Dog[] newArr = null; //myDog[] 배열 다시 읽어오기 위해 복사하기 위한 새로운 배열 newArr[]
		
		try {
			ObjectInputStream inputStream =
					new ObjectInputStream(new FileInputStream(fileName));
			//fileName을 다시 열어 읽어오기
			newArr = (Dog[]) inputStream.readObject(); //Down-casting 필수
			inputStream.close();
			
			System.out.println("Name	Age	Weight	Breed	BoosterShot");
			for (int i=0; i<10; i++) { //인덱스 i는 1부터 10까지 반복
				System.out.println(newArr[i]); //toString() 이용해서 값이 출력될 것
				}
		}
		catch (IOException e) { //Input-Output 에서 문제생길 것을 대비해 꼭 써줄것
			System.out.println("Problem with input from File "+fileName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("");
		System.out.println("Dogs older than 2 years and did not get the boosterShot.");
		for (int j=0; j<10; j++) {
			if(myDog[j].getAge()>2 && myDog[j].getBoosterShot()==false) {
				// 2세 초과 & 예방접종 안 한 강아지 이름과 종 출력
				System.out.println(myDog[j].getName()+"	"+myDog[j].getBreed());
			}
		}
	}
	}

