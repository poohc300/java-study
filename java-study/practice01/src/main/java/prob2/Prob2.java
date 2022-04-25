package prob2;

public class Prob2 {
	public static void main(String[] args) {
		/* 코드 작성 */
		int i = 1;
		int j = 1;
		int k = 0;
		for(i=1;i<10;i++) {
			
			for(j=i;j<11+k;j++) {
				System.out.print(j+ " ");
			}
			k++;
			System.out.println("");
			
		}
	}
}
