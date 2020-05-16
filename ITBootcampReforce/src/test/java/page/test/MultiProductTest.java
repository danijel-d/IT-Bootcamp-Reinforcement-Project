package page.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.ProductPage;
import page.objects.SignIn;
import page.utilites.ExcelUtils;

public class MultiProductTest extends BaseTest {
	
	@Test
	public void prodTest() throws InterruptedException {
		
		
		ProductPage ppg = homePage.newPr();
		SignIn sn = homePage.click();
		sn.navigateLoginPage();
		int i =1;
		ExcelUtils.setExcell("test3.xlsx");
		ExcelUtils.setWorkSheet("Sheet1");
		String data = ExcelUtils.getDataAt(i, 0);
		sn.InputUserr(data);
		data = ExcelUtils.getDataAt(i, 1);
		
		//input password
		sn.InputPassword(data);
		//click submit
		sn.clickSignInBtn();
		int n=6;
		for ( i = 1; i < n; i++) {
		Thread.sleep(3000);
		ppg.clickProdBtnSub();
		Thread.sleep(3000);
		int num=ppg.addBtn();
		if(num==1) {
			ppg.clickAddProdBtnSub();
		}else {
			ppg.clickAddProdBtnSubAf();			
		}
		Thread.sleep(3000);
		data = ExcelUtils.getDataAt(i, 0);
		ppg.clickAddProdNameBtnSub(data);
		
		data = ExcelUtils.getDataAt(i, 11);
		ppg.clickAddProdIdBtnSub(data);
		
		data = ExcelUtils.getDataAt(i, 1);
		ppg.clickAddShDescProd(data);
		
		data = ExcelUtils.getDataAt(i, 13);
		ppg.clickAddLongDescProd(data);
		
		Thread.sleep(3000);
		data = ExcelUtils.getDataAt(i, 11);
		ppg.clickAddPriceProd(data);
		
		
		Thread.sleep(3000);
		ppg.clickSaveProd();
		Thread.sleep(3000);
		//ppg.clickViewProd();
		

		SoftAssert sa = new SoftAssert();
	    //Integer num1= ppg.afterSaveEditProdBtn();
	    Integer num1= ppg.afterCreateProdBtn();
		//check home button is present
		sa.assertEquals(num1, 1);
		sa.assertAll();
		}
	}
	
	
	

}
