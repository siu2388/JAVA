package com.test04;

public class PlaneTest {

	public static void main(String[] args) {

		String infoString = "Plane fuelSize";
		// Airplane과 Cargoplane 객체생성
		Airplane airplane = new Airplane("L777", 1000);
		Cargoplane cargoplane = new Cargoplane("C50", 1000);
		System.out.println(infoString);
		System.out.println("-----------------");
		// 생성된 객체의 정보 출력
		System.out.println(airplane);
		System.out.println(cargoplane);

		// Airplane과 Cargoplane 객체에 100씩 운항
		System.out.println("100 운항");

		System.out.println();
		System.out.println(infoString);
		System.out.println("-----------------");
		// 운항후 객체의 변경된 정보 출력

		airplane.flight(100);
		cargoplane.flight(100);
		System.out.println(airplane);
		System.out.println(cargoplane);
		// Airplane과 Cargoplane 객체에 200씩 주유
		System.out.println("200 주유");

		System.out.println();
		System.out.println(infoString);
		System.out.println("-----------------");
		// 주유후 객체의 변경된 정보 출력
		airplane.refuel(200);
		System.out.println(airplane);
		System.out.println(cargoplane);

	}

}
