import java.util.Scanner;

public class Week7_1_김윤서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
			
		System.out.println("==========");
	    System.out.println("전공: 사이버보안");
	    System.out.println("학번: 1971063");
	    System.out.println("이름: 김윤서");
	    System.out.println("==========");
	    
	    Pet pets[] = new Pet[10]; //Pet 참조변수 배열 (크기10) 생성
	    
	    int task=0; //원하는 작업은? while문 진입을 위해 초기값 0으로 지정(의미x)
	    int index=0; //pets 배열의 index값이므로 초기값은 0
	    int sp; //종은 무엇입니까?의 대답
	    
	    while(index<10) { //pets[i]의 인덱스가 10 이하일 경우에 반복
	    	
	    	System.out.println("원하는 작업은 무엇입니까?");
		    System.out.println("1. New input	2. Output	3. Exit");
		    task=Integer.parseInt(kbd.nextLine()); //int로 변환
		    
		    while(task>3||task<1) { //task가 1~3사이의 값이 아닌 경우
		    	System.out.println("잘못된 입력");
		    	System.out.println("원하는 작업은 무엇입니까?");
			    System.out.println("1. New input	2. Output	3. Exit");
			    task=Integer.parseInt(kbd.nextLine()); //int로 변환
		    } //범위 내의 수를 받을 때까지 반복
		    
	//----------- 1.input -------------------------------------------------------------
		    if (task==1) { //task입력이 1이면
		    	
		    	
		    	while(true) {
		    		System.out.println("종은 무엇입니까?");
			    	System.out.println("1. Dog	2. Cat	3. Bird	4. Snake");
			    	sp=Integer.parseInt(kbd.nextLine()); //종-sp에 입력받기 (문자열로 입력받고 int로 변환)
			    	
			    	if(sp>=1 && sp<=4) //sp가 1~4사이의 값일 경우에만 break;
			    		break;
			    	else
			    		System.out.println("잘못된 입력"); //잘못된 입력일 때 무한 반복
				} 
		    	//sp가 1~4사이일 경우에만 아래 코드가 진행됨
		    	
		    	System.out.println("name:");
				String name=kbd.nextLine(); //이름- name에 입력받기
				System.out.println("age:");
				int age=Integer.parseInt(kbd.nextLine()); //나이 -age에 입력받기(문자열로 입력받고 int로 변환)
				
				if(sp==1)
					pets[index] = new Dog(name,age); //sp가 1이면 Dog() 인스턴스 생성 -생성자 Dog(String name, int age){} 이용
				if(sp==2)
					pets[index] = new Cat(name,age);//sp가 2이면 Cat() 인스턴스 생성 -생성자 Cat(String name, int age){} 이용
				if(sp==3)
					pets[index] = new Bird(name,age);//sp가 3이면 Bird() 인스턴스 생성 -생성자 Bird(String name, int age){} 이용
				if(sp==4)
					pets[index] = new Snake(name,age);//sp가4이면Snake() 인스턴스 생성 -생성자 Snake(String name, int age){} 이용
				
				index++; // index값 증가
		    } 
		    //1.new input 끝
		    
	//----------- 2. Output -------------------------------------------------------------	    
		    else if (task==2) { //task입력이 2 이면
		    	System.out.println("Species	Name	Age	Movement");
		    	for(int i=0; i<10; i++) {
		    		if(pets[i]==null)
		    			break;
		    		System.out.print(pets[i].species+"	"+pets[i].name+"	"+pets[i].age+"	");
		    		pets[i].move();
		    	}
		    	System.out.println("");
		    } 
		    //2.output 끝
	
		    
	//----------- 3. Exit -------------------------------------------------------------
		    else{//task==3이면 종료.
		    	System.out.println("종료");

		    	System.exit(0); //프로그램을 종료
		    	}
		    //3.exit 끝
	    	} 
	    }
	}
