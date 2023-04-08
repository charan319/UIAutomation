package Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssPractice {
	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
            
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		simpleSelecters();
		
	}
	
	public static void simpleSelecters(){
		
		driver.findElement(By.cssSelector("input#firstName")).sendKeys("Sarithaa");  //By Using ID
		WebElement ele = driver.findElement(By.cssSelector("#firstName"));
		ele.sendKeys("charan");
		System.out.print(ele.getAttribute("value"));
		By ele1 = By.cssSelector(".gender");
		By ele2 = By.cssSelector("input.gender");
		driver.findElement(ele2).sendKeys(" Now");
		driver.findElement(ele1).sendKeys(" one");
	    System.out.print(driver.findElement(ele1).getAttribute("value"));
	    driver.get("https://www.udemy.com/");
	   WebElement ele3 = driver.findElement(By.cssSelector("input[name='q']"));
	    ele3.sendKeys(" and for ever ");
	   System.out.println( ele3.getAttribute("value"));
	    
	    
		
		
		
		
		
	}

}
