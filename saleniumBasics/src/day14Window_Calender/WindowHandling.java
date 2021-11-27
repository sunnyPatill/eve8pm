package day14Window_Calender;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtils;

public class WindowHandling {

	static WebDriver driver;
	public static void main(String[] args) {

		SeleniumUtils util=new SeleniumUtils();
		
		util.setUp("https://demoqa.com/browser-windows");
		driver=util.driver;
		System.out.println("Home window currentURL: "+driver.getCurrentUrl());
		//to get current window id
		String homeWinId=driver.getWindowHandle();
		System.out.println("Home window id: "+homeWinId);
		//click on button to open new tab/window
		driver.findElement(By.id("windowButton")).click();
		//get the window ids of all the browser window open by webdriver
		Set<String> allWinIds=driver.getWindowHandles();
		System.out.println("All win ids: "+allWinIds);
		//get child window id
		allWinIds.remove(homeWinId);
		System.out.println("All win ids after removing homewinid: "+allWinIds);
		//get child window string id from allwinid
		Iterator<String> itr=allWinIds.iterator();
		String childWinId=itr.next();
		//after getting required/child window id switch control to that window
		driver.switchTo().window(childWinId);
		System.out.println("After opening new tab/window, current url: "+driver.getCurrentUrl());
		//close child window in which driver has focus
		//driver.close();
		//once all the child page operation are done come back to main page
		driver.switchTo().window(homeWinId);
		System.out.println("After coming back to main page, current url: "+driver.getCurrentUrl());
		//driver.close();
		// to close all the driver instance 
		driver.quit();
	}

}
