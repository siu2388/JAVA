
import java.util.*;

import acc.*;

public class Bank {
	Account[] accs = new Account[100];
	int accCnt;
	Scanner sc = new Scanner(System.in);

	int menu() {
		System.out.println("[코스타 은행]");
		System.out.println("1. 계좌개설");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 계좌조회");
		System.out.println("5. 전체계좌조회");
		System.out.println("0. 종료");
		System.out.print("선택>>");
		return Integer.parseInt(sc.nextLine());
	}

	void makeAccount() {
		System.out.println("[일반계좌 개설]");
		System.out.print("계좌번호:");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		if (acc != null) {
			System.out.println("이미 존재하는 계좌입니다");
			return;
		}
		System.out.print("이름:");
		String name = sc.nextLine();
		System.out.print("입금액:");
		int money = Integer.parseInt(sc.nextLine());
		accs[accCnt++] = new Account(id, name, money);
	}

	void specialAccount() {
		System.out.println("[특수계좌 개설]");
		System.out.print("계좌번호:");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		if (acc != null) {
			System.out.println("이미 존재하는 계좌입니다");
			return;
		}
		System.out.print("이름:");
		String name = sc.nextLine();
		System.out.print("입금액:");
		int money = Integer.parseInt(sc.nextLine());
		System.out.print("등급(VIP-V,Gold-G,Silver-S,Normal-N):");
		String grade = sc.nextLine();
		accs[accCnt++] = new SpecialAccount(id, name, money, grade);
	}

	Account searchAccById(String id) { // 중복계좌조회
		for (int i = 0; i < accCnt; i++) {
			if (accs[i].getId().equals(id)) {
				return accs[i];
			}
		}
		return null;
	}

	void deposit() {
		System.out.println("[입금]");
		System.out.print("계좌번호:");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		if (acc == null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		System.out.print("입금액:");
		int money = Integer.parseInt(sc.nextLine());
		acc.deposit(money); // 오버라이딩을 했기 때문에 일반/특수계좌 다은캐스팅 안해도 됨
	}

	void withdraw() {
		System.out.println("[출금]");
		System.out.print("계좌번호:");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		if (acc == null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		System.out.print("출금액:");
		int money = Integer.parseInt(sc.nextLine());
		acc.withdraw(money);
	}

	void accountInfo() {
		System.out.println("[계좌조회]");
		System.out.print("계좌번호:");
		String id = sc.nextLine();
		Account acc = searchAccById(id); // 마찬가지 오버라이딩했기 때문에 new로 생성된 일반/특수계좌 알아서 연결
		if (acc == null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		System.out.println(acc.info());
	}

	void allAccountInfo() {
		for (int i = 0; i < accCnt; i++) {
			System.out.println(accs[i].info());
		}
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		int sel;
		while (true) {
			sel = bank.menu();
			if (sel == 0)
				break;
			switch (sel) {
			case 1:
				bank.makeAccount();
				break;
			case 2:
				bank.deposit();
				break;
			case 3:
				bank.withdraw();
				break;
			case 4:
				bank.accountInfo();
				break;
			case 5:
				bank.allAccountInfo();
				break;
			}
		}
	}
}
