
public class Song {
	
	public String title; //�뷡 ����
	public String singer; //���� �̸�
	public int price; //����
	//������� 3��

	Song(){}; //default ������
	
	Song(String title, int price){
		this(title,"��",price); 
		//���� ������ ���� ��� "��" ����
		//������ Song(String title, String singer, int price)�� this()�� ȣ��
	}
	
	Song(String title, String singer, int price){
		this.title=title;
		this.singer=singer;
		
	} //������ �� �����ڸ� this()�� ȣ��
	
	void play() {
		System.out.println(this.title+" by "+this.singer);
		//this.title,this.singer,this.price�� ��ü�� ã�ư� ���� ����
		}
	//�޼��� ����
	
}
