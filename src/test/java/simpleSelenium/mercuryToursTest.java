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
import org.openqa.selenium.support.ui.Select;

public class mercuryToursTest {
	public static WebDriver driver;
	public static WebElement targ;
	public static String text;
	
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
	public void registerTest() throws InterruptedException {
		driver.get("http://demo.guru99.com/test/newtours/");
		targ = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
	    targ.click();
	    text = "Register: Mercury Tours";
	    assertEquals(text, driver.getTitle());
	    
	    targ = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
	    text = "Jane";
	    targ.sendKeys(text);
	    
	    targ = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input"));
	    text = "Doe";
	    targ.sendKeys(text);
	    
	    targ = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input"));
	    text = "07123456789";
	    targ.sendKeys(text);
	    
	    targ = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/input"));
	    text = "janedoe@qa.com";
	    targ.sendKeys(text);
	    
	    targ = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input"));
	    text = "145  Harrogate Road";
	    targ.sendKeys(text);
	    
	    targ = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input"));
	    text = "RYHILL";
	    targ.sendKeys(text);
	    
	    targ = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input"));
	    text = "RYHILL";
	    targ.sendKeys(text);
	    
	    targ = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input"));
	    text = "WF4 3TE";
	    targ.sendKeys(text);
	    
	    Select selectCountry = new Select(driver.findElement(By.name("country")));
	    selectCountry.selectByVisibleText("UNITED KINGDOM");
	    
	    targ = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[13]/td[2]/input"));
	    text = "janedoe";
	    targ.sendKeys(text);
	    
	    targ = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input"));
	    text = "root";
	    targ.sendKeys(text);
	    
	    targ = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input"));
	    text = "root";
	    targ.sendKeys(text);
	    
	    targ = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input"));
	    targ.click();
	    
	    targ = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b"));
	    text = "Dear Jane Doe,";
	    assertEquals(text,targ.getText());
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		driver.get("http://demo.guru99.com/test/newtours/");
		targ = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a"));
	    targ.click();
	    text = "Sign-on: Mercury Tours";
	    assertEquals(text, driver.getTitle());
	    
	    targ = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input"));
	    text = "janedoe";
	    targ.sendKeys(text);
	    
	    targ = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
	    text = "root";
	    targ.sendKeys(text);
	    
	    targ = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input"));
	    targ.click();
	    
	    targ = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3"));
	    text = "Login Successfully";
	    assertEquals(text,targ.getText());
	    
	    targ = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a"));
	    targ.click();
	    
	    targ = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]"));
	    targ.click();
	    
	    Select selectPNum = new Select(driver.findElement(By.name("passCount")));
	    selectPNum.selectByVisibleText("2");
	    
	    Select selectfromP = new Select(driver.findElement(By.name("fromPort")));
	    selectfromP.selectByVisibleText("London");
	    
	    Select selectfromM = new Select(driver.findElement(By.name("fromMonth")));
	    selectfromM.selectByVisibleText("December");
	    
	    Select selectfromD = new Select(driver.findElement(By.name("fromDay")));
	    selectfromD.selectByVisibleText("20");
	    
	    Select selecttoP = new Select(driver.findElement(By.name("toPort")));
	    selecttoP.selectByVisibleText("Paris");
	    
	    Select selecttoM = new Select(driver.findElement(By.name("toMonth")));
	    selecttoM.selectByVisibleText("January");
	    
	    Select selecttoD = new Select(driver.findElement(By.name("toDay")));
	    selecttoD.selectByVisibleText("2");
	    
	    targ = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]"));
	    targ.click();
	    
	    Select selectAirline = new Select(driver.findElement(By.name("airline")));
	    selectAirline.selectByVisibleText("Unified Airlines");
	    
	    targ = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input"));
	    targ.click();
	    
	    text = "Find a Flight: Mercury Tours:";
	    assertEquals(text, driver.getTitle());
	}
	
	@AfterClass
	public static void cleanUp() {
		driver.close();
		driver.quit();
	}

}
