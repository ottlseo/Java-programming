
public class Facto {
	static int result; //static ���� result
	
	static int factoVal(int x) { //static �޼��� factoVal()
		int fac=1; //���丮�� ���� ������ �������� fac (�ʱⰪ�� 1)
		for(int i=1;i<=x; i++) //i�� 1���� x���� �� ���� Ŀ���� �ݺ�
			fac*=i; //fac ���� i�� ��� ���ذ��� ���丮�� ���ϱ�
		return fac;
	}
}
