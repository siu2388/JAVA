import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(10); // 원래 queue에서 넣을 때 enqueue
		queue.offer(20); // enqueue
		System.out.println(queue.poll()); // 뺄때 dequeue
		System.out.println(queue.remove());

		queue.clear(); // 초기화

	}
}
