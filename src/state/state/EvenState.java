package state.state;

import state.State;

public class EvenState implements State {
	
	 @Override
	public void handle(int number) {
			System.out.println("2의 배수이며 짝수입니다");
	}

}
