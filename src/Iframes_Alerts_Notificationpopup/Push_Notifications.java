package Iframes_Alerts_Notificationpopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Push_Notifications {
public static void main(String[] args) {
	//chromeOptions class
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--diable-popup-blocking");
	WebDriver driver=new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.get("https://www.easemytrip.com/");
}
}
