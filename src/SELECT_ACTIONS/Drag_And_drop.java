package SELECT_ACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_drop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/women");
	Thread.sleep(5000);
	Actions action=new Actions(driver);
	//source
	WebElement mokshi=driver.findElement(By.partialLinkText("Women Printed Viscose Rayon Straigh..."));
	//target
	WebElement cart=driver.findElement(By.xpath("cartIcon"));
cart.click();
	action.dragAndDrop(mokshi, cart).build().perform();
	
	}

}
