package template;

// Open, print, close 메소드를 구현하고 있는 클래스 
public class CharDisplay extends AbstractDisplay {
	
	char ch;
	
	public CharDisplay(Character ch) {
		this.ch= ch;
	}
	
	public void open() {
		System.out.println("<<");
	}
	
	public void print() {
		System.out.println(ch);
	}
	
	public void close() {
		System.out.println(">>");
	}

}
