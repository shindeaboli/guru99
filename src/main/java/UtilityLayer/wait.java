package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class wait extends BaseClass{
	
	public static void checkElementstatusvalue(WebElement wb,String value)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until( ExpectedConditions.visibilityOf(wb)).sendKeys(value);
	}

}
