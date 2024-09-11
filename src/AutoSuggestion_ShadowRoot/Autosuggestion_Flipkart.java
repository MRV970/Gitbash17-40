package AutoSuggestion_ShadowRoot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Autosuggestion_Flipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("puma");
		driver.findElement(By.partialLinkText(" slippers men")).click();
		
	}

}
