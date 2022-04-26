package prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		/* 코드를 완성합니다 */
		char[] temp = str.toCharArray();
		char[] reversed_arr = new char[temp.length];

		int i = 0;
		int j = 0;
		for(i=temp.length-1;i>=0;i--) {
			reversed_arr[j] = temp[i];
			j++;
		}
		System.out.println(reversed_arr);
		return reversed_arr;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		System.out.println( array );
	}
}