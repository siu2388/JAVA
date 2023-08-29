package exception;

public class BankException extends Exception {
	private BankError errCode;

	public BankException(String message, BankError errCode) {
		super(message);
		this.errCode = errCode;
	}

	@Override
	public String toString() {
		String msg = "[" + super.getMessage() + "]";
		switch (errCode) {
		case NOID:
			msg += "계좌번호 오류입니다. ";
			break;
		case EXISTID:
			msg += "계좌번호가 중복됩니다.";
			break;
		case LACK:
			msg += "잔액이 부족합니다.";
			break;
		case MINUS:
			msg += "입금액 오류입니다.";
			break;
		case ACCMENU:
			msg += "메뉴 번호를 확인해주세요.";
			break;
		default:
			msg += "오류가 발생하였습니다.";
			break;
		}
		return msg;
	}

}
