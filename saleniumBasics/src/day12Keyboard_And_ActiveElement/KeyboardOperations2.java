package day12Keyboard_And_ActiveElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtils;

public class KeyboardOperations2 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtils util = new SeleniumUtils();
		util.setUp("https://www.flipkart.com/");
		driver = util.driver;
		WebElement element = driver.findElement(By.xpath("//body"));
		element.sendKeys(Keys.ESCAPE);
		for (int i = 0; i < 10; i++) {
			element.sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(1500);
		}
	}
}
