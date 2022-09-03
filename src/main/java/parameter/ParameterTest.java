package parameter;

import org.junit.Test;
import org.testng.annotations.Parameters;

public class ParameterTest {
	WebDriver driver;

	@Test
	@Parameters({"env", "browser", "url", "emailID"})
	public void yahooLogin(String env, String browser, String url, String emailID) {
		
		if(browser.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sokoeurn chhay\\Selenium_Java_Review\\Parameter\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		} 
		else if(browser.equals("firework")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sokoeurn chhay\\Selenium_Java_Review\\Parameter\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("url");
		
		driver.findElement(By.xpath("put xpath expressinon")).clear;
		driver.findElement(By.xpath("put xpath expression")).sendKeys("emailID");				//enter username
		driver.findElement(By.xpath("put xpath expression")).sendkeys("#Table1#");					//enter password
		driver.findElement(By.xpath("put xpath expression")).click;
		
		
		
	}

}
