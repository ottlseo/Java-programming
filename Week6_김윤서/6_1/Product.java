
public class Product {
	int price;
	int bonusPoint; //중복되는 멤버 부모 클래스에 지정
	
	Product(int price){
		this.price=price; //price는 입력받고
		bonusPoint=(int)(price/10.0); //이 식은 공통-10%적립
	}
	Product(){}
}
