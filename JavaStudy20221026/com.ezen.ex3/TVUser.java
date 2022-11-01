package com.ezen.ex03;

public class TVUser {

	public static void main(String[] args) {
		SamsungTV tv1 = new SamsungTV();
		tv1.powerOn();
		tv1.powerOff();
		tv1.volumeUp();
		tv1.volumeDown();
		
		LgTV tv2 = new LgTV();
		tv2.powerOn();
		tv2.powerOff();
		tv2.volumeUp();
		tv2.volumeDown();
		
		XiaomiTV tv3 = new XiaomiTV();
		tv3.powerOn();
		tv3.powerOff();
		tv3.volumeUp();
		tv3.volumeDown();
	}
}
