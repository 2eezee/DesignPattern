package template;

// 동작 테스트용 클래스 
public class Main {
	
	public static void main(String[] args) {
		
		Display charDisplay = new CharDisplay('A');
		Display StringDisplay = new StringDisplay("Hello");
		
		charDisplay.display();
		StringDisplay.display();
		
	}

}
