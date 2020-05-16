package page.objects;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationFromInside {
	private WebDriver driver;
	private Map<String, String> xPaths;

	public RegistrationFromInside(WebDriver driver, Map<String, String> xPaths) {
		this.driver = driver;
		this.xPaths = xPaths;
	}

	// Account Btn
	public WebElement accountBtn() {
		return driver.findElement(By.xpath(xPaths.get("AccountBtn")));
	}

	// click Account Btn
	public void clickAccountBtn() {
		accountBtn().click();
	}

	// User Menagment Btn
	public WebElement userMenagmentBtn() {
		return driver.findElement(By.xpath(xPaths.get("UserMgm")));
	}

	// click User Menagment Btn
	public void clickUserMenagmentBtn() {
		userMenagmentBtn().click();
	}

	// Create Username Btn
	public WebElement createUsernameBtn() {
		return driver.findElement(By.xpath(xPaths.get("CreateUser")));
	}

	// click Create User Btn
	public void clickCreateUsernameBtn() {
		createUsernameBtn().click();
	}

	// mail webelement
	public WebElement mailInputField() {
		return driver.findElement(By.xpath(xPaths.get("InputUsMail")));
	}

	// input mail to reg
	public void mailInputToReg() {
		mailInputField().sendKeys(xPaths.get("string8"));
	}

	// mail field with data from Excel

	public void mailInputToReg(String data) {
		mailInputField().sendKeys(data);
	}

	// Username webelement
	public WebElement usernameInputField() {
		return driver.findElement(By.xpath(xPaths.get("InputUsName")));
	}

	// input username to reg
	public void RegInputUsername() {
		usernameInputField().sendKeys(xPaths.get("string9"));
	}

	// Username field with data from Excel

	public void RegInputUsername(String data) {
		usernameInputField().sendKeys(data);
	}

	// Password field
	public WebElement passwordInputElm() {
		return driver.findElement(By.xpath(xPaths.get("InputPassword")));
	}

	//
	public void clickPassInput() {
		passwordInputElm().sendKeys(xPaths.get("string10"));
	}

	// Password field with data from Excel

	public void clickPassInput(String data) {
		passwordInputElm().sendKeys(data);
	}

	// Password field
	public WebElement passwordConfirmInputElm() {
		return driver.findElement(By.xpath(xPaths.get("InputPasswordConfirm")));
	}

	// click to input Confirm Password field
	public void clickConfirmPass() {
		passwordConfirmInputElm().sendKeys(xPaths.get("string10"));
	}

	// Confirm Password field with data from Excel

	public void clickConfirmPass(String data) {
		passwordConfirmInputElm().sendKeys(data);
	}

	//
	// Sub Create User Btn
	public WebElement subToCreateAccountBtn() {
		return driver.findElement(By.xpath(xPaths.get("SubRegUserBtn")));
	}

	// click Sub Create User
	public void clickToCreateAccount() {
		subToCreateAccountBtn().click();
	}

}
