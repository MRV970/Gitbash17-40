package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getters_Methods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		String text=driver.findElement(By.linkText("Register"))
				.getText();
		System.out.println(text);
		driver.findElement(By.name("q")).sendKeys("Electronics");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		//get text on search bar
		String searchbar_text =driver.findElement(By.name("q")).getText();
		System.out.println(searchbar_text);
		//get attribute value
		String subscribe_value=driver.findElement(By.id("newsletter-email")).getText();
		
		System.out.println(subscribe_value);
		//textfieldvalue
		String textfield_val=driver.findElement(By.id("small-searchterms")).getAttribute("value");
		System.out.println(textfield_val);
		//grt cssvalue
		String registerlink_color=driver.findElement(By.linkText("Register")).getCssValue("color");
		System.out.println(registerlink_color);
		String fontvalue =driver.findElement(By.linkText("Register")).getCssValue("font-family");
		
		
		
	}

}
