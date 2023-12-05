package prototype.framework;

import java.util.HashMap;
import java.util.Map;
//프로토타입 패턴을 관리하는 Manager 클래스
public class Manager {
	// 프로토타입을 보관하는 맵
	private Map<String, Product> showcase = new HashMap<>();
	// 프로토타입을 등록하는 메서드
	public void register(String name, Product prototype) {
		showcase.put(name, prototype);
	}
	// 등록된 프로토타입을 기반으로 새로운 인스턴스를 생성하는 메서드
	public Product create(String prototypeName) {
		// 프로토타입 맵에서 해당 이름의 프로토타입을 가져옴
		Product p = showcase.get(prototypeName);
		// 가져온 프로토타입을 복제하여 반환
		return p.createCopy();
	}

}
