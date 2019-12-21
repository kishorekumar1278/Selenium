package Web_Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ApplyAndCancelLeave {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("user02");
		driver.findElement(By.id("txtPassword")).sendKeys("TM1234");
        driver.findElement(By.id("btnLogin")).click();
	Actions obj=new Actions(driver);
	
	//Navigate To ApplyLeave Page
	obj.moveToElement(driver.findElement(By.id("menu_leave_viewLeaveModule"))).build().perform();
	
	driver.findElement(By.id("menu_leave_applyLeave")).click();
	
	if(driver.findElement(By.xpath("//h1[text()='Apply_Leave']")).isDisplayed())
		System.out.println("Apply Leave Page is Displayed");
		else
	  System.out.println("Apply Leave Page is not Displayed");
	
     driver.findElement(By.xpath("//select[@id='applyleave_txtLeaveType']/option[text()='Annual Leave']")).click();
     String Date="2019-10-01";
     WebElement fromDate=driver.findElement(By.xpath("//input[@id='applyleave_txtFromDate']"));
    fromDate.clear();
	fromDate.click();
	fromDate.sendKeys(Date);
	fromDate.sendKeys(Keys.ESCAPE);
	Thread.sleep(2000);
	
	WebElement toDate=driver.findElement(By.xpath("//input[@id='applyleave_txtToDate']"));
	toDate.clear();
	toDate.click();
	toDate.sendKeys(Date);
	toDate.sendKeys(Keys.ESCAPE);
	Thread.sleep(2000);
	driver.findElement(By.id("applyBtn")).click();
	
	
	/*//Navigate to My leave page
	driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
	//int rowCount=driver.findElement(By.xpath("//"))
*/	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
