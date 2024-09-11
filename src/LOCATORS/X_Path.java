package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/RAGHAVAMMA/Desktop/FILE/LOGIN.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("mvnjhb");
		//enter pwd 
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("1224334hjj");
	}
	
}
