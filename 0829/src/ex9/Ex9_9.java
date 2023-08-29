package ex9;

public class Ex9_9 {
	static String delChar(String src, String delChar) {
		StringBuilder sb = new StringBuilder(src);
		// for (int i = 0; i < sb.length(); i++) {
		// for (int j = 0; j < delChar.length(); j++) {
		// if (sb.charAt(j) == delChar.indexOf(j)) {
		// sb.deleteCharAt(i);
		// }
		// }
		// }
		// return sb.toString();
		for (int i = 0; i < sb.length(); i++) {
			for (int j = 0; j < delChar.length(); j++) {
				if (sb.charAt(i) == delChar.charAt(j)) { // 수정된 부분
					sb.deleteCharAt(i);
					i--; // 한 문자를 삭제했으므로 인덱스 조정
					break; // 삭제 후 다음 문자로 넘어감
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