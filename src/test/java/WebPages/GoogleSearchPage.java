package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	
	WebDriver driver = null;
	
	By textbox_search = By.name("q");
	
	By button_search = By.xpath("//input[@name='btnK']");
	
	
	public GoogleSearchPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	public  void provideTextInSearchTextBox()
	
	{
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("document.getElementByName('q').value='ABC'");
		
		//driver.findElement(textbox_search).sendKeys(someText);
		
		
	}
	
	public  void clickOnSearchButton() {
		
		driver.findElement(button_search).sendKeys(Keys.RETURN);
		
	}

}
