package bankingtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebElement NewCustomer() {
		return BaseDriver.getDriver().findElement(By.xpath("//a[text()='New Customer']"));
		
	}
	
	public WebElement EditCustomer() {
		return BaseDriver.getDriver().findElement(By.xpath("//a[text()='Edit Customer']"));
		
	}
	
	public WebElement DeleteCustomer() {
		return BaseDriver.getDriver().findElement(By.xpath("//a[text()='Delete Customer']"));
			
	}

}
