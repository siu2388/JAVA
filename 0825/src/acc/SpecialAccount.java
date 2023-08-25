package acc;

public class SpecialAccount extends Account {
//등급
	String grade = "Normal";
	double interest = 0.01;

	public void getGrade(String grade) {
		this.grade = grade;
	}

	public void setGrade(String grade) {
		switch (grade) {
		case "V":
		case "v":
			this.grade = "VIP";
			interest = 0.04; // 기본 이자율 변경
			break;
		case "G":
		case "g":
			this.grade = "Gold";
			interest = 0.03;
			break;
		case "S":
		case "s":
			this.grade = "Silver";
			interest = 0.02;
			break;
		case "N":
		case "n":
			this.grade = "Normal";
			break;
		}
	}

	public SpecialAccount() {
	}

	public SpecialAccount(String id, String name, int money, String grade) {
		super(id, name, money);
		setGrade(grade);
	}

	@Override
	public void deposit(int money) {
		super.deposit((int) (Math.round(money + money * interest)));
	}

	@Override
	public String info() {
		return super.info() + ",등급:" + grade;
	}
}
