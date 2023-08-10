package first;

public class BreakTest1 {

	public static void main(String[] args) {

		outer: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
				if (i == j)
					break outer; // *
			}
			System.out.println();
		}
	}

}

//break쓰면 가장 가까운 반복문만 빠져나옴. 
//네이밍을 하게되면, 네이밍 한 것을 빠져나옴

//사용자의입력을 받아서 받은 결과를 가지고 반복문 처리를 해야될 때