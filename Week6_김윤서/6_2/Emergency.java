import java.util.Vector;

public class Emergency {
	
	public Car[] emgList = new Car[10]; //Car Ÿ���� �������� �迭 ���� -10�� ���� ok
	
	int i=0; // emgList�� �ε�����
	public void EM_Call(Car c) { //��ȣ ����ϰ� �迭�� �ν��Ͻ� �߰�
		
		System.out.println("Number:"+c.getNumber());
		emgList[i++] = c;
	}
	public void EM_record() { //�ݺ��� �̿��Ͽ� �迭�� ��� instance ���
		System.out.println("Emergency     Number     Car_type     Required");
		for (int i=0; i<emgList.length; i++) {
			System.out.println(emgList[i].getEmgType()+"     "+emgList[i].getNumber()+"     "+emgList[i].getCarType()+"     "+emgList[i].getReqPerson());
		}
	}

	
	
	
}
