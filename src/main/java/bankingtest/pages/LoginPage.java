package bankingtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginPage {
	public WebElement UserId() {
		return BaseDriver.getDriver().findElement(By.name("uid"));
		
	}
	public WebElement Password() {
		return BaseDriver.getDriver().findElement(By.name("password"));
		
	}
	public WebElement LogIn() {
		return BaseDriver.getDriver().findElement(By.name("btnLogin"));
		
	}
	


}
