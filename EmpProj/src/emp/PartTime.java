package emp;

public class PartTime extends Employee implements BusinessTrip {
	int time;
	int payPerTime;

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getPayPerTime() {
		return payPerTime;
	}

	public void setPayPerTime(int payPerTime) {
		this.payPerTime = payPerTime;
	}

	public PartTime() {
	}

	public PartTime(int id, String name, int time, int payPerTime) {
		super(id, name); // 부모클래스의 생성자 가져오기
		this.time = time;
		this.payPerTime = payPerTime;
	}

	public int getPay() {
		return getTime() * getPayPerTime();
	}

	@Override
	public String info() {
		return super.info() + ",급여:" + getPay();
	}

	// 인터페이스에 있는 메서드 오버라이딩 후 출장시간 (24시간)*payPerTime을 인센으로 지급
	@Override
	public void regBusinessTrip() {
		time += (day * 24);
	}
}
