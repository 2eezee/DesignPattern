package state;

	/* [State 패턴 실습]
		
		1초마다 1~10까지의 난수를 발생시키고 홀수가 나오면 "홀수입니다" 출력, 짝수가 나오면 "짝수입니다" 출력
		2의 배수가 나오면 "2의 배수입니다" 출력, 3의 배수가 나오면 "3의 배수입니다" 출력
		
		위 내용이 반영되는 프로그램을 state 패턴을 사용하여 만들어보세요
		(if, else 구문은 최소화 한다) */
		
public interface State {
	void handle(int number);
}

