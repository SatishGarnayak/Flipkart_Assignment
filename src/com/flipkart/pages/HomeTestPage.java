package com.flipkart.pages;

import org.hamcrest.Matchers;
import org.openqa.selenium.interactions.Actions;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;

public class HomeTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "homepage.categoryname.lnk")
	private QAFWebElement homepageCategorynameLnk;
	@FindBy(locator = "homepage.subcategory.lnk")
	private QAFWebElement homepageSubcategoryLnk;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getHomepageCatagorynameLnk() {
		return homepageCategorynameLnk;
	}

	public QAFWebElement getHomepageSubcatagoryLnk() {
		return homepageSubcategoryLnk;
	}
	
    public void launchflipkart() {
		driver.get("/");
		driver.manage().window().maximize();
	}
	
	public void selectCategory(String subcategory, String category) {
		QAFExtendedWebElement categoryName = new QAFExtendedWebElement(
				String.format(ConfigurationManager.getBundle().getString("homepage.categoryname.lnk"), category));

		Actions action = new Actions(driver);
		action.moveToElement(categoryName).build().perform();

		QAFExtendedWebElement subCategoryName = new QAFExtendedWebElement(
				String.format(ConfigurationManager.getBundle().getString("homepage.subcategory.lnk"), subcategory));
   
		subCategoryName.waitForVisible();
		subCategoryName.click();
	}
	
	public void verifyHomepage() {
		
		 Validator.verifyThat("Flipkart Homepage Verified",driver.getTitle(),Matchers.containsString("Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More"));	
	}
}
