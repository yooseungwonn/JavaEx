package com.javaex.oop.tv;

public class TV {
	
	private int channel;
	private int volume;
	private boolean power;
	
	public TV( int channel, int volume, boolean power) {
		this.channel= channel;
		this.volume = volume;
		this.power = power;	
	}
	public TV() {
		 //this(7, 20, false);
	} 
	public void power(boolean on) {
		this.power = on;
		if (power == true) {
			
			System.out.println("TV 켜짐");
			
		} else {
			System.out.println("TV 꺼짐");
		}
	}
	public void channel(int channel) { // 채널 변경 메서드
		if(channel >= 1 && channel <= 255) { // 채널 범위 : 1 ~255
			this.channel = channel;          // 범위를 벗어나면 채널 변경 없음
			System.out.println(channel + "번입니다. ");
		} 
	}
	public void channel(boolean up) { // 채널 변경 메서드(오버로딩)
		
		if(channel >= 1 && channel <= 255) {
			if(up == true) { // 채널 올림
				channel++;
			}
			else {
				channel--; // 채널 내림
			}
			System.out.println(channel + "번입니다. ");
		}
	
		
	}
	public void volume(int volume) { // 볼륨 변경 메서드
		if(volume >= 1 && volume <= 100) { // 볼륨 범위 : 0 ~ 100
			this.volume = volume;
			System.out.println("음량은 " + volume + "입니다. ");
		}
	}
	public void volume(boolean up) { // 볼륨 변경 메서드(오버로딩)
		if(volume >= 1 && volume <= 100) {
			if(up == true) {  // 볼륨 올림
				volume++;
			}
			else {
				volume--;  // 볼륨 내림
			}
			System.out.println("음량은 " + volume + "입니다. ");
		}
	}
	public void status() {
		if (power == true) {
			
			System.out.println("TV 켜짐");
			
		} else {
			System.out.println("TV 꺼짐");
		}
		System.out.println(channel + "번입니다.  ");
		System.out.println("음량은 " + volume + "입니다. ");
	}
	public int getChannel() {
		return channel;
	}
	
	public boolean getPower() {
		return power;
	}
	
	public int getVolume() {
		return volume;
	}

//	public void status() {
//		printPower();
//		printChannel();
//		printVolume();
		
}


