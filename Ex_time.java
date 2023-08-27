package CH7;

public class Ex_time {

	private int hour;
	private int minute;
	private int second;
	// 접근 제어자를 private로 하여 외부에서 직접 접근 못하게 함

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour < 0 || hour > 23)
			return;
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59)
			return;
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0 || second > 59)
			return;
		this.second = second;
	}
}

/*
 * getter, setter 멤버변수의 값을 읽는 메서드의 이름을 get멤버변수이름() {} 
 * //멤버변수의 값을 반환하는 일을 한다.
 * 멤버변수의 값을 변경하는 메서드의 이름을 set멤버변수이름() {} 
 * // 매개변수에 지정된 값을 검사하여 조건에 맞는 값일 때만 멤버변수의
 * 값을 변경하도록 작성됨
 */
