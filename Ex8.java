package CH7;

class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0); // 보너스 점수는 제품가의 10%
	}
}

class Tv1 extends Product {
	Tv1() {
		// 조상클래스의 생성자 Produc(int price)를 호출한다.
		super(100); // Tv의 가격은 100만원
	}

	// Object 클래스의 toStrin()을 오버라이딩한다.
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200); // Computer가격은 200만원
	}

	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1000; // 소유금액
	int bonusPoint = 0;
	// 구입한 제품을 저장하기 위한 카트배열
	Product[] cart = new Product[10];
	int i = 0; // Product배열cart에 사용될 인덱스

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money = money - p.price; // 가진 돈에서 구입한 제품의 가격 뺌
		bonusPoint = bonusPoint + p.bonusPoint;
		cart[i++] = p;
		System.out.println("카트에 " + p + "을/를 담았습니다.");
		System.out.println(p + " 을/를 구입하셨습니다.");
	}
}

public class Ex8 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv1()); // Tv1 t = new Tv1(); b.buy(t);를 한 문장으로 줄임
		b.buy(new Computer());

		System.out.println("잔액은 " + b.money + "만원 입니다.");
		System.out.println("현재 보너스점수는" + b.bonusPoint + "점 입니다.");
	}

}
