import java.util.ArrayList;
import java.util.List;

public class ArrayListTest4 {
	static void print(List<Integer> list) {
		for (Integer n : list) {
			System.out.print(n + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(10);
		al.add(5);
		al.add(4);
		al.add(2);
		al.add(1);
		al.add(0);
		al.add(3);

		List<Integer> list = al.subList(1, 4);
		print(al);
		print(list);
		System.out.println(al.containsAll(list));
		System.out.println("==========");

		al.retainAll(list);
		print(al);
		System.out.println("==========");

		al.add(0, 6); // 0번쨰에 6 삽입
		print(al);
		System.out.println("==========");
		al.set(0, 7);
		print(al);
		System.out.println("==========");
		al.remove(new Integer(7));
		print(al);
		System.out.println("==========");
	}

}
