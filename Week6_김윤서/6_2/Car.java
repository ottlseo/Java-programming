
public class Car {
	
	Car(){}
	Car(String emgType, int number, String carType, String reqPerson){
		this.emgType=emgType;
		this.number=number;
		this.carType=carType;
		this.reqPerson=reqPerson;	
	} //private 변수 4개 받아서 대입 하는 Car 클래스 생성자
	
	private String emgType; // Fire, Patient, Thief
	private int number; // 112(Thief), 119(Fire, Patient)
	private String carType; //FireEngine, Ambulance, PoliceCar
	private String reqPerson; //FireFighter, PoliceOfficer, Doctor

	public String getEmgType() {
		return emgType;
	}
	public int getNumber() {
		return number;
	}
	
	public String getCarType() {
		return carType;
	}
	public String getReqPerson() {
		return reqPerson;
	}
	public String getStr() {
		return getEmgType()+getNumber()+getCarType()+getReqPerson();
	}

	
}
