package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import WebPages.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportWithTesNG {


	// Global variable

	WebDriver driver = null;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	@BeforeTest
	public void SetUp() {

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentreportdemo.html");

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Test
	public void GoogleSearch() {

		ExtentTest test1 = extent.createTest("Google search" , "This is for checking google search functionality");

		test1.log(Status.INFO, "This step perform the google search");

		driver.get("https://google.com");

		test1.pass("Successfully launched the URL");

		GoogleSearchPage GS = new GoogleSearchPage(driver);

		GS.provideTextInSearchTextBox("Testing");


		test1.pass("Provided the text");

		GS.clickOnSearchButton();
		test1.pass("Provided the text");

	}

	public void TearDown() {

		driver.close();
		driver.quit();
		
		extent.flush();

	}
}
