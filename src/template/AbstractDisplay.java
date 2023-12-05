package template;

// Display 메소드만 구현되어 있는 추상클래스
public abstract class AbstractDisplay implements Display {
	
	public void open() {}
	
	public void print() {}
	
	public void close() {}
	
	public void display() {
		open();
		print();
		close();
	}

}
