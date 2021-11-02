package testObject;

import org.testng.annotations.Test;

import junit.framework.Assert;
import net.bytebuddy.asm.Advice.OffsetMapping.Target.AbstractReadOnlyAdapter;
import pageObject.RegisterPage;
import pageObject.SingUpPage;

import org.testng.annotations.BeforeClass;

import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class sing_up {
	
	private WebDriver driver;
	SingUpPage singuppage;
	
	
  @Test
  public void singUp() throws NullPointerException, InterruptedException {
	  Thread.sleep(200);
	  singuppage.singUp(driver);
	  assertTrue(singuppage.okletsgo(driver));
	  Thread.sleep(200);
	  }

  
  
  @Test
  public void abenterEmail() throws Exception  {
	  //	  singuppage.enterName();
	  }
  
  
  @BeforeClass
  public void beforeClass() {
	  singuppage = new SingUpPage(driver);
	  driver = singuppage.chromeDriverConnection();
	  
	  singuppage.visit("http://staging.hellohive.com/register");
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
