package utilites;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesfileReading {
	public static String anyname(String key) throws IOException {
	//public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		String filepath=System.getProperty("user.dir")+"\\src\\test\\resources\\configuration\\develop.properties";
		FileInputStream file = new FileInputStream(filepath);
		prop.load(file);
		System.out.println(prop.getProperty("browserType"));
		//return filepath;
		//String value=prop.getProperty(Key);
		String value =prop.getProperty("browserType");
		return value;
	
	}

}
