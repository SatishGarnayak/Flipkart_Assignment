package com.flipkart.pages;

import org.hamcrest.Matchers;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;

public class AddtocartTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "addtocartpage.addtocart.btn")
	private QAFWebElement addtocartpageAddtocartBtn;
	@FindBy(locator = "addtocartpage.productname.lbl")
	private QAFWebElement addtocartpageProductnameLbl;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getAddtocartpageAddtocartBtn() {
		return addtocartpageAddtocartBtn;
	}

	public QAFWebElement getAddtocartpageProductnameLbl() {
		return addtocartpageProductnameLbl;
	}
    public void clickonaddtocart() {
		
		getAddtocartpageAddtocartBtn().waitForVisible();
		getAddtocartpageAddtocartBtn().click();
	}

	public void verifyaddedproduct() {

		Validator.verifyThat("product successfully added to cart", getAddtocartpageProductnameLbl().isDisplayed(), Matchers.equalTo(true));
		
	}
}
