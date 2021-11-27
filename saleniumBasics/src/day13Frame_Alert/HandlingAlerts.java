package day13Frame_Alert;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtils;

public class HandlingAlerts {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		SeleniumUtils util=new SeleniumUtils();		
		util.setUp("https://demoqa.com/alerts");
		driver=util.driver;
		handleAlertPopup();
		Thread.sleep(2000);
		handleConfirmatioPopup();
		Thread.sleep(2000);
		handlePromptPopup();
//		//to open alert popup
//		driver.findElement(By.id("alertButton")).click();
//		//switch your control to alert popup
//		String alertText=driver.switchTo().alert().getText();
//		System.out.println("Alert Popup text: "+alertText);
//		//to accept alert or to click on ok or yes button use
//		driver.switchTo().alert().accept();
		
		
//				//to open confirmation popup
//				driver.findElement(By.id("confirmButton")).click();
//				//switch your control to confirmation popup
//				String confirmationPopupText=driver.switchTo().alert().getText();
//				System.out.println("confirmation Popup text: "+confirmationPopupText);
//				//to accept alert or to click on ok or yes button use
//				driver.switchTo().alert().accept();
//				//to click on cancel or no button
//				//driver.switchTo().alert().dismiss();
		
//		//to open prompt popup
//		driver.findElement(By.id("promtButton")).click();
//		//switch your control to prompt popup
////		String promptPopupText=driver.switchTo().alert().getText();
////		System.out.println("prompt Popup text: "+promptPopupText);
//				//or
//		System.out.println(driver.switchTo().alert().getText());
//		//type text in popup
//		driver.switchTo().alert().sendKeys("Selenium Testing");
//		//to accept alert or to click on ok or yes button use
//		//driver.switchTo().alert().accept();
//		//to click on cancel or no button
//		driver.switchTo().alert().dismiss();
		
	}
	static void handlePromptPopup() {
		//to open prompt popup
				driver.findElement(By.id("promtButton")).click();
				//switch your control to prompt popup
//				String promptPopupText=driver.switchTo().alert().getText();
//				System.out.println("prompt Popup text: "+promptPopupText);
						//or
				System.out.println(driver.switchTo().alert().getText());
				//type text in popup
				driver.switchTo().alert().sendKeys("Selenium Testing");
				//to accept alert or to click on ok or yes button use
				driver.switchTo().alert().accept();
				//to click on cancel or no button
				//driver.switchTo().alert().dismiss();
	}
	static void handleConfirmatioPopup() {
		//to open confirmation popup
		driver.findElement(By.id("confirmButton")).click();
		//switch your control to confirmation popup
		String confirmationPopupText=driver.switchTo().alert().getText();
		System.out.println("confirmation Popup text: "+confirmationPopupText);
		//to accept alert or to click on ok or yes button use
		driver.switchTo().alert().accept();
		//to click on cancel or no button
		//driver.switchTo().alert().dismiss();
	}
	static void handleAlertPopup() {
		//to open alert popup
		driver.findElement(By.id("alertButton")).click();
		//switch your control to alert popup
		String alertText=driver.switchTo().alert().getText();
		System.out.println("Alert Popup text: "+alertText);
		//to accept alert or to click on ok or yes button use
		driver.switchTo().alert().accept();
	}

}
