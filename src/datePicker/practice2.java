
package datePicker;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class practice2 {

	public static void main(String[] args) {

		ChromeOptions op = new ChromeOptions();
		op.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		driver.findElement(By.name("fromPort")).sendKeys("Boston");
		driver.findElement(By.name("toPort")).sendKeys("London");
		driver.findElement(By.xpath("//input[contains(@class,'primary')]")).click();
		ArrayList<String> arr = new ArrayList<String>();
		List<WebElement> tabledata = driver.findElements(By.xpath("(//table[@class='table']//tbody//tr)//td[6]"));
		for(WebElement tableda : tabledata) {
			arr.add(tableda.getText());
		}
		ArrayList<String> price = new ArrayList<String>();
		for(String ar:arr) {
			String	pri = ar.replace('$',' ');
			price.add(pri);
		}
		ArrayList<Double> dub = new ArrayList<Double>();
		for(String p: price) {
			dub.add(Double.parseDouble(p));
		}
		Collections.sort(dub);	
		ArrayList<String> amount = new ArrayList<String>();
		for(Double dubs:dub) {
			String amt = "$"+dubs;
			amount.add(amt);
		}
		String lp = amount.get(0);
		for(int i=1;i<=tabledata.size();i++) { 
			String p =driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+i+"]/td[6]")).getText();
			if(p.equals(lp))
			{
				driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+i+"]/td[1]//input")).click();
				break;
			}
		}
	}
}


