package simpleSelenium;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoSiteTest {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void initialise() {
		System.setProperty(
			"webdriver.chrome.driver",
			"D:\\Nikolett\\QA\\Java\\Eclipse\\simpleSelenium\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void addUserTest() throws InterruptedException {
		driver.get("http://thedemosite.co.uk/");
	    WebElement addUser, username, password, send;
	    addUser = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
	    Thread.sleep(500);
	    addUser.click();
	    username = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
	    String uName = "guest";
	    username.sendKeys(uName);
	    password = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
	    String pass = "guest";
	    password.sendKeys(pass);
	    send = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
	    send.click();
	    
	    String registered = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/blockquote/blockquote[2]/blockquote")).getText();
	    assertEquals("The username: guest\nThe password: guest",registered);

	}
	
	@Test
	public void loginTest() throws InterruptedException {
		driver.get("http://thedemosite.co.uk/");
	    WebElement login, username, password, send;
	    login = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
	    Thread.sleep(500);
	    login.click();
	    username = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
	    String uName = "guest";
	    username.sendKeys(uName);
	    password = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
	    String pass = "guest";
	    password.sendKeys(pass);
	    send = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));
	    send.click();
	    
	    String registered = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).getText();
	    assertEquals("**Successful Login**",registered);

	}
	
	
	@AfterClass
	public static void cleanUp() {
		driver.quit();
	}
}
