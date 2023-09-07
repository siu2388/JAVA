package com.test05;

public class Sales extends Employee implements Bonus {
<<<<<<< Updated upstream

  Sales() {

  }

  Sales(String name, int number, String department, int salary) {
    super(name, number, department, salary);
  }

  @Override
  public void incentive(int pay) {
    // 인센지급. pay에 120%가 기존salary에 더해짐
    salary += pay * 1.2;
  }

  public double tax() {
    // 세금 리턴. salary에 13% 징수
    return (double) salary * 0.13;
  }

  @Override
  public String toString() {
    return String.format("%s\t\t%s\t%d", name, department, salary);
  }
=======
>>>>>>> Stashed changes

}
