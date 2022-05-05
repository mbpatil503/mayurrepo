package browseroperations;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
		FirefoxDriver fdrive=new FirefoxDriver();
		
	}

}
