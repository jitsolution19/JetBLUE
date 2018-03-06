package Login;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class navigation {
	static
	{
		System.setProperty("webdriver.gecko.driver","B:/Automation/software/geckodriver-v0.16.1-win64/geckodriver.exe");	
	}
	
	WebDriver driver = new FirefoxDriver();
	WebDriverWait wait = new WebDriverWait(driver, 5);
	
	@BeforeMethod
	public void Application_Launch()
	{
		Reporter.log("----------- Application Launch Browser ::: -----------------",true);
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.jetblue.com/#/");
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("span.foreground-sprite")).click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h3.ng-binding.ng-scope")));
		Reporter.log("Application Title :: "+driver.getTitle(), true);
	}
		
	@AfterMethod
	public void CloseApplication()
	{
//		driver.quit();
		Reporter.log("----------- Application Closed-----------------",true);
	}
}
