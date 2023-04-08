package Maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Uitlity  extends Selenium{

//	public void verifytitle(String title, String actualTitle) {
//		if(title.equals(actualTitle)) {
//			System.out.println("given title is correct : " + title);
//		}
//	}
		
	
	public static void main(String args[]) throws InterruptedException  {
		
		Uitlity util = new Uitlity();
		util.pageTitle("Chrome","https://www.amazon.in/?tag=siteplug38669-21") ;
//		driver.findElement(By.xpath("//a[text()='Become an Affiliate']//..//..//child::li")).click();
//	List<WebElement> ele =driver.findElements(By.xpath("//a[text()='Become an Affiliate']//..//..//child::li"));
//     System.out.println(ele.size());
//     for(int i=0;i<	ele.size();i++) {
//    	System.out.println(driver.findElement(By.xpath("//a[text()='Become an Affiliate']//..//..//child::li["+i+"]")).getText());
    	
    	 //System.out.println(ele.get(i).getText());
//		SampleProject.findTheValue("Amazon Global Selling");
		SampleProject.findTheValue("Amazon Global Selling");
		
     }

         
	}


//
//util.pageTitle("Chrome", "https://www.google.co.in/");
//String title = (util.driver.getTitle());
//String actualTitle = "Login to your Account - UrbanPro";
////util.verifytitle(util.driver.getTitle());
////util.verifytitle(title, "Login to your Account - UrbanPro");
//SampleProject.verifytitle(title, "actualTitle");
////String str = "https://www.guru99.com/software-testing.html";
////SampleProject.navigation(str);
////String title1 = util.driver.getTitle();
////System.out.println(title1);
//By element = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input");
//driver.findElement(element).sendKeys("Shiva Krishna");
//driver.findElement(element).submit();	
////WebElement ele =   driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"))  ;
////ele.sendKeys("Shiva Krishna");
////ele.submit();
//System.out.println(driver.getTitle());
//
//Thread.sleep(1000);