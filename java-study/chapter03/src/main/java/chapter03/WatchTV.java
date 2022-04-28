package chapter03;

public class WatchTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV(7, 20, false);
		
		tv.status();
		
		tv.power(true);
		
		tv.volume(120);
		tv.status();
		
		tv.volume(false);
		tv.status();
		
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();
		
		tv.power(false);
		tv.status();
	}

}
