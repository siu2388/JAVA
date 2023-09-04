package com.test05;

public class Secretary extends Employee implements Bonus {

  Secretary() {
  }

  Secretary(String name, int number, String departement, int salary) {
    super(name, number, departement, salary);
  }

  // public을 써줘야 밑줄이 없어지는 이유?
  public void incentive(int pay) {
    // 인센지급. pay에 80%가 기존 salary에 더해짐
    salary += pay * 0.8;
  }

  public double tax() {
    // 세금 리턴. salary에 10%징수
    return (double) salary * 0.1;
  }

  @Override
  public String toString() {
    return String.format("%s\t\t%s\t%d", name, department, salary);
  }
  getIncentive
}
