package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Table_Sort {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[1]")).click();
		
		driver.findElement(By.linkText("Web Table")).click();
		Thread.sleep(2000);
	WebElement element=	driver.findElement(By.xpath("//a[contains(@href,'ui/table/tableSort')]"));
	element.click();
	Actions action=new Actions(driver);
	Thread.sleep(2000);
	WebElement levis=driver.findElement(By.xpath("//th[contains(text(),'HP')]/../td[4]"));
	action.moveToElement(levis).perform();
	Thread.sleep(2000);
	List<WebElement> alldata=driver.findElements(By.xpath("//div[contains(@class,'relative top-4 pb-5')]"));
	for( WebElement data:alldata) {
		//System.out.println(data.getText());
	Thread.sleep(2000);
	action.moveToElement(data).perform();
	}
	driver.quit();
	}
}
