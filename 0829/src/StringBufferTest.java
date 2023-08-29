
public class StringBufferTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(100);
		sb.append("abc");
		System.out.println(sb.capacity()); // 용량은 100
		System.out.println(sb.length()); // 현재 그 안에 들어있는문자열 길이

		sb.insert(1, "2");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.delete(1, 2); // start , end
		System.out.println(sb.toString());
		sb.replace(0, 2, "ll"); //
		sb.reverse();
		sb.setCharAt(2, 'u'); //
		sb.setLength(5); // 남으면 스페이스로 ,모자라면 짤림
	}

}
