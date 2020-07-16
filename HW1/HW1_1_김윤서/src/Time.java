
public class Time {
	
	private int hour;
	private int minute;
	
	private boolean isValid(int hour, int minute) {
		if ((hour>=0 && hour<=23) && (minute>=0 && minute<=59)) { 
			//hour가 0~23 사이의 수이고, minute가 0~59 사이의 수이면 valid
			return true;
		}
		else
			return false;
	}
	public boolean getValid(Time t) {
		
		return t.isValid(t.hour, t.minute);
	} //isValid() 메서드가 private 메서드여서 main에서 불러올 수 없으므로 getter 메서드 정의
	
	
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
			return 0; //getTime()메서드가 int값을 반환해야 하므로 else도 정의,
		//쓰일 일 없는 코드지만 오류방지를 위해 추가.
	}
}
