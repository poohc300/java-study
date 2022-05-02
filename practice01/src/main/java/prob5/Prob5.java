package prob5;

public class Prob5 {

	public static void main(String[] args) {
		int i = 0;
		String result = "";
		for(i=30; i<33; i++) {
			result = String.valueOf(i);
			System.out.println(result.contains("3"));
		}
	}
}
