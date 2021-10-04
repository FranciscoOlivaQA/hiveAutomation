package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class HomePage extends BaseObject {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	
	//HOME OBJECTS
	By hiveLogo = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/img");
	By welcomeLabel = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/label");
	By processBtn = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div/div/button");
	By UpdateResumeBtn = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div/button[1]");
	By FlyhireBtn = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div/button[2]");
	By HelperB = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[2]/img");
	By askBtn = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[3]/img");
	By burguerMenu = By.id("toggle-icon");
	
	//HIVE 5 PROCESS
	By hiveLogoProcess = By.xpath("//*[@id=\"sidebar-container\"]/div[2]/div[1]/img");
	By resumePreview = By.xpath("//*[@id=\"sidebar-container\"]/div[2]/div[2]/button");
	By beYourself = By.xpath("//*[@id=\"sidebar-container\"]/div[2]/div[3]/button");
	By beInformed = By.xpath("//*[@id=\"sidebar-container\"]/div[2]/div[5]/button");
	By bePrepared = By.xpath("//*[@id=\"sidebar-container\"]/div[2]/div[6]/button");
	By beProfessional = By.xpath("//*[@id=\"sidebar-container\"]/div[2]/div[7]/button");
	By beInclusive = By.xpath("//*[@id=\"sidebar-container\"]/div[2]/div[8]/button");
	By beHive = By.xpath("//*[@id=\"sidebar-container\"]/div[2]/div[9]/button");
	By homeBtn = By.xpath("//*[@id=\"sidebar-container\"]/div[3]/div[1]/div[1]/button");
	
	//UPDATE PROFILE & RESUME
	By photoBtn = By.xpath("//*[@id=\"sidebar-container-profile\"]/div[1]/button");
	By resumeBtn = By.xpath("//*[@id=\"infoBody\"]/div/div[2]/div[2]/button");
	By schoolInfo = By.id("school");
	By experience = By.id("experience");
	By skills = By.id("skill");	
	By diversity = By.id("diversity-inclusion");
	By writing = By.id("writing");
	By preferences = By.id("preferences");
	
	
	public boolean pageDisplayed() {
		return isDisplayed(hiveLogo);
	}
	
	public boolean isHomeObjectsDisplayed() {
		boolean displayed = false;
		if(isDisplayed(processBtn)&
				isDisplayed(UpdateResumeBtn)&
				isDisplayed(FlyhireBtn)&
				isDisplayed(HelperB)&
				isDisplayed(askBtn)&
				isDisplayed(burguerMenu)) {
			displayed=true;
		}else {
			System.out.print("not displayed correctly");
		}
		
		
		return displayed;
	}
	
	public boolean isHive5ProcessObjectsDisplayed() {
		boolean displayed = false;
 		if(isDisplayed(hiveLogoProcess)&
 				isDisplayed(resumePreview)&
 				isDisplayed(beYourself)&
 				isDisplayed(beInformed)&
 				isDisplayed(bePrepared)&
 				isDisplayed(beProfessional)&
 				isDisplayed(beInclusive)&
 				isDisplayed(beHive)&
 				isDisplayed(homeBtn)) {
 			displayed = true;
 		}else {
			System.out.print("not displayed correctly");
		}
		return displayed;
	}
	
	
	
	
}
