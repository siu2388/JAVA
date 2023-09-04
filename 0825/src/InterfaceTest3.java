interface IClick {
	void iclick();
}

class BasicButton {
	String title;
	IClick iClick;

	void click() {
		System.out.println("버튼 기본 처리");
		if (iClick != null) {
			iClick.iclick();
		}
	}

// 인터페이스 타입의 매개변수가 갖는 의미:
	// 메서드 호출 시 해당 인터페이스를 구현한 클래스의 인스턴스를 매개변수로 제공해야 한다!
	void addClickEventHandler(IClick iClick) {
		this.iClick = iClick;
	}
}

class LoginClick implements IClick {
	@Override
	public void iclick() {
		System.out.println("로그인 처리");
	}
}

public class InterfaceTest3 {

	public static void main(String[] args) {
		BasicButton loginBtn = new BasicButton();
		loginBtn.addClickEventHandler(new LoginClick());
		loginBtn.click();
		// 회원가입 버튼 1회성으로 사용하니까 위의 class 찾아 안올라가도 됨
		// 익명클래스 (내부클래스)
		BasicButton joinBtn = new BasicButton();
		joinBtn.addClickEventHandler(new IClick() { // new IClick이 조상클래스고 그 클래스를
																// 상속받아 바로 매개변수로 만들어서 넘겨줌
			@Override
			public void iclick() {
				System.out.println("회원가입 처리");
			}
		});
		joinBtn.click();
	}

}
