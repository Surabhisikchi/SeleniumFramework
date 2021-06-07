package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import WebPages.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyGoogleSearchFunctionalityWithTestNG2 {

	static WebDriver driver = null;
	
	

	@BeforeTest
	public void SetUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Test
	public static void GoogleSearch1() {

		driver.get("https://google.com");

		GoogleSearchPage GS = new GoogleSearchPage(driver);

		//GS.provideTextInSearchTextBox("Testing");
		GS.clickOnSearchButton();

	}

	@Test
	public static void GoogleSearch2() {

		driver.get("https://google.com");

		GoogleSearchPage GS = new GoogleSearchPage(driver);

		//GS.provideTextInSearchTextBox("abcd");


	}
	
	//@AfterTest
	//public void TearDown() {

		//driver.close();
		//driver.quit();
//	}

}
