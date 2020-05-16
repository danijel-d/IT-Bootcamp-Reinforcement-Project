package page.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.SignIn;
import page.utilites.ExcelUtils;

public class MultiUserLogin extends BaseTest{


	@Test
	public  void testSignIn(){

		//SignIn sn = SignIn.navigateLoginPage(driver, xPaths);
		int n =32;
		for ( int i = 1; i < n; i++) {
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		SignIn sn = homePage.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		sn.navigateLoginPage();
		
		ExcelUtils.setExcell("test3.xlsx");
		ExcelUtils.setWorkSheet("Sheet1");
		String data = ExcelUtils.getDataAt(i, 0);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		sn.InputUserr(data);
		data = ExcelUtils.getDataAt(i, 1);
		
		//input password
		sn.InputPassword(data);
		//click submit
		sn.clickSignInBtn();
		SoftAssert sa = new SoftAssert();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		int num= sn.indHome();
		
		//check home button is present
		sa.assertEquals(num, 1);
		
		sa.assertAll();
		sn.clickLogoutBtn();
		sn.clickLogoutBtnS();
		}
	}
	
	
	public static void wait2() {
		try {
			Thread.sleep(2999);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
