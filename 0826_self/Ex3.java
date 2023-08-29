package CH7;

public class Ex3 {

	public static void main(String[] args) {
		Child2 c2 = new Child2();
		c2.method();
	}

}

class Parent2 {
	int x = 10; // super.x와 this.x 둘다가능
}

class Child2 extends Parent2 {
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x =" + super.x);
	}
}

/*
 * 모든 인스턴스메서드에는 this와 super가 지역변수로 존재하는데, 이 들에는 자신이 속한 인스턴스의 주소가 자동으로 저장된다.
 */
