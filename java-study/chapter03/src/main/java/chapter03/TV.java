package chapter03;

public class TV {

		private int channel; // 0 ~ 255, 255 이상이면 다시 0이어야 함
		private int volume; // 0 ~ 100, 100이상이면 다시 0이어야 함
		private boolean power;
		
		public TV() {
			
		}
		
		public TV(int channel, int volume , boolean power) {
			this.channel = channel;
			this.volume = volume;
			this.power = power;
		}
		
		public int getChannel() {
			return channel;
		}
		public int getVolume() {
			return volume;
		}
		public boolean isPower() {
			return power;
		}

		public void status() {
			// TODO Auto-generated method stub
			System.out.println("현재 TV 상황\n");
			System.out.println("채널: "+getChannel()+"\n");
			System.out.println("볼륨: "+getVolume()+"\n");
			
			String message = "";
			if(isPower() == true) {
				message = "켜짐";
			}
			else {
				message = "꺼짐";
			}
			System.out.println("전원: "+message);
		}

		public void power(boolean on) {
			// TODO Auto-generated method stub
			this.power = on;
		}

		public void volume(int volume) {
			// TODO Auto-generated method stub
			this.volume = volume;
		}

		public void volume(boolean up) {
			// TODO Auto-generated method stub
			this.volume += 1;
			if(this.volume > 100) {
				this.volume = 1;
			}
		}

		public void channel(boolean up) {
			// TODO Auto-generated method stub
			this.channel += 1;
			if(this.channel > 255) {
				this.channel = 1;
			}
		}
		
		public void channel(int channel) {
			this.channel = channel;
		}
}
