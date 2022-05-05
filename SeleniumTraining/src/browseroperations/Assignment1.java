package browseroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/");
		
		String pageTitlename=driver.getTitle();
		
		System.out.println("page Title name is = "+pageTitlename);
		
		System.out.println("page Title name Length is = "+pageTitlename.length());
		
		String ActualURL=driver.getCurrentUrl();
		String expectedURL="https://demo.actitime.com/";
		if(ActualURL.equalsIgnoreCase(expectedURL)) {
			System.out.println("The URL is right");
		}else {
			System.out.println("the url is wrong or it has been changed");
		}
		
		String pageSourceCode=driver.getPageSource();
		System.out.println("the Page  source code is ="+pageSourceCode);
		System.out.println("the Page  source code Length is ="+pageSourceCode.length());
		
//		driver.close();
		
		
	}	

}
