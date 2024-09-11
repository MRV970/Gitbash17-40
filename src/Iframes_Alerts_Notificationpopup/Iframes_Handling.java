package Iframes_Alerts_Notificationpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Iframes_Handling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/RAGHAVAMMA/Desktop/!DOCTYPE%20html.html");
		Thread.sleep(2000);
		//switch to frame by index
		driver.switchTo().frame(0);
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		//switch back to main page
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Google")).click();
		
		
	}

}
