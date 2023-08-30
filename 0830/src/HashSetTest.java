import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(584);
		hs.add(23);
		hs.add(459);
		hs.add(459); // 중복허용X, 차례대로 들어가지 않음.(Hash의 특징)
		hs.add(65);

		for (Integer h : hs) {
			System.out.println(h);
		}

		HashSet<Person> hsac = new HashSet<>();
		hsac.add(new Person("고메리", 100));
		hsac.add(new Person("고길동", 200));
		hsac.add(new Person("고메리", 400)); // ArrayListTest1 override
		hsac.add(new Person("고사리", 200));
		hsac.add(new Person("고메리", 400));

		for (Person p : hsac) {
			System.out.println(p);
		}
	}

}
