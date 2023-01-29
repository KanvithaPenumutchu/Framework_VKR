package coreUtilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfiguratorReader {
	
	public static Properties props;
	public static FileReader reader;
	
	
	public static void loadConfigFile() throws IOException
	{
		props=new Properties();
		reader=new FileReader("D:\\WorkSpace\\Live_Project_QM\\src\\test\\resources\\configfiles\\config.properties");
		props.load(reader);
	}
	
	public static String getConfigValue(String key) throws IOException
	{
		loadConfigFile();
		/*String keyvalue=props.getProperty(key);
		return keyvalue;*/
		return props.getProperty(key);
	}
	
	
}
