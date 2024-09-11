package SELECT_ACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_with_Select_class {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new EdgeDriver();                
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Books")).click();
		//select position
		WebElement sort=driver.findElement(By.id("products-orderby"));
		Select objsel=new Select(sort);
		objsel.selectByVisibleText("Name: Z to A");
		Thread.sleep(2000);
		// Display
		WebElement display=driver.findElement(By.id("products-pagesize"));
		Select objsel1=new Select(display);
		//objsel1.selectByValue("https://demowebshop.tricentis.com/books?pagesize=8");
		objsel1.selectByIndex(2);
		Thread.sleep(2000);
		// view
		WebElement view=driver.findElement(By.id("products-viewmode"));
		Select objsel2=new Select(view);
		objsel2.selectByIndex(1);
		
	}
	

}
