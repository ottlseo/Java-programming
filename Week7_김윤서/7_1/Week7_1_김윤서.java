import java.util.Scanner;

public class Week7_1_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
			
		System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
	    
	    Pet pets[] = new Pet[10]; //Pet �������� �迭 (ũ��10) ����
	    
	    int task=0; //���ϴ� �۾���? while�� ������ ���� �ʱⰪ 0���� ����(�ǹ�x)
	    int index=0; //pets �迭�� index���̹Ƿ� �ʱⰪ�� 0
	    int sp; //���� �����Դϱ�?�� ���
	    
	    while(index<10) { //pets[i]�� �ε����� 10 ������ ��쿡 �ݺ�
	    	
	    	System.out.println("���ϴ� �۾��� �����Դϱ�?");
		    System.out.println("1. New input	2. Output	3. Exit");
		    task=Integer.parseInt(kbd.nextLine()); //int�� ��ȯ
		    
		    while(task>3||task<1) { //task�� 1~3������ ���� �ƴ� ���
		    	System.out.println("�߸��� �Է�");
		    	System.out.println("���ϴ� �۾��� �����Դϱ�?");
			    System.out.println("1. New input	2. Output	3. Exit");
			    task=Integer.parseInt(kbd.nextLine()); //int�� ��ȯ
		    } //���� ���� ���� ���� ������ �ݺ�
		    
	//----------- 1.input -------------------------------------------------------------
		    if (task==1) { //task�Է��� 1�̸�
		    	
		    	
		    	while(true) {
		    		System.out.println("���� �����Դϱ�?");
			    	System.out.println("1. Dog	2. Cat	3. Bird	4. Snake");
			    	sp=Integer.parseInt(kbd.nextLine()); //��-sp�� �Է¹ޱ� (���ڿ��� �Է¹ް� int�� ��ȯ)
			    	
			    	if(sp>=1 && sp<=4) //sp�� 1~4������ ���� ��쿡�� break;
			    		break;
			    	else
			    		System.out.println("�߸��� �Է�"); //�߸��� �Է��� �� ���� �ݺ�
				} 
		    	//sp�� 1~4������ ��쿡�� �Ʒ� �ڵ尡 �����
		    	
		    	System.out.println("name:");
				String name=kbd.nextLine(); //�̸�- name�� �Է¹ޱ�
				System.out.println("age:");
				int age=Integer.parseInt(kbd.nextLine()); //���� -age�� �Է¹ޱ�(���ڿ��� �Է¹ް� int�� ��ȯ)
				
				if(sp==1)
					pets[index] = new Dog(name,age); //sp�� 1�̸� Dog() �ν��Ͻ� ���� -������ Dog(String name, int age){} �̿�
				if(sp==2)
					pets[index] = new Cat(name,age);//sp�� 2�̸� Cat() �ν��Ͻ� ���� -������ Cat(String name, int age){} �̿�
				if(sp==3)
					pets[index] = new Bird(name,age);//sp�� 3�̸� Bird() �ν��Ͻ� ���� -������ Bird(String name, int age){} �̿�
				if(sp==4)
					pets[index] = new Snake(name,age);//sp��4�̸�Snake() �ν��Ͻ� ���� -������ Snake(String name, int age){} �̿�
				
				index++; // index�� ����
		    } 
		    //1.new input ��
		    
	//----------- 2. Output -------------------------------------------------------------	    
		    else if (task==2) { //task�Է��� 2 �̸�
		    	System.out.println("Species	Name	Age	Movement");
		    	for(int i=0; i<10; i++) {
		    		if(pets[i]==null)
		    			break;
		    		System.out.print(pets[i].species+"	"+pets[i].name+"	"+pets[i].age+"	");
		    		pets[i].move();
		    	}
		    	System.out.println("");
		    } 
		    //2.output ��
	
		    
	//----------- 3. Exit -------------------------------------------------------------
		    else{//task==3�̸� ����.
		    	System.out.println("����");

		    	System.exit(0); //���α׷��� ����
		    	}
		    //3.exit ��
	    	} 
	    }
	}
