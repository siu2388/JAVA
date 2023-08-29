package chap6_0826;

/*
 * 6_4의 getDistance() -static메서드를 인스턴스 메서드로 변경*/
class MyPoint {
	int x;
	int y;

	MyPoint(int x, int y) { // 매개변수가 있는 생성자
		this.x = x; // iv초기화
		this.y = y;
	}

	double getDistance(int x1, int y1) { // 인스턴스 메서드
		return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
	}
}

public class Ex6_6 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);

		System.out.println(p.getDistance(2, 2));
	}

}

/*
 * static메서드는 메서드 내에서 iv 사용하지 않음 . 매개변수(lv)로 작업에 필요한 값을 전부 받아 써야한다.
 */
