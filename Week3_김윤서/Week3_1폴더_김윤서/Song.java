
public class Song {


	public String singer; //���� �̸�
	public int price; //����
	public String title; //�뷡 ����
	//����������, �ڵ��ʱ�ȭ x

	void play() {
		System.out.println("�뷡 ����! : \""+this.title+"\" by "+this.singer);
		//\" �� �̿��ؼ� ����ǥ ���
		//this.title, this.singer�� ��ü�� ã�ư� ���� ����
	}
	void price() {
		System.out.println(this.price+"���Դϴ�.");
		// this.price�� ��ü�� ã�ư� ���� ����
	}
	

	

}
