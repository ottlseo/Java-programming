import java.util.Scanner;

public class Week3_3_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String title; //������ ������ String Ÿ���� title ����
		int page; //���������� ������ int Ÿ���� page ����
		
		Scanner kbd = new Scanner(System.in);
		MyFile fOld = new MyFile(); //old file ��ü ����
		MyFile fNew = new MyFile(); //new file ��ü ����
				
	    System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
		
	    System.out.println("--File ���� �Է� (����,��������)--");
	    fOld.setTitle(kbd.nextLine());
	    fOld.setPage(kbd.nextInt());
	    fOld.fileCopy(fNew);
	    System.out.println("<���� File>");
	    fOld.fileInfo(); //���� ���� ���
	    System.out.println("<����� File>");
	    fNew.fileInfo(); //����� ���� ���� ���
	    	    
	    
	}

}
