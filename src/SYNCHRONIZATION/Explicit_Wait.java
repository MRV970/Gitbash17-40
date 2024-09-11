package SYNCHRONIZATION;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement searctxt=driver.findElement(By.id("small-searchterms"));
	//webdriver wait is nothing but the explicit wait
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	wait.until(ExpectedConditions.elementToBeClickable(searctxt));
	driver.findElement(By.id("small-searchterms")).sendKeys("computers");
	driver.findElement(By.xpath("submit")).click();
	WebElement searchpage=driver.findElement(By.xpath("//h1[text()='Search']"));
	//synchronization point for search text
	wait.until(ExpectedConditions.visibilityOf(searchpage));
	driver.quit();
	
	
}
}
