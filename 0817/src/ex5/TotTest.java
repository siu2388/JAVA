package ex5;

import java.util.*;

public class TotTest {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int select = 0;
		int money = 0;
		int[] coins = { 5000, 1000, 500 };
		int[] prices = { 1500, 2500, 2500, 1000, 3000 };
		int[] menu = { 1, 2, 3, 4, 5 };

		// 0을 누르면 종료 다른 숫자가 나오면 계속 화면이 나올 수 있게한다.
		while (true) {
			System.out.println("[kosta cafe]");
			System.out.println("1.아메리카노(1500원)");
			System.out.println("2.카페라떼(2500원)");
			System.out.println("3.카푸치노(2500원)");
			System.out.println("4.에스프레소(1000원)");
			System.out.println("5.카페모카(3000원)");
			System.out.println("0.종료");
			System.out.print("선택하세요 : ");
			select = sc.nextInt(); // 번호선택
			if (select > 5) {
				System.out.println("메뉴는 1~5번까지 입니다. 다시 선택해주세요.");
				continue;
			}
//			if (Arrays.asList(menu).contains(select)) {
//				System.out.println("메뉴는 1~5번까지 입니다. 다시 선택해주세요.");
//				continue;
//			}
			if (select == 0)
				break;
			System.out.print("돈을 넣어주세요. (5만원권 사용불가) => ");
			money = sc.nextInt();

			// 1. 입금이 가격보다 작을 경우 : 돈이 부족합니다.
			// 2. 잔돈 : 5000(0),1000(0),500(0)

			if (money < prices[select - 1]) {
				System.out.println("현금이 부족합니다.");
				continue; // 다시 메뉴를 선택하는것으로 돌리기
			}
			int change = money - prices[select - 1];
			System.out.print("잔돈 : ");
			for (int i = 0; i < coins.length; i++) {
				System.out.println(String.format("%d(%d)", coins[i], change / coins[i]));
				change = change % coins[i];
			}
			System.out.println();
		}

	}

}
