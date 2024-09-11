package Iframes_Alerts_Notificationpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo_SAlert_JS {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Javascript")).click();
		Thread.sleep(2000);
		//click on alert box and identify alert
		driver.findElement(By.id("buttonAlert2")).click();
		Thread.sleep(2000);
		//switch to alert and handle alert
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		//Confirmation alert
		driver.findElement(By.linkText("Confirm")).click();
		
		driver.quit();
		
	}

}
