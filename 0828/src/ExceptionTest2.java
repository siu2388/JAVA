
public class ExceptionTest2 {

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50, 60 };
		int[] arr2 = { 2, 4, 6, 0, 10 };
		int tot = 0; // sum(arr1[i]/arr2[i])
		int count = arr1.length;
		double avg = 0; // tot/갯수

		for (int i = 0; i < arr1.length; i++) {
			try {
				tot += arr1[i] / arr2[i];

			} catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
				count--;
			} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
				count--;
			} catch (Exception e) {
				count--;
			} // 자손예외를 부모가 받아서 처리할 수도 있다. 최상위 예외는 가장 마지막에 위치
			// catch (Exception e) {} // 괄호처리로만 구현해도 예외처리 된거임
		}
		System.out.println(tot);
		System.out.println(tot / (double) count);
		System.out.println("프로그램 종료");
	}
}