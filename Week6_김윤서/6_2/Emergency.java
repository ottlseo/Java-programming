import java.util.Vector;

public class Emergency {
	
	public Car[] emgList = new Car[10]; //Car 타입의 참조변수 배열 선언 -10개 까지 ok
	
	int i=0; // emgList의 인덱스값
	public void EM_Call(Car c) { //번호 출력하고 배열에 인스턴스 추가
		
		System.out.println("Number:"+c.getNumber());
		emgList[i++] = c;
	}
	public void EM_record() { //반복문 이용하여 배열의 모든 instance 출력
		System.out.println("Emergency     Number     Car_type     Required");
		for (int i=0; i<emgList.length; i++) {
			System.out.println(emgList[i].getEmgType()+"     "+emgList[i].getNumber()+"     "+emgList[i].getCarType()+"     "+emgList[i].getReqPerson());
		}
	}

	
	
	
}
