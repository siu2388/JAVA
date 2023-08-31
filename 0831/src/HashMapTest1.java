import java.util.HashMap;
import java.util.Map;

public class HashMapTest1 {

	public static void main(String[] args) {
		Map<String, Integer> hmap = new HashMap<>();
		hmap.put("1001", 35); // 데이터 삽입(1001,35)
		if (hmap.containsKey("1001") == false) {
			hmap.put("1001", 40);// 중 복검사 안하고 넣으면 1001 데이터가 변경되어 들어가게됨
		}

		hmap.put("1002", 20);
		hmap.put("1005", 13);
		hmap.put("1003", 34);
		hmap.put("1004", 50);
		Integer value = hmap.get("1001"); // key로 데이터의 value조회
		System.out.println(hmap);
		System.out.println("value	: " + value);

		System.out.println("=== value 전체 목록 조회1");
		for (Integer n : hmap.values()) {
			System.out.println(n);
		}
		System.out.println("=== value 전체 목록 조회2");
		for (String k : hmap.keySet()) {
			System.out.println(hmap.get(k));
		}

		System.out.println("=== 키 목록조회");
		for (String s : hmap.keySet()) {
			System.out.println(s);
		}

		System.out.println("=== 삭제");
		hmap.remove("1005"); // 키를 통해 전체 키벨류 삭제
		System.out.println("=== key-value 쌍 조회");
		for (Map.Entry<String, Integer> entry : hmap.entrySet()) {
			System.out.println(String.format("key:%s, value:%d", entry.getKey(), entry.getValue()));
		}

	}

}
