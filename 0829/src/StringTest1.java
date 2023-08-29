
public class StringTest1 {

	public static void main(String[] args) {
		String a = "a";
		a = "b"; // 메모리의 데이터가 바뀌는게 아니라 b(값) 참조하는 주소값이 바뀜
		// 원래 초기화된 메모리의 데이터를 변경하는게 mutable
		// 따라서 String클래스는 immutable
		int n = 10;
		n = 20;

		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		String str4 = new String("abc");

		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));

		String s1 = null; //
		String s2 = ""; // \0
		char c = 'a'; // a

		char[] carr = { 'a', 'b', 'c' }; //
		String s4 = new String(carr);
		System.out.println(str3);
		System.out.println(s4);
		System.out.println(str3.equals(s4));

		StringBuffer sb = new StringBuffer("abc");
		String s5 = new String(sb);
		System.out.println(s5);

		String s6 = "Hello,";
		String s7 = s6.concat("World"); // 원본s6데이터는 바뀌지않음(immutable)
		System.out.println(s7);
		System.out.println(s6);

		System.out.println(s7.contains("ello")); // 포함? true or false

		String filename = "test.txt";
		System.out.println(filename.endsWith("hwp")); // false
		// 지정된 문자열로 끝나는지 검사 true or false

		String[] files = { "test.txt", "temp.hwp", "backup.txt" };
		for (int i = 0; i < files.length; i++) {
			if (files[i].endsWith("txt")) {
				System.out.println(files[i]);
			}
		}
		System.out.println(s6.indexOf('l')); // 나오는 첫번째 값을 보여줌
		System.out.println(s7.indexOf("Wo")); // 전체 다 포함 & 첫문자 인덱스
		System.out.println(s6.lastIndexOf('l')); // 뒤에서부터 찾겠음

		System.out.println(s6.replace('H', 'c'));
		System.out.println(s6); // replace 했어도 원본은 안바뀜
		System.out.println(s6.replace(s6, "hi")); // 문자열 전체를 바꿀수도 있음
		System.out.println(s6); // 역시 원본유지

	}
}
