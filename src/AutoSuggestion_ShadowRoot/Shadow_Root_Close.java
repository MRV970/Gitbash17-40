package AutoSuggestion_ShadowRoot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shadow_Root_Close {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[contains(text(),'Register')]")).click();
		Thread.sleep(1000);
		Actions action =new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		action.sendKeys("bhghh").perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		action.sendKeys("asdsdf@123");
		//driver.findElement(By.id("name")).sendKeys("raghavi",Keys.TAB,"kalpana",Keys.TAB,"lpa",Keys.TAB,Keys.ENTER);
		/*
		 * driver.get("https://www.instagram.com/accounts/login/"); String
		 * n=driver.findElement(By.id("name")).getText(); System.out.println(n);
		 */
	}

}
