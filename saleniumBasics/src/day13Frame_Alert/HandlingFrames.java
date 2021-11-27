package day13Frame_Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtils;

public class HandlingFrames {

	static WebDriver driver;
	public static void main(String[] args) {

		SeleniumUtils util=new SeleniumUtils();
		
		util.setUp("https://jqueryui.com/");
		driver=util.driver;
		driver.findElement(By.xpath("//a[text()='Checkboxradio']")).click();
		//taking control inside the frame from main page
		//driver.switchTo().frame(0);
		//Identify the frame 
		WebElement e1=driver.findElement(By.cssSelector(".demo-frame"));
		//switch control to the frame
		driver.switchTo().frame(e1);
		driver.findElement(By.xpath("//label[@for='radio-1']")).click();
		//coming back to main page from the frame
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector(".logo")).click();
	 //util.cleanUp();
		

	}

}
