package ex9;

public class Ex9_9 {
	static String delChar(String src, String delChar) {
		StringBuilder sb = new StringBuilder(src);
		for (int i = 0; i < sb.length(); i++) {
			for (int j = 0; j < delChar.length(); j++) {
				if (sb.charAt(j) == delChar.indexOf(j)) {
					sb.deleteCharAt(i);
				}
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)", " \t"));
	}

}

// charAt(int i), IndexOf(int ch)