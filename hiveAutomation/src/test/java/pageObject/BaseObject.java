package pageObject;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.TimeoutException;
import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
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
		System.setProperty(GlobalLocalVariables.CHROME_DIVER_KEY,GlobalLocalVariables.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
		return driver;
	}

	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}

	public java.util.List<WebElement> findElements(By locator) {
		return driver.findElements(locator);
	}

	public String getText(WebElement element) {
		return element.getText();
	}

	public String getText(By locator) {
		try {
			return driver.findElement(locator).getText();	
		}catch(NoSuchElementException e) {
			e.printStackTrace();
			return null;
		}
		
	}

	public void type(String inputText, By locator) {
		try {
			driver.findElement(locator).clear();
			driver.findElement(locator).sendKeys(inputText);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

	}

	public void click(By locator) {
		try {
			driver.findElement(locator).click();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
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
		if (driver.findElement(locator).isEnabled()) {
			clickeable = true;
		}
		return clickeable;

	}

	public String selectDropdownList(By locator, String text) {
		Select selectList = new Select(findElement(locator));
		selectList.selectByVisibleText(text);
		return getText(selectList.getFirstSelectedOption());
	}

	public void reporter(String log) {
		Reporter.log(log);
	}

	/*
	 * Implicit wait
	 *
	 */
	public void implicitWait() {
		try {
			driver.manage().timeouts().implicitlyWait(GlobalLocalVariables.TIMEOUT_SEC, TimeUnit.SECONDS);
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}

	/*
	 * Implicit wait (Overloading)
	 *
	 */
	public void implicitWait(int seg) {
		try {
			driver.manage().timeouts().implicitlyWait(seg, TimeUnit.SECONDS);
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}

	/*
	 * Wait for element present (sync)
	 */
	public void waitForElementPresent(By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, GlobalLocalVariables.TIMEOUT_SEC);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
	
	public void waitForElementPresentToBeClikleabe(By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, GlobalLocalVariables.TIMEOUT_SEC);
			wait.until(ExpectedConditions.elementToBeClickable(locator));
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
	
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void assertEquals (String actual, String expected) {
		try {
			Assert.assertEquals(actual, expected);
		}catch(AssertionError e) {
			Assert.fail();
		}
	}
	
	
	
}
