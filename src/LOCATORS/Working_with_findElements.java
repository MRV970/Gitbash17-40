package LOCATORS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Working_with_findElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//get all the links on webpage
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		//Iterate over the collection of links
		/*for(int i=0;i<=links.size()-1;i++) {
			String Linktext= links.get(i).getText();
			System.out.println(Linktext);*/
			//or
			//Iterate on the list of links
			/*for(WebElement element:links) {
				String url=element.getAttribute("href");
				System.out.println(url);*/
				
			//}
		//take the radio buttons
		List<WebElement> radio_btn=driver.findElements(By.xpath("//input[@type='radio']"));
		
		//iterate
		for(WebElement element: radio_btn) {
			element.click();
			System.out.println(element.isSelected());
		}
		}
			
		}
	


