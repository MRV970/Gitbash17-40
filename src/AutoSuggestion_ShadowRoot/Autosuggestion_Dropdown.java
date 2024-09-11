package AutoSuggestion_ShadowRoot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Autosuggestion_Dropdown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("small-searchterms")).sendKeys("comp");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(text(),'Build your own computer')]")).click();
}
}
