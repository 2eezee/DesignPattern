package template;

//Open, print, close 메소드를 구현하고 있는 클래스 
public class StringDisplay extends AbstractDisplay {
	
	String str;
	
	public StringDisplay(String str) {
		this.str = str;
	}
	
	public void open() {
		System.out.println("+===========+");
	}
	
	public void print() {
		System.out.println(str);
	}
	
	public void close() {
		System.out.println("+===========+");
	}

}
