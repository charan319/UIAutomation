package practicejava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class selenium {

	public static void main(String[] args) {
        
		ChromeOptions op = new ChromeOptions();
		op.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
