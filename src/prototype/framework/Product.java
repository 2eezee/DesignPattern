package prototype.framework;

//Product 인터페이스는 프로토타입 패턴을 구현하기 위한 기본적인 메서드를 정의합니다.
//Cloneable 인터페이스를 상속하여 객체 복제가 가능하도록 지정합니다.
public interface Product extends Cloneable {
	   // 주어진 문자열을 이용하여 어떻게 사용할지 정의하는 메서드
	public abstract void use(String s);
	 // 현재 객체를 복제하여 새로운 객체를 생성하는 메서드
	public abstract Product createCopy();

}
