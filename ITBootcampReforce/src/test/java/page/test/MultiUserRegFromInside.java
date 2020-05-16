package page.test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.RegistrationFromInside;
import page.objects.SignIn;
import page.utilites.ExcelUtils;

public class MultiUserRegFromInside extends BaseTest {

	@Test
	public void multiReg() {
		//new Signin Page with chrome webdriver
		SignIn sn = homePage.click();
		// navigate to Login Page
		sn.navigateLoginPage();

		// input username
		sn.InputUser();
		// input password
		sn.InputPassword();
		// click submit
		sn.clickSignInBtn();

		RegistrationFromInside reg2 = homePage.newReg2();
		// click on Account button
		reg2.clickAccountBtn();

		ExcelUtils.setExcell("test3.xlsx");
		ExcelUtils.setWorkSheet("Sheet1");
		int n = 41;
		for (int i = 38; i < n; i++) {

			// click User Menagment
			reg2.clickUserMenagmentBtn();
			// click Create Username
			reg2.clickCreateUsernameBtn();

			String data = ExcelUtils.getDataAt(i, 0);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// input mail
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			reg2.mailInputToReg(data);
			// input username
			data = ExcelUtils.getDataAt(i, 1);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			reg2.RegInputUsername(data);
			data+= randomInt();
			//add new value to user name so you can do several tests without change Excel file
			ExcelUtils.setDataAt(i, 1, data);
			// input password
			data = ExcelUtils.getDataAt(i, 2);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			reg2.clickPassInput(data);
			// confirm password
			data = ExcelUtils.getDataAt(i, 2);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			reg2.clickConfirmPass(data);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// click Create
			reg2.clickToCreateAccount();
			//url to check after user is created
			Boolean contains = driver.getCurrentUrl().contains("sandbox.2checkout.com/sandbox/acct/update_user");
			

			SoftAssert sa = new SoftAssert();
			sa.assertEquals(contains, true);
			sa.assertAll();

		}

	}
	
	private Integer randomInt() {
		Random rand = new Random();
		Integer random = rand.nextInt(9) + 1;
		return random;
	}
}
