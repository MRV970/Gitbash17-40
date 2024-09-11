package LOCATORS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipcart_Links {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("laptop");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		List<WebElement> links=driver.findElements(By.cssSelector("div[class='Nx9bqj _4b5DiR']"));
		for(WebElement element:links) {
			System.out.println(element.getText());
			
		}
	}

}
