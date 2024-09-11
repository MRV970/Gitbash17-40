package LOCATORS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_Phones {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@type='submit']")).submit();
	Thread.sleep(1000);
	List<WebElement> links=driver.findElements
	(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	//iterate all links
	/*
	 * for(int i=0;i<=links.size()-1;i++) { String linktext=links.get(i).getText();
	 * System.out.println(linktext); }
	 */
	for(WebElement element:links) {
		System.out.println(element.getText());
	}
	
}
}
