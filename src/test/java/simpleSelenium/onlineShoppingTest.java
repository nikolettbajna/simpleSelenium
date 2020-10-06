package simpleSelenium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class onlineShoppingTest {
	public static WebDriver driver;
	
//	// Designed to return ChromeOptions to configure new ChromeDrivers in Selenium
//	public static ChromeOptions chromeCfg() {
//	 Map<String, Object> prefs = new HashMap<String, Object>();
//	 ChromeOptions cOptions = new ChromeOptions();
//	  
//	 // Settings
//	 prefs.put("profile.default_content_setting_values.cookies", 2);
//	 prefs.put("network.cookie.cookieBehavior", 2);
//	 prefs.put("profile.block_third_party_cookies", true);
//
//	 // Create ChromeOptions to disable Cookies pop-up
//	 cOptions.setExperimentalOption("prefs", prefs);
//
//	 return cOptions;
//	 }
//	
	@BeforeClass
	public static void initialise() {
		System.setProperty(
			"webdriver.chrome.driver",
			"D:\\Nikolett\\QA\\Java\\Eclipse\\simpleSelenium\\src\\test\\resources\\drivers\\chromedriver.exe");
	//	driver = new ChromeDriver(chromeCfg());
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1366, 768));
	    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}
	
//	@Test
//	public void kitten_Test() throws Exception {
//		WebElement target;
//		//driver.get("http://thedemosite.co.uk/index.php");
//		
//		//driver.findElement(By.className("gsr")).submit();
//		
////		target = driver.findElement(By.className("q"));
////		target.sendKeys("Kittens");
////		target.submit();
//		driver.get("https://google.com");
//		Thread.sleep(500);
//
//        assertEquals("Google", driver.getTitle());
//		
//		//target = driver.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[2]/a"));
////		target.click();
//		
////		String clipboard = target.getAttribute("name");
////		System.out.println(clipboard);
//		
//		Thread.sleep(500);
//	}
	
//	@Test
//    public void test() throws InterruptedException {
//        driver.get("http://automationpractice.com/index.php");
//        WebElement searchBar = driver.findElement(By.id("search_query_top"));
//        String searchTerm = "Printed";
//        searchBar.sendKeys(searchTerm);
//        searchBar.submit();
//
//        List<WebElement> products = driver.findElements(By.className("ajax_block_product"));
//        for(WebElement product: products) {
//            String productName = product.findElement(By.className("product-name")).getText();
//            if (!productName.contains(searchTerm)) {
//                fail("Non-relevant item returned");
//            }
//        }
//    }
	
	@Test
	public void test() throws InterruptedException {
      driver.get("http://automationpractice.com/index.php");
      WebElement tshirts = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
      tshirts.click();
      WebElement targetShirt = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a"));
      targetShirt.click();
      WebElement add = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
      add.click();
      WebElement proceed = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
      proceed.click();
      
      String product = driver.findElement(By.xpath("//*[@id=\"product_1_1_0_0\"]/td[2]/p/a")).getText();
      assertEquals("Faded Short Sleeve T-shirts", product);
      
      WebElement checkout = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
      checkout.click();

      WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
      String email = "guest@qa.com";
	  emailField.sendKeys(email);
	  WebElement password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
      String pw = "guest";
	  password.sendKeys(pw);
	  WebElement login = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
	  login.click();
	  
	  WebElement proceedAgain = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
	  proceedAgain.click();
	  
	  WebElement check = driver.findElement(By.xpath("//*[@id=\"cgv\"]"));
	  check.click();
	  
	  WebElement andAgain = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
	  andAgain.click();
	  
	  WebElement bankWire = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a/span"));
	  bankWire.click();
	  
	  WebElement again = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
	  again.click();
	  
	  String orderComplete = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p/strong")).getText();
	  assertEquals("Your order on My Store is complete.",orderComplete);

  }
	
	//Faded Short Sleeve T-shirts
	
	@AfterClass
	public static void cleanUp() {
		driver.quit();
	}
}
