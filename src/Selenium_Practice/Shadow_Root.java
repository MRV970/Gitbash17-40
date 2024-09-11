package Selenium_Practice;

import org.openqa.selenium.By;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Shadow_Root {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[contains(text(),'shadow')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[contains(text(),'shadow')][2]")).click();
		Thread.sleep(1000);
		//shadow host
		SearchContext shadow_host=driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();
		shadow_host.findElement(By.cssSelector("input[type='text']")).sendKeys("mrv");
		//shadow host for password
		SearchContext shadow_host_password=driver.findElement(By.xpath("//form/div[2]")).getShadowRoot();
		shadow_host_password.findElement(By.cssSelector("input[type='text']")).sendKeys("mrv@123");
		
	
	}

}
