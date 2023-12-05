// state.context.NumberContext.java
package state.context;

import java.util.Random;
import state.State;
import state.state.*;

public class NumberContext {
    private State currentState;

    public NumberContext() {
        currentState = new OddState();
    }

    public void generateRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        System.out.println("생성된 숫자: " + randomNumber);

        // 상태 변경 로직
        if (randomNumber % 3 == 0) {
            currentState = new MultipleOfThreeState();
        } else if (randomNumber % 2 == 0) {
            currentState = new EvenState();
        } else {
            currentState = new OddState();
        }

        // 현재 상태 처리
        currentState.handle(randomNumber);
    }
}
