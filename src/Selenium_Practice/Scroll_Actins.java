package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_Actins {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Scroll']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("ul[class='mt-1 ps-3 pe-4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Open In New Tab")).click();
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("ul[class='mt-1 ps-3 pe-4']")).click();
		Actions action =new Actions(driver);
		//action.scrollByAmount(0, 1000);
		Thread.sleep(3000);
	//WebElement rights=	driver.findElement(By.xpath("//h3[text()='Free Materials']"));
	//	action.scrollToElement(rights);
		//horizontal
//		driver.findElement(By.partialLinkText("Horizontal")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.partialLinkText("Open In New Tab")).click();
//		Thread.sleep(2000);
//		action.scrollByAmount(600, 0);
//		Thread.sleep(1000);		/*
//		 * WebElement rights= driver.findElement(By.
//		 * xpath("//h1[contains(text(),'4. Intellectual property rights')]"));
//		 * action.scrollToElement(rights);
//		 */
		
		action.keyDown(Keys.END).keyUp(Keys.END).perform();
		
	
	}

}
