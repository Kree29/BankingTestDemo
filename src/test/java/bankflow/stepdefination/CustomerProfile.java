package bankflow.stepdefination;

import org.openqa.selenium.chrome.ChromeDriver;

import bankingtest.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerProfile extends BaseDriver{
	@Given("I have access to webpage")
	public void i_have_access_to_webpage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/allocen27/WebDriver/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/index.php");
		Thread.sleep(4000);
		driver.manage().window().maximize();
	}

	@Given("I pass {string} and {string}")
	public void i_pass_and(String string, String string2) throws InterruptedException {
		System.out.println("Going");
		LoginPage lp = new LoginPage();

		lp.UserId().sendKeys("mngr281424");
		lp.Password().sendKeys("eserEjy");
		lp.LogIn().click();
		Thread.sleep(4000);
		
	    	}

	@When("click on sign in, I will be on a home page")
	public void click_on_sign_in_i_will_be_on_a_home_page() {
	   
	    HomePage hp = new HomePage();
	    hp.NewCustomer().click();
	}

	@Given("I am on a home page I click on new customer")
	public void i_am_on_a_home_page_i_click_on_new_customer() {
	    System.out.println("Given");
	    
	}

	@When("I add customer details, and click on submit")
	public void i_add_customer_details_and_click_on_submit() throws InterruptedException {
		NewCustomerPage nc = new NewCustomerPage();
		Thread.sleep(5000);
		System.out.println("customer page");
		nc.CustomerName().sendKeys("Krishna");
		nc.Gender().click();
		nc.DOB().sendKeys("0019920629");
		nc.Address().sendKeys("Canada");
		nc.City().sendKeys("Mississauga");
		nc.State().sendKeys("Ontario");
		nc.Pin().sendKeys("123456");
		nc.MNum().sendKeys("123456");
		nc.Email().sendKeys("kree4@gmail.com");
		nc.Password().sendKeys("abc123");
		nc.Submit().click();
	    
	}

	@Then("new customer will be created, and customer Id will be provided")
	public void new_customer_will_be_created_and_customer_id_will_be_provided() {
		
		System.out.println("fetch Customerid");
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}






@Given("I have CustomerId")
public void i_have_customer_id() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("I click on Edit Customer, I will be directed to Edit Customer page")
public void i_click_on_edit_customer_i_will_be_directed_to_edit_customer_page() {
	HomePage hp = new HomePage();
    hp.EditCustomer().click();
}
    

@When("I pass {string} and click on submit")
public void i_pass_and_click_on_submit(String string) {
    // Write code here that turns the phrase above into concrete actions
	EditCustomerPage Ec = new EditCustomerPage();
	Ec.Edit().sendKeys("xxx");
	Ec.Submit().click();
}

@Then("I can Edit Customer details")
public void i_can_edit_customer_details() {
    // Write code here that turns the phrase above into concrete actions
	
}

@When("I click on Delete Customer, I will be directed to Delete Cutomer page")
public void i_click_on_delete_customer_i_will_be_directed_to_delete_cutomer_page() {
	HomePage hp = new HomePage();
    hp.DeleteCustomer().click();
    }

@Then("I can Delete Customer")
public void i_can_delete_customer() {
    DeleteCustomerPage Dc = new DeleteCustomerPage();
    Dc.Delete().sendKeys("xxx");
    Dc.Submit();
}


}
