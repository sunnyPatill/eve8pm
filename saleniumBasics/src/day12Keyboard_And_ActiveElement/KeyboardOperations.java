package day12Keyboard_And_ActiveElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtils;

public class KeyboardOperations{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		SeleniumUtils util=new SeleniumUtils();
		util.setUp("https://demo.actitime.com/login.do");
		driver=util.driver;
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB);
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		/**
		 * possible ways to refresh the browser:
		 * 1. driver.navigate().refresh();
		 * 2. sendKeys(Keys.f5)
		 * 3. ctrl+R
		 */
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.F5);
		//util.action.keyDown(Keys.CONTROL).sendKeys("r").keyUp(Keys.CONTROL).build().perform();
	}
}
