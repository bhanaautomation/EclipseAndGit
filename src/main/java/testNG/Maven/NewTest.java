package testNG.Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class NewTest {
	
	static WebDriver obj = null;
	@BeforeTest 
	public  void BeforeT() {
		System.setProperty("webdriver.gecko.driver","src/main/webdriver/geckodriver.exe");
		obj = new FirefoxDriver();
		obj.get("https://www.google.com//");


	}
	
	
	@Test ()
  public  void test() throws InterruptedException {
	     obj.findElement(By.name("q")).sendKeys("youtube");
	     obj.findElement(By.name("q")).sendKeys(Keys.ENTER);
	     //obj.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	     //obj.findElement(By.name("btnK")).click();
	     Thread.sleep(3000);
	     obj.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//	  String ExpectedRes = "Programmable Search Engine";
//	  String ActualRes = obj.getTitle();
//	  Assert.assertEquals(ExpectedRes, ActualRes);
  }
	
	@AfterTest 
	
	public  void AfterT() {
		
		//obj.close();
		
	}
}
