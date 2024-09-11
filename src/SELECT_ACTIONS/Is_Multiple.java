package SELECT_ACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Is_Multiple {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Books")).click();
		Thread.sleep(1000);
		//sort by dropdrown
		WebElement sort_by= driver.findElement(By.id("products-orderby"));
		Select objsel= new Select(sort_by);
		
		System.out.println(objsel.isMultiple());
		
		
	}

}
