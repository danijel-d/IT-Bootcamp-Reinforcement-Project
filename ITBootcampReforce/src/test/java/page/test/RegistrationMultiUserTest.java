package page.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.HomePage;
import page.objects.Registration;
import page.utilites.ExcelUtils;

public class RegistrationMultiUserTest extends BaseTest {

	

	
		@Test
		public  void testExcelRegistrationSeveralUsers()throws InterruptedException   {
			
			int n=3;
			
			for (int i = 1; i < n; i++) {
			Registration rg = homePage.clickBtn();
			rg.navigateLoginPage();
			
			ExcelUtils.setExcell("test3.xlsx");
			ExcelUtils.setWorkSheet("Sheet1");
			String data;
		
			
			rg.navigateLoginPage();
			
			
			Thread.sleep(5000);
			
			
			rg.clickRegBtn();
			
			data = ExcelUtils.getDataAt(i, 0);
			
			rg.RegInputUser(data);
			data = ExcelUtils.getDataAt(i, 5);
			
			rg.EmailInputPass(data);
			
			data = ExcelUtils.getDataAt(i, 1);
			rg.RegInputPass(data);
			
			data = ExcelUtils.getDataAt(i, 2);
			rg.CRegInputPass(data);
			Thread.sleep(5000);
			
			data = ExcelUtils.getDataAt(i, 14);
			rg.clickselectOption1(data);
			
			rg.clickRegBtnSub();
		
			SoftAssert sa = new SoftAssert();
			
			String s = driver.getCurrentUrl();
			boolean b =true;
			b =s.contains("https://sandbox.2checkout.com/sandbox/home/dashboard");
			if(s.contains("https://sandbox.2checkout.com/sandbox/home/dashboard")){
			System.out.println("Registracija je uspesna");
			}else {
				System.out.println("Registracija nije uspesna");
			}
			
			
			sa.assertTrue(b); 
			rg.clickLogoutBtn();
			rg.clickLogoutBtnS();
			sa.assertAll();

			
			}
		
	}
	
}
