import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("name", "kim si u");
		prop.setProperty("age", "30");
		prop.setProperty("height", "170");
		prop.setProperty("weigh", "77");

		try {
			prop.store(new FileOutputStream("profile.properties"), "profile");
			prop.storeToXML(new FileOutputStream("profile.xml"), "profile");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
