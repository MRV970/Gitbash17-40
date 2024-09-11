package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains_xpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//click on books link
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		//enter text in search bar
		driver.findElement(By.xpath("//input[contains(@id,'search')]")).sendKeys("computers");
		//click on search
		driver.findElement(By.xpath("(//input[contains(@class,'button')])[1]")).click();
	}

}
