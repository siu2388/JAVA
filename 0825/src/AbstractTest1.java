abstract class Player {
	int currentPosition;

	public Player() {
		currentPosition = 0;
	}

	abstract void play(int position); // 추상메서드

	abstract void stop(); // 추상메서드

	void play() {
		play(currentPosition);
	}
}

//abstract class 를 상속받으면 abstract method르 반드시 구현하지 않으면,
//상속받은 자식 클래스도 abstract 클래스여야 한다.
class DPlayer extends Player {
	@Override
	void play(int position) { // 중괄호가 있으면 구현부가 있는거임!
		System.out.println("DPlayer play(int position)");
	}

	@Override
	void stop() {
		System.out.println("DPlayer stop()");
	}

}

public class AbstractTest1 {

	public static void main(String[] args) {
		// Player player = new Player(); // 에러!abstract class는 객체 생성 불가능
		DPlayer dPlayer = new DPlayer();
		dPlayer.play();
		dPlayer.stop();

		Player player1 = new DPlayer(); // upcasting
		player1.play();
		player1.stop();

	}

}
