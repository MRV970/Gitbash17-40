package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Check_Box {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Check Box")).click();
		Thread.sleep(2000);
		
		List<WebElement> all=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(all.size());
		for(WebElement allCheck:all) {
			allCheck.click();
			//System.out.println(allCheck.length());
		}
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
