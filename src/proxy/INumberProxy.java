package proxy;

public class INumberProxy implements INum {
	 private INumber originalObject;

	    @Override
	    public void print(int number) {
	        if (originalObject == null) {
	            originalObject = new INumber();
	        }

	        if (number >= 1 && number <= 5) {
	            System.out.println("프락시에서 출력: " + number);
	        } else {
	            originalObject.print(number); // 원본 객체는 필요할때 생성한다 
	        }
	    }
}
