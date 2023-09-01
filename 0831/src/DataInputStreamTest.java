import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Person {
	String name;
	int age;
	double weight;
	boolean married;

	Person(String name, int age, double weight, boolean married) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.married = married;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}

	public boolean isMarried() {
		return married;
	}

	@Override
	public String toString() {
		return String.format("이름:%s, 나이:%d,몸무게:%f,결혼여부:%s", name, age, weight, (married ? "YES" : "NO"));
	}
}

public class DataInputStreamTest {
	static void write(Person p) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;

		try {
			fos = new FileOutputStream("person.bin");
			dos = new DataOutputStream(fos);

			dos.writeUTF(p.name);
			dos.writeInt(p.age);
			dos.writeDouble(p.weight);
			dos.writeBoolean(p.married);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dos != null) {
					dos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	static Person read() {
		FileInputStream fis = null;
		DataInputStream dis = null;
		Person p = null;
		try {
			fis = new FileInputStream("person.bin");
			dis = new DataInputStream(fis);

			String name = dis.readUTF();
			int age = dis.readInt();
			double weight = dis.readDouble();
			boolean married = dis.readBoolean();

			p = new Person(name, age, weight, married);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dis != null) {
					dis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return p;

	}

	static void write(List<Person> plist) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;

		try {
			fos = new FileOutputStream("person.bin");
			dos = new DataOutputStream(fos);

			dos.writeInt(plist.size()); // 인원수 저장
			for (Person p : plist) {
				dos.writeUTF(p.name);
				dos.writeInt(p.age);
				dos.writeDouble(p.weight);
				dos.writeBoolean(p.married);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dos != null) {
					dos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	static List<Person> readList() {
		List<Person> plist = new ArrayList<>();
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream("person.bin");
			dis = new DataInputStream(fis);

			int personCount = dis.readInt();

			for (int i = 0; i < personCount; i++) {
				String name = dis.readUTF();
				int age = dis.readInt();
				double weight = dis.readDouble();
				boolean married = dis.readBoolean();
				plist.add(new Person(name, age, weight, married));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dis != null) {
					dis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return plist;
	}

	public static void main(String[] args) {

		List<Person> plist = readList();
		for (Person p : plist) {
			System.out.println(p);
		}

	}

}
