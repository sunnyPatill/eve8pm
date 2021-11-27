package day10WebDriverManager_PropertyFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriverManager.iedriver().setup();
		// creating an object of chromedriver class and upcasting it to WebDriver
		// interface
		WebDriver driver = new InternetExplorerDriver();
		// enter required application url
		driver.get("https://demo.actitime.com/login.do");

		driver.close();
	}
}
