package testObject;

import org.testng.annotations.Test;

import junit.framework.Assert;
import net.bytebuddy.asm.Advice.OffsetMapping.Target.AbstractReadOnlyAdapter;
import pageObject.RegisterPage;
import pageObject.SingUpPage;

import org.testng.annotations.BeforeClass;

import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class sing_up {
	
	private WebDriver driver;
	SingUpPage singuppage;
	
	
  @Test
  public void singUp() throws NullPointerException, InterruptedException {
	  Thread.sleep(200);
	  singuppage.singUp();
	  Thread.sleep(200);
	  singuppage.enterName();
	  Thread.sleep(2000);
	  singuppage.enterEmail();
	  Thread.sleep(2000);
	  singuppage.alterMail();
	  Thread.sleep(2000);
	  singuppage.aboutUs();
	  Thread.sleep(2000);
	  singuppage.university();
	  Thread.sleep(2000);
	  singuppage.password();
	  Thread.sleep(2000);
	  singuppage.confirm();
	  Thread.sleep(2000);
  }
  
  /*
  @Test
  public void abenterEmail() throws Exception  {
	  
  }
  
  @Test
  public void acalterEmail() throws Exception {
	  
  }
  
  @Test
  public void adaboutUs() throws Exception{
	  
  }
  
  @Test
  public void aeuniversity() throws Exception{
	  
  }
  
  @Test
  public void afpassword() throws Exception{
	  
  }
  
  @Test
  public void agphoneNumber() throws Exception{
	  singuppage.phoneNumber();
	  Thread.sleep(2000);
  }
  
  @Test
  public void ahconfirm() throws Exception{
	  
  }
  */
  
  
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
