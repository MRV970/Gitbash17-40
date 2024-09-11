package Iframes_Alerts_Notificationpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Iframe_Byname {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/RAGHAVAMMA/Desktop/!DOCTYPE%20html.html");
		Thread.sleep(2000);
		//switch to frame by name
		driver.switchTo().frame("frame1");
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Google")).click();
		
		
	}

}
