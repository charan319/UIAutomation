package datePicker;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class practice {

	public static void main(String[] args) {

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--headless");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		System.out.println(driver.getTitle());
		
		WebElement element = driver.findElement(By.name("fromPort"));
		Select options = new Select(element);
		for(WebElement option:options.getOptions()) {

			System.out.println(option.getText());
			if(option.getText().equals("Boston")) {
				option.click();
			}
		}
		List<WebElement> elements = driver.findElements(By.xpath("//select[@name='fromPort']//option"));
		for(WebElement elemen:elements) {
			System.out.println(elemen.getText());
		}

		WebElement ele = driver.findElement(By.name("toPort"));
		Select opt = new Select(ele);
		for(WebElement opts:opt.getOptions()) {
			if(opts.equals("London")) {
				opts.click();

			}
		}
		driver.findElement(By.xpath("//input[contains(@class,'primary')]")).click();
		System.out.println(driver.getTitle());

		ArrayList<String> arr = new ArrayList<String>();
		List<WebElement> tabledata = driver.findElements(By.xpath("(//table[@class='table']//tbody//tr)//td[6]"));
		tabledata.size();

		for(WebElement tableda : tabledata) {

			System.out.println(tableda.getText());

			arr.add(tableda.getText());
		}
		System.out.println(arr);

		ArrayList<String> price = new ArrayList<String>();
		for(String ar:arr) {

			String	pri = ar.replace('$',' ');
			price.add(pri);

		}
		System.out.println(price);
		ArrayList<Double> dub = new ArrayList<Double>();
		for(String p: price) {
			dub.add(Double.parseDouble(p));
		}
		System.out.println(dub);
		Collections.sort(dub);	

		System.out.println(dub);

		System.out.println(dub.get(0));

		Double Lowestvaule = dub.get(0);

		ArrayList<String> amount = new ArrayList<String>();

		for(Double dubs:dub) {

			String amt = "$"+dubs;
			amount.add(amt);
		}
		System.out.println(amount);

		String lp = amount.get(0);

		for(int i=1;i<=tabledata.size();i++) { 

			String p =driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+i+"]/td[6]")).getText();

			if(p.equals(lp))
			{
				driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+i+"]/td[1]//input")).click();
				break;
			}

		}
		System.out.println(driver.getTitle());
	}
}
