package Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		By element = By.id("login_field");
		driver.findElement(element).sendKeys("Vinu");
		Thread.sleep(1000);
		driver.findElement(element).clear();
		WebElement ele = driver.findElement(By.id("login_field"));
		ele.sendKeys("Madhumohan");
		By element1 = By.name("password");
		driver.findElement(element1).sendKeys("12345");
		Thread.sleep(1000);
		driver.findElement(element1).clear();
		WebElement ele1 = driver.findElement(By.name("password"));
		ele1.sendKeys("Madhumohan");
		By element2 = By.className("header-logo");
		System.out.println(driver.findElement(element2).isEnabled());
		Thread.sleep(1000);
		By element3 = By.linkText("Forgot password?");
		driver.findElement(element3).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
//		By element4 = By.partialLinkText("Create an");
//		driver.findElement(element4).getText();
//		driver.findElement(element4).click();
//		Thread.sleep(1000);
//		driver.navigate().back();
//		Thread.sleep(1000);
//		WebElement ele2 = driver.findElement(element4);
//		System.out.println(ele2.getText());
		System.out.println(driver.findElement(By.partialLinkText("Create an")).getText());
		driver.findElement(By.partialLinkText("Create an")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='Sign in to GitHub']")).getText());
		driver.findElement(By.cssSelector("input[value='Sign in']")).click();
		driver.navigate().back();		
//		driver.get("https://www.guru99.com/locators-in-selenium.html");
//		driver.findElement(By.xpath("//*[@class='search-toggle-icon']")).click();	
	}

}
