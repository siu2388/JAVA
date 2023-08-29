package ex;

import java.util.*;

public class Ex8_7 {

	public static void main(String[] args) {
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0; // 사용자 입력을 저장할 공간
		int count = 0; // 시도횟수를 세기 위한 변수

		do {
			count++;
			System.out.println("1과 100 사이의 값을 입력하세요. :");

			try {
				input = new Scanner(System.in).nextInt();
				if (answer > input) {
					System.out.println("더 큰 수를 입력하세요. ");
				} else if (answer < input) {
					System.out.println("더 작은 수를 입력하세요. ");
				} else {
					System.out.println("정답!");
					System.out.println("시도 횟수는 " + count + "번입니다.");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
				// continue; // 반복문은 계속 돌고(input아래if문을 아래 블럭에 두거나)
			}
		} while (true);
	}

}
