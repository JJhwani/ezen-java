package ex1;

public class TvTest {

	public static void main(String[] args) {
		Tv t;            //TV 인스턴스를 참조하기 위한 변수 t를 선언
		t = new Tv();    //TV 인스턴스를 생성한다.
		t.channel = 7;   //TV 인스턴스의 멤버변수 channel의 값을 7로 한다.
		t.channelDown(); //TV 인스턴스의 매서드 channelDown()을 호출한다.
		System.out.println("현재 채널은 "+t.channel+"입니다.");
		
		

	}

}

class Tv{
	//TV의 속성
	String Color;   //색상
	boolean power;  //전원상태(on/off)
	int channel;    //채널
	
	void power(){	power =!power;	}     //TV를 켜거나 끄는 기능을 하는 매서드
	void channelUp() {	++channel;	}     //TV의 채널을 높이는 기능을 하는 매서드
	void channelDown() {	--channel;	} //TV의 채널을 낮추는 기능을 하는 매서드
}
