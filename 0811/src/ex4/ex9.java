package ex4;

public class ex9 {

	public static void main(String[] args) {

		String str = "12345";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); // 숫자로 만드는 방법 1==49
			System.out.println("숫자= " + ch);

			// sum = sum + y; 떙!
			sum = sum + ch - '0'; // 0==48이니까 ch를 숫자로 만드는 정형화된 방법
		}
		System.out.println("sum=" + sum);
	}

}

// string 은 시작부터 null 을만날 때까지 데이터를 가지고올 수 있기 때문에 끝자리 지정이 안되있음
//그래서 '' ""는 다른거야

//str.length()가 null값 빼고 데이터만 쏙 가져오는거임 

// 난 숫자가 지금 49부터 나올꺼라고 생각했는데, 왜 1이 찍히는걸까..