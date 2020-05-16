package page.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import page.objects.SignIn;
import page.objects.HomePage;
import page.objects.ProductPage;

public class BaseTest {

	protected WebDriver driver;
	protected HomePage homePage;
	protected SignIn signIn;
	protected ProductPage productPage;
	protected Map<String, String> xPaths;

	public void timOut() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@BeforeClass
	public void setUp() throws IOException {
		//surpress all logs expect INFO
		System.setProperty("webdriver.chrome.silentOutput", "true");
		// sets the system property to value named webdriver.chrome.driver and the path is mentioned to get the chrome driver
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		// create an instance of the chrome driver
		driver = new ChromeDriver();
		//String delimiter to separate words from txt file
		String delimiter = "`";
		// txt values to HashMap
		Map<String, String> xPaths = new HashMap<>();
		// using values from txt file
		try (Stream<String> lines = Files.lines(Paths.get("in.txt"))) {
			lines.filter(line -> line.contains(delimiter))
					.forEach(line -> xPaths.putIfAbsent(line.split(delimiter)[0], line.split(delimiter)[1]));
		}
		System.out.println(xPaths);
		//Resize current window to the set dimension
		driver.manage().window().maximize();
		timOut(); // time out after 3 seconds
		// new homepage before each test
		homePage = new HomePage(driver, xPaths);
	}

	@BeforeMethod
	public void goHome() {
	}

	@AfterClass
	public void quitBrowser() {
		//Close the browser
		driver.quit();
	}

	@AfterMethod(alwaysRun = true)
	private void aftermeth() {

	}

}
