class Base {
  int x = 1;

  void method() {
    System.out.println("Base method");
  }
}

class Derived extends Base {
  int x = 2;
  int y = 3;

  void method() { // overriding
    System.out.println("Derived method");
  }
}

public class PolinoTest3 {
  public static void main(String[] args) {
    Base base1 = new Derived(); // upcasting
    base1.method(); // 다형성
    base1.x = 10;

    Base base2 = new Base();
    base2.method();

    // downcasting 할 때마다 instanceof 로 다운캐스팅 체크하라!
    if (base2 instanceof Derived) {
      Derived derived2 = (Derived) base2; // downcasting
      derived2.y = 30; // 에러
      // downcasting은 개발자가 체크해서 변수 선언된게 있는지 확인 한 다음!
    }

    if (base1 instanceof Derived) {
      Derived derived1 = (Derived) base1; // downcasting
      derived1.y = 20;
    }

    Base base3 = new Derived();
    base3.method(); // Derived method호출
    System.out.println(base3.x); // Base의 x값 출력 ; 변수는 //변수는 다형성이 적용되지 않는다.
  }
}
