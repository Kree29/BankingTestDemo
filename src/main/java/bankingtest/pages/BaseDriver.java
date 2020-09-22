package bankingtest.pages;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class BaseDriver {
	protected static WebDriver driver;
	
	public static WebDriver  getDriver() {
		return driver;
	}
	public Properties ReturnProperties() throws FileNotFoundException
	{
		OutputStream output = new FileOutputStream(System.getProperty("user.dir")+"/config.properties");
		Properties prop = new Properties();
  	return prop;
	}

}


