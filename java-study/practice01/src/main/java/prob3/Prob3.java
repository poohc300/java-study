package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		System.out.println("숫자를 입력하세요:");
		int number = scanner.nextInt();
		int i = 0;
		int sum = 0;
		
		for(i=0;i<number+1;i++) {
			if(number % 2 == 1) {
				if(i % 2 == 1) {
					sum+=i;
				}
			}
			else if(number % 2 == 0) {
				if(i % 2 == 0) {
					sum+=i;
				}
			}
			
			
		}
		System.out.println("결과 값: "+sum);
		scanner.close();
	}
}
