package ex4;

public class ex11 {

	public static void main(String[] args) {
		// Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 한다.
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; // 세번째 값
		System.out.print(num1 + "," + num2);
		for (int i = 0; i < 8; i++) {
			num3 = num1 + num2;
			System.out.print("," + num3);
			num1 = num2;
			num2 = num3;
		}
	}

}

// println 아님 주의 
//3번째 숫자를 먼저 지정하고, 2번쨰 숫자를 먼저 1번으로 보내고, 3번째 숫자를 2번으로 보냄
