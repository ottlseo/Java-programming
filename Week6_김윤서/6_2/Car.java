
public class Car {
	
	Car(){}
	Car(String emgType, int number, String carType, String reqPerson){
		this.emgType=emgType;
		this.number=number;
		this.carType=carType;
		this.reqPerson=reqPerson;	
	} //private ���� 4�� �޾Ƽ� ���� �ϴ� Car Ŭ���� ������
	
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
