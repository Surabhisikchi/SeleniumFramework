import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String ProjectPath = System.getProperty("user.dir");
		System.out.println("Project Path Is:"+""+ProjectPath);
		
		System.setProperty("webdriver.chrome.driver", ProjectPath+"/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://wwnorton.com/");
		driver.close();
		
	}

}
