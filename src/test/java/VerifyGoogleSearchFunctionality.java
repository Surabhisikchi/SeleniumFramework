

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import WebPages.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyGoogleSearchFunctionality {

	static WebDriver driver = null;

	public static void main(String args[]) {
		
		GoogleSearch();

	}

	public static void GoogleSearch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://google.com");
		
		GoogleSearchPage GS = new GoogleSearchPage(driver);

		GS.provideTextInSearchTextBox("Testing");
		GS.clickOnSearchButton();

	}

}
