package com.test04;

public abstract class Plane {
	String planeName;
	int fuelSize;
	int fuel;

	Plane() {

	}

	Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}

	public void refuel(int fuel) {
		// 일정량의 연료 주입 , 기존연료가 증가됨
		fuelSize = fuelSize + fuel;
	}

	abstract void flight(int distance);

	public String getPlaneName() {
		return planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public String toString() {
		return getPlaneName() + " " + getFuelSize();
	}
}
