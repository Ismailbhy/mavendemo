package utilites;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileIO {
	public static String propertiesfileReading(String key) throws IOException {
	Properties prop = new Properties();
	String filepath=System.getProperty("user.dir")+"\\src\\test\\resources\\configuration\\develop.properties";
	FileInputStream file =new FileInputStream(filepath);
	prop.load(file);
	//System.out.println(prop.getProperty("browserType"));
	//return filepath;
	String value =prop.getProperty(key);
	return value;
	/*it is saparate class to what used for read properties*/
	}
}
