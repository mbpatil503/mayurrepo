package browseroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		System.out.println("the title of give page is = "+driver.getTitle());
		
		System.out.println("the title of give page is = "+driver.getCurrentUrl());
		
		System.out.println("the title of give page is = "+driver.getPageSource());
		
		String Source=driver.getPageSource();
		
		System.out.println("the title of give page is = "+Source.length());
		
		String getTitle1=driver.getTitle();
		
		
		
		if(driver.getTitle().equalsIgnoreCase("Facebook")) {
			System.out.println("title is right");
		}else {
			System.out.println("title is wrong");
		}
		
		System.out.println("getTitle1");
		
		System.out.println("SA SA RERE GAGA MAMA PAPA DHA DHA NI NI SA SA");
		
		//driver.close();
	}

}
