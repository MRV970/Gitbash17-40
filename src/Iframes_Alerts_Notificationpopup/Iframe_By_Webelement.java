package Iframes_Alerts_Notificationpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Iframe_By_Webelement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/RAGHAVAMMA/Desktop/!DOCTYPE%20html.html");
		Thread.sleep(1000);
		//switch to frame by WebElement
		driver.switchTo().frame(driver.findElement(By.id("FR1")));
		driver.findElement(By.id("newsletter-email")).sendKeys("aaa@test.com");
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		driver.quit();
		
	}

}
