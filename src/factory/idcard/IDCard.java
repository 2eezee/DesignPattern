package factory.idcard;

import factory.framework.Product;

//Product 클래스의 하위 클래스
//상위 클래스 use() 메소드를 구현함
//getOwner()를 추가함 

public class IDCard extends Product {
	private String owner;
	
	IDCard(String owner) {
		System.out.println(owner + "의 카드를 만듭니다");
		this.owner = owner;
	}
	
	@Override
	public void use() {
		System.out.println(this + "을 사용합니다");
	}

	@Override
    public String toString() {
        return "IDCard[" + owner + "]";
    }
}
	
	