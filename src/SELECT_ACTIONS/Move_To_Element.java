package SELECT_ACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_To_Element {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	//create an object for Action class
	Actions action =new Actions(driver);
	//move to element 
	WebElement computers=driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
	action.moveToElement(computers).build().perform();
	//move to desktop and click
	WebElement desktops=driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"));
	action.moveToElement(desktops).click().build().perform();
	
	
}
}
