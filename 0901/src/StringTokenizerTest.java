import java.util.StringTokenizer;

//split 과 비슷하게 문자열 자르기 
public class StringTokenizerTest {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("apple banana orange");
		while (st.hasMoreTokens()) {
			System.out.println("#1 =>" + st.nextToken());
		}

		// 구분자가 존재할 경우
		StringTokenizer st1 = new StringTokenizer("apple banana orange", ",", true);
		while (st1.hasMoreTokens()) {
			System.out.println("#2 >>" + st1.nextToken());
		}
		// true값이 있을 경우 구분자도 하나의 데이터라고 지정 default = false

		// 구분자를 여러개 지정할 수 있음.

		StringTokenizer st2 = new StringTokenizer("apple#banana?orange,kiwi", ",#?");
		System.out.println("문자열개수 : " + st2.countTokens());
		while (st2.hasMoreTokens()) {
			System.out.print("#3 >>" + st2.nextToken() + " ");
		}
	}

}
