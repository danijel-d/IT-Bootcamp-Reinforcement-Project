package page.objects;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	private WebDriver driver;
	private Map<String, String> xPaths;

	public Registration(WebDriver driver, Map<String, String> xPaths) {
		this.driver = driver;
		this.xPaths = xPaths;
		
	}
	
	public Registration navigateLoginPage()  {
		driver.get(xPaths.get("SignInURL"));
		return new Registration(driver, xPaths);
	}
	// registration fields
	public WebElement regBtn() {
		return driver.findElement(By.xpath(xPaths.get("Reg")));
	}
	//click on registration btn
	public void clickRegBtn() {
		regBtn().click();
	}
	
	public WebElement RegInputUserElm() {
		return driver.findElement(By.xpath(xPaths.get("RegInputUser")));
	}
	//LogoutBtn
	public WebElement logoutBtn() {
		return driver.findElement(By.xpath(xPaths.get("logout1")));
	}
	// click on Logout
	public void clickLogoutBtn() {
		 logoutBtn().click();
	}
	//LGout
	public WebElement logoutBtnS() {
		return driver.findElement(By.xpath(xPaths.get("logoutB1")));
	}
	
	public void clickLogoutBtnS() {
		logoutBtnS().click();
	}
	
	// input user field
	public void RegInputUser() {
		RegInputUserElm().sendKeys(xPaths.get("string3"));
	}
	//with data from Excel
	public void RegInputUser(String data) {
		RegInputUserElm().sendKeys(data);
	}
	
	//input Password
	public WebElement PasswordInputElm() {
		return driver.findElement(By.xpath(xPaths.get("pass1")));
	}
	// send password string
	public void RegInputPass() {
		PasswordInputElm().sendKeys(xPaths.get("string4"));
	}
	
	
	//with data from Excel
	
	public void RegInputPass(String data) {
		PasswordInputElm().sendKeys(data);
	}
	
	//Email field 
	public WebElement EmailInputElm() {
		return driver.findElement(By.xpath(xPaths.get("email")));
	}
	
	public void EmailInput() {
		EmailInputElm().sendKeys(xPaths.get("string5"));
	}
	//with data from Excel
	public void EmailInputPass(String data) {
		EmailInputElm().sendKeys(data);
	}
	//Repeat Password
	
	public WebElement CPasswordInputElm() {
		return driver.findElement(By.xpath(xPaths.get("cpass1")));
	}
	
	public void CRegInputPass() {
		CPasswordInputElm().sendKeys(xPaths.get("string4"));
	}
	
	//with data from Excel
	public void CRegInputPass(String data) {
		CPasswordInputElm().sendKeys(data);
	}
	
	//DropDown 
	
	public WebElement DroDownElm() {
		return driver.findElement(By.xpath(xPaths.get("dropddo1")));
	}
	
	public Select selectOption1() {
		Select dropdown = new Select(DroDownElm());
		return dropdown;
	}

	public void clickselectOption1() {
		selectOption1().selectByVisibleText(xPaths.get("string7"));
	}
	
	//with data from Excel
	public void clickselectOption1(String data) {
		selectOption1().selectByVisibleText(data);
	}
	
	//clik Reg btn
	public WebElement regBtnSub() {
		return driver.findElement(By.xpath(xPaths.get("subB3")));
	}
	public void clickRegBtnSub() {
		regBtnSub().click();
	}
	
	public Integer indHome() {
		return  driver.findElements(By.xpath(xPaths.get("checkSi"))).size();
	}
	
	
	
	
	
	
	
	
}
