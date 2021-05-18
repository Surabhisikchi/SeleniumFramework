

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManagerSample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		// Cmd+Shift+O --> To import the packages
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		Thread.sleep(3000);
		List <WebElement> Countoflocators =driver.findElements(By.xpath("//input"));
		
		int Count = Countoflocators.size();
		
		System.out.println(Count);
		
		driver.close();
		

	}

}
