package array;

public class Lotto {

	public static void main(String[] args) {
		// int타입 45개 배열 생성
		int[] ball = new int[45];

//		for (int i = 0; i <= 45; i++) {
//			ball[i] = i + 1;
//			System.out.println(ball[i]);
//		}

		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
//			System.out.println(ball[i]);
		}

		// 0~44중 하나의 임의의 정수 구해서 변수에 담기 : idx1,idx2
		for (int i = 0; i < 1000; i++) {
			int idx1 = (int) (Math.random() * 45);
			int idx2 = (int) (Math.random() * 45);
//			System.out.println(idx1);
//			System.out.println(idx2);

			int tmp = ball[idx1];
			ball[idx1] = ball[idx2];
			ball[idx2] = tmp;
		}
		for (int i = 0; i < 6; i++) {
			System.out.println("행운의 숫자: " + ball[i] + '\t');
		}
	}

}
