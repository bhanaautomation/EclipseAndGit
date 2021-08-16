package testNG.Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class NewTest {
	
	static WebDriver obj = null;
	@BeforeTest 
	public static void BeforeT() {
		System.setProperty("webdriver.gecko.driver","src/main/webdriver/geckodriver.exe");
		obj = new FirefoxDriver();
		obj.get("https://www.facebook.com/");


	}
	
	
	@Test ()
  public static void test() {
	     obj.findElement(By.id("email")).sendKeys("pbo4wala");
		 obj.findElement(By.id("pass")).sendKeys("Deep@1994");
		 obj.findElement(By.linkText("Log In")).click();
	     obj.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//	  String ExpectedRes = "Programmable Search Engine";
//	  String ActualRes = obj.getTitle();
//	  Assert.assertEquals(ExpectedRes, ActualRes);
  }
	
	@AfterTest 
	
	public static void AfterT() {
		
		//obj.close();
		
	}
}
