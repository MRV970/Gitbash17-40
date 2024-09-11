package ScreeenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_Shot {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		//type cast to get the capabilities of takesscreenshot interface
		//to the driver instances
		//Typecasting
		TakesScreenshot ts=(TakesScreenshot)driver;
		//temprorary location'
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		
		//destination file
		File destfile=new File("./ScreenShots/HomePage.png");
		
		FileHandler.copy(srcfile, destfile);
		//driver.close();
		System.out.println("Home page launched successfully");
		
		
		
		 driver.findElement(By.id("small-searchterms")).sendKeys("books");
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
		 
		//screenshot after cliclicking on search
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/SearchPage.png");
		FileHandler.copy(src, dest);
	}

	
}
