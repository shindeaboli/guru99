package UtilitysFramewok;

	import java.time.Duration;
	import java.util.Iterator;
	import java.util.List;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import BaseLayer.BaseClass;

	public class HandleDropDown extends BaseClass {

		// selectByVisibleText()
		public static void selectByVisibleText(WebElement wb, String value) {
			WebElement selwb = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));

			new Select(selwb).selectByVisibleText(value);
		}

		// selectByValue()
		public static void selectByValue(WebElement wb, String value) {
			WebElement selwb = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));

			new Select(selwb).selectByValue(value);
		}

		// selectByIndex
		public static void selectByIndex(WebElement wb, int index) {
			WebElement selwb = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));

			new Select(selwb).selectByIndex(index);
		}

		// getOptions()
		public static void getOptions(WebElement wb) {
			WebElement selwb = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));

			List<WebElement> ls = new Select(selwb).getOptions();

			for (WebElement wb1 : ls) {
				System.out.println(wb1.getText());
			}

		}

		// count drop down size
		public static int size(WebElement wb) {
			WebElement selwb = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));

			List<WebElement> ls = new Select(selwb).getOptions();

			return ls.size();
		}

		// count drop down size
		public static String checkSpecificValue(WebElement wb, String value) {
			WebElement selwb = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));

			List<WebElement> ls = new Select(selwb).getOptions();

			for (WebElement wb1 : ls) {

				if (wb1.getText().equalsIgnoreCase(value)) {
					return wb1.getText();
				}
			}
			return null;
		}

		// getFirstSelectedOption() method
		public static String getFirstSelectedOption(WebElement wb) {

			WebElement selwb = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));

			return new Select(selwb).getFirstSelectedOption().getText();

		}

}
