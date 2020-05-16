package page.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.ProductPage;
import page.objects.SignIn;
import page.utilites.ExcelUtils;

public class EditProductTest extends BaseTest {
	@Test
	public void prodTest() throws InterruptedException {
		
		//new Product page
		ProductPage ppg = homePage.newPr();
		SignIn sn = homePage.click();
		sn.navigateLoginPage();
		//row value in excel file
		int i =1;
		//Excel file
		ExcelUtils.setExcell("test3.xlsx");
		ExcelUtils.setWorkSheet("Sheet1");
		String data = ExcelUtils.getDataAt(i, 0);
		sn.InputUserr(data);
		//values from Excel file
		data = ExcelUtils.getDataAt(i, 1);
		
		//input password
		sn.InputPassword(data);
		//click submit
		sn.clickSignInBtn();
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ppg.clickProdBtnSub();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		ppg.clickViewProd();
		ppg.clickEditProd();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Double num= 101.00;
		
		ppg.clickAddNewPriceProd(num);
		ppg.clickSaveEditProd();
	
		
		
		
		SoftAssert sa = new SoftAssert();
	    Integer num1= ppg.afterSaveEditProdBtn();
		
		//check home button is present
		sa.assertEquals(num1, 1);
		sa.assertAll();
		
		
		
		}
	}

