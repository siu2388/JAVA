import emp.PartTime;
import emp.Permanent;
import emp.Sales;

public class CompanyMain {
	public static void main(String[] args) {
		Company com = new Company();
		Permanent emp1 = new Permanent(1001, "상부상조", 5000000);
		Sales emp2 = new Sales(1002, "자바조", 4000000, 1000000);
		PartTime emp3 = new PartTime(1003, "커피조", 160, 300000);

		com.enter(emp1);
		com.enter(emp2);
		com.enter(emp3);

		// com.regBusinessTrip(emp1); // 에러! parmanent 출장 불가능
		com.regBusinessTrip(emp2);// Sales 출장 가능, 하루당 100,000원을 인센지급
		com.regBusinessTrip(emp3);// PartTime 출장가능, (출장시간(1일24시간)*payPerTime원 인센지급

		com.allEmployeeInfo();
		System.out.println("총급여액:" + com.getTotalPay());
	}
}
/*
 * 사번:1001,이름:상부상조,급여:5,000,000
 * 사번:1002,이름:자바조,급여:5,000,000
 * 사번:1003,이름:커피조,급여:4,800,000 
 * 총급여액:14,800,000
 */