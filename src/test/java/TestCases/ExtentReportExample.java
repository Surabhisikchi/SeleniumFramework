package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ExtentReportExample {

	static WebDriver driver = null;

	public static void main(String[] args) {

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentreportdemo.html");

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test1 = extent.createTest("Google search" , "This is for checking google search functionality");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		test1.log(Status.INFO, "Starting test case");

		driver.get("https://google.com");
		test1.pass("Launched URL successfully");

		driver.findElement(By.name("q")).sendKeys("Software Testing");

		test1.pass("Type the text successfully");

		driver.close();

		driver.quit();
		
		test1.info("Test completed");
		extent.flush();

	}

}
