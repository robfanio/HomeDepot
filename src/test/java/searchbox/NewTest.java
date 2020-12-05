package searchbox;

import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.taskdefs.WaitFor.Unit;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	
	 Actions action = new Actions(driver);
	 WebElement AccountList = driver.findElement(By.id("nav-link-accountList"));
	 action.moveToElement(AccountList).build().perform();
	 WebElement accounts = driver.findElement(By.linkText("Account"));
	 //action.moveToElement(accounts).build().perform();
	 accounts.click();

	 
	 
	  
	  
	  
	  }
  
  @BeforeMethod
  public void SetUp(){
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\robfa\\Desktop\\cucumber Framework\\Ebay\\driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.amazon.com");
	  driver.manage().timeouts().implicitlyWait(3l, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  
  }
}
