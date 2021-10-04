package testObject;

import org.testng.annotations.Test;

import pageObject.RegisterPage;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class log_in_test {
	
	private WebDriver driver;
	RegisterPage registerpage;
	
  @Test
  public void login() throws Exception {
	  
	  registerpage.singIn();
	  Thread.sleep(2000);
	  //assertNotEquals("Welcome back", registerpage.okLogIn());
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  registerpage = new RegisterPage(driver);
	  driver = registerpage.chromeDriverConnection();
	  registerpage.visit("http://staging.hellohive.com/login");
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

  
}
