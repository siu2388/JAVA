class Point implements Cloneable {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;

	}

	@Override
	public String toString() {
		return x + ", " + y;
	}

	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
		}
		return obj;
	}
}

public class CloneTest {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		Object obj = p.clone(); // Object 였으니까
		Point cp = (Point) obj; // Point(원래 나의 타입)다운캐스팅

		System.out.println(p);
		System.out.println(cp);
	}

}
