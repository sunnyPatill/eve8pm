package day8HnndlingMultipleEvent;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements2 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//creating an object of chromedriver class and upcasting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//enter required application url
		driver.get("https://www.amazon.in/");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		//to identify multiple web elements
		List<WebElement> menuBarList=driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		//get the count of identify element
		int menuBarCount=menuBarList.size();
		System.out.println(menuBarCount);
		//to access one by one list element
		for(int i=0;i<menuBarCount;i++) {
			if(!menuBarList.get(i).getText().isEmpty()) {
			System.out.println(menuBarList.get(i).getText());
			Thread.sleep(1000);
			}else {
				System.out.println("Empty:"+i);
				Thread.sleep(1000);
			}
		}
		//close current browser
		//driver.close();		
	}
}
