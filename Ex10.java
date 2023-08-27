package CH7;

abstract class Unit {
	int x, y;

	abstract void move(int x, int y); // 추상메서드

	void stop() {
		System.out.println("현재 위치에 정지");
	}
}

// move의 구현부를 구현해야 한다.
class Marine extends Unit {
	void move(int x, int y) {
		System.out.println("Marine의 move (x,y): " + "(" + x + "," + y + ")");
	}

	void stimPack() {
		System.out.println("스팀팩을 사용한다.");
	}
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("탱크의 move (x,y): " + "(" + x + "," + y + ")");
	}

	void changeMode() {
		System.out.println("공격모드를 변환");
	}
}

class Dropship extends Unit {
	void move(int x, int y) {
		System.out.println("드랍쉽의 move (x,y): " + "(" + x + "," + y + ")");
	}

	void load() {
		System.out.println("선택된 대상 태운다.");
	}

	void unload() {
		System.out.println("선택된 대상을 내린다.");
	}
}

public class Ex10 {

	public static void main(String[] args) {
		Unit[] groups = { new Marine(), new Tank(), new Dropship() };
		for (int i = 0; i < groups.length; i++) {
			groups[i].move(100, 200);
		}
		//
		Dropship dropship = new Dropship();
		dropship.load();
	}

}
