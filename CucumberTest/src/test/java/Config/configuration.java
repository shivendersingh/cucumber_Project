package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.knight.cucumber.stepdef.create_user;

public class configuration 
{
	static String ch=null;
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		getproperties();
	}
	public static void getproperties() throws FileNotFoundException, IOException
	{
		Properties prop = new Properties();
		prop.load(new FileInputStream("E:/eclipse-new-ws/CucumberTest/application.properties"));
		ch = prop.getProperty("Path");
		create_user.ch1=ch;
	}

}
