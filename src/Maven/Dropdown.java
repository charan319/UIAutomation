package Maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown extends Selenium {

	public static void main(String[] args) throws Exception {
		Dropdown drop = new Dropdown();
		drop.pageTitle("chrome", "https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement	   dropdown = driver.findElement(By.id("course"));
		SampleProject.findElebyIndex(dropdown , 3);
		
		
////		WebDriver driver = new ChromeDriver();
//		Dropdown drop = new Dropdown();
//		drop.pageTitle("Chrome", "https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
////		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
//		WebElement dropdown = driver.findElement(By.id("course"));
////		dropdown.click();
//		Select sec = new Select(dropdown);
//		sec.selectByIndex(3);
//		Thread.sleep(1000);
//		sec.selectByValue("java");
//		Thread.sleep(1000);
//		sec.selectByVisibleText("Dot Net");
//		Thread.sleep(1000);
//		String st = sec.getFirstSelectedOption().getText();
//		System.out.println(st);
//		
////		List<WebElement> dropDownOptions = sec.getOptions();
////		for (WebElement options : dropDownOptions) {
////		System.out.println(options.getText()); // to print all the options in the dropdown
////		}
//
////		System.out.println(sec.getOptions());
//		

	}

}
