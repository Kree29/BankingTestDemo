package bankingtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DeleteCustomerPage {
	public WebElement Delete() {
		return BaseDriver.getDriver().findElement(By.name("cusid"));
		
	}
	public WebElement Submit() {
		return BaseDriver.getDriver().findElement(By.name("AccSubmit"));
	}
		
	

}
