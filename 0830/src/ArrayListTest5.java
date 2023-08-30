import java.util.ArrayList;
import java.util.List;

public class ArrayListTest5 {
	static void print(Object[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayList list = new ArrayList(10);
		list.add(5);
		list.add(4);
		list.add(2);
		list.add(1);
		list.add(0);
		list.add(3);
		System.out.println(list);
		print(list.toArray()); // toArray()

		// clone 복제 원본 유지
		List list2 = (List) list.clone();
		list2.set(0, 100); // 0번을 100으로 바꾸고 원본은 유지
		System.out.println(list2);
		System.out.println(list);

	}

}
