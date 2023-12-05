package prototype.framework;

public class Main {
	
	public static void main(String[] args) {
		// Manager 인스턴스 생성
		Manager manager = new Manager();

		// 다양한 유형의 제품(UnderlinePen, MessageBox) 인스턴스 생성
		UnderlinePen uPen = new UnderlinePen('-');
		MessageBox mBox = new MessageBox('*');
		MessageBox sBox = new MessageBox('/');
		
		 // Manager에 프로토타입 등록
		manager.register("strong massage", uPen);
		manager.register("warning box", mBox);
		manager.register("slash box", sBox);
		
		// 등록된 프로토타입을 사용하여 새로운 인스턴스 생성 및 사용
		Product p1 = manager.create("strong massage");
		p1.use("Hello,world");
		
		Product p2 = manager.create("warning box");      
		p2.use("Hello,world");
		
		Product p3 = manager.create("slash box");
		p3.use("Hello,world");
				
		
	}

}
