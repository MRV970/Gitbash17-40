package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//enter text on search bar
		/*
		 * driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys(
		 * "computers"); //click on search
		 * driver.findElement(By.cssSelector("input[class='button-1 search-box-button']"
		 * )).click();
		 */
		
		//enter text on searchbar
		driver.findElement(By.cssSelector(".search-box-text.ui-autocomplete-input")).sendKeys("computers");
		//click on search 
		driver.findElement(By.cssSelector(".button-1.search-box-button")).click();
	}

}
