package pageObject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseObject {
	
	private WebDriver driver;
	
	public BaseObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User.DESKTOP-RT4P2IR\\git\\hiveAutomation\\hiveAutomation\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	
	public java.util.List<WebElement> findElements(By locator){
		return driver.findElements(locator);
	}
	
	public String getText(WebElement element) {
		return element.getText();
	}

	public String getText (By locator) {
		return driver.findElement(locator).getText();
	}
	
	public void type(String inputText, By locator) {
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(inputText);
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	public void visit(String url) {
		driver.get(url);
	}
	
	public boolean isClikeble(By locator, WebDriver driver) {
		boolean clickeable = false;
		if(driver.findElement(locator).isEnabled()){
			clickeable = true;
		}
		return clickeable;
		
	}
	
	public String selectDropdownList_hearAboutUs(By locator,String text) {
		Select selectList = new Select(findElement(locator));
		selectList.selectByVisibleText(text);
		return getText(selectList.getFirstSelectedOption());
	}
	
	
}
