import java.sql.Connection;

public class AccountMain {

	public static void main(String[] args) {
		AccountService accountService = new AccountService();
		// 계좌개설 여부 조회
		// accountService.accountInfo("10003");

//		// 계좌 개설
//		Account acc = new Account("10003", "또치", 20000, "Silver");
//		accountService.makeAccount(acc);

		// 입금
		// accountService.deposit("10003", 50000);

		// 출금
		// accountService.withdraw("10003", 10000);

		// 전체계좌조회
		accountService.allAccountInfo();
	}
}
