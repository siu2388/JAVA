package ex;

public class Ex8_9 {

	public static void main(String[] args) {
		try {
			throw new UnsupportedFunctionException(100, "지원하지 않는 기능입니다.");
		} catch (UnsupportedFunctionException e) {
			System.out.println(e.getMessage());
		}
	}

}

class UnsupportedFunctionException extends RuntimeException {
	private final int ERR_CODE;

	public UnsupportedFunctionException(String message) {
		super(message);
		ERR_CODE = 100;
	}

	public UnsupportedFunctionException(int errCode, String message) {
		super(message);
		ERR_CODE = errCode;
	}

	@Override
	public String getMessage() {
		return "[" + ERR_CODE + "]" + super.getMessage();
	}

}