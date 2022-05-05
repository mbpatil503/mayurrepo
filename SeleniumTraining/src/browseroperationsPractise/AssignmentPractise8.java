package browseroperationsPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPractise8 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().setSize(new Dimension(500,500));
		
		driver.manage().window().maximize();
		
		String PageTitle=driver.getTitle();
		
		System.out.println("The Current Page Title Is = "+PageTitle);
		
		List<WebElement> options=driver.findElements(By.cssSelector("div#nav-xshop>a"));

		System.out.println("The Current Page count Is = "+options.size());
		
		for(int i=0;i<options.size();i++) {
			WebElement member=options.get(i);
			String names=member.getText();
			System.out.println("Option Name= "+names);
			if(names.equals("Amazon Pay")) {
			
				member.click();
				break;
			
			}else {
				System.out.println("Name of option has not Matched");
			}
				
		}
		String ActualPageTitleOfAmazonPay=driver.getTitle();
		String ExpectedPageTitleOfAmazonPay="Amazon Pay";
		
		if(ExpectedPageTitleOfAmazonPay.equals(ActualPageTitleOfAmazonPay)) {
			System.out.println("The PageTitle has Matched, hence page Is Verified..");
		}else {
			System.out.println("the page title has not matched, not verified");
		}
		
		driver.navigate().back();
		driver.navigate().refresh();
		
		
	}

}
