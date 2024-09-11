package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Actions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//li[1]")).click();
//		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Keyboard Actions")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[contains(text(),'Signup')]")).click();
		Actions action =new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		action.sendKeys("bhghh").perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		action.sendKeys("asdsdf@123").perform();
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		action.sendKeys("asdsdf@123").perform();
		action.sendKeys(Keys.ENTER).perform();
	}

}
