package browseroperationsPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPractise6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().window().setSize(new Dimension(100,100));
		
		driver.manage().window().maximize();
		
		System.out.println("The Current Page Title Is = "+driver.getTitle());
		
//		driver.findElement(By.cssSelector("a[href='/gp/sva/dashboard?ref_=hav_cs_apay']")).click();
		//OR
		driver.findElement(By.linkText("Amazon Pay")).click();
		
		String ActualPageTitle=driver.getTitle();
		String ExpectedPageTitle="Amazon Pay";
		
		if(ExpectedPageTitle.equals(ActualPageTitle)) {
			System.out.println("the page title is verified, correct page is open");
		}else {
			System.out.println("The Wrong page is opened,or page title has been change");
		}
		
//		driver.navigate().back();
		
//		driver.navigate().refresh();
		
//		driver.close();

	}

}
