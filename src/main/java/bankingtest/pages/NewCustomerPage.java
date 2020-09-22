package bankingtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewCustomerPage {
	public WebElement CustomerName() {
		return BaseDriver.getDriver().findElement(By.name("name"));
			
	}
	public WebElement Gender() {
		return BaseDriver.getDriver().findElement(By.xpath("//*[@value='f']"));
	}
	public WebElement DOB() {
		return BaseDriver.getDriver().findElement(By.name("dob"));
		
	}
	public WebElement Address() {
		return BaseDriver.getDriver().findElement(By.name("addr"));
		
	}

	public WebElement City() {
		return BaseDriver.getDriver().findElement(By.name("city"));
		
	}
	public WebElement State() {
		return BaseDriver.getDriver().findElement(By.name("state"));
		
	}
	public WebElement Pin() {
		return BaseDriver.getDriver().findElement(By.name("pinno"));
		
	}
	public WebElement MNum() {
		return BaseDriver.getDriver().findElement(By.name("telephoneno"));
		
	}
	public WebElement Email() {
		return BaseDriver.getDriver().findElement(By.name("emailid"));
		
	}
	public WebElement Password() {
		return BaseDriver.getDriver().findElement(By.name("password"));
		
	}
	public WebElement Submit() {
		return BaseDriver.getDriver().findElement(By.name("sub"));
		
	}
	public WebElement CustomerID() {
		return BaseDriver.getDriver().findElement(By.xpath("//*[@id='customer']//tr[4]//td[2]"));
	}
	


}
