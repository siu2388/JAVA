package ex5;

public class Ex10_1 {

	public static void main(String[] args) {
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[', ']',
				'{', '}', ';', ':', ',', '.', '/' };
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		String result = "~!wer";
		String src = "";

		for (int i = 0; i < result.length(); i++) {
			char ch = result.charAt(i);
			int idx = -1;
			if (ch >= 'a' && ch <= 'z') {
				for (int j = 0; j < numCode.length; j++) {
					if (ch == numCode[j]) {
						idx = j;
						break;
					}
				}
				if (idx != -1) {
					src = src + (char) ('0' + idx);
			} else {
				for (int j = 0; j < abcCode.length; j++) {
					if (ch == abcCode[j]) {
						idx = j;
						break;
					}
				}
				src = src + 'a' + idx;
			}

		}
		System.out.println("result: " + result);
		System.out.println("src: " + src);

	}

}
