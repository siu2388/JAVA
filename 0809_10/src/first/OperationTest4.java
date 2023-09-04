package first;

public class OperationTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 30, y = 20;
		int max = (x > y) ? x : y; // 삼항조건연산자
		System.out.println(max);

		int i = 10;
		i *= 3 + 5; // i=i*(3+5) => 80 *=는 복합대입연산자 우선순위 낮음
//이렇게 쓰지마, 가독성 떨어지니까 

	}

}
