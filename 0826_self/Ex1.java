package CH7;

class Tv {
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}
}

class SmartTv extends Tv {
	boolean caption;

	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}

public class Ex1 {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 11; // 조상클래스로부터 상속받은 멤버
		stv.channelUp(); // 조상클래스로부터 상속받은 멤버
		System.out.println(stv.channel);

		stv.caption = true; // 캡션 기능을 켠다.
		stv.displayCaption("Hello siu");
		stv.caption = false; // 해도 콘솔에 찍히는 이유?? -> 해결
		stv.displayCaption("Hello world");
		// 아 이렇게 찍어야 그 뒤로 나오는 캡션 안찍히게 하는거구나

	}

}
