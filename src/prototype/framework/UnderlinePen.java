package prototype.framework;

//Product 인터페이스를 구현하는 UnderlinePen 클래스
public class UnderlinePen implements Product{
	 // 밑줄로 표시할 문자
	private char ulchar;
	 // 생성자: 밑줄로 표시할 문자를 받아 초기화
	public UnderlinePen(char ulchar) {
		this.ulchar = ulchar;
	}
	 // Product 인터페이스의 use 메서드를 구현
	@Override
	public void use(String s) {
		int ulen = s.length();
		System.out.println(s);
		for(int i = 0; i < ulen; i++) {
			System.out.print(ulchar);
		}
		System.out.println();
	}
	// Product 인터페이스의 createCopy 메서드를 구현
	@Override
	public Product createCopy() {
		Product p = null;
		try {
			// clone 메서드를 사용하여 현재 객체를 복제
			p = (Product)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}

}
