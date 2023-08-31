package ex11;

import java.util.Comparator;
import java.util.TreeMap;

public class Ex11_13 {

	public static void main(String[] args) throws Exception {
		SutdaDeck deck = new SutdaDeck();
		deck.shuffle();
		Player[] pArr = { new Player("타짜", deck.pick(), deck.pick()), new Player("고수", deck.pick(), deck.pick()),
				new Player("물주", deck.pick(), deck.pick()), new Player("중수", deck.pick(), deck.pick()),
				new Player("하수", deck.pick(), deck.pick()) };

		TreeMap<Player, Integer> rank = new TreeMap<>(new Comparator<Player>() {
			@Override
			public int compare(Player p1, Player p2) {// 내림차순 (뒤 - 앞)
				return p2.point - p1.point;
			}
		});
		for (int i = 0; i < pArr.length; i++) {
			Player p = pArr[i];
			rank.put(p, deck.getPoint(p));
			System.out.println(p + " " + deck.getPoint(p));
		}
		System.out.println();
		System.out.println("1위는 " + rank.firstKey() + "입니다.");
	}
}
