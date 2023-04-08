package Maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	static WebDriver driver;
	  
	public static void main(String[] args) throws Exception {
          driver = new ChromeDriver();
          driver.manage().window().maximize();
//          driver.get("https://github.com/session");
          System.out.println(driver.getTitle());
//          chap1();
//          chap2();
//          chap3();
          chap4();		
	}
	
	public static void chap1()   {
		
		  By path =By.xpath("//input[@autocomplete='username']");
		  //driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("Charan");
		  driver.findElement(path).sendKeys("Charan");
		  WebElement ele = driver.findElement(By.xpath("//input[@autocomplete='username']"));
		  ele.sendKeys("  loves Saritha ");
//		  Thread.sleep(1000);
		  System.out.println(ele.getAttribute("value"));
	}

public static void chap2()   {
		List<WebElement> ele1 = driver.findElements(By.xpath("//input[@id='password' and @name='passwod'] "));
		System.out.println(ele1.size());
		List<WebElement> ele2 = driver.findElements(By.xpath("//input[@id='password' and @name='password'] "));
		if(ele2.size()==1) {
		WebElement ele3 = driver.findElement(By.xpath("//input[@id='password' and @name='password'] "));
		ele3.sendKeys("Sari");
		System.out.println(ele3.getAttribute("value"));
		}
}
		
		public static void chap3() throws Exception {
			
			// index number
			
	driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
	System.out.println(driver.findElement(By.xpath("(//table[@id='contactList']//tbody/tr/td)[3]")).getText());
	driver.navigate().back();
	Thread.sleep(1000);
				
		}
		public static void chap4() throws InterruptedException {
			//functions
			
			driver.get("https://www.amazon.in/");
			Thread.sleep(2000);
			WebElement ele = driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
			ele.click();
			System.out.println(driver.getTitle());
			driver.navigate().back();
			driver.findElement(By.xpath("//a[contains(text(),'on Merchants')]")).click();
			System.out.println(driver.getTitle());
			driver.navigate().back();
			WebElement ele1 = driver.findElement(By.xpath("//input[contains(@placeholder,' Amazon.in')]"));
			ele1.click();
			ele1.sendKeys("watches for men");
			ele1.submit();
			System.out.println(driver.getTitle());
			driver.navigate().back();
			System.out.println(driver.findElement(By.xpath("//a[starts-with(text(),'Protect and Build')]")).getText());
			
			driver.navigate().to("https://github.com/login");
			//input[contains(@placeholder,' Amazon.in')]
			//input[contains(@id,'submit-button')]
//			//a[starts-with(text(),'Protect and Build')]
			
		}
}
