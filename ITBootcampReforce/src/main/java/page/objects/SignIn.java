package page.objects;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {

	private WebDriver driver;
	private Map<String, String> xPaths;

	public SignIn(WebDriver driver, Map<String, String> xPaths) {
		this.driver = driver;
		this.xPaths = xPaths;
	}

	public WebElement takeSigninBtn() {
		return driver.findElement(By.xpath(xPaths.get("SignInBtn")));
	}

	public static void wait2() {
		try {
			Thread.sleep(2999);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public SignIn navigateLoginPage() {
		wait2();
		driver.get(xPaths.get("SignInURL"));
		return new SignIn(driver, xPaths);
	}

	// LogoutBtn
	public WebElement logoutBtn() {
		return driver.findElement(By.xpath(xPaths.get("logout1")));
	}

	public void clickLogoutBtn() {
		logoutBtn().click();
	}

	// LGout
	public WebElement logoutBtnS() {
		return driver.findElement(By.xpath(xPaths.get("logoutB1")));
	}

	public void clickLogoutBtnS() {
		logoutBtnS().click();
	}

	// input user WebElement
	public WebElement SingInInputUser() {
		return driver.findElement(By.xpath(xPaths.get("SignInInputUser")));
	}

	// pass input
	public WebElement PasswordInput() {
		return driver.findElement(By.xpath(xPaths.get("PasswordInput")));
	}

	// input User

	public void InputUser() {
		SingInInputUser().sendKeys(xPaths.get("string1"));
	}

	public void InputUserr(String data) {
		SingInInputUser().sendKeys(data);
	}

	// input password

	public void InputPassword() {
		PasswordInput().sendKeys(xPaths.get("string2"));
	}

	public void InputPassword(String data) {
		PasswordInput().sendKeys(data);
	}

	public void clickSignInBtn() {
		takeSigninBtn().click();

	}

	public Integer indHome() {
		return driver.findElements(By.xpath(xPaths.get("checkSi"))).size();
	}

}
