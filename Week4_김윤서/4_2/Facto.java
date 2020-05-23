
public class Facto {
	static int result; //static 변수 result
	
	static int factoVal(int x) { //static 메서드 factoVal()
		int fac=1; //팩토리얼 값을 저장할 지역변수 fac (초기값은 1)
		for(int i=1;i<=x; i++) //i는 1부터 x까지 그 값이 커지며 반복
			fac*=i; //fac 값에 i를 계속 곱해가며 팩토리얼값 구하기
		return fac;
	}
}
