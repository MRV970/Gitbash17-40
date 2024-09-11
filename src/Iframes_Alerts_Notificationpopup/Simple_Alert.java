package Iframes_Alerts_Notificationpopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Simple_Alert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		//identifying alert
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		//switching to alert
	Alert ale=	driver.switchTo().alert();
	//handling alert
	    ale.accept();
	    Thread.sleep(1000);
	    System.out.println("alert was handled successfully");
	    driver.findElement(By.id("small-searchterms")).sendKeys("books");
	    Thread.sleep(1000);
	    driver.quit();
	    
		
		
		
	}

}
