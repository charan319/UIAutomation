package Maven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Selenium {
	
	
	static WebDriver driver;
		public void pageTitle(String selectBrowser, String correctURL) {
		
		switch(selectBrowser){
			case "chrome":	
				ChromeOptions op = new ChromeOptions();
				op.addArguments("start-maximized");
			    driver = new ChromeDriver(op);
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get(correctURL);
				//driver.close();
				System.out.println("chrome browser run successfully");
				break;
			case "fireFox":
				driver = new FirefoxDriver();
				 driver.manage().window().maximize();
				driver.get(correctURL);
				//driver.close();
				System.out.println("firefox browser run successfully");
				break;	
			case "ie":
			    driver = new InternetExplorerDriver();
			    driver.manage().window().maximize();
				driver.get(correctURL);
				//driver.close();
				System.out.println("ie browser run successfully");
				break;
            default: System.out.println("choose the correct browser");
				
		}
	}
	
//	public static void main(String[] args) {
//		
//	  Selenium browser = new Selenium();
//	  browser.pageTitle("Chrome");
//	}
}