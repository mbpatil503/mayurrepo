package browseroperationsPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPractise2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		String ActualPageTitle=driver.getTitle();
		String ExpectedTitle="Facebook – log in or sign up";
				
		
		if(ExpectedTitle.equals(ActualPageTitle)) {
			System.out.println("the current page title is correct ");
		}else {
			System.out.println("the title is wrong or it has been changed....");
		}
		
		System.out.println("the current page title is ="+ActualPageTitle);
		
		driver.close();
	
	
	}

}
