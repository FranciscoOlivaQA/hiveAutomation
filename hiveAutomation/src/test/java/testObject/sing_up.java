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
  public void singUp() throws Exception {
	  singuppage.implicitWait();
	  singuppage.reporter("Opening Browser...");
	  singuppage.singUp(driver);
	  assertTrue(singuppage.okletsgo(driver));
	  singuppage.reporter("Log in succesfully");
	  singuppage.reporter("Entering Name and Last Name...");
	  singuppage.enterName();
	  singuppage.reporter("Enter Name Succesfully");
	  singuppage.implicitWait(2);
	  singuppage.reporter("Entering email...");
	  singuppage.enterEmail();
	  singuppage.reporter("Email set succesfully");
	  singuppage.reporter("Entering alter email...");
	  singuppage.alterMail();
	  singuppage.reporter("Alter Email set succesfully");
	  singuppage.implicitWait(2);
	  singuppage.implicitWait();
	  singuppage.reporter("AboutUs completing...");
	  singuppage.aboutUs();
	  singuppage.reporter("About us complete Succesfully");
	  singuppage.implicitWait();
  }
//  	@Test
//  	public void enterName() {
//	  singuppage.reporter("Entering Name and Last Name...");
//	  singuppage.enterName();
//	  singuppage.reporter("Enter Name Succesfully");
//	  singuppage.implicitWait(2);
//	  }
//
//  	@Test
//  	public void enterEmail() throws Exception {
//	  singuppage.reporter("Entering email...");
//	  singuppage.enterEmail();
//	  singuppage.reporter("Email set succesfully");
//  	}
//  	
//  	@Test
//  	public void  alterEmail() {
//	  singuppage.reporter("Entering alter email...");
//	  singuppage.alterMail();
//	  singuppage.reporter("Alter Email set succesfully");
//	  singuppage.implicitWait(2);
//  	}
//  	
//  	@Test
//  	public void aboutUs() {
//  		
//	  singuppage.implicitWait();
//	  singuppage.reporter("AboutUs completing...");
//	  singuppage.aboutUs();
//	  singuppage.reporter("About us complete Succesfully");
//	  singuppage.implicitWait();
//	  
//	  }
//
//  
//  
  
  @BeforeClass
  public void beforeClass() {
	  singuppage = new SingUpPage(driver);
	  driver = singuppage.chromeDriverConnection();
	  driver.manage().window().maximize();
	  singuppage.visit("http://staging.hellohive.com/register");
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
