package UtilityLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass{
	
	
	//Reusable script code for check element displayed status and enabled status and enter the value  in text box
			public static void sendKeys(WebElement wb,String value)
			{
				if(wb.isDisplayed()&&wb.isEnabled())
				{
					wb.sendKeys(value);
				}
			}

}
