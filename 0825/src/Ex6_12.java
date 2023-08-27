/*
 * 기본생성자와 매개변수가 있는 생성자
 * */

class Car {
	//iv 선언
	String color;
	String gearType;
	int door;
	
	Car() {}  //기본생성자
	
	Car(String c, String g, int d) {  //매개변수가 있는 생성자
		color  = c;
		gearType = g;
		door = d;
	}
}
 class Ex6_12 {

	public static void main(String[] args) {
		Car c1 = new Car();  //인스턴스를 생성한 다음에
		c1.color = "white";  //각 원하는 값으로 초기화
		c1.gearType = "auto";
		c1.door = 4;
		
		//new=>인스턴스를 생성과 동시에 원하는 값으로 초기화
		Car c2 = new Car("white","auto",4);
		
		System.out.println("c1차정보 : "+c1.color+c1.gearType+c1.door);
		System.out.println("c2차정보 : "+c2.color+c2.gearType+c2.door);

	}

}
