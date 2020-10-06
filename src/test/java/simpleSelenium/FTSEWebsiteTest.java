package simpleSelenium;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FTSEWebsiteTest {
	
public static WebDriver driver;
	
	@BeforeClass
	public static void initialise() {
		System.setProperty(
			"webdriver.chrome.driver",
			"D:\\Nikolett\\QA\\Java\\Eclipse\\simpleSelenium\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1366, 768));
	    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		driver.get("http://thedemosite.co.uk/");
	    WebElement login, username, password, send;
	    login = driver.findElement(By.xpath(""));
	    login.click();
	    
	    String registered = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).getText();
	    assertEquals("**Successful Login**",registered);

	}
	
	
	@AfterClass
	public static void cleanUp() {
		driver.quit();
	}
	
}
