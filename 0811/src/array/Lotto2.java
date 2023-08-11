package array;

public class Lotto2 {

	public static void main(String[] args) {
		int[] ball = new int[6];

		int count = 0; // 카운팅의 역할 or 들어가있는 갯수의 역할
		boolean isExisted = false;

		// 1~45까지 숫자 중 하나를 골라-> 공 하나를 뽑고 , 뽑은공은 다시 바구니로 들어가게됨
		// 배열 ball에 하나씩 넣는데,
		// 이미 존재한 값이 있으면 넣으면 안됨
		while (true) {
			int num = (int) ((Math.random() * 45) + 1);
			isExisted = false;
			for (int i = 0; i < count; i++) {
				if (ball[i] == num) {
					isExisted = true;
					break;
				}
			}
			if (isExisted == false) {
				ball[count++] = num;
			}
			if (count == 6)
				break;

		}
		for (int i = 0; i < ball.length; i++) {
			System.out.print(ball[i] + ",");
		}
	}

}
