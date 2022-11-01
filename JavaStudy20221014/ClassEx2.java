package ex1;


public class ClassEx2 {

	public static void main(String[] args) {
		
		Jaehwan 김대철 = new Jaehwan();
		김대철.setName("김대철");
		김대철.setAddress("안산");
		김대철.setTrafic("자차");
		김대철.setTime(30);
		김대철.show();

	}
}
	
class Jaehwan{
	String name;
	String address;
	String trafic;
	int time;

	
	//생성자
//	Jaehwan(String n, String add, String tr, int t){
//		name=n;
//		address=add;
//		trafic=tr;
//		time=t;
//	}
	void setName(String n) {
		name = n;
	}
	
	void setAddress(String a) {
		address = a;
	}
	
	void setTrafic(String t) {
		trafic = t;
	}
	
	void setTime(int ti) {
		time = ti;
	}
	
	void show() {
		System.out.print(" 이      름 :"+name);
		System.out.print(" 주      소 :"+address);
		System.out.print(" 학원  교통편 :"+trafic);
		System.out.print(" 학원 소요시간 :"+time);
		System.out.println();
	}
}