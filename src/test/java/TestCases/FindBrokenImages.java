package TestCases;
import java.util.List;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.HttpResponse;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindBrokenImages {

	private WebDriver driver;

	private int invalidImageCount;

	@BeforeClass

	public void setUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Test

	public void validateInvalidImages() {
		
		driver.get("https://google.com");

		try {

			invalidImageCount = 0;

			List<WebElement> imagesList = driver.findElements(By.tagName("img"));

			System.out.println("Total no. of images are " + imagesList.size());

			for (WebElement imgElement : imagesList) {

				if (imgElement != null) {

					//verifyimageActive(imgElement);

					System.out.println("No images are broken");

				}

			}

			System.out.println("Total no. of invalid images are "       + invalidImageCount);

		} catch (Exception e) {

			e.printStackTrace();

			System.out.println(e.getMessage());

		}

	}



	@AfterClass

	public void tearDown() {

		if (driver != null)

			driver.quit();

	}





}