package day10WebDriverManager_PropertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		
		//identify property file location using FileInputStream class
		FileInputStream fis=new FileInputStream(".\\TestData\\AppData.properties");
		//Create an instance of Properties class
		Properties prop=new Properties();
		//load property file
		prop.load(fis);
		//get the data from property file
		String appUrl=prop.getProperty("appUrl");
		System.out.println(appUrl);
		String un=prop.getProperty("username");
		System.out.println(un);
		String pwd=prop.getProperty("password");
		System.out.println(pwd);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(appUrl);
		driver.findElement(By.id("username")).sendKeys(un);
		//identify password field
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		//identify login button 
		driver.findElement(By.id("loginButton")).click();		
	}
}
