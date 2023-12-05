package factory;

import factory.framework.Factory;
import factory.framework.Product;
import factory.idcard.IDCardFactory;

// framework패키지와 idcard패키지를 이용해서 Idcard를 생성해서 사용함
// 필요한 IDCard 공장을 만들고 IDCard 공장의 create() 메소드를 호출해서 원하는 IDCard 제품을 얻는다 
public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("이아무개");
		Product card2 = factory.create("김아무개");
		Product card3 = factory.create("박아무개");
		card1.use();
		card2.use();
		card3.use();

	}

}
