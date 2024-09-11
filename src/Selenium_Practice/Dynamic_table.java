package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Dynamic_table {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[1]")).click();
		
		driver.findElement(By.linkText("Web Table")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'ui/table/dynamicTable')]")).click();
		Thread.sleep(1000);
	WebElement item=	driver.findElement(By.xpath("//th[contains(text(),'Apple')]/../td[4]"));
		Thread.sleep(2000);
	//WebElement price=	driver.findElement(By.xpath("//td[contains(text(),'897')]"));
		System.out.println("price"+item.getText());
		List<WebElement> alldata=driver.findElements(By.xpath("//div[contains(@class,'relative top-4 pb-5')]"));
		for( WebElement data:alldata) {
			System.out.println(data.getText());
		}
		
		
	}

}
