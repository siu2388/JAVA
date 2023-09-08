import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnect {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver"); // driver 설정
			// db연결
			conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/kosta", "root", "1234");
			System.out.println("db연결 성공!");

			// 데이터 CRUD
			// ===create
			String sql = "insert into user (id,name) values('kim','김시유')";
			stmt = conn.createStatement(); // statement얻어옴 . 모든 시작은 conn부터
			int insertedCount = stmt.executeUpdate(sql);
			System.out.println(insertedCount + "개 데이터 삽입 성공");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
