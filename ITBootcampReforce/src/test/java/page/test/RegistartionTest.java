package page.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.Registration;
import page.objects.SignIn;

public class RegistartionTest extends BaseTest{

	
	//detailed registration test
	
	@Test(enabled=false)
	public void regTest() throws InterruptedException {
		// new regiostration page
		Registration rg = homePage.clickBtn();
		//to url for Login Page
		rg.navigateLoginPage();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//click on sign up btn from login page
		rg.clickRegBtn();
		//input user name
		rg.RegInputUser();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//input email 
		rg.EmailInput();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		// input pass
		rg.RegInputPass();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		// input confirm pass
		rg.CRegInputPass();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//click to select option
		rg.clickselectOption1();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//click to register user
		rg.clickRegBtnSub();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		SoftAssert sa = new SoftAssert();
		//boolean value for weblement that appear after successful test 
		int num= rg.indHome();
		
		//check home button is present
		sa.assertEquals(num, 1);
		rg.clickLogoutBtn();
		rg.clickLogoutBtnS();
		sa.assertAll();
		
		
	}
	@Test(enabled=false)
	public void regTest2() throws InterruptedException {
		
		Registration rg = homePage.clickBtn();
		rg.navigateLoginPage();
		Thread.sleep(5000);
		rg.clickRegBtn();
		rg.RegInputUser();
		rg.EmailInput();
		rg.RegInputPass();
		rg.CRegInputPass();
		Thread.sleep(5000);
		
		rg.clickRegBtnSub();
		Thread.sleep(8000);
		
		SoftAssert sa = new SoftAssert();
		int num= rg.indHome();
		
		//check home button is present
		sa.assertEquals(num, 1);
		rg.clickLogoutBtn();
		rg.clickLogoutBtnS();
		sa.assertAll();
		
		
	}
	@Test(enabled=false)
	public void regTest3() throws InterruptedException {
		
		Registration rg = homePage.clickBtn();
		rg.navigateLoginPage();
		Thread.sleep(5000);
		rg.clickRegBtn();
		rg.RegInputUser();
		rg.EmailInput();
		rg.RegInputPass();
		
		Thread.sleep(5000);
		
		rg.clickRegBtnSub();
		Thread.sleep(8000);
		
		SoftAssert sa = new SoftAssert();
		int num= rg.indHome();
		
		//check home button is present
		sa.assertEquals(num, 1);
		rg.clickLogoutBtn();
		rg.clickLogoutBtnS();
		sa.assertAll();
		
		
	}
	
	@Test(enabled=false)
	public void regTest4() throws InterruptedException {
		
		Registration rg = homePage.clickBtn();
		rg.navigateLoginPage();
		Thread.sleep(5000);
		rg.clickRegBtn();
		rg.RegInputUser();
		
		rg.RegInputPass();
		
		Thread.sleep(5000);
		
		rg.clickRegBtnSub();
		Thread.sleep(8000);
		
		SoftAssert sa = new SoftAssert();
		int num= rg.indHome();
		
		//check home button is present
		sa.assertEquals(num, 1);
		rg.clickLogoutBtn();
		rg.clickLogoutBtnS();
		sa.assertAll();
		
		
	}
}
