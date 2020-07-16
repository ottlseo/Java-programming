import java.util.Scanner;

public class Week5_2_김윤서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		Dog[] Dog = new Dog[] {d1,d2,d3}; //Dog 배열 선언 (3개의 element)
		
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		Cat c3 = new Cat();
		Cat[] Cat = new Cat[] {c1,c2,c3}; //Cat 배열 선언 (3개의 element)
		
		
		
		
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
	    
	    
	    //---------------------------Dog 정보입력 Start --------------------------
	    for (int i=0;i<=2;i++) {
	    	System.out.printf("<<Dog %d>>",i+1); //i=0일 떄, <<Dog 1>>출력
	    	System.out.println("");
	    	System.out.println("Name: ");
	    	Dog[i].setName(kbd.nextLine()); //Dog[i]의 이름 입력받아 저장(setName()메서드 이용해서 저장)
	    	
	    	System.out.println("Age: ");
	    	int age_d=Integer.parseInt(kbd.nextLine()); //나이 입력받아서 int로 변환- age_d 변수에 저장
	    	Dog[i].setAge(age_d); //age_d 변수에 저장된 값 Dog클래스의 setAge()메서드 이용하여 나이 저장
	    	
	    	//2살보다 많은 dog 분류하기 위한 if문
	    	if (Dog[i].getAge()>2) //2살보다 많으면
	    		Dog[i].olderthantwo=true; //olderthantwo에 true값 저장
	    	else
	    		Dog[i].olderthantwo=false;
	    	
	    	System.out.println("Weight: ");
	    	double weight_d=Double.parseDouble(kbd.nextLine());//몸무게 입력받아서 double로 변환- weight_d 변수에 저장
	    	Dog[i].setWeight(weight_d);//weight_d 변수에 저장된 값 Dog클래스의 setWeight()메서드 이용하여 몸무게 저장
	    	
	    	System.out.println("BoosterShot(y/n): ");
	    	String answer=kbd.nextLine(); //예방접종 여부를 y/n으로 받아서 answer에 저장
	    	if (answer.equalsIgnoreCase("y")) //answer가 y 이면(대소문자 구분x)
	    		Dog[i].setBoosterShot(true); //boosterShot 변수에 true값 저장
	    	else ////answer가 n 이면(대소문자 구분x)
	    		Dog[i].setBoosterShot(false);//boosterShot 변수에 false값 저장
	    	System.out.println("");
	    }
	    //---------------------------Dog 정보입력 End --------------------------
	    
	    
	    //---------------------------Cat 정보입력 Start --------------------------
	    for (int i=0;i<=2;i++) {
	    	System.out.printf("<<Cat %d>>",i+1); //i=0일 떄, <<Cat 1>>출력
	    	System.out.println("");
	    	System.out.println("Name: ");
	    	Cat[i].setName(kbd.nextLine()); //Cat[i]의 이름 입력받아 저장(setName()메서드 이용해서 저장)
	    	
	    	System.out.println("Age: ");
	    	int age_c=Integer.parseInt(kbd.nextLine()); //나이 입력받아서 int로 변환- age_c 변수에 저장
	    	Cat[i].setAge(age_c); //age_c 변수에 저장된 값 Cat클래스의 setAge()메서드 이용하여 나이 저장
	    	
	    	System.out.println("Weight: ");
	    	double weight_c=Double.parseDouble(kbd.nextLine());//몸무게 입력받아서 double로 변환- weight_c 변수에 저장
	    	Cat[i].setWeight(weight_c);//weight_c 변수에 저장된 값 Cat클래스의 setWeight()메서드 이용하여 몸무게 저장
	    	
	    	System.out.println("Color: ");
	    	String color=kbd.nextLine(); //color로 받아서
	    	Cat[i].setColor(color); //setColor()메서드 이용해서 Cat클래스의 color에 저장
	    	System.out.println("");
	    }
	    //---------------------------Cat 정보입력 End --------------------------
	    
	    
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
	    	} //2살보다 많고 boostershot여부가 false인 Dog만 이름 출력
	    }
	    
	    System.out.println("");
	    System.out.println("* Black cats weights more than 3Kg are...");
	    for (int i=0; i<=2; i++) {
	    	if (Cat[i].getColor().equalsIgnoreCase("Black") && Cat[i].getWeight()>=3.0) {
	    		System.out.println(Cat[i].getName());
	    	} //color가 black이고(대소문자 구분x), 무게가 3 이상인  Cat만 이름을 출력
	    }
	}

}
