package day3LaunchingBrowser;

public class LaunchingRequiredBrowser {

	public static void main(String[] args) {
		//open ie browser
		launchRequiredBrowser("ie");
		//open firefox browser
		launchRequiredBrowser("firefox");
		//open chrome browser
		launchRequiredBrowser("chrome");
	}	
	static void launchRequiredBrowser(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			//TODO: code to open chrome browser
		}else if(browserName.equalsIgnoreCase("firefox")) {
			//TODO: code to open firefox browser
		}else if(browserName.equalsIgnoreCase("ie")) {
			//TODO: code to open ie browser
		}
	}
}
