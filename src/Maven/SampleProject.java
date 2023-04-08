package Maven;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class SampleProject  extends Selenium{
	

	public static void verifytitle(String title, String actualTitle) {
		
		if(title.equals(actualTitle)) {
				System.out.println("given title is correct : " + title);
			}
			else {
				System.out.println("given title is wrong " + "\n " + " and the actual title is :" +title );
				
		}
		}
	
	public static void navigation(String pageURL)
	{
		driver.navigate().to(pageURL);
		System.out.println(driver.getTitle());	
		
	}
	public static void findTheValue(String actualvalue) throws InterruptedException  {
		List<WebElement> ele =driver.findElements(By.xpath("//a[text()='Become an Affiliate']//..//..//child::li"));
	     System.out.println(ele.size());
	     for(int i=1;i<	ele.size();i++) {
	   String elem = driver.findElement(By.xpath("//a[text()='Become an Affiliate']//..//..//child::li["+i+"]")).getText();
	   if(elem.contains(actualvalue)) {
		   System.out.println("it is the expected value : " + elem );
  driver.findElement(By.xpath("//a[text()='Become an Affiliate']//..//..//child::li["+i+"]")).click();
System.out.println(driver.getTitle());
		   Thread.sleep(1000);
		   break;
//		   public static void verifythechildvalues(String verifythechildvalue) throws InterruptedException{
//				List<WebElement> collectallthech=driver.findElements(By.xpath("//*[text()='Sell on Amazon']//..//..//child::li"));
//				for (int i = 1; i < collectallthech.size() ; i++) {
//					String childvalue = driver.findElement(By.xpath("//*[text()='Sell on Amazon']//..//..//child::li["+i+"]")).getText();
//					if (childvalue.equals(verifythechildvalue)) {
//						System.out.println("found the exact value:- "+ childvalue);
//						driver.findElement(By.xpath("//*[text()='Sell on Amazon']//..//..//child::li["+i+"]//a")).click();
//						Thread.sleep(2000);
//						break;
	   }
	     }
	}
	   public static void findElebyIndex(WebElement ele, int indexnumber) throws Exception{
//	 WebElement	   dropdown = driver.findElement(By.id("course"));
	
		   Select sec = new Select(ele);
			sec.selectByIndex(indexnumber);
			Thread.sleep(1000);
//			sec.selectByValue("java");
//			Thread.sleep(1000);
//			sec.selectByVisibleText("Dot Net");
//			Thread.sleep(1000);
			String st = sec.getFirstSelectedOption().getText();
			System.out.println(st);	   
	}
	   public static void links() {
		   List<WebElement> list = driver.findElements(By.tagName("a"));
		   System.out.println(list.size());
		   for(int i=0;i<list.size();i++) {
			   String linklist = list.get(i).getText();
			   if(!linklist.isEmpty()) {
				   System.out.println("list is starts " + list.get(i).getText());
			   }
		   }
//			for(WebElement lists : list) {
//				System.out.println("list is starts " + lists.getText());
	   }
	   
	   public static void time() {
		   
		   Instant starttime = Instant.now();
		   System.out.println(starttime.toString());
		   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		   driver.navigate().to("https://www.youtube.com/watch?v=Pef_oV1amYQ&list=PLacgMXFs7kl_7BbV1p_KqDYM65Zm4L_HU&in");
		   Instant endtime = Instant.now();
		   System.out.println(endtime.toString());
		 Duration duration = Duration.between(starttime, endtime);   
		 System.out.println("Page load time is : " + duration.toSeconds() + " Seconds ");
	   }
	}


//}
//	public static void main(String[] args) {
//		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.urbanpro.com/register/newSeekerHomePage");
//		System.out.println(driver.getTitle());
//		driver.findElement(By.xpath("/html/body/div[10]/div")).click();
//		String str = "https://www.guru99.com/software-testing.html";
//		//driver.navigate().to("https://www.guru99.com/software-testing.html");
//		driver.navigate().to(str);
//		System.out.println(driver.getTitle());
//    	driver.navigate().back();
//    	
//		System.out.println(driver.getTitle());
//		driver.navigate().forward();
//		
//		System.out.println(driver.getTitle());
//		driver.navigate().refresh();
//		
//		System.out.println(driver.getTitle());
//		By element = By.xpath("/html/body/div[5]/div/nav/ul/li[1]/a");
//		driver.findElement(element).click();
//		driver.close();
//		
//		
//		
//	}
//}