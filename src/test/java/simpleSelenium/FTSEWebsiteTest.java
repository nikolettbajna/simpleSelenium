package simpleSelenium;

import static org.junit.Assert.assertEquals;

import java.util.List;
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
	    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}
	
	@Test
  public void test() throws InterruptedException {
      driver.get("https://www.hl.co.uk/shares/stock-market-summary/ftse-100");
      double change = 0, riser = 0, faller = 0;
      String riserName ="", fallerName = "", num;

      List<WebElement> records = driver.findElements(By.cssSelector("tr[id^='ls-row-']"));
      System.out.println("Array size = "+records.size());
      for(WebElement record: records) {
          num = record.findElement(By.cssSelector("tr td:nth-child(5)")).getText();
          num = num.replace("%", "");
          change = Double.parseDouble(num);
          if (change > riser) {
              riser = change;
              riserName = record.findElement(By.cssSelector("tr td:nth-child(2)")).getText();
          }else if(change < faller) {
        	  faller = change;
        	  fallerName = record.findElement(By.cssSelector("tr td:nth-child(2)")).getText();
          }
      }
      
      assertEquals("Ocado Group plc",fallerName);
      assertEquals("Rolls Royce Holdings Plc",riserName);
  }
	
	
	@AfterClass
	public static void cleanUp() {
		driver.quit();
	}
	
}
