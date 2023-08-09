package first;

public class OperationTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = -10;
		i = +i;
		System.out.println(i); // -10
		i = -i;
		System.out.println(i); // 10

		boolean power = false;
		power = !power;
		System.out.println(power); // true;
		power = !power;
		System.out.println(power); // false;

		int j = 10;
		j = ~j; // 비트연산자
		System.out.println(j); // -11 ; 1의 보수를 취함

	}

}
