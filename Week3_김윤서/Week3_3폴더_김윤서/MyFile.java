
public class MyFile {

	private String title;
	private int page;
	
	public void setTitle(String title) {
		this.title=title; //title�� this.title�� �����ϴ� setter�޼���
		}
	public String getTitle() {
		return title;
	}
	public void setPage(int page) {
		this.page=page; //page�� this.page�� �����ϴ� setter�޼���
	}
	public int getPage() {
		return page;
	}
	
	public void fileCopy(MyFile fnew) {
		fnew.title=this.title; //fileCopy(fnew): �Ű������� ���� fnew������ title�� ���� ����(this.)�� title ����.
		fnew.page=this.page; //fileCopy(fnew): �Ű������� ���� fnew������ page�� ���� ����(this.)�� page ����.
	}
	
	public void fileInfo() {
		System.out.println("���� ����:"+this.title);
		System.out.println("������:"+this.page);
	} //�ش� file ��ü�� ��������(this.title)�� ������(this.page) ��� 
		
	}
