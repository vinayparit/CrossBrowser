package GenricUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtil {
	
	public String getDataFromProperty(String key) throws Throwable {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\commonData.properties");
		Properties p=new Properties();
		p.load(fis);
		
		String value=p.getProperty(key);
		return value;
	}

}
