package dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Dao {
	
	//DB Connection
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Properties db = new Properties();
			db.load(new FileInputStream("db.properties"));
			Class.forName(db.getProperty("driver")); // getProperty("driver")는 키값으로 value를 리턴해주는 겁니당.

			conn = DriverManager.getConnection(db.getProperty("url"), db.getProperty("user"), db.getProperty("pwd"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	//DB close
	public static void close(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
