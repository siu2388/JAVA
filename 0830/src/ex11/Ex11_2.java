package ex11;

import java.util.ArrayList;
import java.util.Stack;
import java.util.HashSet;
import java.util.TreeSet;

public class Ex11_2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);

		HashSet<Integer> set = new HashSet<>(list); // [2,3,6,7] &중복허용X,sorting
		TreeSet<Integer> tset = new TreeSet<>(list);
		// 내림차순 정렬의 개념 stack 에 넣었다가 빼기
		Stack<Integer> stack = new Stack<>();
		stack.addAll(tset);

		while (!stack.empty()) {
			System.out.println(stack.pop()); // stack에 저장된 값을 하나씩 꺼낸다.
		}

	}

}

/**
 * HashSet 중복허용X, 저장순서 유지 안함
 * 
 * TreeSet 정렬해서 저장(default 오름차순 : 2,3,6,7)
 * 
 * Stack -> FILO
 */
