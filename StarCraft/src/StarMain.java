import item.*;

public class StarMain {

	public static void main(String[] args) {
		Tank tank = new Tank();
		SCV scv = new SCV();
		Zerg zerg = new Zerg();
		Marine marine = new Marine();

		scv.repair(tank); // 90%
		scv.repair(scv);// 80%
		scv.repair(zerg);// 100%
		// scv.repair(marine); //에러!

	}

}
