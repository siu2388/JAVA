
public class ExceptionTest3 {

	public static void main(String[] args) {
		try {
			throw new Exception("Exception발생");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
// throws 메서드 안에서 발생할 수 있는 예외 -> 호출한 부분에다가 예외처리 위임 