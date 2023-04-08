package Maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

public class links extends Selenium {
	
	public void img() {
		
		List<WebElement> elements = driver.findElements(By.tagName("img"));
		System.out.println(elements.size());
		for(int i=1;i<elements.size();i++) {
			String imglink = elements.get(i).getText();
			if(!imglink.isEmpty())
			{
			System.out.println("link  "+ i + " is " + imglink );
			}
		}
	}

	public static void main(String[] args) {
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("start-maximized");
		links link = new links();
		link.pageTitle("chrome", "https://www.spicejet.com/");
//		SampleProject.links();
		link.img();
		}
;
	}


