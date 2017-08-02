package com.flipkart.pages;

import org.hamcrest.Matchers;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;

public class SearchresultTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "searchresult.productname.lnk")
	private QAFWebElement searchresultProductnameLnk;


	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	
	public QAFWebElement getSearchresultProductnameLnk() {
		return searchresultProductnameLnk;
	}

	public void selectProduct(String productName) {
		QAFExtendedWebElement productCategoryName = new QAFExtendedWebElement(String
				.format(ConfigurationManager.getBundle().getString("searchresult.productname.lnk"), productName));
		Validator.verifyThat("user verify selected product", productCategoryName.getText().equalsIgnoreCase("iPad"),
				Matchers.equalTo(true));
		productCategoryName.click();
	}
	public void verifySearchResultPage(){
		Validator.verifyThat("Flipkart SelectProduct Page Verified",driver.getTitle(),Matchers.containsString("Apple Store | Buy Apple Store at Best Price in India | Flipkart.com"));
	}

	
}
