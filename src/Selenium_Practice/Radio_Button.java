package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Radio_Button {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Radio Button")).click();
		Thread.sleep(2000);
		//default
		driver.findElement(By.xpath("//input[@value='Upi']")).click();
		//selected Radio button
		driver.findElement(By.partialLinkText("Selected")).click();
		Thread.sleep(1000);
		if(driver.findElement(By.id("attended53")).isSelected()) {
			System.out.println("Radio button is selected");
			
		}
		Thread.sleep(1000);
		//disabled
		if(driver.findElement(By.xpath("//a[text()='Disabled']")).isEnabled()) {
			System.out.println("radio button is disabled");
		}
		else {
			System.out.println("radio button is enabled");
		}
		driver.quit();
	}

}
