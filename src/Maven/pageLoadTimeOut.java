package Maven;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageLoadTimeOut {
	
	static WebDriver driver;
	
	public static void pageload(String weburl){
		
		Instant starttime = Instant.now();
		   System.out.println(starttime.toString());
//		   driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		   driver.get(weburl);
		   Instant endtime = Instant.now();
		   System.out.println(endtime.toString());
		 Duration duration = Duration.between(starttime, endtime);   
		 System.out.println("Page load time is : " + duration.toSeconds() + " Seconds ");
	}
	
	public static void implicitWaitTimeOut()  {

		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.id("txt1")).sendKeys("character");
		System.out.println(driver.findElement(By.id("txt1")).getAttribute("value"));
		driver.findElement(By.id("txt2")).sendKeys("characters");
		System.out.println(driver.findElement(By.id("txt2")).getAttribute("value"));	
		}
	public static void explicitTime() {
		
	//declaration and usage
	
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("btn2")).click();
		WebElement ele = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1")));
		ele.sendKeys("charans");
		System.out.print(driver.findElement(By.id("txt1")).getAttribute("value"));
		WebElement ele1 = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
		ele1.sendKeys("ari");
		System.out.println(driver.findElement(By.id("txt2")).getAttribute("value"));
		
		
		
		
	}
	
	public static void main(String[] args)  {
		ChromeOptions choops= new ChromeOptions();
		choops.addArguments("start-maximized");
		driver = new ChromeDriver(choops);
//		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
//		implicitWaitTimeOut();
//		pageload("https://www.hyrtutorials.com/p/waits-demo.html");
		explicitTime();
		
		
		
//		driver.findElement(By.id("btn1")).click();
//		implicitWait("https://www.hyrtutorials.com/p/waits-demo.html");
		
		
	//	pageload("https://www.youtube.com/watch?v=Pef_oV1amYQ&list=PLacgMXFs7kl_7BbV1p_KqDYM65Zm4L_HU&in");//
		
		
//		SampleProject.time();
//		https://www.royalmansour.com/
	}

}
