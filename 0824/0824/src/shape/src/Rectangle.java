package shape.src;

public class Rectangle extends Shape {
  Point startPos;
  int width;
  int height;

  public Rectangle() {
    super("black");
    startPos = new Point();
  }

  public Rectangle(String color, Point startPos, int width, int height) {
    super(color);
    this.startPos;
    this.width = width;
    this.height = height;

  }

  @Override
  public void draw() {
    System.out.println(String.format("[사각형: 색(%s), 시작점%s, 너비(%d), 높이(%d)]",
        getColor(), getWidth(), getHeight()));
  }
}
