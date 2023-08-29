class Car {
  String color;
  int door;

  void drive() {
    System.out.println("drive, Brrr~~~");
  }

  void stop() {
    System.out.println("stop!!");
  }
}

class FireEngine extends Car {
  void water() {
    System.out.println("Water ~~~");
  }
}

class Ambulance extends Car {
  void siren() {
    System.out.println("siren~~~");
  }
}
// 다형성 부모가 자식 객체를.. -> 가능

public class PolinoTest4 {
  public static void main(String[] args) {
    FireEngine fe = new FireEngine();
    fe.water();

    Car car = fe; // upcasting

    if (car instanceof FireEngine) { // downcasting
      FireEngine fe2 = (FireEngine) car;
      fe2.water();
    }
  }
}
