
public class WrapperTest1 {

	public static void main(String[] args) {
		int m = 10;
		long l = m; // m을 long으로 바꿔서 l에 넣는것 (객체)
		Integer n = 10; // Boxing int 가 Integer로 바뀌어서 주소를 넣음
		// int는 기본자료형
		int k = n; // Unboxing Integer를 int로

		Object obj = 100; // boxing이 된 후 upcasting
		// 모든 배열을 담을 수 있는 Object로 만들 수 있당.
	}

}
