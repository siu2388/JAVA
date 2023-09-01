import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BufferedTest1 {

//	static void write(Person p) {
//		FileWriter fw = null;
//		BufferedWriter bw = null;
//		try {
//			fw = new FileWriter("personInfo.txt");
//			bw = new BufferedWriter(fw);
//
//			String personInfo = p.getName() + "," + p.getAge() + "," + p.getWeight() + ",";
//			personInfo += p.isMarried() ? "Y" : "N";
//
//			bw.write(personInfo); // 문자열로 저장 후
//			bw.newLine(); // 개행
//
//		} catch (IOException e) {
//			e.printStackTrace();
//
//		} finally {
//			try {
//				if (bw != null) {
//					bw.close();
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}

//	static Person read() {
//		Person person = null;
//		FileReader fr = null;
//		BufferedReader br = null;
//		try {
//			fr = new FileReader("personInfo.txt");
//			br = new BufferedReader(fr);
//
//			String personInfo = br.readLine(); // kim,23,66,Y
//			String[] personProperties = personInfo.split(","); // ,로 자르기
//
//			String name = personProperties[0];
//			int age = Integer.parseInt(personProperties[1]);
//			double weight = Double.parseDouble(personProperties[2]);
//			boolean isMarreid = personProperties[3].charAt(0) == 'Y' ? true : false;
//
//			person = new Person(name, age, weight, isMarreid);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (br != null) {
//					br.close();
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		return person;
//
//	}

	static void write(List<Person> people) {
		BufferedWriter bw = null;

		try {
			bw = new BufferedWriter(new FileWriter("person.txt"));

			for (Person p : people) {
				String personInfo = p.getName() + "," + p.getAge() + "," + p.getWeight() + ",";
				personInfo += p.isMarried() ? "Y" : "N";

				bw.write(personInfo); // 문자열로 저장 후
				bw.newLine(); // 개행
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	static List<Person> readList() {
		List<Person> personList = new ArrayList<>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("person.txt"));
			String perStr = null;
			while ((perStr = br.readLine()) != null) {
				String[] personProperties = perStr.split(","); // ,로 자르기

				String name = personProperties[0];
				int age = Integer.parseInt(personProperties[1]);
				double weight = Double.parseDouble(personProperties[2]);
				boolean isMarreid = personProperties[3].charAt(0) == 'Y' ? true : false;

				personList.add(new Person(name, age, weight, isMarreid));
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace(); //
			}
		}
		return personList;
	}

	public static void main(String[] args) {
		// Person p = new Person("kim", 23, 44, false);
		// write(p);

//		Person p = read();
//		System.out.println(p);

//		List<Person> people = new ArrayList<>();
//		people.add(new Person("kim", 23, 44, false));
//		people.add(new Person("lee", 23, 44, false));
//		people.add(new Person("park", 23, 44, false));
//		people.add(new Person("go", 23, 44, false));
//		write(people);

		List<Person> list = readList();
		for (Person p : list) {
			System.out.println(p);
		}
	}

}
