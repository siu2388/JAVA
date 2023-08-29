package ex9;

public class Ex9_11 {

	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("시작,끝 단 두개의 정수를 입력해주세용.\nUSAGE : GUGUDAN test");
		}
		int f = Integer.parseInt(args[0]);
		int s = Integer.parseInt(args[1]);

		if (f < 2 || s > 9) {
			System.out.println("단의 범위는 2~9사이입니다.\nUSAGE : GUDAN test 3 5");
		}
		// 만약 앞자리 수를 더 크게 입력한 경우 에러처리
		if (f > s) {
			int tmp = f;
			f = s;
			s = tmp;
		}

		for (int i = f; i <= s; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(String.format("%d*%d=%d", i, j, i * j));
			}
			System.out.println();
		}
	}

}
