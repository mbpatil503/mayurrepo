package browseroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Genericwaytoopenchrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		
		WebDriver web=new ChromeDriver();
		
		
	}

}
