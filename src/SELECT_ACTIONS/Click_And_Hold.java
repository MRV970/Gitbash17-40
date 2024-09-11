package SELECT_ACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_And_Hold {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		Actions action =new Actions(driver);
		WebElement speakers=driver.findElement(By.xpath("//div[text()='Best Selling Mobile Speakers']"));
		action.clickAndHold(speakers).perform();
		Thread.sleep(2000);
		driver.quit();
		
		
	
	
	
	
	}

}
