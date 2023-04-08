import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	
	static WebDriver driver;
	
	public static void batmen(String name) {
	
	List<WebElement> batsmens = driver.findElements(By.xpath("(//a[contains(text(),'"+name+"')]/parent::div)/following-sibling::div"));
	System.out.print(name+"\t");
	for(WebElement batsmen:batsmens) {
		System.out.print(batsmen.getText());
		System.out.print("\t");
	}
	System.out.println();
}
	public static void bowler() {
//		System.out.println(driver.findElements(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[4]/div)")).size());
//
//		int row = driver.findElements(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[4]/div)")).size();
//		int column= driver.findElements(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[4]/div[1] /div)")).size();
		for(int i=1;i<=7;i++) {
			
			for(int j=1;j<=8;j++) {
			
		System.out.print(driver.findElement(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[4]/div["+i+"]/div["+j+"]")).getText()+"  ");	
		
	}
			System.out.println();
		}	
	}
	
	public static void main(String[] args) {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/60028/ind-vs-aus-4th-test-australia-tour-of-india-2023");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		batmen("Khawaja");
		bowler();
	}
}
