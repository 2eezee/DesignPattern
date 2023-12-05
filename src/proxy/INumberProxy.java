package proxy;

public class INumberProxy implements INum {
	
	 private INumber originalObject;

	    @Override
	    public void print(int number) {
	        if (originalObject == null) { 				
	        	// 프락시 객체가 아직 원본객체를 생성하지 않음, 어떤 객체도 가리키지 않겠다는 것을 의미함  
	            originalObject = new INumber();
	        } 

	        if (number >= 1 && number <= 5) {
	            System.out.println("프락시에서 출력: " + number);
	        } else {
	            originalObject.print(number);		// 원본 객체는 필요할때 생성한다 
	        }
	    }
}


// 프락시 패턴에서는 프락시 객체가 필요한 경우에만 원본 객체를 생성하여 사용하도록 하는 것이 일반적
// 불필요한 자원을 낭비하지 않으면서도 필요한 순간에만 객체를 생성할 수 있다 