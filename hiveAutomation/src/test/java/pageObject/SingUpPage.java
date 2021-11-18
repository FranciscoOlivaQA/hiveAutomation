package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingUpPage extends BaseObject {

	public SingUpPage(WebDriver driver) {
		super(driver);
	}

	// SING IN FLOW
	By logo = By.xpath("//*[@id=\"root\"]/div/div/div/img");
	By emailLabel = By.name("email");
	By passLabel = By.name("password");
	By forgotLabel = By.xpath("//*[@id=\"root\"]/div/div/div/form/button[1]");
	By singUpLabel = By.xpath("//*[@id=\"root\"]/div/div/div/form/div[1]/p");
	By singUpBtn = By.xpath("//*[@id=\"root\"]/div/div/div/form/div[1]/button");
	By SingIn = By.xpath("//*[@id=\"root\"]/div/div/div/form/button[2]");
	By singUpTextLabel = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div/p"); // Text to be present "Sign up
																						// and get buzzing."
	By letsGo = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div/button");

	// namePage
	By titleName = By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div/div[1]/h1");
	By name = By.name("firstName");
	By lastName = By.name("lastName");
	By nameContinueBtn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div/div[2]/div[1]/div[4]");
	// schoolarEmail
	By title = By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[1]/h1"); // text to be present "What's your school
																			// email?"
	By schoolMail = By.name("email");
	By emailBackBtn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[2]/div[1]/div[1]/button");
	By emailContinueBtn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[2]/div[1]/div[4]/button");

	// alterAddress
	By titleAlterAddress = By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[1]/h1"); // text to be present "Enter an
																						// alternate email address."
	By alterEmail = By.name("alternativeEmail");
	By alterBackBtn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[2]/div[1]/div[1]/button");
	By alterContinueBtn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[2]/div[1]/div[4]/button");

	// hear about us
	By aboutUsTitle = By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[1]/div/h1/text()[1]"); // text to be present "How did
																						// you hear"
	By selectOptionHear = By.xpath("//*[@id=\"heardFromUs\"]/div/div[1]/div[1]");
	By aboutUsBackBtn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[2]/div[1]/div[1]/button");
	By aboutUsContinueBtn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[2]/div[1]/div[4]/button");
	// University
	By universityTitle = By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[1]/h1"); // text to be present "Confirm
																						// your University."
	By chooseDropDown = By.xpath("//*[@id=\"university\"]/div/div[1]");
	By universityBackBtn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[2]/div[1]/div[1]/button");
	By universityContunueBtn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[2]/div[1]/div[4]/button");
	// Password
	By passwordTitle = By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[1]/h1"); // text to be present "Password?"
	By passwordLbl = By.name("password");
	By confirmPasswordLbl = By.name("confirmPassword");
	By agreeRadioBtn = By.id("radio-option");
	By termsAndcond = By.xpath("//*[@id=\"radio-option\"]/span/a[1]");
	By passwordBackBtn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[2]/div[1]/div[1]/button");
	By passwordContinueBtn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[2]/div[1]/div[4]/button");
	// Phone
	By phoneTitle = By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[1]/h1");
	By phoneLabel = By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[1]/div[1]/div/input");
	By checkBox = By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[1]/div[3]/div/label");
	By phoneBackBtn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[2]/div[1]/div[1]/button");
	By phoneContinueBtn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[2]/div[1]/div[4]/button");
	// Confirm Email
	By confirmEmailTitle = By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[1]/h1"); // Text to be present "Please
																						// confirm that the email below
																						// is correct"
	By confirmEmailLabel = By.name("email");
	By confirmEmailButton = By.xpath("//*[@id=\"root\"]/div/div/div[2]/form/div[1]/div/button");

	public void singUp(WebDriver driver) throws Exception {
		
		waitForElementPresent(letsGo);
		Thread.sleep(20);
		click(letsGo);
		waitForElementPresent(name);
	}

	public boolean okletsgo(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(name));
		return true;
	}

	public void enterName() {
		waitForElementPresent(name);

		type("Automation", name);
		type("Test", lastName);
		click(nameContinueBtn);
		
	}

	public void enterEmail() throws Exception {

		waitForElementPresent(schoolMail);
		type("randomMail@yopmail.com", schoolMail);
		click(emailContinueBtn);
		Thread.sleep(2000);
		type("randomMail@yopmail.com", schoolMail);
		waitForElementPresentToBeClikleabe(emailContinueBtn);
		click(emailContinueBtn);
		waitForElementPresentToBeClikleabe(emailContinueBtn);
		click(emailContinueBtn);waitForElementPresentToBeClikleabe(emailContinueBtn);
		click(emailContinueBtn);waitForElementPresentToBeClikleabe(emailContinueBtn);
		click(emailContinueBtn);waitForElementPresentToBeClikleabe(emailContinueBtn);
		click(emailContinueBtn);waitForElementPresentToBeClikleabe(emailContinueBtn);
		click(emailContinueBtn);waitForElementPresentToBeClikleabe(emailContinueBtn);
		click(emailContinueBtn);
		
	}

	public void alterMail() {
		implicitWait();
		waitForElementPresent(alterEmail);
		waitForElementPresent(alterContinueBtn);
		assertEquals(getText(titleAlterAddress), "Enter an alternate email address.");
		type("oliva.francisco.j@gmail.com", alterEmail);
		click(alterContinueBtn);
	}

	public void aboutUs() {
		System.out.println("1");
		//waitForElementPresent(aboutUsTitle);
		System.out.println("2");
		waitForElementPresent(selectOptionHear);
		System.out.println("3");
		click(selectOptionHear);
		System.out.println("4");
		selectDropdownList(selectOptionHear, "Google Search");
		System.out.println("5");
		click(aboutUsContinueBtn);
		//assertEquals(getText(aboutUsTitle), "How did you hear");
	}

	public void university() {
		waitForElementPresent(aboutUsTitle);
		selectDropdownList(universityTitle, "Adrian Collage");
		click(universityContunueBtn);
		
	}

	public void password() {
		waitForElementPresent(passwordTitle);
			type("Frankie652!", passwordLbl);
			type("Frankie652!", confirmPasswordLbl);
			click(termsAndcond);
			click(passwordContinueBtn);
		
	}

	public void phoneNumber() {
		waitForElementPresent(phoneTitle);
			type("5157889632", phoneLabel);
			click(checkBox);
			click(phoneContinueBtn);
		
	}

	public void confirm() {
		waitForElementPresent(confirmEmailTitle);
			click(confirmEmailButton);
		
	}

	public boolean logoDisplay() {
		return isDisplayed(letsGo);
	}
}
