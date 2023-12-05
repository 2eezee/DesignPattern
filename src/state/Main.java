package state;

import state.context.NumberContext;

public class Main {
	public static void main(String[] args) {
        NumberContext context = new NumberContext();

        while (true) {
            context.generateRandomNumber();
            try {
                Thread.sleep(1000); // 1초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
