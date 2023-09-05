import java.util.ArrayList;
import java.util.List;

public class ObjectStreamTest {
	static void write(List<Person> pers) {

	}

	public static void main(String[] args) {

		List<Person> people = new ArrayList<>();
		people.add(new Person("kim", 23, 44, false));
		people.add(new Person("lee", 23, 44, false));
		people.add(new Person("park", 23, 44, false));
		people.add(new Person("go", 23, 44, false));
		write(people);

	}

}
