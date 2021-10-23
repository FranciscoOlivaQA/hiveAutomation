package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import bsh.Console;


public class RegisterPage extends BaseObject{

	
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	By logo = By.xpath("//*[@id=\"root\"]/div/div/div/img");
	By emailLabel = By.name("email");	
	By passLabel = By.name("password");
	By forgotLabel = By.xpath("//*[@id=\"root\"]/div/div/div/form/button[1]");
	By singUpLabel = By.xpath("//*[@id=\"root\"]/div/div/div/form/div[1]/p");
	By singUpBtn = By.xpath("//*[@id=\"root\"]/div/div/div/form/div[1]/button");
	By SingIn = By.xpath("//*[@id=\"root\"]/div/div/div/form/button[2]");
	By okLabel = By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div/label");
	
	
	
	
	public void signIn(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlToBe("http://staging.hellohive.com/login"));
		wait.until(ExpectedConditions.elementToBeClickable(forgotLabel));
		wait.until(ExpectedConditions.elementToBeClickable(singUpLabel));
		System.out.println("antes de poner las credenciales");
		type("foliva@kubikware.com", emailLabel);
		type("Frankie.652", passLabel);
		click(SingIn);
		
		}
		
		
		
	

	public boolean pageDisplayed() {
		return isDisplayed(logo);
	}
	
	
	public String okLogIn(WebDriver driver) {
		
	WebDriverWait wait = new WebDriverWait(driver, 10);
	visit("http://staging.hellohive.com/");
	//wait.until(ExpectedConditions.urlToBe(url))
	wait.until(ExpectedConditions.textToBePresentInElementLocated(okLabel, "Welcome back"));
	return getText(okLabel);
	}
	
	
}