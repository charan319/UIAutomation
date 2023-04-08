package datePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Date2  {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application");
		driver.findElement(By.id("dob")).click();
		
		
		WebElement ele = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select sec = new Select(ele);
		for(WebElement element:sec.getOptions()) {
			if(element.getText().equals("Apr")) {
				element.click();
				break;
			}
		}
		
		WebElement ele1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select sec1 = new Select(ele1);
		for(WebElement element1:sec1.getOptions()) {
			if(element1.getText().equals("2015")) {
				element1.click();
				break;
			}
		}
		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for(WebElement date:dates) {
			
			if(date.getText().equals("27")) {
				
				date.click();
				break;
			}
		}
	}

	

}
