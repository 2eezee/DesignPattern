package adapter;

public class PrintAdapter2 implements Print {
	
	StringPrinter stringPrinter;
	
	// 위임을 이용한 패턴
	// 결합도를 낮추기 위해서 상속보다는 위임을 이용한 패턴을 사용함 
	@Override
	public void print() {
		stringPrinter = new StringPrinter();
		stringPrinter.printInfo();
	}

}
