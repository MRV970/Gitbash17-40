package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class R_xpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//click on excellent
		driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();
		//click on vote
		driver.findElement(By.xpath("//input[@id='vote-poll-1']")).click();
		//enter books on search text
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Books");
		
		
	}

}
