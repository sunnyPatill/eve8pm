package day14Window_Calender;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtils;

public class CalenderHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		SeleniumUtils util=new SeleniumUtils();
		
		util.setUp("https://www.makemytrip.com/");
		driver=util.driver;
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("li[data-cy='account']")).click();
		//to open calender
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		Thread.sleep(2000);
		//to select date from calender
		driver.findElement(By.cssSelector("div.DayPicker-Months>div:nth-of-type(2)>.DayPicker-Body>div:nth-of-type(2)>div:nth-of-type(2)")).click();
	}

}
