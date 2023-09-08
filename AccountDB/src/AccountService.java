import java.sql.Connection;
import java.util.List;

public class AccountService {
	public void accountInfo(String id) {
		Connection conn = Dao.getConnection();

		// 계좌개설 여부 조회 후 계좌 리턴
		Account acc = Dao.selectAccount(conn, "10001");
		if (acc == null) {
			System.out.println("계좌가 없습니다. 다시 확인해주세요.");
		} else {
			System.out.println(acc);
		}
		Dao.close(conn);
	}

	public void allAccountInfo() {
		Connection conn = Dao.getConnection();
		List<Account> accounts = Dao.selectAccountList(conn);
		for (Account account : accounts) {
			System.out.println(account);
		}
		Dao.close(conn);
	}

	public void makeAccount(Account acc) {
		Connection conn = Dao.getConnection();
		Account checkAccount = Dao.selectAccount(conn, acc.getId()); // 중복계좌체크
		if (checkAccount != null) {
			System.out.println("중복 계좌번호입니다.");
		} else {
			int insertedCount = Dao.insertAccount(conn, acc);
			if (insertedCount > 0) {
				System.out.println(insertedCount + "개의 계좌가 성공적으로 개설되었습니다.");
			}
		}
		Dao.close(conn);
	}

	public void deposit(String id, Integer money) {
		Connection conn = Dao.getConnection();
		Account acc = Dao.selectAccount(conn, id);
		if (acc == null) {
			System.out.println("계좌번호가 틀립니다유");
			return;
		}
		acc.deposit(money);
		if (Dao.updateAccount(conn, acc) > 0) {
			System.out.println("입금했어요!");
			System.out.println(String.format("%s계좌의 잔액은 %d원 입니다.", acc.getId(), acc.getBalance()));
		}
		Dao.close(conn);
	}

	public void withdraw(String id, Integer money) {
		Connection conn = Dao.getConnection();
		Account acc = Dao.selectAccount(conn, id);
		if (acc == null) {
			System.out.println("계좌번호가 틀린데용?");
			return;
		}
		if (acc.getBalance() < money) {
			System.out.println("잔액이 부족합니다.");
		}
		acc.withdraw(money);
		if (Dao.updateAccount(conn, acc) > 0) {
			System.out.println("출금에 성공했시유^^");
			System.out.println(String.format("%s계좌의 잔액은 %d원 입니다.", acc.getId(), acc.getBalance()));
		}
		Dao.close(conn);
	}

}
