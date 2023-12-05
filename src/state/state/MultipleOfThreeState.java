package state.state;

import state.State;

public class MultipleOfThreeState implements State {
	
	@Override
	public void handle(int number) {
		System.out.println("3의 배수입니다");
	}

}
