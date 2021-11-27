package day4BasicActionOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//creating an object of chromedriver class and upcasting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//enter required application url
		driver.get("https://demo.actitime.com/login.do");
		//identify the element/object in which we need to perform action
		/**
		 * By is predefined class selenium and all its method are static which are also known as "locator"
		 * Selenium support following locator:
		 * id , name, linkText, partialLinkText, className, tagName, cssSelector, xpath
		 * 
		 * Action: all the below actions will be performed on the webelement
		 * 			type--> sendKeys("");
		 * 		   click---> click();
		 * 		   clearing existing value from the field ---> clear();
		 */
		WebElement userNameInputField=driver.findElement(By.id("username"));
		//perform typing operation
		userNameInputField.sendKeys("admin");
		//identify password field
		WebElement passwordInputField=driver.findElement(By.name("pwd"));
		//perform typing operation
		passwordInputField.sendKeys("manager");
		//identify login button 
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		//perform click operation
		loginButton.click();		
		//close current browser
		driver.close();
	}
}
