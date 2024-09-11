package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class R_xpath_text {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//click on register
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(2000);
		
		//click on login
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
	}

}
