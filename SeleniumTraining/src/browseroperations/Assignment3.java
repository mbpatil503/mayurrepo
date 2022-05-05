package browseroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("www.google.com");
		
		String currentPageURL=driver.getCurrentUrl();
		
		System.out.println("the current Page URL is ="+currentPageURL);
		
		String sourcecode=driver.getPageSource();
		
		System.out.println("teh source code of given Page is ="+sourcecode);
		
	//	driver.close();
		
		
		
		

	}

}
