package SELECT_ACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_To_Ele {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		Actions action =new Actions(driver);
	WebElement H_F=	driver.findElement(By.xpath("//div[@aria-label='Home & Furniture']"));
		action.moveToElement(H_F).build().perform();
		WebElement Homedecor=driver.findElement(By.xpath("//a[text()='Home Decor']"));
		action.moveToElement(Homedecor).build().perform();
	
		
	}

}
