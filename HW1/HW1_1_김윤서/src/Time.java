
public class Time {
	
	private int hour;
	private int minute;
	
	private boolean isValid(int hour, int minute) {
		if ((hour>=0 && hour<=23) && (minute>=0 && minute<=59)) { 
			//hour�� 0~23 ������ ���̰�, minute�� 0~59 ������ ���̸� valid
			return true;
		}
		else
			return false;
	}
	public boolean getValid(Time t) {
		
		return t.isValid(t.hour, t.minute);
	} //isValid() �޼��尡 private �޼��忩�� main���� �ҷ��� �� �����Ƿ� getter �޼��� ����
	
	
	public void setTime(int hour, int minute) {
		this.hour=hour;
		this.minute=minute;
	}
	public int getTime(char ch) {
		if(ch=='h' || ch=='H')
			return this.hour;
		
		else if(ch=='m' || ch=='M')
			return this.minute;
		else
			return 0; //getTime()�޼��尡 int���� ��ȯ�ؾ� �ϹǷ� else�� ����,
		//���� �� ���� �ڵ����� ���������� ���� �߰�.
	}
}
