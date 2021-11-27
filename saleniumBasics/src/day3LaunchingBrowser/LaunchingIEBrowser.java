package day3LaunchingBrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchingIEBrowser {

	public static void main(String[] args) {
		
		//Set the path of IEDriverServer.exe using setProperty() of System class
				// with Absolute path
		//System.setProperty("webdriver.ie.driver", "F:\\Online Class\\Training Syllabus-20210816T050832Z-001\\Training Syllabus\\CoreJava Sessions\\SeleniumBasics\\drivers\\IEDriverServer.exe");
					//or with Relative path
		//System.setProperty("webdriver.ie.driver", ".\\drivers\\IEDriverServer.exe");
					//or with Relative path
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		
		//create an object of InternetExplorerDriver class to open IE browser	
		InternetExplorerDriver idriver=new InternetExplorerDriver();
	}

}
