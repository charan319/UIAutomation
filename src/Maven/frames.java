package Maven;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class frames {
	
	//alerts and frames
	
	static WebDriver driver;
	
	public static void singleframe(String url) {
		
		driver.get(url);
		driver.switchTo().frame("login_page");
//		driver.findElement(By.xpath("//input[@class='form-control text-muted']")).sendKeys("12345");
		driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
	
	}

	public static void main(String[] args) {
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("start-maximized");
		 driver = new ChromeDriver(op);
		singleframe("https://netbanking.hdfcbank.com/netbanking/");
	}

}
