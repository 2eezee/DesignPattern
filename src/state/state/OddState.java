package state.state;

import state.State;

public class OddState implements State {
	
	@Override
	public void handle(int number) {
		System.out.println("홀수입니다");
	}

}
