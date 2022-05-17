package browseroperationsPractise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentParctise12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.gsmarena.com/");
		
		String ActualHomePageTitle=driver.getTitle();
		System.out.println("the actual page title is = "+ActualHomePageTitle);
		String ExpectedHomePageTitle="GSMArena.com - mobile phone reviews, news, specifications and more...";
		
		if(ExpectedHomePageTitle.equals(ActualHomePageTitle)) {
			System.out.println("The Page is Verified");
		}else {
			System.out.println("The page is wrong");
		}
		
		driver.findElement(By.cssSelector("a[href='realme-phones-118.php']")).click();
		
		List<WebElement> PaginationList=driver.findElements(By.cssSelector(".nav-pages>strong"));
		
		System.out.println("The Total page Count is = "+PaginationList.size());
		
		if(PaginationList.size()>0) {
			System.out.println("The Pagination Is Exist For Given Page...");
		}else {
			System.out.println("The Pagination Doesn't Exist...");
		}
		
		for(int i=0;i<=PaginationList.size();i++) {
			WebElement PageListName=PaginationList.get(i);
			String PageName=PageListName.getText();
			System.out.println("The Page link name is = "+PageName);
			PageListName.click();
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.elementToBeClickable(PageListName));
			System.out.println("The Current Page URL is = "+driver.getCurrentUrl());
			
		}
		
		
	}

}
