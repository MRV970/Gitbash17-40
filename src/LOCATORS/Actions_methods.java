package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions_methods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//sendkeys
		driver.findElement(By.name("q")).sendKeys("mobiles");
		Thread.sleep(2000);
		//clear the data on search bar
		driver.findElement(By.id("small-searchterms")).clear();
		Thread.sleep(2000);
		//enter the data on searchbar
		driver.findElement(By.id("small-searchterms")).sendKeys("books");
		//click on search by submit
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
	}
	

}
