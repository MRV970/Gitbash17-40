package SELECT_ACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Actions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
      Actions action =new Actions(driver);
      WebElement search=driver.findElement(By.id("small-searchterms"));
     // action.moveToElement(search).click().sendKeys("mobiles").perform();
      
		action.moveToElement(search).click()
		.keyDown(Keys.SHIFT).sendKeys("mobiles")//.keyDown(Keys.BACK_SPACE).perform();
		.keyUp(Keys.SHIFT).perform();
		//.keyUp(Keys.SHIFT).perform();
		
	}

}
//Webelement element=driver.findElement(By.id("");
//Select objsel=new select(element);
//objsel.selectByVisibleText("");
//List<WebElement> ele=objsel.getOptions();
//for(WebElement element:ele){
//syso(element.getText());
//syso(objsel.isMultiple());
//actions action =new actions
//WebElement e=driver.findElement(By.id());
//action.moveToElement(e).perform();

