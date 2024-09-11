package TASK;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shadow_Root {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://partners.pointsville.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'SIGN IN')]")).click();
		Actions action =new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		action.sendKeys("adsfdfg").perform();
		
		Thread.sleep(1000);
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		action.sendKeys("bvgh@123").perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(Keys.TAB).perform();
		
		WebElement signin=driver.findElement(By.xpath("//span[contains(text(),'SIGN IN')]"));
		signin.click();
		WebElement Error=driver.findElement(By.xpath
				("//label[contains(text(),'Please enter a valid business email')]"));
		
			System.out.println(Error.getText());
			
				
			}
		
		
		}
	


