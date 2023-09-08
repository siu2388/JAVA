package acc;

import java.io.Serializable;

import exc.BankError;
import exc.BankException;

public class Account implements Serializable {
	String id;
	String name;
	int balance;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public Account() { // 기본생성자
	}

	public Account(String aid, String aname, int money) {
		id = aid;
		name = aname;
		balance = money;
	}

	@Override
	public String toString() {
		return String.format("계좌번호:%s,이름:%s,잔액:%d", id, name, balance);
	}

	public void deposit(int money) throws BankException {
		if (money <= 0) {
			throw new BankException("입금 오류", BankError.LACK);
		}
		balance += money;
	}

	public void withdraw(int money) throws BankException {
		if (balance < money) {
			throw new BankException("출금 오류", BankError.LACK);
		}
		if (balance >= money) {
			balance -= money;
		}
	}
}
