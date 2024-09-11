package TASK;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Not_Sponsered {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//identify non-sponsered phones
		List<WebElement> non_sponsered=driver.findElements(By.xpath
				("//div[@data-cy='title-recipe' and not(contains(.,'Sponsored'))]"));
		System.out.println(non_sponsered.size());
		
		for(WebElement N_S:non_sponsered) {
			
			/*if(N_S.getText().contains("Sponsored")){
				
				continue;
			}
			else {*/
				System.out.println(N_S.getText());
			
			
			
		  
		}
		 
		
		driver.quit();
		
	}

	

}
