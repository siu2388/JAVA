/*
 * 생성자에서 다른 생성자 호출하기 
 * 1.this()로 사용
 * 2.반드시 첫번째 줄에서 호출*/
class Car2 {
	String color;
	String gearType;
	int door;
	
//생성자1 ->3을 호출
	//하나의 클래스 내부!!! 다른 생성자를 호출 할 때 Car2로 호출하지 않고 this()를 사용 & 첫줄에서 호출
	Car2() {  
		this("white","auot",4);
	}
//생성자2 ->3을 호출
	Car2(String color) {
		this(color,"auot",2);
	}	
//생성자3
	Car2(String color, String gearType , int door) { 
		this.color = color;  // this.color 는 iv, color는 lv
		this.gearType = gearType;
		this.door = door;
	}
}
public class Ex6_13 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue");
		Car2 c3 = new Car2("yellow","m",2);
		System.out.println("c1의 차량 스펙 : " +c1.color+c1.gearType+c1.door);	
		System.out.println("c2의 차량 스펙 : " +c2.color+c2.gearType+c2.door);	
		System.out.println("c3의 차량 스펙 : " +c3.color+c3.gearType+c3.door);
	}	

}

/*
 * this는 참조변수로 인스턴스 자신을 가리킨다. (인스턴스의 주소가 저장되어 있다.)
 * 인스턴스멤버만 사용할 수 있다.
 * !static메서드에서는 this를 사용할 수 없다. 
 * this -> 참조변수 
 * this() -> 생성자*/