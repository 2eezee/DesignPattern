package composite;

public class Directory extends Entry {
	
	Entry entry; // entry를 상속받으면서(is a) entry를 가지고(has a) 있어야 함 -> composite 패턴의 핵심 

	@Override
	String getName() {
		return "";
	}

	@Override
	long getSize() {
		return 0L;
	}

	@Override
	void printList() {
	}
	
	void add() {
	}

}
