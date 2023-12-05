package singleton;

public class Singleton {
	
	private static Singleton s = new Singleton();
	
	private Singleton() {
	}
	
	public static Singleton getInstantce() {
		return s;
	}

}
