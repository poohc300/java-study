package prob03;

public class CurrencyConverter {
	private static double rate;
	
	public static double toDollar(double won) {
	      // 한국 원화를 달러로 변환
		won = won / rate;
		return won;
	}
	
	public static double toKRW(double dollar) {
      // 달러를 한국 원화로 변환
		dollar = dollar * rate;
		return dollar;
	}

	public static void setRate(double rate) {
		CurrencyConverter.rate = rate;
	}
}
