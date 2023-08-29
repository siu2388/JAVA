package CH7;

public class Ex7 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		car = fe; // car = (Car)fe2;(자손을 조상타입으로 형변환시)생략가능
		// car.water(); //조상Car타입의 참조변수로 자손의 water()를 호출할 수 없지
		fe2 = (FireEngine) car;
		fe2.water();
		// 범위가 줄어드는 형변환을 하면 생략 가능하고 ,범위 넓어지는 형변환은 생략불가
		fe2.stop();
		fe.drive();
		car.stop();
	}

}

class Car {
	String color;
	int door;

	void drive() {
		System.out.println("drive, BRR~~");
	}

	void stop() {
		System.out.println("stop!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!");
	}
}