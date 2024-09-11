package ScreeenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_WebElement {
	public static void main(String[] args) throws IOException {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement srctxt=driver.findElement(By.id("small-searchterms"));
		srctxt.sendKeys("books");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcfile=srctxt.getScreenshotAs(OutputType.FILE);
		File destfile=new File("./ScreenShots/srcfile.png");
		FileHandler.copy(srcfile, destfile);
		System.out.println("Screenshot on webelement srctxt field successfully");
		WebElement search=driver.findElement(By.xpath("//input[@type='submit']"));
		File src=search.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/search.png");
		FileHandler.copy(src, dest);
		driver.close();
		
	}

}
