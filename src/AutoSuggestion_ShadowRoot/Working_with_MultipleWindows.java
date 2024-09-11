package AutoSuggestion_ShadowRoot;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Working_with_MultipleWindows {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);
		Set<String> childwindows=driver.getWindowHandles();
		for(String window:childwindows) {
		driver.switchTo().window(window);
		if(driver.getTitle().contains("Facebook")) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("marv@123");
			Thread.sleep(2000);
			driver.close();
			
		
		}
	}
		driver.switchTo().window(parentwindow);
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		  Thread.sleep(2000);
		  driver.close();
	}
}
