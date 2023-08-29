import java.util.*;

import acc.*;
import exception.*;

public class Bank {
	Account[] accs = new Account[100];
	int accCnt;
	Scanner sc = new Scanner(System.in);

	int menu() throws BankException {
		System.out.println("[코스타 은행]");
		System.out.println("1. 계좌개설");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 계좌조회");
		System.out.println("5. 전체계좌조회");
		System.out.println("0. 종료");
		System.out.print("선택>>");
		int sel = Integer.parseInt(sc.nextLine());
		if (!(sel >= 0 && sel <= 5)) {
			throw new BankException("메뉴 선택 오류", BankError.ACCMENU);
		}
		return sel;
	}

//	int menu() {
//		System.out.println("[코스타 은행]");
//		System.out.println("1. 계좌개설");
//		System.out.println("2. 입금");
//		System.out.println("3. 출금");
//		System.out.println("4. 계좌조회");
//		System.out.println("5. 전체계좌조회");
//		System.out.println("0. 종료");
//		System.out.print("선택>>");
//		int sel = Integer.parseInt(sc.nextLine());
//		if (!(sel >= 0 && sel <= 5)) {
//			try {
//				throw new BankException("메뉴 선택 오류", BankError.ACCMENU);
//
//			} catch (BankException e) {
//				System.out.println(e);
//				menu();
//			}
//		}
//		return sel;
//	}

	void selAccMenu() throws BankException {
		System.out.println("[계좌개설]");
		System.out.println("1.일반계좌");
		System.out.println("2.특수계좌");
		System.out.print("선택>>");
		int sel = Integer.parseInt(sc.nextLine());

		switch (sel) {
		case 1:
			makeAccount();
			break;
		case 2:
			makeSpecialAccount();
			break;
		default:
//			try {
			throw new BankException("메뉴 선택 오류", BankError.ACCMENU);
//			} catch (BankException e) {
//				System.out.println(e);
//				selAccMenu();
//			}
		}

	}

	void makeAccount() throws BankException {
		System.out.println("[일반계좌 개설]");
		System.out.print("계좌번호:");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		if (acc != null) {
			throw new BankException("계좌 중복 오류", BankError.EXISTID);
		}
		System.out.print("이름:");
		String name = sc.nextLine();
		System.out.print("입금액:");
		int money = Integer.parseInt(sc.nextLine());
		accs[accCnt++] = new Account(id, name, money);
	}

	void makeSpecialAccount() throws BankException {
		System.out.println("[특수계좌 개설]");
		System.out.print("계좌번호:");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		if (acc != null) {
			throw new BankException("계좌오류 ", BankError.EXISTID);
		}
		System.out.print("이름:");
		String name = sc.nextLine();
		System.out.print("입금액:");
		int money = Integer.parseInt(sc.nextLine());
		System.out.print("등급(VIP-V,Gold-G,Silver-S,Normal-N):");
		String grade = sc.nextLine();
		// 추가
		accs[accCnt++] = new SpecialAccount(id, name, money, grade);
	}

	Account searchAccById(String id) {
		for (int i = 0; i < accCnt; i++) {
			if (accs[i].getId().equals(id)) {
				return accs[i];
			}
		}
		return null;
	}

	void deposit() throws BankException {
		System.out.println("[입금]");
		System.out.print("계좌번호:");
		String id = sc.nextLine();
		Account acc = searchAccById(id);

		if (acc == null) {
			throw new BankException("계좌번호 오류", BankError.NOID);
		}

//		if (acc == null) {
//			System.out.println("계좌번호가 틀립니다.");
//			return;
//		}
		System.out.print("입금액:");

		int money = Integer.parseInt(sc.nextLine());
		acc.deposit(money);
	}

	void withdraw() throws BankException {
		System.out.println("[출금]");
		System.out.print("계좌번호:");
		String id = sc.nextLine();
		Account acc = searchAccById(id);

		if (acc == null) {
			throw new BankException("계좌번호 오류", BankError.NOID);
		}
//		if (acc == null) {
//			System.out.println("계좌번호가 틀립니다.");
//			return;
//		}
		System.out.print("출금액:");
		int money = Integer.parseInt(sc.nextLine());
		acc.withdraw(money);
	}

	void accountInfo() throws BankException {
		System.out.println("[계좌조회]");
		System.out.print("계좌번호:");
		String id = sc.nextLine();
		Account acc = searchAccById(id);

		if (acc == null) {
			throw new BankException("계좌번호 오류", BankError.NOID);
		}
//		if (acc == null) {
//			System.out.println("계좌번호가 틀립니다.");
//			return;
//		}
		System.out.println(acc);
	}

	void allAccountInfo() {
		for (int i = 0; i < accCnt; i++) {
			System.out.println(accs[i]);
		}
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		int sel;
		while (true) {
			try {
				sel = bank.menu();
				if (sel == 0)
					break;
				switch (sel) {
				case 1:
					bank.selAccMenu();
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
			} catch (NumberFormatException e) {
				System.out.println("입력 형식이 맞지 않습니다. 다시 선택하세요.");
			} catch (BankException e) {
				System.out.println(e);
			}

		}
	}
}