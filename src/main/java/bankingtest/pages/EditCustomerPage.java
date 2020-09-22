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
	public WebElement EditName() {
		return BaseDriver.getDriver().findElement(By.name("name"));
			
	}
	public WebElement EditAdd() {
		return BaseDriver.getDriver().findElement(By.name("addr"));
		
	}
	public WebElement FinalSub() {
		return BaseDriver.getDriver().findElement(By.name("sub"));
		
	}
	

}
