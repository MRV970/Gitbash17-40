package SELECT_ACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Methods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//click on Apparel&shoe
		driver.findElement(By.partialLinkText("Apparel & Shoe")).click();
		
		//sort by dropdown
		WebElement sort=driver.findElement(By.id("products-orderby"));
		
		Select O_S=new Select(sort);
		O_S.selectByValue("https://demowebshop.tricentis.com/apparel-shoes?orderby=5");
		Thread.sleep(1000);
		
		
		
		
	}

}
