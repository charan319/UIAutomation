package webTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;


public class staticTable {

	public static void main(String[] args) {
       // ChromeOptions op = new ChromeOptions();
      //  op.addArguments("start-maximized");
//        op.addArguments("--headless");
	//	WebDriver driver = new EdgeDriver();
		WebDriver driver = new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.name("BookTable"));
		
		//number of rows
		int row = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size());
		//number of columns
		int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println(driver.findElements(By.xpath("//table[@name='BookTable']//th")).size());
		//specific cell
		System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]//td[3]")).getText());
		//data from all rows and columns
		for(int r=2;r<=row;r++) {
			for(int c=1;c<=columns;c++) {
				System.out.print(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText()+ "       ");
					
			}System.out.print("\n");
		}
		//print the books those written by Mukesh
		for(int r=2;r<=row;r++) {
		String authors = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
//		System.out.println(authors);
		if(authors.equals("Mukesh")) {
			
			 String books = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
			 System.out.println(authors+ "   " + books );
		}	
	}
		int sum = 0;
		for(int r=2;r<=row;r++) {
			
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			System.out.println(price);
			sum = sum +Integer.parseInt(price);
		}
		System.out.println("total sum is " +sum);
		driver.close();
		
		
	}
	}

	
