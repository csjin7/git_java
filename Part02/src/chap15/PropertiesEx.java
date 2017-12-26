package chap15;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {
	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		String path= PropertiesEx.class.getResource("config/oracle.properties").getPath();
		//String path= PropertiesEx.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");
		System.out.println(path);
		
		properties.load(new FileReader(path));
		
		String driver 	= properties.getProperty("driver");
		String url 		= properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");

		System.out.println(driver);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
				

	}

}
