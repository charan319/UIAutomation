package datePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Date {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("start-maximized");
	    driver = new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		//		driver.findElement(By.id("datepicker")).sendKeys("12/15/2022");
		driver.findElement(By.id("datepicker")).click();
		String month = "March";
		String year = "2024";
		String date = "27";

		while(true)
		{
			String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String ye = driver.findElement(By.xpath("//span[contains(@class,'year')]")).getText();

			if(month.equals(mon) && year.equals(ye))
			{
				break;
			}
			driver.findElement(By.xpath("//a[contains(@class,'next ui-corner-all')]")).click();
		}

		List<WebElement> dates =	driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td"));

				for(WebElement dat:dates) {
		
					if(dat.getText().equals(date)) {
						dat.click();
						break;
					}
		
				}
		

//		for(int i=0;i<=dates.size();i++) {
//			if(dates.get(i).getText().equals(date)) {
//				dates.get(i).click();
//				break;
//			}	
//		}




		System.out.println("date selected successfully");
	}
}
