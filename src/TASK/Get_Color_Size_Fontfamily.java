package TASK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Color_Size_Fontfamily {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String color = driver.findElement(By.xpath("//img[@src='https://static.xx.fbcdn.net/rsrc.php/y1/r/4lCu2zih0ca.svg']"))
				.getCssValue("color");
		System.out.println(color);
		String font = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"))
				.getCssValue("font");
		System.out.println(font);
		String font_family = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"))
				.getCssValue("font-family");
		System.out.println(font_family);
		String Intrinsic_size = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"))
				.getCssValue("Intrinsic_size");
		System.out.println(Intrinsic_size);
		
		driver.quit();
		
		

	}

}
