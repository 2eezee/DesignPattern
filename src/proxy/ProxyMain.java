package proxy;

import java.util.Scanner;

/* 1~10 까지의 숫자를 하나 입력 받습니다
1~5가 입력된 경우 프락시에서 출력합니다
6~10이 입력된 경우 원본에서 출력합니다 
단, 원본객체는 필요할 때 생성합니다 */

public class ProxyMain {

	public static void main(String[] args) {
		  INum proxy = new INumberProxy();

		  Scanner scanner = new Scanner(System.in);

	      System.out.print(" 1~10 까지의 숫자중 하나를 입력하세요: ");
	      int inputNumber = scanner.nextInt();

	      proxy.print(inputNumber);
	      }
	  }


