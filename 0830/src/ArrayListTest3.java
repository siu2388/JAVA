import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Account {
	String id;
	int balance;

	Account() {

	}

	Account(String id, int balance) {
		this.id = id;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return String.format("계좌번호:%s, 잔액: %d", id, balance);
	}
}

class IdCompare implements Comparator<Account> {
	@Override
	public int compare(Account a, Account b) {
		return a.id.compareTo(b.id);
	}
}

public class ArrayListTest3 {

	public static void main(String[] args) {
		List<Account> acc = new ArrayList<>();
		acc.add(new Account("111", 100));
		acc.add(new Account("411", 500));
		acc.add(new Account("211", 200));

		Collections.sort(acc, new IdCompare());
//		for (Account a : acc) {
//			System.out.println(acc);
//		}
		// 데이터 조회만 할 때 가장 좋은 for문

		for (int i = 0; i < acc.size(); i++) { // length 말고 size
			System.out.println(acc.get(i)); // idx연산자 말고 get
		}
		/*
		데이터를 삭제할 떄는 for문 안에 size처럼 크기가 변경될 수 있는 코드가 포함되어 있을 경우
		데이터의 꼬임이 발생할 수 있기 떄문에 Iterator를 사용하는 것을 권장한다.
		 * */

		System.out.println("======Itrator");
		// 반복자 Iterator
		Iterator<Account> it = acc.iterator();
		while (it.hasNext()) {
			Account a = it.next();
			System.out.println(a);
		}
	}

}
