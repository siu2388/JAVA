import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector();
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);

		System.out.println("=====enumeration");
		Enumeration<Integer> e = vector.elements();

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		System.out.println("=====ArrayList");
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Iterator<Integer> it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("=====ListIterator 뒤로!");

		ListIterator<Integer> lit = list.listIterator();
		while (lit.hasNext()) {
			System.out.println(lit.next());
		}

		System.out.println("=====ListIterator preivious 앞으로!");
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}

	}

}

/*
 * Arraylist 를 가장 많이 쓴다.*/
