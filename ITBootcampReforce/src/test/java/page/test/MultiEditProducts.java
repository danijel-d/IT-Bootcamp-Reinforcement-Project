package page.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.ProductPage;
import page.objects.SignIn;
import page.utilites.ExcelUtils;

public class MultiEditProducts  extends BaseTest {
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
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			ppg.clickProdBtnSub();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			// view product
			ppg.clickViewProd();
			// edit products
			ppg.clickEditProd();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			//value to add for new price
			Double num= 100.00;
			
			ppg.addNewPriceProdBtn(num);
			//save new price
			ppg.clickSaveEditProd();
			
			
			
			SoftAssert sa = new SoftAssert();
		    Integer num1= ppg.afterSaveEditProdBtn();
			
			//check home button is present
			sa.assertEquals(num1, 1);
			sa.assertAll();
			
			
			
			}
		}

