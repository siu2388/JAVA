package com.test04;

public class Cargoplane extends Plane {
	int fuel;

	Cargoplane() {

	}

	Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	public void flight(int distance) {
		// System.out.println("10운항 시 연료 50감소");
		fuelSize -= distance * 5;
		// System.out.println(fuelSize);
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
