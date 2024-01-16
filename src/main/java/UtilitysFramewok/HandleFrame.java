package UtilitysFramewok;

	import java.time.Duration;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import BaseLayer.BaseClass;

	public class HandleFrame extends BaseClass {

		// by using frame id or name
		public static void frame(String idOrName) {
			new WebDriverWait(driver, Duration.ofSeconds(30))
					.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idOrName)).switchTo().frame(idOrName);

		}

		// by using frame index

		public static void frame(int index) {
			new WebDriverWait(driver, Duration.ofSeconds(30))
					.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index)).switchTo().frame(index);

		}
		// by using frame WebElement

		public static void frame(WebElement wb) {
			new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(wb))
					.switchTo().frame(wb);

		}

		// switch to top frame by using defaultContent
		public static void defaultContent() {
			driver.switchTo().defaultContent();
		}

		// switch to parent frame
		public static void parentFrame() {
			driver.switchTo().parentFrame();
		}

}
