package page.objects;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {

	private WebDriver driver;
	private Map<String, String> xPaths;

	public ProductPage(WebDriver driver, Map<String, String> xPaths) {
		this.driver = driver;
		this.xPaths = xPaths;

	}

	// prod

	public WebElement prodBtn() {
		return driver.findElement(By.xpath(xPaths.get("prod")));
	}

	public void clickProdBtnSub() {
		prodBtn().click();
	}

	// add

	public WebElement addProdBtn() {
		return driver.findElement(By.xpath(xPaths.get("add1")));
	}

	public void clickAddProdBtnSub() {
		addProdBtn().click();
	}

	// radio check
	public WebElement addRadioBtn() {
		return driver.findElement(By.xpath(xPaths.get("radio1")));
	}

	public void clickRaadioBtnSub() {
		addRadioBtn().click();
	}

	// weight field
	public WebElement addRadiooBtn() {
		return driver.findElement(By.xpath(xPaths.get("RadiooBtn")));
	}

	public void clickRaadiooBtnSub() {
		addRadiooBtn().sendKeys(xPaths.get("RadiooKeys"));
	}

	// handling field
	public WebElement addHandlingBtn() {
		return driver.findElement(By.xpath(xPaths.get("addHandlingBtn")));
	}

	public void clickHandlingBtnSub() {
		addHandlingBtn().sendKeys(xPaths.get("HandlingKeys"));
	}
	

	public WebElement addRecurring() {
		return driver.findElement(By.xpath(xPaths.get("RecurringElement")));
	}

	public void clickRecurringBtnSub() {
		addRecurring().click();
	}

	// startup fee
	public WebElement addStartupfee() {
		return driver.findElement(By.xpath(xPaths.get("StartupfeeElement")));
	}
	
	public void clickaddStartupfee() {
		addStartupfee().sendKeys(xPaths.get("StartupfeeKeys"));
	}

	// runincrement
	public WebElement addRunincrement() {
		return driver.findElement(By.xpath(xPaths.get("RunincremenElement")));
	}

	public void clickaddRunincrement() {
		addRunincrement().sendKeys(xPaths.get("clickRunincrementKeys"));
	}

	

	// data_increment
	public WebElement addDataIncrement() {
		return driver.findElement(By.xpath(xPaths.get("IncrementElement")));
	}
	
	public void clickaddDataIncrement() {
		addDataIncrement().sendKeys(xPaths.get("DataIncrementKeys"));
	}
	
	
	// approvedurl
	public WebElement addApprovedUrl() {
		return driver.findElement(By.xpath(xPaths.get("ApprovedUrlElement")));
	}
	
	public void clickaddApprovedUrl() {
		addApprovedUrl().sendKeys(xPaths.get("clickaddApprovedUrlKeys"));
	}

	// weeks run interval
	public WebElement DroDownElm() {
		return driver.findElement(By.xpath(xPaths.get("DroDownElement1")));
	}
	
	public Select selectOption1() {
		Select dropdown = new Select(DroDownElm());
		return dropdown;
	}
	
	public void clickselectOptionRunInt() {
		selectOption1().selectByVisibleText(xPaths.get("clickSelectByVisibleText1"));
	}
	
	//data
	public void clickselectOptionRunInt(String data) {
		selectOption1().selectByVisibleText(data);
	}
	
	
	// weeks data interval
	public WebElement DroDownElme() {
		return driver.findElement(By.xpath(xPaths.get("DroDownElement2")));
	}
	
	public Select selectOptionDataInt() {
		Select dropdown = new Select(DroDownElme());
		return dropdown;
	}
	
	public void clicksselectOptionDataInt() {
		selectOptionDataInt().selectByVisibleText(xPaths.get("clickSelectByVisibleText2"));
	}
	
	//data
	public void clicksselectOptionDataInt(String data) {
		selectOptionDataInt().selectByVisibleText(data);
	}
	
	
	
	
	public WebElement addProdBtnAf() {
		return driver.findElement(By.xpath(xPaths.get("add")));
	}

	public void clickAddProdBtnSubAf() {
		addProdBtnAf().click();
	}
	// prod name

	public WebElement addProdNameBtn() {
		return driver.findElement(By.xpath(xPaths.get("prNameadd1")));
	}

	public void clickAddProdNameBtnSub() {
		addProdNameBtn().sendKeys(xPaths.get("prdStr"));
	}

	// data Name
	public void clickAddProdNameBtnSub(String data) {
		addProdNameBtn().sendKeys(data);
	}

	// prod id

	public WebElement addProdIdBtn() {
		return driver.findElement(By.xpath(xPaths.get("prid1")));
	}

	public void clickAddProdIdBtnSub() {
		addProdIdBtn().sendKeys(xPaths.get("prodidStr"));
	}

	// data Prod ID
	public void clickAddProdIdBtnSub(String data) {
		addProdIdBtn().sendKeys(data);
	}

	// short description
	public WebElement addShDescProdBtn() {
		return driver.findElement(By.xpath(xPaths.get("shrdescription1")));
	}

	public void clickAddShDescProd() {
		addShDescProdBtn().sendKeys(xPaths.get("shdespStr"));
	}

	// data desc sh
	public void clickAddShDescProd(String data) {
		addShDescProdBtn().sendKeys(data);
	}

	// long decription

	public WebElement addLongDescProdBtn() {
		return driver.findElement(By.xpath(xPaths.get("longdescption1")));
	}

	public void clickAddLongDescProd() {
		addLongDescProdBtn().sendKeys(xPaths.get("longdesStr"));
	}

	// data long description
	public void clickAddLongDescProd(String data) {
		addLongDescProdBtn().sendKeys(data);
	}
	// price

	public WebElement addPriceProdBtn() {
		return driver.findElement(By.xpath(xPaths.get("price1")));
	}

	public void clickAddPriceProd() {
		addPriceProdBtn().sendKeys(xPaths.get("pricestr"));
	}

	// data price
	public void clickAddPriceProd(String data) {
		addPriceProdBtn().sendKeys(data);
	}

	// save product
	public WebElement subSaveProdBtn() {
		return driver.findElement(By.xpath(xPaths.get("subProd1")));
	}

	public void clickSaveProd() {
		subSaveProdBtn().click();
	}

	// view
	public WebElement viewProdBtn() {
		return driver.findElement(By.xpath(xPaths.get("view2")));
	}

	public void clickViewProd() {
		viewProdBtn().click();
	}

	// edit Btn

	public WebElement editProdBtn() {
		return driver.findElement(By.xpath(xPaths.get("edit")));
	}

	public void clickEditProd() {
		editProdBtn().click();
	}

	public Integer addBtn() {
		return driver.findElements(By.xpath(xPaths.get("add1"))).size();
	}

	// edit price on price element

	public WebElement addNewPriceProdBtn() {
		return driver.findElement(By.xpath(xPaths.get("pprice1")));
	
	}
	//edit price for one product
	public void clickAddNewPriceProd(Double num) {
		String value = addNewPriceProdBtn().getAttribute("value");
		double incValue = num + Double.parseDouble(value);
		addNewPriceProdBtn().clear();
		addNewPriceProdBtn().sendKeys(String.valueOf(incValue));
	}
	
	
		//edit price for all product on page
	public void addNewPriceProdBtn(Double num) {
		List<WebElement> prod = driver.findElements(By.xpath("//*[contains(@name,'price')]"));
		Iterator<WebElement> itr = prod.iterator();
		while (itr.hasNext()) {
			WebElement element = itr.next();
			// find temp price
			String value = element.getAttribute("value");
			// new price equals plus old price "num"
			double incValue = num + Double.parseDouble(value);
			element.clear();
			element.sendKeys(String.valueOf(incValue));
		}

	}
	



	// save product edit

	public WebElement saveEditProdBtn() {
		return driver.findElement(By.xpath(xPaths.get("save2")));
	}

	public void clickSaveEditProd() {
		saveEditProdBtn().click();
	}

	public Integer afterSaveEditProdBtn() {
		return driver.findElements(By.xpath(xPaths.get("aftersave"))).size();
	}
	
	public Integer afterCreateProdBtn() {
		return driver.findElements(By.xpath(xPaths.get("aftercreate"))).size();
	}

}
