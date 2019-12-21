package Web_Driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DropDown_Demo {
	public static void main(String[] args) {
		
	
FirefoxDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
WebElement month=driver.findElement(By.name("month"));
List<WebElement> items=month.findElements(By.tagName("option"));
for(WebElement item:items)
{
System.out.println(item.getText());
}
/*driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.id("email")).sendKeys("9666005328");
driver.findElement(By.id("pass")).sendKeys("9866687795");
driver.findElement(By.id("email")).click();
//driver.navigate();
//driver.close();
*/}
}
