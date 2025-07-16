package TASK;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Get_Color_Size_Fontfamily {
	public static void main(String[] args) throws InterruptedException, AWTException {
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
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);// button 1mouse left click
		r.mouseRelease(InputEvent.BUTTON2_DOWN_MASK); //button 2 mouse right click
		
		r.mouseMove(0, 0);//based on x and y coordinates scrolling
		r.mouseWheel(0);  //scrolling 

	}
	
	@Test
	public void file() {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload/drag?sublist=2");
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\RAGHAVAMMA\\Desktop\\Self Intro.txt");
		System.out.println(" drag and drop file uploaded");
//		driver.quit();
	}
	  @Test
	  public void upload() {
		  WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoapps.qspiders.com/ui/fileUpload/custom?sublist=1");
		WebElement file=	driver.findElement(By.xpath("//div[text()='Upload File']"));
		//file.click();
			file.sendKeys("C:\\\\Users\\\\RAGHAVAMMA\\\\Desktop\\\\Self Intro.txt");
			
			System.out.println("file uploaded");
	  }
	  
	

}
