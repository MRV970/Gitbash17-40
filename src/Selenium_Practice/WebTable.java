package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTable {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[1]")).click();
		
		driver.findElement(By.linkText("Web Table")).click();
		Thread.sleep(2000);
	WebElement item=	driver.findElement(By.xpath("//th[contains(text(),'HP')]/../td[4]"));
		Thread.sleep(2000);
	
		System.out.println(item.getText());
		List<WebElement> alldata=driver.findElements(By.xpath("//div[contains(@class,'relative top-4 pb-5')]"));
		for( WebElement data:alldata) {
			System.out.println(data.getText());
		}
		driver.quit();
		
	}

}
