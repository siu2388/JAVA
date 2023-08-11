package ex4;

public class ex2 {

	public static void main(String[] args) {
		// 1부터 20까지의수 중에서 2 또는 3의 배수가 아닌 총합을 구하시오.
		int sum = 0;
//		for (int i = 1; i <= 20; i++) {
//			if (i % 2 != 0 || i % 3 != 0)
//				continue;
//			sum = sum + i;
//
//		}

		for (int i = 1; i <= 20; i++) {
			if (!(i % 2 != 0 || i % 3 != 0)) { // if(i % 2 != 0 && i % 3 != 0)
				sum = sum + i;
			}
		}
		System.out.println(sum);

	}

}
//continue 를 if에 중괄호를 쓰면 어디에다가??
