package ex5;

public class Ex12 {

	public static void main(String[] args) {
		/*
		 * 3m 짜리 우물 바닥에 달팽이가 있따. 낮동안 55CM 올라가고 날이지면 잠을 자야한다. 자는 동안 3CM 미끄러져 내려온다. 달팽이가
		 * 우물 밖으로 나오는데 몇일이 걸릴까? 반복문과 조건문을 이용하여 프로그램을 작성하시오.
		 */
		int depth = 3 * 100, height = 0;
		;
		final int up = 55;
		final int down = 3;
		int day = 0;

		while (true) {
			height = height + up;
			day++;
			if (height >= depth)
				break;
			height = height - down;
		}
		System.out.println(day);
	}
// FOR문을 	돌리면 for(height>=depth)가 조건문으로 들어가고, day++ 이 들어가 줘야하기 때문에 
	// 날짜가 하루 더 나오게 되거나 , 생각의 흐름에 따라서 짜주지 않으면 생각 따라 달라질 수 있거든
	// 그랙서 차라리 무한반복문 돌리다가 빠져나오겠다는 전략을 짠거야.
}
