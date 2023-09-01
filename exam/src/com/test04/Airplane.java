package com.test04;

public class Airplane extends Plane {
	int fuel;

	Airplane() {

	}

	Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	public void flight(int distance) {
		// System.out.println("10운항 시 연료 30감소");
		fuelSize -= distance * 3;
		// System.out.println(fuelSize);
	}

	@Override
	public String toString() {
//		return super.planeName + " " + super.fuelSize;
		return super.toString();
	}
}
