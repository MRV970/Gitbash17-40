package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
		
		Thread.sleep(1000);
		WebElement Mobile_charger=driver.findElement(By.xpath
				("//div[@style='background-color: rgb(252, 165, 165);'][1]"));
		Thread.sleep(2000);
		WebElement Mobile_Accesories=driver.findElement(By.xpath("drop-column  min-h-[200px] bg-slate-100"));
		Actions action =new Actions(driver);
		action.dragAndDrop(Mobile_charger, Mobile_Accesories);
		//mouse over
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[2]")).click();
		Thread.sleep(2000);
	WebElement icon=	driver.findElement(By.xpath("//img[@src='/assets/message-hint-J20Zlhln.png']"));
		action.moveToElement(icon).perform();
		//click and hold
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[3]")).click();
		Thread.sleep(1000);
		WebElement circle=driver.findElement(By.id("circle"));
		action.clickAndHold(circle);
		driver.quit();
		
		
		
		
		
		
		
	}

}
