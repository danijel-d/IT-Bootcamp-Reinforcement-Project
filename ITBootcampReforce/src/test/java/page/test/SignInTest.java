package page.test;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.HomePage;
import page.objects.SignIn;

public class SignInTest extends BaseTest{
	
	

	@Test
	public  void testSignIn(){

		//SignIn sn = SignIn.navigateLoginPage(driver, xPaths);
		SignIn sn = homePage.click();
		sn.navigateLoginPage();
		
		
		//input username
		sn.InputUser();
		wait2();
		//input password
		sn.InputPassword();
		//click submit
		sn.clickSignInBtn();
		SoftAssert sa = new SoftAssert();
		wait2();
		
		int num= sn.indHome();
	
		//check home button is present
		sa.assertEquals(num, 1);
		
		sa.assertAll();
	}
	
	
	public static void wait2() {
		try {
			Thread.sleep(7999);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
