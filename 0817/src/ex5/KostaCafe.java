package ex5;

import java.util.*;

public class KostaCafe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int select = 0;
		int money = 0;
		int orderCount = 0;
		int[] order = new int[10]; // 한번에 주문할 수 있는개수 10개 지정
		int[] coins = { 5000, 1000, 500 };
		int[] prices = { 1500, 2500, 2500, 1000, 3000 };
		String[] menu = { "아메리카노", "카페라떼", "카푸치노", "에스프레소", "카페모카" };

		while (true) {
			System.out.println("[kosta cafe]");
			for (int i = 0; i < menu.length; i++) {
				System.out.println(String.format("%d. %s(%d원)", i + 1, menu[i], prices[i]));
			}
			System.out.println("0.종료");
			System.out.print("선택하세요 : ");
			select = sc.nextInt(); // 번호선택
			if (select == 0) {
				// 1.주문내역 보여주기
				// 2.돈 입력받기
				// 3.돈이 부족하면 '돈이부족합니다.'
				// 4.돈이 부족하지 않으면 잔돈 내어주기
				/*
				 * select값 받으면 order에 저장 order에 저장된 번호대로 menu출력 1.배열생성 String[] names = new
				 * String[3]; int size = names.length; //2.입력받기 Scanner put = new
				 * Scanner(System.in); //3.입력된 이름을 배열에 순서에 맞게 저장 for(int i=0; i<size; i++){
				 * System.out.print("이름을 입력하세요. "); names[i] = put.next(); } for(int i=0;
				 * i<size; i++){ //4.화면에 입력된 이름을 표시한다. System.out.println("이름: " +names[i]); }
				 */
//				System.out.println(sc.getClass().getName());

				for (int i = 0; i < order.length; i++) {
					order[i] = sc.nextInt();
				}
				for (int i = 0; i < order.length; i++) {
					System.out.println("주문한 메뉴: " + order[i]);
				}

				break;
			}

			order[orderCount++] = select;
		}
	}
}
