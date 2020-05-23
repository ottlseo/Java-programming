import java.util.*;
public class Week10_2_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
	    
	    String ID, name;
	    String maxID, minID;
	    String maxName, minName;
	    int maxLength, minLength, nowLength;
	    
	    Map <String, String> student = new HashMap<String, String> ();
	    // Map �������̽��� HashMap Ŭ������ ��ü�� ����
	    
	    System.out.println("�л��� ID�� �̸��� ���ʷ� �Է��ϼ���. (����� 0 0 �Է�)");
	    ID = kbd.next();
	    name = kbd.next();
	    student.put(ID, name); //����
	    
	    Set s = student.keySet(); // key ���� set�� ����
	    Iterator <String> it = s.iterator();
	    
	    maxID = ID; // ID�� maxID�ʱⰪ���� ����
	    maxName = student.get(maxID);
	    maxLength = maxName.length();
	    // ��key�� ���� value�� get()���� ������-> name
	    // �� name���� ���̸� maxLength�� �ʱⰪ���� ����
	    
	    minID = ID; // ID�� minID�ʱⰪ���� ����
	    minName = student.get(minID);
	    minLength = minName.length();
	    // maxLength�� �ʱⰪ ���� �Ͱ� ���� ������� minLength�� �ʱⰪ�� ����
	    
	
	    while(true) { // ���ѹݺ����� �Է� ����, if�� �̿��Ͽ� 0 0 �Է��ϸ� �Է��� ���ߵ���
	    	ID = kbd.next();
		    name = kbd.next();
		    
		    if (ID.equalsIgnoreCase("0") && name.equalsIgnoreCase("0")) {
		    	// 0 0 �Է½�
		    	break; //�ݺ����� ����������.
		    }
		    
		    student.put(ID, name); //����
		    
		    nowLength = name.length();
		    // nowID�� ���� value�� get()���� ������-> nowName
		    // ���� �̸��� ���̸� nowLength�� ����
		    if (nowLength > maxLength) { // nowLength ���� max ���� ũ��
		    	maxLength = nowLength; // update
		    	maxID = ID;
		    	maxName = name;
		    }
		    if (nowLength < minLength) { // nowLength ���� min ���� ������
		    	minLength = nowLength; // update
		    	minID = ID;
		    	minName = name;
		    }
	    }
	    // �Է� end
	    Set stu = student.keySet(); // ó������ key���� �о���� ���� set�� ���� ����
	    Iterator <String> it2 = stu.iterator();
	    
	    System.out.println("<�л� ���>");
	    System.out.println("[ID]	[NAME]");
	    while (it2.hasNext()) { // ���̻� stu�� �����ִ� �� ���� ������
	    	String str = it2.next();
	    	System.out.println(str+"	"+student.get(str));
		    // ID�� �̸� ���
	    }
	    //�л� ��� ��� end
	    
	    System.out.println("��ü �л���: "+s.size()); //key���� Set�� s�� ũ�Ⱑ ��ü �л� ��
	    System.out.println("<���� �� �̸��� ���� �л�>");
	    System.out.println("ID:"+maxID+"  Name:"+maxName+"  ����:"+maxLength);
	    System.out.println("<���� ª�� �̸��� ���� �л�>");
	    System.out.println("ID:"+minID+"  Name:"+minName+"  ����:"+minLength);
	}

}
