package ex9;

public class Ex9_7 {
	static boolean contains(String src, String target) {
		return (src.indexOf(target) >= 0) ? true : false;
	}

	public static void main(String[] args) {
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345", "67"));
	}

}
