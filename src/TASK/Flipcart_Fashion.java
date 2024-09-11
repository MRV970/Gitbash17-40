package TASK;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcart_Fashion {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.flipkart.com/");
	
	Thread.sleep(2000);
	
	Actions action=new Actions(driver);
WebElement fashion=	driver.findElement(By.className("_1wE2Px"));
	//Actions action=new Actions(driver);
action.moveToElement(fashion);
//	//WebElement men=driver.findElement(By.xpath("//a[@class='_1BJVlg _11MZbx']"));
//	//action.moveToElement(men);
//	List<WebElement>menli=driver.findElements(By.xpath("//div[@class='uA12UE']/../a"));
//	//action.moveToElement(menli))
//	for(WebElement ml:menli) {
//		
//		System.out.println(ml.getText());
//	}
	
	
	
	//driver.close();
	
	
	
	}

}
