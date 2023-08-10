package first;

public class IfTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = (int) (Math.random() * 10);
		if (i > 0) {
			System.out.println(i + "양수");
		} else {
			System.out.println(i + "음수");
		}

		System.out.println("==========");

		int j = -10;
		if (j > 0) {
			System.out.println("양수");
		} else if (j < 0) {
			System.out.println("음수");

		} else {
			System.out.println("0이네!");
		}

		System.out.println("==========");

		int k = 89;
		String grade = "";
		if (k >= 90) {
			// grade = "A";
			if (k >= 97) {
				grade = "A+";
			} else if (k >= 94) {
				grade = "A0";
			} else {
				grade = "A-";
			}
		} else if (k >= 80) {
//			grade = "B";
			if (k >= 87) {
				grade = "B+";
			} else if (k >= 84) {
				grade = "B0";
			} else {
				grade = "B-";
			}
		}
		System.out.println(grade);

	}

}
