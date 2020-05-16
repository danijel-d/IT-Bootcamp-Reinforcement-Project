package page.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.RegistrationFromInside;
import page.objects.SignIn;

public class RegistrationFromInsideTest extends BaseTest{

	@Test
	public void Reg2() {
		
		SignIn sn = homePage.click();
		sn.navigateLoginPage();
		
		//input username
		sn.InputUser();
		//input password
		sn.InputPassword();
		//click submit
		sn.clickSignInBtn();
		
		RegistrationFromInside reg2 = homePage.newReg2();
		//click on Account button
		reg2.clickAccountBtn();
		//click User Menagment
		reg2.clickUserMenagmentBtn();
		//click Create Username
		reg2.clickCreateUsernameBtn();
		
		//input mail
		reg2.mailInputToReg();
		//input username
		reg2.RegInputUsername();
		//input password
		reg2.clickPassInput();
		//confirm password
		reg2.clickConfirmPass();
		//click Create
		reg2.clickToCreateAccount();
		
		//url to check after user is created
		Boolean contains= driver.getCurrentUrl().contains("sandbox.2checkout.com/sandbox/acct/update_user");
			

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(contains, true);
		sa.assertAll();
		
		
	}

}
