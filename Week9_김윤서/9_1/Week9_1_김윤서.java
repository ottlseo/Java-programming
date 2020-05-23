import java.io.*;
import java.util.*;

public class Week9_1_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
	    
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("File name for input:");
		String inFileName = kbd.nextLine(); // �Է����� �̸� �Է¹ޱ� "numbers.dat"
		System.out.println("File name for output:");
		String outFileName = kbd.nextLine(); // ������� �̸� �Է¹ޱ�
		
		try {
			ObjectInputStream inputStream 
			= new ObjectInputStream(new FileInputStream(inFileName));
			// binary ������ �о���� ���� 
			ObjectOutputStream outputStream
			= new ObjectOutputStream(new FileOutputStream(outFileName));
			// �� ���� ������ ����
			
			System.out.println("The numbers in File "+inFileName);
			try {
				while(true) { //���ѷ���
					int anInteger = inputStream.readInt(); //inputStream���� ���� �о��
					System.out.println(anInteger);
					outputStream.writeInt(anInteger*2); //2�� ���� ���� outputStream�� ���� ������Ͽ� ����!
				}
			}
			catch(EOFException e) { //EndOfFile -���̻� �о�� ���� ������
				System.out.println("End of reading from File, "+inFileName);
				System.out.println(outFileName+" is generated.");
				System.out.println("");
				outputStream.close();
				inputStream.close(); //�� ���� ��� �ݾ��ش�.
			}
		}
		catch(FileNotFoundException e) { //������ ���°��
			System.out.println("Cannot find file "+inFileName);
		}
		catch(IOException e) { //Input-Output ���� �������� ���� ����� �� ���ٰ�
			System.out.println("Problem with input from file "+inFileName);
		}
		
		try {
			ObjectInputStream newInputStream =
					new ObjectInputStream(new FileInputStream(outFileName));
			//outFileName�� �ٽ� ���� �о����
			System.out.println("The numbers in new File, "+outFileName);
			
			try {
				while(true) { //���ѷ��� -���� ������ EOFException���� �ݾ��� ��
					int doubleInteger = newInputStream.readInt();
					System.out.println(doubleInteger);
				}
			}
			catch(EOFException e) { //���� ���� ��� (EndOfFile -���̻� �о�� ���� ������)

				System.out.println("End of reading from 2nd File, "+outFileName);
				newInputStream.close(); //�ݾ��ش�.
			}
		}
		catch(FileNotFoundException e) {   //������ ���°��
			System.out.println("Cannot find File "+outFileName);
		}
		catch (IOException e) { //Input-Output ���� �������� ���� ����� �� ���ٰ�
			System.out.println("Problem with input from File "+outFileName);
		}
	}

}
