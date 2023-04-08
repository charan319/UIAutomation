package Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class framesPractice extends Selenium {
	
	public static void frame(String name1, String name2, WebElement element) {
		driver.switchTo().frame(name1);
		System.out.println(driver.findElement(By.xpath("//h2[text()='Title bar ']")).getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame(name2);
		System.out.println(driver.findElement(By.xpath("//a[text()='No frames']")).getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame(element);
		System.out.println(driver.findElement(By.xpath("//h1[text()='Example home page ']")).getText());	
		
	}
	
	public static void frame2(String selectTheframe) {
		
		switch(selectTheframe){
		
		case "frame1": 
			driver.switchTo().frame(1);
			System.out.println(driver.findElement(By.xpath("//h2[text()='Title bar ']")).getText());
			break;
		case "frame2": 
			driver.switchTo().frame("navbar");
			System.out.println(driver.findElement(By.xpath("//a[text()='No frames']")).getText());
			break;
		case "frame3":
			WebElement ele = driver.findElement(By.xpath("//frame[@src='home.html']"));
			driver.switchTo().frame(ele);
		System.out.println(driver.findElement(By.xpath("//h1[text()='Example home page ']")).getText());
		break;
			default : 
				System.out.println("select the correct frame");
		}
	}

	public static void main(String[] args) {

		framesPractice pt = new framesPractice();
		pt.pageTitle("chrome", "http://www.londonfreelance.org/courses/frames/");
		WebElement ele = driver.findElement(By.xpath("//frame[@src='home.html']"));
//		frame("main","navbar",ele);
		pt.frame2("frame1");
	}

}
