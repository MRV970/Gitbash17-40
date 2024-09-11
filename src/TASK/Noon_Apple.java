package TASK;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Noon_Apple {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.noon.com/uae-en/");
		Thread.sleep(4000);
		Actions action =new Actions(driver);
		action.scrollByAmount(0,1000).perform();
		
				Thread.sleep(5000);
				//List<WebElement> Names=driver.findElements(By.xpath("//div[starts-with(@title,'Apple')]"));
			//	Thread.sleep(2000);
				
	           for(int i=0;i<=7;i++) {
	        	  
		           List<WebElement> Names=driver.findElements(By.xpath("//div[contains(@text(),'Apple')]"));
		           
					Thread.sleep(1000);
					
				for( WebElement Apple_Products:Names) {
					Thread.sleep(2000);		
					
					System.out.println(Apple_Products.getText());
				}
				Thread.sleep(1000);
				 WebElement swipe=driver.findElement(By.xpath("(//div[contains(@class,'swiper-button')])[13]"));
				 swipe.click();		           
		           
				
	           }
	           driver.quit();
		
		}
		
	}

//}
