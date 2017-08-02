package com.flipkart.pages;

import org.hamcrest.Matchers;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;

public class ProductdetailTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "productdetailpage.productname.text")
	private QAFWebElement productdetailpageProductnameText;
	@FindBy(locator = "productdetailpage.productprice.text")
	private QAFWebElement productdetailpageProductpriceText;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getProductdetailpageProductnameText() {
		return productdetailpageProductnameText;
	}

	public QAFWebElement getProductdetailpageProductpriceText() {
		return productdetailpageProductpriceText;
	}
  
	public void verifyProductDetailPage(){
	Validator.verifyThat("selected product name displayed",getProductdetailpageProductnameText().isDisplayed(), Matchers.equalTo(true));
	Validator.verifyThat("selected product price displayed",getProductdetailpageProductpriceText().isDisplayed(), Matchers.equalTo(true));
	}
	
}
