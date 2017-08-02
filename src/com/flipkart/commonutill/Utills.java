package com.flipkart.commonutill;

import java.util.Set;

import com.qmetry.qaf.automation.core.QAFTestBase;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;

public class Utills extends WebDriverBaseTestPage<WebDriverTestPage>{
	

	
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		
	}

	public void switchToWindow(String switchto) {
		String oldwindowId = "";
	if (switchto.equalsIgnoreCase("childwindow")) {

			oldwindowId = driver.getWindowHandle();
			System.out.println(oldwindowId);
			Set<String> windowid = driver.getWindowHandles();
			for (String s : windowid) {
				driver.switchTo().window(s);
			}
	}
	else if (switchto.equalsIgnoreCase("parentwindow")) {
			driver.switchTo().window(oldwindowId);
			QAFTestBase.pause(4000);
		}
	}
	
	
	}
	
	


