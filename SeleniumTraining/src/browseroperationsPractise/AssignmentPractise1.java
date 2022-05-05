package browseroperationsPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPractise1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/");
		
		String PageTitle=driver.getTitle();
		int pagetitilelength=PageTitle.length();
		
		System.out.println("the current page title is ="+PageTitle);
		System.out.println("the current page title length is ="+pagetitilelength);
		
		String ExpectedPageURL="https://demo.actitime.com/login.do";
		String ActualPageURL=driver.getCurrentUrl();
		System.out.println("the current page URL is ="+ActualPageURL);
		
		if(ExpectedPageURL.equals("ActualPageURL")) {
			System.out.println("the current page URL is Correct ");
		}else {
			System.out.println("the current page URL is Wrong or It has been Changed");
		}
		
		String PageSourceCode=driver.getPageSource();
		System.out.println("the current page Source code length is = "+PageSourceCode.length());
		
	//	driver.close();
	
	}
}	