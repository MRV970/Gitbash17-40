package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Working_with_RLocators {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(By.xpath("//input[@type='submit']")))
				.sendKeys("mobiles");
		Thread.sleep(2000);
		//click on search button
		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(By.id("small-searchterms")))
		.click();
		Thread.sleep(2000);
		driver.navigate().back();
		//Excellent Radio button
		driver.findElement(RelativeLocator.with(By.name("pollanswers-1")).above(By.id("pollanswers-2"))).click();
		Thread.sleep(2000);
		//good button
		driver.findElement(RelativeLocator.with(By.id("pollanswers-2")).below(By.tagName("input"))).click();
		Thread.sleep(2000);
		//click on Registerlink
		driver.findElement(RelativeLocator.with(By.tagName("a")).near(By.linkText("Log in"))).click();
		Thread.sleep(2000);
	}

}
