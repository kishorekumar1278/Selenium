package Web_Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Item_DropDown {
	public static void main(String[] args) {
		
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement month=driver.findElement(By.name("birthday_day"));
		
		Select obj_month=new Select(month);
		
		obj_month.selectByVisibleText("oct");
		
		obj_month.selectByValue("oct");
		
		obj_month.selectByIndex(10);
		
		
		
		
		
	}

}
