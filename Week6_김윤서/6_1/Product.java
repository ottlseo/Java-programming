
public class Product {
	int price;
	int bonusPoint; //�ߺ��Ǵ� ��� �θ� Ŭ������ ����
	
	Product(int price){
		this.price=price; //price�� �Է¹ް�
		bonusPoint=(int)(price/10.0); //�� ���� ����-10%����
	}
	Product(){}
}
