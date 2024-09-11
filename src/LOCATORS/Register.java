package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//click on register
		driver.findElement(By.linkText("Register")).click();
		//click on gender w.e
		driver.findElement(By.id("gender-female")).click();
		//enter text in Fn text field
		driver.findElement(By.name("FirstName")).sendKeys("mrv");
		//enter text in  ln text field
		driver.findElement(By.name("LastName")).sendKeys("m");
		//enter email into email text field
		driver.findElement(By.id("Email")).sendKeys("mrv@gmail.com");
		//enter password in pwd field
		driver.findElement(By.name("Password")).sendKeys("secret");
		//enter confirm password in cpwd
		driver.findElement(By.id("ConfirmPassword")).sendKeys("secret");
		//click on register button
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
	}

}
