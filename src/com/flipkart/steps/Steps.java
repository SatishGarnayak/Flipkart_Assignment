package com.flipkart.steps;

import com.flipkart.pages.AddtocartTestPage;
import com.flipkart.pages.HomeTestPage;
import com.flipkart.pages.ProductTestPage;
import com.flipkart.pages.ProductdetailTestPage;
import com.flipkart.pages.SearchresultTestPage;
import com.qmetry.qaf.automation.core.QAFTestBase;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class Steps {
	AddtocartTestPage addtocartTestPage = new AddtocartTestPage();
	HomeTestPage homeTestPage=new HomeTestPage();
	SearchresultTestPage searchresultTestPage=new SearchresultTestPage();
	ProductTestPage productTestPage=new ProductTestPage();
	ProductdetailTestPage productdetailTestPage=new ProductdetailTestPage();
	
	@QAFTestStep(description = "user launches flipkart")
	public void UserLaunchFlipkart() {

	homeTestPage.launchflipkart();
	homeTestPage.verifyHomepage();
	}

	@QAFTestStep(description = "user select {0} from {1} section")
	public void UserSelectProduct(String subcategory, String category) {
		homeTestPage.selectCategory(subcategory, category);
	}

	@QAFTestStep(description = "user verifies searchresult page")
	public void UserVerifySearchResultPage(){
		searchresultTestPage.verifySearchResultPage();
	}

	@QAFTestStep(description = "user select {0} in searchresult page")
	public void Userselectipad(String productName) {
		searchresultTestPage.selectProduct(productName);
	}
	
	@QAFTestStep(description = "user able to see list of product name and price in console")
	public void UserseeProductnameAndPrice() {
	 productTestPage.showProductNameAndPrice();
	}
	
	@QAFTestStep(description = "user select the product with lowest price")
	public void UserselectTheProductWithLowestPrice() {
		productTestPage.clickOnlowestprice();
	}
	
	@QAFTestStep(description = "user select the product with highest price")
	public void UserselectProductWithHighestPrice() {
		productTestPage.clickOnHighestPrice();
	}
	
	@QAFTestStep(description = "verify user is on product detail page")
	public void userVerifyProductDetailPage() {
		productdetailTestPage.verifyProductDetailPage(); 
	}
	
	@QAFTestStep(description = "user taps on addtocart")
	public void UserTapOnAddtocartBtn() {
		QAFTestBase.pause(4000);
		addtocartTestPage.clickonaddtocart();
	}

	@QAFTestStep(description = "user verifies the product added to cart")
	public void UserVerifyTheProductAddedToCart() {
		addtocartTestPage.verifyaddedproduct();
	}

}
