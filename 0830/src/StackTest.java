import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		System.out.println(stack.pop()); // First in lask out
		System.out.println(stack.pop());

		System.out.println("===== 남은 원소 향상된 for문");
		for (Object obj : stack) {
			System.out.println(obj); // List를 상속받아서 10,20,30으로 나옴
		}

	}

}
