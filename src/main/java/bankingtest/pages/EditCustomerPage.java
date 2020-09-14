package bankingtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EditCustomerPage {
	public WebElement Edit() {
		return BaseDriver.getDriver().findElement(By.name("cusid"));
	
	}
	public WebElement Submit() {
		return BaseDriver.getDriver().findElement(By.name("AccSubmit"));
	
	}

}
