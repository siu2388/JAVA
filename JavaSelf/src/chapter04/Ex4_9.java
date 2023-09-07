package chapter04;

public class Ex4_9 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		for (int i = 1; i <= 5; i++) {
			System.out.print(i); // print()메서드를 쓰면 가로로 출력된다.
		}
		System.out.println(); // 다음번 출력 위해 줄바꿈

		// 4_10
		System.out.println("====예제4-10====");
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum += i;
			System.out.printf("1부터 %d까지의 합 : %d\n", i, sum);
		}
	}
}
