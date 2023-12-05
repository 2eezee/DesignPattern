package proxy;

public class INumber implements INum {
	
	 @Override
	    public void print(int number) {
	        System.out.println("원본에서 출력: " + number);
	    }

}
