package datePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("(//div[@class= 'oxd-select-text-input' ])[3]")).click();	
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='oxd-select-dropdown --positon-bottom' ]//span"));
		
		for(WebElement element:elements) {
			
			System.out.println(element.getText());
			
			if(element.getText().equals("Social Media Marketer")) {
				
				element.click();
				
			break;
				
			}
		}
		
		for(int i=1;i<=elements.size();i++) {
			
//			elements.get(i).click();
			driver.findElement(By.xpath("(//div[@class= 'oxd-select-text-input' ])[3]")).click();
			driver.findElement(By.xpath("//div[@class='oxd-select-dropdown --positon-bottom' ]//div["+i+"]")).click();
			
		}
		
	}

}
