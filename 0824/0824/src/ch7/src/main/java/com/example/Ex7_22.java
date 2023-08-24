package com.example;

abstract class Shape {
  Point p;

  Shape() {
    this(new Point(0, 0));
  }

  Shape(Point p) {
    this.p = p;
  }

  abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

  Point getPosition() { // getter 내부 멤버변수에 저장도니 값을 외부로 리턴
    return p;
  }

  void setPosition(Point p) { // setter 외부로부터 데이터를 전달받아 멤버변수에 저장
    this.p = p;
  }
}

class Point {
  int x;
  int y;

  Point() {
    this(0, 0);
  }

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "[" + x + "," + y + "]";
  }
}

class Circle extends Shape {
  double r; // 반지름
}

class Rectangle extends Shape {
  int width;
  int hieght;

  boolean isSquare() {

  }
}

public class Ex7_22 {

}
