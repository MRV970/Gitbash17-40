package SELECT_ACTIONS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_Options {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//click on books link
		driver.findElement(By.partialLinkText("Books")).click();
		//sort by dropdown
		WebElement display=driver.findElement(By.id("products-pagesize"));
		
		Select objsel=new Select(display);
		//get options mehod
		List<WebElement> display_val= objsel.getOptions();
		//iterate list
		for(WebElement values:display_val) {
			System.out.println(values.getText());
			
		}
		Thread.sleep(1000);
		 WebElement sort_by =driver.findElement(By.id("products-orderby"));
		  Select objsel1=new Select(sort_by);
		  
		  List<WebElement> sortby_values=objsel1.getOptions();
		  //iterate sort by
		  for(WebElement val:sortby_values) {
			  System.out.println(val.getText());
		  }
		
	}

}
