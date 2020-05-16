package page.test;



import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.ProductPage;
import page.objects.SignIn;

public class ProductTest extends BaseTest {

	@Test
	public void prodTest() throws InterruptedException {
		//new Product page
		ProductPage ppg = homePage.newPr();
		// new Signin Page so we can use methods from signin
		SignIn sn = homePage.click();
		sn.navigateLoginPage();
		sn.InputUser();
		//input password
		sn.InputPassword();
		//click submit
		sn.clickSignInBtn();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ppg.clickProdBtnSub();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		int num=ppg.addBtn();
		//after adding one product every new have 2nd value for adding btn, so it has two possible values
		if(num==1) {
			ppg.clickAddProdBtnSub();
		}else {
			ppg.clickAddProdBtnSubAf();			
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//add prooduct name
		ppg.clickAddProdNameBtnSub();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//add product id
		ppg.clickAddProdIdBtnSub();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//add product short description
		ppg.clickAddShDescProd();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//add product long description
		ppg.clickAddLongDescProd();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		// add product price
		ppg.clickAddPriceProd();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//check radio btn
		ppg.clickRaadioBtnSub();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ppg.clickRaadiooBtnSub();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ppg.clickHandlingBtnSub();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ppg.clickRecurringBtnSub();
		
		
		//add startup fee
		ppg.clickaddStartupfee();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ppg.clickaddRunincrement();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ppg.clickaddDataIncrement();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//add approved url fro product
		ppg.clickaddApprovedUrl();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ppg.clickselectOptionRunInt();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ppg.clicksselectOptionDataInt();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Save new product
		ppg.clickSaveProd();

        SoftAssert sa = new SoftAssert();
        //boolean value for web element which appear after successful test,
	    Integer num1= ppg.afterCreateProdBtn();
		//check home button is present
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		sa.assertEquals(num1, 1);
		sa.assertAll();
		
	}
}
