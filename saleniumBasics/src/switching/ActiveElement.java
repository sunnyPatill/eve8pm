package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtils;

public class ActiveElement {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtils util = new SeleniumUtils();
		util.setUp("https://demo.actitime.com/login.do");
		driver=util.driver;
		WebElement element=driver.switchTo().activeElement();
		String exp=element.getAttribute("placeholder");
		if(exp.equals("Username")) {
			element.sendKeys("admin",Keys.TAB);
		}
		driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
	}

}
