package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Function_of_Locators {
public static void main(String[] args) throws InterruptedException {
	//launch browser
	WebDriver driver=new ChromeDriver();
	//navigate to url
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	//name locator
	//enter the text in search bar text field
	//WebElement searchfield=driver.findElement(By.name("q"));
	//searchfield.sendKeys("mobiles");
	//id locator
	//driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
	Thread.sleep(1000);
	//link text locator
	//click on register link
	//driver.findElement(By.linkText("Register")).click();
	//Thread.sleep(1000);
	//click on login link
	//driver.findElement(By.partialLinkText("Log in")).click();
	//Thread.sleep(1000);
	//Partial link text
	//click on shopping cart
	//driver.findElement(By.partialLinkText("oppin")).click();
	//Thread.sleep(1000);
	//tagname locator
	//enter text in subscribe text field
	//driver.findElement(By.tagName("input")).sendKeys("test@123.com");
	//tagname is not efficient
	//class name locator
	//enter text in searchbar field
	driver.findElement(By.className("search-box-text")).sendKeys("mobiles");
	
	
}
}
