package ex11;

import java.util.ArrayList;

public class Ex11_1 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> kyo = new ArrayList<>(); // 교집합
		ArrayList<Integer> cha = new ArrayList<>(); // 차집합
		ArrayList<Integer> hap = new ArrayList<>(); // 합집합
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);

		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		// 교집합 -> list1을 넣고 list2에 있는 것 빼주기
		kyo.addAll(list1);
		kyo.retainAll(list2);

		/*
		 * ===retainAll===
		 * 두 개의 컬렉션을 비교하여 두 컬렉션에 공통으로 포함된 요소들을 남기고 
		 * 나머지 요소들을 제거
		 * => 예:디비에서 조회환 결과와 사용자가 선택한 필터를 비교 -> 공곹된 데이터만 보여주기*/

		// 차집합
		cha.addAll(list1);
		cha.removeAll(list2);

		// 합집합 ( 순서 중요 !)
		hap.addAll(list1);
		hap.removeAll(kyo);
		hap.addAll(list2);

		System.out.println("list1=" + list1);
		System.out.println("list2=" + list2);
		System.out.println("kyo=" + kyo);
		System.out.println("cha=" + cha);
		System.out.println("hap=" + hap);
	}

	/*
	 * ArrayList<Integer> list1 = new ArrayList<>();
	와 
	ArrayList list1 = new ArrayList();
	의 차이는 뭐야?
	 => 제네릭을 사용하는 첫번째 방법은 타입 안정성을 가와하고 컴파일 시간에 타입 검사를 가능하게 한다.
	 
	 두번째 방법은 제네릭을 사용하지 않아 어떤 타입의 요소라도 리스트에 추가할 수 있다.
	  런타임 시에 잠재적인 타입 불일치 문제가 발생할 수 있다.
	
	 * */

}
