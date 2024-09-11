package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verification_methods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//verification methods
		if(driver.findElement(By.id("small-searchterms")).isDisplayed()){
			driver.findElement(By.id("small-searchterms")).sendKeys("Books");
			//check if search button is Enabled then click search
			if(driver.findElement(By.xpath("//input[@type='submit']")).isEnabled()) {
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.navigate().back();
				//check if radio button excellent is selected
				driver.findElement(By.id("pollanswers-1")).click();
				//verify if the radio button is selected
				if(driver.findElement(By.id("pollanswers-1")).isSelected()) {
					System.out.println("The excellent radio button was selected successfully");
					driver.quit();
				}
					}
			
			
		}
		
	}

}
