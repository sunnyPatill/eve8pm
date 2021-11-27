package day4BasicActionOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GenericWayToOpenBrowser {

	public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		// create an object of ChromeDriver class to open Chrome browser
//		ChromeDriver cdriver = new ChromeDriver();
//
//		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
//		FirefoxDriver fdriver = new FirefoxDriver();
//
//		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
//		// create an object of InternetExplorerDriver class to open IE browser
//		InternetExplorerDriver idriver = new InternetExplorerDriver();
		
		//creating an object of chromedriver class and upcasting it to WebDriver interface
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	}

}
