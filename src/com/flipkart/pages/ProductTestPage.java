package com.flipkart.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.flipkart.commonutill.Utills;
import com.flipkart.component.ProductComponent;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

public class ProductTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	
	@FindBy(locator = "productpage.pricelowtohigh.lnk")
	private QAFWebElement productpagePricelowtohighLnk;
	
	@FindBy(locator = "productpage.pricehightolow.lnk")
	private QAFWebElement productpagePricehightolowLnk;

	@FindBy(locator = "productpage.product.lst")
	private List<ProductComponent> productpageProductLst;
	
	public QAFWebElement getProductpagePricelowtohighLnk() {
		return productpagePricelowtohighLnk;
	}


	public QAFWebElement getProductpagePricehightolowLnk() {
		return productpagePricehightolowLnk;
	}
	
	public List<ProductComponent> getProductpageProductLst() {
		return productpageProductLst;
	}
	
	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}
	Utills utills=new Utills();
	public void showProductNameAndPrice(){
		
		List<ProductComponent> comp=getProductpageProductLst();
		for(ProductComponent product:comp){
			Reporter.log("Product name= "+product.productName());
			Reporter.log("Product price= "+product.productPrice());
			
	}
	}

	public void clickOnlowestprice() {
		
		getProductpagePricelowtohighLnk().click();
		getProductpageProductLst().get(0).click();
		utills.switchToWindow("switchtochildwindow");

	}
	public void clickOnHighestPrice(){
		getProductpagePricehightolowLnk().click();
		getProductpageProductLst().get(0).click();
		utills.switchToWindow("switchtochildwindow");
		
	
	}

}
