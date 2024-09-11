package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_downs {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Dropdown")).click();
		Thread.sleep(2000);
		WebElement phone=driver.findElement(By.id("select1"));
		Select obj=new Select(phone);
		obj.selectByValue("+92");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Multi Select")).click();
		Thread.sleep(1000);
		WebElement country=driver.findElement(By.xpath("(//select[@id='select-multiple-native'])[1]"));
		
		Thread.sleep(1000);
		Select obj1=new Select(country);
		System.out.println(obj1.isMultiple());
		
		obj1.selectByVisibleText("India");
		Thread.sleep(1000);
		//driver.findElement(By.xpath(""));
		obj1.selectByValue("Andhra Pradesh");
		Thread.sleep(1000);
		obj1.deselectByIndex(0);
		Thread.sleep(1000);
		
		driver.quit();
		
	}

}
