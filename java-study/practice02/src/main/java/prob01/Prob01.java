package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		
		System.out.print("금액: ");
		int number = scanner.nextInt();
		int i = 0;
		int count = 0;
		
		for(i=0;i<MONEYS.length;i++) {


			
			System.out.println(number);
			count = number / MONEYS[i];
			number = number % MONEYS[i];

			System.out.println(MONEYS[i]+"원: "+count+"개");
			count = 0;
		}
		/* 코드 작성 */
		
		scanner.close();
 	}
}