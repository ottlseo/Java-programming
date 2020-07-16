import java.util.Scanner;

public class Week5_2_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		Dog[] Dog = new Dog[] {d1,d2,d3}; //Dog �迭 ���� (3���� element)
		
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		Cat c3 = new Cat();
		Cat[] Cat = new Cat[] {c1,c2,c3}; //Cat �迭 ���� (3���� element)
		
		
		
		
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("==========");
	    System.out.println("����: ���̹�����");
	    System.out.println("�й�: 1971063");
	    System.out.println("�̸�: ������");
	    System.out.println("==========");
	    
	    
	    //---------------------------Dog �����Է� Start --------------------------
	    for (int i=0;i<=2;i++) {
	    	System.out.printf("<<Dog %d>>",i+1); //i=0�� ��, <<Dog 1>>���
	    	System.out.println("");
	    	System.out.println("Name: ");
	    	Dog[i].setName(kbd.nextLine()); //Dog[i]�� �̸� �Է¹޾� ����(setName()�޼��� �̿��ؼ� ����)
	    	
	    	System.out.println("Age: ");
	    	int age_d=Integer.parseInt(kbd.nextLine()); //���� �Է¹޾Ƽ� int�� ��ȯ- age_d ������ ����
	    	Dog[i].setAge(age_d); //age_d ������ ����� �� DogŬ������ setAge()�޼��� �̿��Ͽ� ���� ����
	    	
	    	//2�캸�� ���� dog �з��ϱ� ���� if��
	    	if (Dog[i].getAge()>2) //2�캸�� ������
	    		Dog[i].olderthantwo=true; //olderthantwo�� true�� ����
	    	else
	    		Dog[i].olderthantwo=false;
	    	
	    	System.out.println("Weight: ");
	    	double weight_d=Double.parseDouble(kbd.nextLine());//������ �Է¹޾Ƽ� double�� ��ȯ- weight_d ������ ����
	    	Dog[i].setWeight(weight_d);//weight_d ������ ����� �� DogŬ������ setWeight()�޼��� �̿��Ͽ� ������ ����
	    	
	    	System.out.println("BoosterShot(y/n): ");
	    	String answer=kbd.nextLine(); //�������� ���θ� y/n���� �޾Ƽ� answer�� ����
	    	if (answer.equalsIgnoreCase("y")) //answer�� y �̸�(��ҹ��� ����x)
	    		Dog[i].setBoosterShot(true); //boosterShot ������ true�� ����
	    	else ////answer�� n �̸�(��ҹ��� ����x)
	    		Dog[i].setBoosterShot(false);//boosterShot ������ false�� ����
	    	System.out.println("");
	    }
	    //---------------------------Dog �����Է� End --------------------------
	    
	    
	    //---------------------------Cat �����Է� Start --------------------------
	    for (int i=0;i<=2;i++) {
	    	System.out.printf("<<Cat %d>>",i+1); //i=0�� ��, <<Cat 1>>���
	    	System.out.println("");
	    	System.out.println("Name: ");
	    	Cat[i].setName(kbd.nextLine()); //Cat[i]�� �̸� �Է¹޾� ����(setName()�޼��� �̿��ؼ� ����)
	    	
	    	System.out.println("Age: ");
	    	int age_c=Integer.parseInt(kbd.nextLine()); //���� �Է¹޾Ƽ� int�� ��ȯ- age_c ������ ����
	    	Cat[i].setAge(age_c); //age_c ������ ����� �� CatŬ������ setAge()�޼��� �̿��Ͽ� ���� ����
	    	
	    	System.out.println("Weight: ");
	    	double weight_c=Double.parseDouble(kbd.nextLine());//������ �Է¹޾Ƽ� double�� ��ȯ- weight_c ������ ����
	    	Cat[i].setWeight(weight_c);//weight_c ������ ����� �� CatŬ������ setWeight()�޼��� �̿��Ͽ� ������ ����
	    	
	    	System.out.println("Color: ");
	    	String color=kbd.nextLine(); //color�� �޾Ƽ�
	    	Cat[i].setColor(color); //setColor()�޼��� �̿��ؼ� CatŬ������ color�� ����
	    	System.out.println("");
	    }
	    //---------------------------Cat �����Է� End --------------------------
	    
	    
	    System.out.printf("<<Dog List>>");
	    for (int i=0;i<=2;i++) {
	    	Dog[i].writeOutput();
	    	Dog[i].move();
	    	System.out.println("");
	    }
	    
	    System.out.printf("<<Cat List>>");
	    for (int i=0;i<=2;i++) {
	    	Cat[i].writeOutput();
	    	Cat[i].move();
	    	System.out.println("");
	    }
	    
	    System.out.println("");	    
	    System.out.println("* Dogs older than 2 years and no boostershot are...");
	    for (int i=0; i<=2; i++) {
	    	if (Dog[i].olderthantwo==true && Dog[i].getBoosterShot()==false) {
	    		System.out.println(Dog[i].getName());
	    	} //2�캸�� ���� boostershot���ΰ� false�� Dog�� �̸� ���
	    }
	    
	    System.out.println("");
	    System.out.println("* Black cats weights more than 3Kg are...");
	    for (int i=0; i<=2; i++) {
	    	if (Cat[i].getColor().equalsIgnoreCase("Black") && Cat[i].getWeight()>=3.0) {
	    		System.out.println(Cat[i].getName());
	    	} //color�� black�̰�(��ҹ��� ����x), ���԰� 3 �̻���  Cat�� �̸��� ���
	    }
	}

}
