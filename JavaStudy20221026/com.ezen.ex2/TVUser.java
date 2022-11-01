package com.ezen.ex02;

public class TVUser {

	public static void main(String[] args) {

		SamsungTV tv1 = new SamsungTV();
		tv1.powerOn();
		tv1.powerOff();
		tv1.volumeUp();
		tv1.volumeDown();
		
		LgTV tv2 = new LgTV();
		tv2.turnOn();
		tv2.turnOff();
		tv2.soundUp();
		tv2.soundDown();
		
		XiaomiTV tv3 = new XiaomiTV();
		tv3.전원온();
		tv3.전원내림();
		tv3.소리올림();
		tv3.소리내림();
	}
}
