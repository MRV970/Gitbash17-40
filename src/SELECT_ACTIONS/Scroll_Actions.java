package SELECT_ACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_Actions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		Actions action =new Actions(driver);
		//action.scrollByAmount(0, 600).perform();
		WebElement my_account=driver.findElement(By.xpath("//a[text()='My account']"));
		action.scrollToElement(my_account).perform();
	}

}
