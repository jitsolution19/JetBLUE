package baseline;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BrowserSetup {

	protected WebDriver driver;
	protected WebDriverWait wait;

	@BeforeSuite
	public void Browserselection()
	{
		String BrowserName = "Firefox";
		Reporter.log("----------- Application Launch Browser ::: "+BrowserName+"-----------------",true);
		System.setProperty("webdriver.gecko.driver","B:/Automation/software/geckodriver-v0.16.1-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 5);
	
	}

@AfterSuite
public void CloseApplication()
{
	driver.quit();
	Reporter.log("----------- Application Closed-----------------",true);
}


	@Test
	public void temp()
	{
////		 Thread.sleep(2000);
//		 WebElement autoOptions = driver.findElement(By.id("jbBookerDepart"));
//		 wait.until(ExpectedConditions.visibilityOf(autoOptions));
//		 List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
//		 System.out.println(optionsToSelect.size());
//		 for(WebElement option : optionsToSelect){
//		        if(option.getText().equals("New York, NY (JFK)")) {
//		        	System.out.println("Trying to select: New York, NY (JFK)");
//		            option.click();
//		            break;
//		        }
//		    }
//		 
////		 driver.findElement(By.id("jbBookerDepart")).sendKeys(Keys.TAB);
//		 driver.findElement(By.id("jbBookerArrive")).sendKeys("LGB");
//		// driver.findElement(By.id("jbBookerArrive")).sendKeys(Keys.TAB);
//		 driver.findElement(By.id("jbBookerCalendarDepart")).sendKeys("05-18-2017");
//		 
	

		//Boolean selec =false;
//	 	selec = driver.findElement(By.id("jbBookerItinRT")).isSelected();
//	 	if (selec = true)
//	 	{
//	 		System.out.println("Already Selected");
//	 	}else
//	 	{
//	 		driver.findElement(By.id("jbBookerItinRT")).click();
//	 	}
	 	
	 	
//	 	Boolean selec =false;
//	 	selec = driver.findElement(By.id("jbBookerItinOW")).isSelected();
//	 	if (selec = true)
//	 	{
//	 		System.out.println("Already Selected");
//	 	}else
//	 	{
//	 		driver.findElement(By.id("jbBookerItinOW")).click();
//	 	}
	 	
	 	
	 	
//		String txt = driver.findElement(By.xpath("//div[@class='itinerarySelect']/descendant::div[@class='ng-scope']")).getText();
//		System.out.println(txt);
//		String prac = driver.findElement(By.id("jbBookerItinRT")).getText();
//		System.out.println(prac);
//		List<WebElement>ele = driver.findElements(By.className("labeltextholder ng-binding"));
//		//int len = ele.size();
//		for(WebElement len:ele)
//		{
//			System.out.println(len.getText());
//		}
//	 driver.findElement(By.id("jbBookerDepart")).clear();
//	 driver.findElement(By.id("jbBookerDepart")).sendKeys("JKF");
//	 Select sel = new Select(driver.findElement(By.className("auto ng-isolate-scope ng-pristine ng-valid")));
//	 sel.deselectByIndex(0);
//	 driver.findElement(By.id("jbBookerDepart")).sendKeys(Keys.ARROW_DOWN);
//	 driver.findElement(By.id("jbBookerDepart")).click();
//	 driver.findElement(By.id("jbBookerArrive")).sendKeys("LGB");
//	 driver.findElement(By.id("jbBookerArrive")).sendKeys(Keys.ARROW_DOWN);
//	 driver.findElement(By.id("jbBookerArrive")).click();
	}
	

}
