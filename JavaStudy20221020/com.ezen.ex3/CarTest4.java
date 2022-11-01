package com.ezen.ex3;

class Car {
	String color;    //색깔
	String gearType; //변속기 종ㄹ - auto(자동), manual(수동)
	int door;        //문의 개수
	
	Car(){
		this("white","auto",4);
	}
	
	Car(String color){
		this(color,"auto",4);
	}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car(Car c){
		this(c.color, c.gearType, c.door);
	}
}

class CarTest4{
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(c1);
		
		System.out.println("c1의 color="+c1.color+", gearType="+c1.gearType+", door="+c1.door);
		System.out.println("c2의 color="+c2.color+", gearType="+c2.gearType+", door="+c2.door);
		c1.color = "blue";
		c2.color = "red";
		System.out.println("------------------------------------------------------------");
		System.out.println("c1의 color="+c1.color+", gearType="+c1.gearType+", door="+c1.door);
		System.out.println("c2의 color="+c2.color+", gearType="+c2.gearType+", door="+c2.door);
	}
}
