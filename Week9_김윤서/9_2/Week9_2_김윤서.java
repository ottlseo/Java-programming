import java.io.*;
import java.util.*;

public class Week9_2_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
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
		String fileName = kbd.nextLine(); // ������� �̸� �Է¹ޱ�
		
		try { 
			ObjectOutputStream outputStream
			= new ObjectOutputStream(new FileOutputStream(fileName));
			// �� ���� ������ ����
			outputStream.writeObject(myDog); //outputStream�� ���Ͽ� myDog �迭�� ������Ʈ ��ü�� ���ְ�
			outputStream.close(); //�ݾ��ش�
		}
		catch(FileNotFoundException e) { //������ ���°��
			System.out.println("Cannot find file "+fileName);
			System.exit(0); //���ϸ��� �߸��� ��� �׳� ����.
		}
		catch(IOException e) { //Input-Output ���� �������� ���� ����� �� ���ٰ�
			System.out.println("Problem with input from file "+fileName);
		}
		
		Dog[] newArr = null; //myDog[] �迭 �ٽ� �о���� ���� �����ϱ� ���� ���ο� �迭 newArr[]
		
		try {
			ObjectInputStream inputStream =
					new ObjectInputStream(new FileInputStream(fileName));
			//fileName�� �ٽ� ���� �о����
			newArr = (Dog[]) inputStream.readObject(); //Down-casting �ʼ�
			inputStream.close();
			
			System.out.println("Name	Age	Weight	Breed	BoosterShot");
			for (int i=0; i<10; i++) { //�ε��� i�� 1���� 10���� �ݺ�
				System.out.println(newArr[i]); //toString() �̿��ؼ� ���� ��µ� ��
				}
		}
		catch (IOException e) { //Input-Output ���� �������� ���� ����� �� ���ٰ�
			System.out.println("Problem with input from File "+fileName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("");
		System.out.println("Dogs older than 2 years and did not get the boosterShot.");
		for (int j=0; j<10; j++) {
			if(myDog[j].getAge()>2 && myDog[j].getBoosterShot()==false) {
				// 2�� �ʰ� & �������� �� �� ������ �̸��� �� ���
				System.out.println(myDog[j].getName()+"	"+myDog[j].getBreed());
			}
		}
	}
	}

