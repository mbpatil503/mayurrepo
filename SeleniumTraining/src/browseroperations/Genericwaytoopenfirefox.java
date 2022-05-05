package browseroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Genericwaytoopenfirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",".\\executables\\geckodriver.exe");
		
		WebDriver web=new FirefoxDriver();

	}

}
