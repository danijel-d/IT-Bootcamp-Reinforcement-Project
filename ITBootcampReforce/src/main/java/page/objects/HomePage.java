package page.objects;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

	
	private WebDriver driver;
	private Map<String, String> xPaths;
	
	public HomePage(WebDriver driver, Map<String, String> xPaths) {
		this.driver = driver;
		this.xPaths= xPaths;
	}
	
	//new SignIn page
	public SignIn click() {
		return new SignIn(driver, xPaths);
	}
	
	//new Registration page
	public Registration clickBtn() {
		return  new Registration(driver, xPaths);
	}
	//new Product page
	public ProductPage newPr() {
		return new ProductPage(driver, xPaths);
	}
	
	//new Registration From Inside page
	public RegistrationFromInside newReg2() {
		return  new RegistrationFromInside(driver, xPaths);
	}
	
}
