package Maven;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle{

	static WebDriver driver;
	
	
	public static void udemy1() {
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[text()='SpiceJet Axis Bank Credit Card']")).click();
		Set<String> windowhand = driver.getWindowHandles();
		Iterator<String> itr = windowhand.iterator();
		String parentWindowHand = itr.next();
		String childWindowHand = itr.next();
//		String childWindowHand2 = itr.next();
		driver.switchTo().window(childWindowHand);
		driver.findElement(By.xpath("(//a[contains(text(),'Flights')])[2]")).click();
		System.out.println("Child window title " + driver.getTitle());
		driver.switchTo().window(parentWindowHand);
		System.out.println("parent window title" + driver.getTitle());
		driver.findElement(By.xpath("//div[text()='//div[text()='SpiceScreen']']")).click();
//		driver.switchTo().window(chaildWindowHand2);
//		System.out.println("Child window 2 title " + driver.getTitle());


		
		
		}
	
	public void udemy2() {
		driver.get("https://testautomationpractice.blogspot.com/");
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("pagehandle "+ parentWindowHandle +"  " + driver.getTitle());
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("windows");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<WebElement> searchlinks=driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div"));

		System.out.println("Number of Links:"+ searchlinks.size());
		for(WebElement link:searchlinks)
		{
			link.click();
			System.out.println(link.getText());
		}
		
		//After opening all the pages, capture windowid's
		Set<String> windowIds=driver.getWindowHandles();
		
		System.out.println("Switching to each browser window and getting the titles........"); 
		for(String winid:windowIds)
		{
			String title=driver.switchTo().window(winid).getTitle();
			System.out.println(title);
		}
			
	}
	
	public static void herokuppa() {
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> winHand = driver.getWindowHandles();
		Iterator<String> mwind = winHand.iterator();
		String parentmwind = mwind.next();
		String childmwind = mwind.next();
		driver.switchTo().window(childmwind);
		System.out.println(driver.findElement(By.xpath("(//*[text()='New Window'])[2]")).getText());
		driver.switchTo().window(parentmwind);
		System.out.println(driver.findElement(By.xpath("//*[text()='Opening a new window']")).getText());

		
	}
	public static void main(String[] args)  {
		
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		herokuppa();
			
	}


		
		

//		List<WebElement> elements = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div/a"));
		//div[@id='Wikipedia1_wikipedia-search-results']//div/a
//		System.out.println(elements.size());
//		for(WebElement element:elements) {
//			
//			System.out.println(element.getText());
//			if(element.getText().equals("Windows")) {
//				element.click();
//				System.out.println(driver.getTitle());
//			}
//		}
		
		
//		Set<String> str = driver.getWindowHandles();
//	    Iterator<String> itr = str.iterator();
//	    String parentWindow = itr.next();
//	    String chaildWindow = itr.next();
//	    driver.switchTo().window(chaildWindow);
//		System.out.println("Window handle"+ chaildWindow + driver.getTitle());

	    

	    
//		
//		Set<String> elems = driver.getWindowHandles();
//		for(String elem:elems) {
//			if(!elem.equals(parentWindowHandle)) {
//			driver.switchTo().window(elem);
//			System.out.println("page title is " + driver.getTitle());
//			driver.switchTo().window(parentWindowHandle);
		}
			
		
