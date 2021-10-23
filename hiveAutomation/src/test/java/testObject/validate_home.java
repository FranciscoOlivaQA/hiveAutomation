package testObject;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.RegisterPage;

public class validate_home {
	
	private WebDriver driver;
	RegisterPage registerpage;
	HomePage homepage;
	
	
  @Test
  public void pageDispalyed() {
	  homepage.pageDisplayed();
  }
  
  @Test
  public void objectsDisplayed() {
	  homepage.isHomeObjectsDisplayed();
  }
  
  @Test
  public void burgerMenuDispleyed() throws Exception {
	  homepage.isHive5ProcessObjectsDisplayed();
	  Thread.sleep(2000);
  }
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  registerpage = new RegisterPage(driver);
	  driver = registerpage.chromeDriverConnection();
	  registerpage.visit("http://staging.hellohive.com/login");
	  registerpage.signIn(driver);
	  Thread.sleep(2000);
	  homepage = new HomePage(driver);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
  
}
