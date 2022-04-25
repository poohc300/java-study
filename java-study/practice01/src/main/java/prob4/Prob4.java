package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String text = scanner.nextLine();
		scanner.close();
		
		int i = 0;
		for(i=0;i<text.length()+1;i++) {
			System.out.println(text.substring(0,i));
		}
	}

}
