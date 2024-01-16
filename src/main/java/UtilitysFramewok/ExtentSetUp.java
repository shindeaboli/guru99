package UtilitysFramewok;

import java.io.File;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentSetUp {

	
	private static TakesScreenshot driver;
	private static ExtentReports extentReports;
	private static ExtentSparkReporter extentSparkReporter;

	// Set the Extent Reports properties and return the ExtentReports class
	public static ExtentReports setUp(String suiteName) {
		extentReports = new ExtentReports();

		extentSparkReporter = new ExtentSparkReporter(
				System.getProperty("user.dir") + "\\ExtentHTMLReports\\" + suiteName + "_" + getTime() + ".html");
		extentReports.attachReporter(extentSparkReporter);

		return extentReports;
	}

	// codde for Screenshot and return the destination location
	public static String screenshot(String folderName, String methodname) {
	
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir") + "\\" + folderName + "\\" + methodname + getTime() + ".png";

		try {
			FileUtils.copyFile(f, new File(dest));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dest;

	}

	// capture Current Date and Time and we have to return current date and tome
	public static String getTime() {
		return new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
	}

}
