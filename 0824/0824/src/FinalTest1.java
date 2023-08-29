class TempClass {
  final int x;
  static final int sx = 100;

  TempClass(int x) {
    this.x = x; // instance final은 생성자에서 초기화한다. (객체들마다 다른 값을 같게 하고 싶으니까)
    // sx=x; static final은 생성자에서 초기화할 수 없다.
  }

  void method(int x) {
  }
}

public class FinalTest1 {
  public static void main(String[] args) {
    final int n;
    n = 20;
    System.out.println(n);

    new Tempclass(30);
    new Tempclass(40);
  }
}
