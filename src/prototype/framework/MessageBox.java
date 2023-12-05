package prototype.framework;
//Product 인터페이스를 구현하는 MessageBox 클래스
public class MessageBox implements Product {
	 // 장식 문자
	private char decochar;
	
	  // 생성자: 장식 문자를 받아 초기화
	public MessageBox(char decochar) {
		this.decochar = decochar;
	}
    // Product 인터페이스의 use 메서드를 구현
	@Override
	public void use(String s) {
		   // 장식 문자를 사용하여 상자를 출력
		int decolen = 1 + s.length() + 1;
		for (int i = 0; i < decolen; i++) {
			System.out.print(decochar);
		}
		System.out.println();
		System.out.println(decochar + s + decochar);
		for(int i = 0; i < decolen; i++) {
			System.out.print(decochar);
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
