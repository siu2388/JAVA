import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class ArrayListTest6 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
		System.out.println(numbers);
		numbers.removeIf(n -> (n % 2) == 0); // 람다식;배열에서 하나씩가져오면서 조건 만족하면 제거
		System.out.println(numbers);

		Vector<Integer> vector = new Vector<>();
		vector.add(1);
		vector.add(2);
		vector.add(3);

		System.out.println("현재 용량: " + vector.capacity()); // 현재 용량 출력
		vector.ensureCapacity(300); // 용량을 300으로 변경
		System.out.println("변경된 용량: " + vector.capacity()); // 변경된 용량 출력
	}

}
