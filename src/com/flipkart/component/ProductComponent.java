package com.flipkart.component;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class ProductComponent extends QAFWebComponent{
	
	public ProductComponent(String locator) {
		super(locator);
	}
	
	@FindBy(locator = "productpage.price.lst")
	private QAFWebElement productpagePriceLst;
	
	@FindBy(locator = "productpage.productname.lst")
	private QAFWebElement productpageProductnameLst;
	
	
	public QAFWebElement getProductpagePriceLst() {
		return productpagePriceLst;
	}
	public QAFWebElement getProductpageProductnameLst() {
		return productpageProductnameLst;
	}
	public String productName() {
		return getProductpageProductnameLst().getText();
	}
	public String productPrice(){
		return getProductpagePriceLst().getText();
	}
}
