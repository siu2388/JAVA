package CH7;

public class Ex2 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}

}

class Parent {
	int x = 10; // super.x
}

class Child extends Parent {
	int x = 20; // this.x

	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x =" + super.x);
	}
}

/*
 * 상속을 받은 int x 가 자손의 멤버인x와 이름이 같아서 둘을 구분하는 방법
 * 
 * 상속을 받은 건 super.x 내꺼는 this.x
 * 
 * this를 사용해서 멤버변수와 지역분수의 이름이 같을 때 구분했었다.
 */
