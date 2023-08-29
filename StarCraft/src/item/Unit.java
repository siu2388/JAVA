package item;

public class Unit {
	int healthPoint; // 각 개체가 가질 수 있는 포인트 (파워)
	final int MAX_HP;

	Unit(int hp) { // 생성자 (자식이 기본생성자 호출하지만 초기 생성 시 각자의 최대값으로 초기화)
		MAX_HP = hp;
		healthPoint = MAX_HP;
	}

}
