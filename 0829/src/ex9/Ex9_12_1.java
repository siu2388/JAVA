package ex9;

public class Ex9_12_1 {
	static int getRand(int from, int to) {

		int min = Math.min(from, to);
		int max = Math.max(from, to);
		if (from > to) {
			int tmp = from;
			to = from;
			to = tmp;
		}
		return (int) (Math.random() * (max - min + 1)) + min;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++)
			System.out.print(getRand(1, -3) + ",");
		// System.out.println(getRand(5, 3));
	}

}
